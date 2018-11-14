import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements MouseListener {
 
	
JFrame frame = new JFrame();
JPanel pan = new JPanel();
JLabel lab = new JLabel();
JTextField text = new JTextField(16);
JButton button = new JButton("CONVERT");
public static void main(String[] args) {
new BinaryConverter().converter();
}
private void converter() {
	frame.setVisible(true);
	frame.setSize(300, 300);
	frame.add(pan);
	pan.add(text);
pan.add(button);
pan.add(lab);
frame.pack();
button.addMouseListener(this);
}
String convert(String input) {
    if(input.length() != 8){
         JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
         return "-";
    }
    String binary = "[0-1]+";    //must contain numbers in the given range
    if (!input.matches(binary)) {
         JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
         return "-";
    }
    try {
         int asciiValue = Integer.parseInt(input, 2);
         char theLetter = (char) asciiValue;
         return "" + theLetter;
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
         return "-";
    }
}
}
