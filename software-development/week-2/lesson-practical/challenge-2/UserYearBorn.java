import javax.swing.JOptionPane;
public class UserYearBorn {
	public static void main(String[] args){
		int age=Integer.parseInt(JOptionPane.showInputDialog(null, "What's your age?"));
		int year=Integer.parseInt(JOptionPane.showInputDialog(null, "What is the current year?"));
		JOptionPane.showMessageDialog(null, year-age);
	}
}