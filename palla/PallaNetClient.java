import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
public class PallaNetClient extends JFrame implements ActionListener{
    private Socket connessione = null;
    private DataOutputStream out = null;
    private DataInputStream in = null;
    public PallaNetClient() {
        super("PallaNetClient");
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        connetti();
        this.setVisible(true);
    }
}
public void connetti(){
    try{
        connessione = new Socket("localhost", 2000);
        out = new DataOutputStream(connessione.getOutputStream());
        in = new DataInputStream(connessione.getInputStream());
    }catch{
        JOptionPane.showMessageDialog(null, e.toString());
        System.exit(-1);
    }
    Container c = this.getContentPane();
    PannelloClient pannello = new PannelloClient(this, this.getSize());
    c.add(pannello);
}