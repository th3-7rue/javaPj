import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ThreadConnessione implements Runnable{
    private PallaNetServer finestra;
    private Thread me;

    public ThreadConnessione(PallaNetServer finestra) {
        this.finestra = finestra;
        me = new Thread(this);
        me.start();
    }
    

    public void run() {
        try{
            ServerSocket server = new ServerSocket(2000);
            finestra.setCon
        }
    }
}
