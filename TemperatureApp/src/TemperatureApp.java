import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.MouseMotionAdapter;
import java.nio.channels.ShutdownChannelGroupException;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import java.awt.Font;

public class TemperatureApp {

	private JFrame frame;
	private final Button button1 = new Button("Convert to Celsius");
	private final Button button2 = new Button("Convert to Fahrenheit");
	private TextField input1 = new TextField();
	private TextField input2 = new TextField();
	private TextField Answer1 = new TextField();
	private TextField textField = new TextField();
	private JLabel label = new JLabel();
	private JLabel label2 = new JLabel();
	private JLabel label3 = new JLabel();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TemperatureApp window = new TemperatureApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TemperatureApp() {
		initialize();
		button1Action();
		button2Action();

	}

	private void button1Action() {
		button1.setBounds(192, 121, 172, 36);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1;
				double answer1;
				try {
					num1 = Integer.parseInt(input1.getText());
					answer1 = (num1 - 32) / 1.8;
					Answer1.setText(Integer.toString((int) answer1)); // Converting
																		// Answer
																		// to
																		// Text
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Please Enter valid input!");
				}
			}
		});

	}

	private void button2Action() {
		button2.setBounds(563, 121, 172, 36);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double num2, answer2;
					num2 = Integer.parseInt(input2.getText());
					answer2 = ((num2 * 9) / 5.0 + 32);
					textField.setText(Integer.toString((int) answer2));

				} catch (Exception e3) {
					JOptionPane.showMessageDialog(null, "Please Enter valid input!");
				}
			}

		});
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 204));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(button1);

		this.input1 = new TextField();
		input1.setBounds(174, 33, 206, 65);
		frame.getContentPane().add(input1);

		this.Answer1 = new TextField();
		Answer1.setBounds(174, 180, 206, 59);
		Answer1.setBackground(new Color(204, 204, 204));
		frame.getContentPane().add(Answer1);
		input2.setBounds(552, 33, 206, 65);
		frame.getContentPane().add(input2);
		textField.setBounds(552, 180, 206, 59);
		textField.setBackground(new Color(204, 204, 204));
		textField.setEnabled(false);
		frame.getContentPane().add(textField);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		frame.getContentPane().add(button2);

		this.label = new JLabel("Fahrenheit:");
		label.setBounds(12, 60, 156, 24);
		label.setFont(new Font("DialogInput", Font.PLAIN, 23));
		frame.getContentPane().add(label);

		this.label2 = new JLabel("Celsius:");
		label2.setBounds(434, 55, 140, 34);
		label2.setFont(new Font("DialogInput", Font.PLAIN, 23));
		frame.getContentPane().add(label2);

		this.label3 = new JLabel("Answer:");
		label3.setBounds(72, 192, 129, 36);
		label3.setFont(new Font("DialogInput", Font.PLAIN, 23)); //Change1
		frame.getContentPane().add(label3);

		frame.getContentPane().add(textField);

		frame.setBounds(100, 100, 859, 379);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
