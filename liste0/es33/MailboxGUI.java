package es33;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MailboxGUI extends JFrame {
    private Mailbox mailbox;
    private JTextArea emailArea;
    private JButton viewButton;
    private JButton removeButton;
    private JSpinner emailSpinner;

    public MailboxGUI() {
        // Inizializza la mailbox con qualche email di esempio
        mailbox = new Mailbox();
        mailbox.addEmail(new Email("giuseppe@gmail.com", "Ciao!", "Ciao come stai?", "2022-12-31 12:00"));
        mailbox.addEmail(new Email("maria@hotmail.com", "Domanda sul progetto",
                "Ciao, ho una domanda sul progetto. Puoi aiutarmi?", "2022-12-31 13:00"));

        // Crea il pannello principale
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Crea l'area di testo per visualizzare le email
        emailArea = new JTextArea(10, 40);
        emailArea.setEditable(false);

        // Crea il pannello superiore con lo spinner per selezionare la email e il
        // pulsante di visualizzazione
        JPanel topPanel = new JPanel(new FlowLayout());
        emailSpinner = new JSpinner(new SpinnerNumberModel(1, 1, mailbox.size(), 1));
        viewButton = new JButton("View");
        viewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int index = (int) emailSpinner.getValue() - 1;
                Email email = mailbox.getEmailAt(index);
                if (email != null) {
                    emailArea.setText(email.toString());
                } else {
                    emailArea.setText("Invalid email index");
                }
            }
        });
        topPanel.add(new JLabel("Email:"));
        topPanel.add(emailSpinner);
        topPanel.add(viewButton);

        // Crea il pannello inferiore con il pulsante di rimozione
        JPanel bottomPanel = new JPanel(new FlowLayout());
        removeButton = new JButton("Remove");
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int index = (int) emailSpinner.getValue() - 1;
                boolean success = mailbox.removeEmailAt(index);
                if (success) {
                    emailSpinner.setModel(new SpinnerNumberModel(1, 1, mailbox.size(), 1));
                    emailArea.setText("");
                } else {
                    emailArea.setText("Invalid email index");
                }
            }
        });
        bottomPanel.add(removeButton);

        // Aggiunge i pannelli al pannello principale
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(new JScrollPane(emailArea), BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        // Configura la finestra
        setTitle("Mailbox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new MailboxGUI();
    }
}
