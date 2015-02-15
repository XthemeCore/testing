import javax.swing.*;
 
public class Adder{
    public static void main(String[] args){
        String firstNumber,secondNumber,result;
        int sum;
        JTextField firstField = new JTextField(4);
        JTextField secondField = new JTextField(4);
        JPanel adderPanel = new JPanel();
        adderPanel.add(new JLabel("First Number:"));
        adderPanel.add(firstField);
        adderPanel.add(new JLabel("Second Number:"));
        adderPanel.add(secondField);
        Object[] choices = {"Calculate"};
    	int calc = JOptionPane.showOptionDialog(null,
                   adderPanel,"Adder",
                   JOptionPane.PLAIN_MESSAGE,
                   JOptionPane.PLAIN_MESSAGE,
                   null,
                   choices,
                   null);
        if (calc == 0) {
            firstNumber = firstField.getText();
            secondNumber = secondField.getText();
            sum = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
            result = Integer.toString(sum);
            JOptionPane.showMessageDialog(adderPanel,"Sum: " + result,"Adder",JOptionPane.PLAIN_MESSAGE);
        }      
    }
}