import javax.swing.JOptionPane;

public class number {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,
				"Pick a number between 1 and 10");
		JOptionPane.showMessageDialog(null,
				"The number is "+ (1 + (int)(Math.random()*10)));

	}

}
