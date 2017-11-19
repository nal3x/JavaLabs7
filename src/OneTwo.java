import javax.swing.*;
import java.awt.*;

class OneTwoFrame extends JFrame {
    
    private JButton one, two;

    public OneTwoFrame() {

     
    super("New Frame"); // Τίτλος Πλαισίου
    setSize(250,100); //μέγεθος του παραθύρου σε 250 px πλάτος και 100 px ύψος
    setLocationRelativeTo(null); //κεντράρει το παράθυρο στην οθόνη

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Κλείνει η εφαρμογή με κλικ στο κουμπί «Κλείσιμο» της γραμμής τίτλου
           
    setVisible(true); // Το πλαίσιο να είναι ορατό

    
    one=new JButton("One"); // Δημιουργία των 2 κουμπιών
    two=new JButton("Two");

    Container pane=getContentPane();
    // Δημιουργία υποδοχέα (container)
    // Η κλάση JFrame δεν αποτελεί container από μόνη της. Ο container 
    // που αντιστοιχεί στο frame λαμβάνεται με τη μέθοδο getContentPane() 
    // της κλάσης JFrame  

    FlowLayout flo=new FlowLayout(); // Δημιουργία διαχειριστή διάταξης

    // Η θέση ενός component σε ένα container καθορίζεται από το layout 
    // manager.

    /*  Αν πρέπει να ελέγχετε το μέγεθος ή τη θέση των components με τρόπο 
        που δεν μπορεί να γίνει με κάποιον από τους συνήθεις layout 
        managers είναι δυνατό να απενεργοποιήσετε το layout manager 
        δίνοντας την ακόλουθη κλήση μεθόδου στον container σας:
        setLayout(null);
        Μετά αυτό το βήμα θα πρέπει να χρησιμοποιήσετε τα setLocation(), 
        setSize() ή setBounds() σε component για να τα τοποθετήσετε σε 
        container. */

    // Το flow layout που χρησιμοποιείται σε αυτό το παράδειγμα τοποθετεί 
    // τα components με βάση γραμμή-γραμμή. Κάθε φορά που γεμίζει μία 
    // γραμμή ξεκινά μία άλλη.

    pane.setLayout(flo); // Σύνδεση διαχειριστή διάταξης με τον υποδοχέα

    
    pane.add(one); // Προσθήκη κουμπιών στον υποδοχέα
    pane.add(two);
    
    setContentPane(pane); // Τοποθέτηση υποδοχέα στο πλαίσιο
    
    }
}

public class OneTwo {
    public static void main(String[] args) {
        OneTwoFrame a = new OneTwoFrame();
    }
}