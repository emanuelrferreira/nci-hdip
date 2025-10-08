import javax.swing.JOptionPane;
public class UserInput2 {
	public static void main(String[] args){
		int num=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number"));
		JOptionPane.showMessageDialog(null, num*10);
	}
}