import javax.swing.JOptionPane;

public class OptionPane1_2 {
    
    public static void main (String[] args) {
    int age = 20;
    JOptionPane.showMessageDialog(null, 
            "H ηλικία σου είναι " + age + " χρονών. ", 
            "Πληροφορίες", 
            JOptionPane.INFORMATION_MESSAGE);
    
    String[] options = {"Yes, please",
                    "No, thanks",
                    "Cancel delete file!"};

    int n = JOptionPane.showOptionDialog(null,
        "Would you like to delete the file ", "Delete Confirmation",
        JOptionPane. DEFAULT_OPTION,
        JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
}    
    
}
    



