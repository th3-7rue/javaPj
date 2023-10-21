import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class PannelloAnimazione extends JPanel implements ActionListener {
    private PallaNetServer finestra;
    private Dimension dimensioni;
    private Image bufferVirtuale;
    private Graphics offscreen;
    private Timer tim = null;
    private int xPalla = 0;
    private int yPalla = 0;
    private int diametroPalla = 40;
    private int spostamento = 3;
    private int timerDelay = 10;
    private boolean destra, basso, pallaPresente, arrivoComunicato;

    public PannelloAnimazione(PallaNetServer finestra, Dimension dimensioni) {
        super();
        this.finestra = finestra;
        this.setSize(dimensioni);
        destra = true;
        basso = true;
        pallaPresente = true;
        arrivoComunicato = false;
        tim = new Timer(timerDelay, this);
        tim.start();
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        super.paint(g);
        bufferVirtuale = createImage(this.getWidth(), this.getHeight());
        offscreen = bufferVirtuale.getGraphics();
        Graphics2D screen = (Graphics2D) g;
        offscreen.setColor(new Color(254, 138, 22));
        if (pallaPresente) {
            offscreen.fillOval(xPalla, yPalla, diametroPalla, diametroPalla);
        }
        screen.drawImage(bufferVirtuale, 0, 0, this);
        offscreen.dispose();
    }

    public void actionPerformed(ActionEvent e) {
        if (pallaPresente) {
            if (basso) {
                if (yPalla > (this.getHeight() - diametroPalla)) {
                    basso = false;
                    yPalla -= spostamento;
                } else {
                    yPalla += spostamento;
                }
            } else {
                if (yPalla < 0) {
                    basso = true;
                    yPalla += spostamento;
                } else {
                    yPalla -= spostamento;
                }
            }
            if (destra) {
                if ((!arrivoComunicato) && (xPalla > (this.getWidth() - diametroPalla))) {
                    try {
                        finestra.getOut().writeBoolean(basso);
                        finestra.getOut().writeInt(yPalla);
                        arrivoComunicato = true;
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.toString());
                        System.exit(-1);
                    }
                } else {
                    xPalla += spostamento;
                    if (xPalla > this.getWidth()) {
                        pallaPresente = false;
                        arrivoComunicato = false;
                    }
                }
            } else {
                if (xPalla < 0) {
                    destra = true;
                    xPalla += spostamento;
                } else {
                    xPalla -= spostamento;
                }
            }
        } else {
            boolean direzione = false;
            int y = 0;
            try {
                direzione = finestra.getIn().readBoolean();
                y = finestra.getIn().readInt();
                basso = direzione;
                destra = false;
                yPalla = y;
                xPalla = this.getWidth();
                pallaPresente = true;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
                System.exit(-1);
            }
        }
        repaint();
    }
}
