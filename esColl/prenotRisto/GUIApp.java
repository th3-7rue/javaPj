package esColl.prenotRisto;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class GUIApp extends JFrame {
    public GUIApp() {
        setTitle("La mia app");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300); // Imposta le dimensioni della finestra
        setLocationRelativeTo(null); // Centra la finestra sullo schermo

        // Crea un pannello per contenere i componenti
        JPanel panel = new JPanel();

        // Aggiungi i componenti al pannello
        JButton button = new JButton("Clicca qui");
        panel.add(button);

        // Aggiungi il pannello alla finestra
        add(panel);
    }

    public static void main(String[] args) {
        // Crea un'istanza della tua classe GUIApp e mostrala
        GUIApp app = new GUIApp();
        app.setVisible(true);
        
    }
}
