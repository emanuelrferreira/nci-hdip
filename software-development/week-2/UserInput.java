import javax.swing.JOptionPane;
public class UserInput {
	public static void main(String[] args){
		// declare variables
		String msg=JOptionPane.showInputDialog(null, "Please enter a message"); // always is treated as a string
		//output
		JOptionPane.showMessageDialog(null, msg);
		int choice=JOptionPane.showConfirmDialog(null, "Was that ok?");
		JOptionPane.showMessageDialog(null, choice);
	}
}