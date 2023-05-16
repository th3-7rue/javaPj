package verificamaggio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Grafica extends Frame implements ActionListener {
            Clinica clinica = new Clinica();

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Aggiungi una nuova cartella clinica":
                System.out.println(clinica.aggiungi());
                break;
            case "Cancella una cartella clinica":
                System.out.println(clinica.cancella());
                break;
            case "Visualizza tutte le cartelle cliniche":
                System.out.println(clinica.visualizza());
                break;
            case "Cerca una cartella clinica":
                System.out.println(clinica.cerca());
                break;
            case "Ordina le cartelle cliniche":
                System.out.println(clinica.ordina());
                break;
            default:
                System.out.println("Scelta non valida!");
                break;
        }
    }

    Grafica() {
        // creazione finestra
        JFrame f = new JFrame("ClinicaRasori");
        // creazione pulsanti
        JButton b1 = new JButton("Aggiungi una nuova cartella clinica");
        JButton b2 = new JButton("Cancella una cartella clinica");
        JButton b3 = new JButton("Visualizza tutte le cartelle cliniche");
        JButton b4 = new JButton("Cerca una cartella clinica");
        JButton b5 = new JButton("Ordina le cartelle cliniche");
        JButton b6 = new JButton("Esci");
        // posizionamento pulsanti
        b1.setBounds(50, 100, 300, 30);
        b2.setBounds(50, 150, 300, 30);
        b3.setBounds(50, 200, 300, 30);
        b4.setBounds(50, 250, 300, 30);
        b5.setBounds(50, 300, 300, 30);
        b6.setBounds(50, 350, 300, 30);
        // aggiunta pulsanti alla finestra
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        // aggiunta listener ai pulsanti
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(e -> {
            System.out.println("Arrivederci!");
            System.exit(0);
        });

        // crea nuovo frame per visualizzare il println e inserire il dato relativo
        JFrame f2 = new JFrame("Inserisci il nome del paziente");
        JTextField t = new JTextField();
        t.setBounds(50, 50, 300, 30);
        f2.add(t);
        f2.setSize(400, 200);
        f2.setLayout(null);
        f2.setVisible(false);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // impostazioni finestra
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Grafica();
    }
}
