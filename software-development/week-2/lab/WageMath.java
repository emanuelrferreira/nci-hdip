import javax.swing.JOptionPane;
public class WageMath {
	public static void main(String[] args){
		double mWage=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your monthly wage:"));
		double wHours=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your weekly hours:"));
		double yWage=mWage*12;
		double hWage=mWage/wHours;
		JOptionPane.showMessageDialog(null, "Your yearly wage is: "+yWage);
		JOptionPane.showMessageDialog(null, "Your paid "+hWage+" per hour");
	}
}