import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

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
        ThreaC
        this.setVisible(true);

    }
     connessione=new Socket("localhost",2000);
public void setConnessione(Socket connessione) {
        this.connessione = connessione;
        try{
            out = new DataOutputStream(connessione.getOutputStream());
            in = new DataInputStream(connessione.getInputStream());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString());}
    }
}
