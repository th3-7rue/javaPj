import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PallaNetServer extends JFrame {
    private Socket connessione = null;
    private DataOutputStream out = null;
    private DataInputStream in = null;

    public PallaNetServer() {
        super("PallaNetServer");
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ThreadConnessione attendiConnessione = new ThreadConnessione(this);
        this.setVisible(true);

    }

    public void setConnessione(Socket connessione) {
        this.connessione = connessione;
        try {
            out = new DataOutputStream(connessione.getOutputStream());
            in = new DataInputStream(connessione.getInputStream());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            System.exit(-1);
        }
        PannelloAnimazione pannello = new PannelloAnimazione(this, this.getSize());
        this.add(pannello);
    }

    public DataOutputStream getOut() {
        return out;
    }
    public DataInputStream getIn() {
        return in;
    }
}
