import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Calculator {
    private JFrame frame = new JFrame("Calculator");
    private JTextArea textScreen = new JTextArea();

    //Constructor
    public Calculator() {

        //frame 

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(400,500);
        //frame.setResizable(true);
        frame.setLayout(null);

        //textScreen

        textScreen.setSize(380,100);
        textScreen.setLocation(7, 5);
        textScreen.setEditable(false);
    }

}
