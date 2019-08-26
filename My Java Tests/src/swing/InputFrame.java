package swing;
import javax.swing.*;
import java.awt.*;

public class InputFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Test Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Enter text");
		panel.add(label);
		JTextArea ta = new JTextArea();
		frame.getContentPane().add(BorderLayout.SOUTH, panel);
		frame.getContentPane().add(BorderLayout.CENTER, ta);
		frame.setVisible(true);

	}

}
