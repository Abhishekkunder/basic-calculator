package calculater;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cal {

	private JFrame frame;
	private JTextField textField;
	private JButton btn00;
	double first;
	double second;
	double result;
	String operation;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cal window = new cal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public cal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 448, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CALCULATOR");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel.setBounds(155, 13, 124, 24);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		textField.setBounds(10, 48, 412, 53);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnbackspace = new JButton("\uF0E7");
		btnbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backspace =null;
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getSelectedText().length()-1);
					backspace=str.toString();
					textField.setText(backspace);
				}
				
			}
		});
		btnbackspace.setFont(new Font("wingdings", Font.BOLD, 20));
		btnbackspace.setBounds(20, 120, 89, 53);
		frame.getContentPane().add(btnbackspace);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num = textField.getText() + btn9.getText();
				textField.setText(num);
			}
		});
		btn9.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btn9.setBounds(20, 184, 89, 53);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num = textField.getText() + btn6.getText();
				textField.setText(num);
			}
		});
		btn6.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btn6.setBounds(20, 248, 89, 53);
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num = textField.getText() + btn1.getText();
				textField.setText(num);
			}
		});
		btn1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btn1.setBounds(20, 312, 89, 53);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num = textField.getText() + btn0.getText();
				textField.setText(num);
			}
		});
		btn0.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btn0.setBounds(20, 376, 89, 53);
		frame.getContentPane().add(btn0);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnClear.setBounds(119, 120, 89, 53);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num = textField.getText() + btn8.getText();
				textField.setText(num);
			}
		});
		btn8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btn8.setBounds(119, 184, 89, 53);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num = textField.getText() + btn5.getText();
				textField.setText(num);
			}
		});
		btn5.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btn5.setBounds(119, 248, 89, 53);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num = textField.getText() + btn2.getText();
				textField.setText(num);
			}
			
		});
		btn2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btn2.setBounds(119, 312, 89, 53);
		frame.getContentPane().add(btn2);
		
		JButton btndot = new JButton(".");
		btndot.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btndot.setBounds(119, 376, 89, 53);
		frame.getContentPane().add(btndot);
		
		btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num = textField.getText() + btn00.getText();
				textField.setText(num);
			}
		});
		btn00.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btn00.setBounds(218, 120, 89, 53);
		frame.getContentPane().add(btn00);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num = textField.getText() + btn7.getText();
				textField.setText(num);
			}
		});
		btn7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btn7.setBounds(218, 184, 89, 53);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num = textField.getText() + btn4.getText();
				textField.setText(num);
			}
		});
		btn4.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btn4.setBounds(218, 248, 89, 53);
		frame.getContentPane().add(btn4);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num = textField.getText() + btn3.getText();
				textField.setText(num);
			}
		});
		btn3.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btn3.setBounds(218, 312, 89, 53);
		frame.getContentPane().add(btn3);
		
		JButton btneq = new JButton("=");
		btneq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
			}
		});
		btneq.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btneq.setBounds(218, 376, 89, 53);
		frame.getContentPane().add(btneq);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
				
			}
		});
		btnplus.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnplus.setBounds(317, 120, 89, 53);
		frame.getContentPane().add(btnplus);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnsub.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnsub.setBounds(317, 184, 89, 53);
		frame.getContentPane().add(btnsub);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnX.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnX.setBounds(317, 248, 89, 53);
		frame.getContentPane().add(btnX);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btndiv.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btndiv.setBounds(317, 312, 89, 53);
		frame.getContentPane().add(btndiv);
		
		JButton btnper = new JButton("%");
		btnper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnper.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnper.setBounds(317, 376, 89, 53);
		frame.getContentPane().add(btnper);
	}
}
