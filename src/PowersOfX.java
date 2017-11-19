import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.*;


class NewJFrame extends JFrame {
    private JLabel xLabel;
    private JTextField x;
    private JButton calculate;
    private JButton reset;
    private JLabel sqrtLabel;
    private JTextField sqrt;
    private JLabel x2Label;
    private JTextField x2;
    private JLabel x3Label;
    private JTextField x3;
    
    public NewJFrame(){
        super("Calculate Powers of x");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
                
        xLabel = new JLabel("Enter number x:");
        xLabel.setFont(new Font("Consolas", Font.BOLD, 20));
        xLabel.setBounds(20, 20, 200, 30);
        
        x = new JTextField(20);
        x.setBackground(Color.LIGHT_GRAY);
        x.setFont(new Font("Consolas", Font.BOLD, 16));
        x.setBounds(220, 20, 200, 30);
        
        calculate = new JButton("Calculate");
        calculate.setFont(new Font("Consolas", Font.BOLD, 20));
        calculate.setBounds(50, 70, 150, 30);

        reset=new JButton("Reset");
        reset.setFont(new Font("Consolas", Font.BOLD, 20));
        reset.setBounds(220, 70, 150, 30);

        sqrtLabel = new JLabel("Sqrt(x):", JLabel.RIGHT);
        sqrtLabel.setFont(new Font("Consolas", Font.BOLD, 20));
        sqrtLabel.setBounds(80, 120, 120, 30);
    
        sqrt=new JTextField(15);
        sqrt.setBackground(Color.LIGHT_GRAY);
        sqrt.setFont(new Font("Consolas", Font.BOLD, 16));
        sqrt.setBounds(220, 120, 200, 30);

        
        x2Label = new JLabel("x^2:", JLabel.RIGHT);
        x2Label.setFont(new Font("Consolas", Font.BOLD, 20));
        x2Label.setBounds(80, 170, 120, 30);

        x2=new JTextField(15);
        x2.setBackground(Color.LIGHT_GRAY);
        x2.setFont(new Font("Consolas", Font.BOLD, 16));
        x2.setBounds(220, 170, 200, 30);

        
        x3Label = new JLabel("x^3:", JLabel.RIGHT);
        x3Label.setFont(new Font("Consolas", Font.BOLD, 20));
        x3Label.setBounds(80, 220, 120, 30);

        
        x3=new JTextField(15);
        x3.setBackground(Color.LIGHT_GRAY);
        x3.setFont(new Font("Consolas", Font.BOLD, 16));
        x3.setBounds(220, 220, 200, 30);

        Container pane = getContentPane();
 
        pane.setLayout(null);

        pane.add(xLabel);
        pane.add(x);
        pane.add(calculate);
        pane.add(reset);
        pane.add(sqrtLabel);
        pane.add(sqrt);
        pane.add(x2Label);
        pane.add(x2);
        pane.add(x3Label);
        pane.add(x3);

        setContentPane(pane);
       }
}


public class PowersOfX {
    public static void main(String[] args) {
        NewJFrame a=new NewJFrame();
    }
}
