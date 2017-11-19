import javax.swing.*;
import java.awt.*;

class NewFrame extends JFrame {
    private JLabel etiketa;
    private JTextField onoma;


    public NewFrame() {
        
        super("Εισαγωγή Κειμένου"); // Τίτλος Πλαισίου

        // Δεν είναι απαραίτητη η χρήση της setSize από την στιγμή που 
        // χρησιμοποιούμε την pack() μέθοδο στη συνέχεια
        // setSize(650,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); // Το πλαίσιο να είναι ορατό

           
        etiketa = new JLabel("Ονοματεπώνυμο : ", JLabel.RIGHT);// Δημιουργία ετικέτας
        onoma = new JTextField(40); // Δημιουργία χώρου για να γράψουμε με μήκος 40 χαρακτήρες 
        Container pane=getContentPane(); // Δημιουργία υποδοχέα

        FlowLayout flo=new FlowLayout(); // Δημιουργία διαχειριστή διάταξης   
        pane.setLayout(flo); // Σύνδεση διαχειριστή διάταξης με τον υποδοχέα

        pane.add(etiketa);// Πρόσθεση ετικέτας στον υποδοχέα          
        pane.add(onoma); // Πρόσθεση ονόματος στον υποδοχέα
        setContentPane(pane); // Τοποθέτηση υποδοχέα στο πλαίσιο
        
        pack(); //Γέμισμα του πλαισίου
        /* Η μέθοδος pack() αυτόματα δίνει διαστάσεις στο
        JFrame ανάλογα με τις διαστάσεις των components που βάζουμε μέσα του 
        και ανάλογα την θέση στην οποία βάζουμε καθένα από τα components */
        
    }
}


public class Onomateponymo {
    public static void main(String[] args) {
        NewFrame a=new NewFrame();
    }
}