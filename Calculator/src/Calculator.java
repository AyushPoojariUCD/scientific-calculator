import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.lang.Math;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JLabel;
public class Calculator {

	private JFrame frame;
	private JTextField textField;
    double c;   //global variable for tenx
	double a;
	double b;
	String operations;
	String answer;
	double result;
	double z; //For sin and cos converting to radians
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Calibri", Font.PLAIN, 11));
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 520, 645);
		//
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Digiface", Font.BOLD, 59));
		textField.setForeground(new Color(0, 0, 0));
		textField.setBackground(new Color(47, 79, 79));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(-3, 73, 514, 126);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		

		
/////////////////////////////////////////////////////////////////////////////////////////		
		JButton btn9 = new JButton("9");
		btn9.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\9.png"));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setBounds(202, 367, 103, 57);
		frame.getContentPane().add(btn9);
/////////////////////////////////////////////////////////////////////////////////////////		
		JButton btnadd = new JButton("+");
		btnadd.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\plus.png"));
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnadd.setBounds(304, 478, 103, 61);
		frame.getContentPane().add(btnadd);
		
/////////////////////////////////////////////////////////////////////////////////////////		
		//ROW 2//
		JButton btn4 = new JButton("4");
		 btn4.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\4.png"));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setBounds(-3, 422, 103, 57);
		frame.getContentPane().add(btn4);
/////////////////////////////////////////////////////////////////////////////////////////		
		JButton btn5 = new JButton("5");
		 btn5.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\5.png"));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setBounds(101, 422, 103, 57);
		frame.getContentPane().add(btn5);
/////////////////////////////////////////////////////////////////////////////////////////		
		JButton btn6 = new JButton("6");
		
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		
		btn6.setBounds(202, 420, 103, 61);
		 btn6.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\6.png"));
		frame.getContentPane().add(btn6);
/////////////////////////////////////////////////////////////////////////////////////////		
		JButton btnsub = new JButton("-");
		btnsub.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\minus.png"));
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
				}
		});
		
		btnsub.setBounds(408, 478, 103, 61);
		frame.getContentPane().add(btnsub);
		
		//ROW 3//
/////////////////////////////////////////////////////////////////////////////////////////
		JButton btn1 = new JButton("1");
		 btn1.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\1.png"));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setBounds(-3, 478, 103, 61);
		frame.getContentPane().add(btn1);
/////////////////////////////////////////////////////////////////////////////////////////		
		JButton btn2 = new JButton("2");
		 btn2.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\2.png"));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setBounds(101, 478, 103, 61);
		frame.getContentPane().add(btn2);
		
/////////////////////////////////////////////////////////////////////////////////////////		
		JButton btn3 = new JButton("3");
		 btn3.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\3.png"));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		
		btn3.setBounds(202, 478, 103, 61);
		frame.getContentPane().add(btn3);
/////////////////////////////////////////////////////////////////////////////////////////		
		JButton btnmul= new JButton("*");
		 btnmul.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\into.jpg"));
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		 btnmul.setBounds(304, 422, 103, 57);
		frame.getContentPane().add( btnmul);
///////////////////////////////////////////////////////////////////////////////////////		
		//ROW 4//
		JButton btn0 = new JButton("0");
		 btn0.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\0.png"));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setBounds(-3, 535, 102, 54);
		frame.getContentPane().add(btn0);
///////////////////////////////////////////////////////////////////////////////////////		
		JButton btnpoint = new JButton("");
		 btnpoint.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\sqrt.png"));
		btnpoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "sqrt";
			}
			
		});
		 btnpoint.setBounds(-3, 259, 103, 54);
		frame.getContentPane().add( btnpoint);
//////////////////////////////////////////////////////////////////////////////////////		
		JButton btnaddsub= new JButton("/" );
		btnaddsub.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\divide.png"));
		btnaddsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btnaddsub.setBounds(408, 421, 103, 59);
		frame.getContentPane().add(btnaddsub);
		
		JButton btnequal = new JButton("=");
		btnequal.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\equal.png"));
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer = null;
				if(operations =="+" ||operations =="*" ||operations =="/" ||operations =="-" || operations == "xpow" || operations =="hyp" || operations =="tenx")
				{	
				b = Double.parseDouble(textField.getText());
				
				if(operations == "+") {
				result = a + b;
				answer = String.format("%.2f",result);
				textField.setText(answer);
			    }
				else if(operations == "-"){
				result = a - b;	
				answer = String.format("%.2f",result);
				textField.setText(answer);
				}
				else if(operations == "*") {
					result = a * b;	
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations == "/") {
					result = a / b;	
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations == "xpow"){
					result = Math.pow(a, b);	
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations == "hyp") {
					result = Math.hypot(a,b);	
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if (operations == "tenx")
				  {
					c = Math.pow(10,b);
				    result = a*c;	
					answer = String.format("%.2f",result);
					textField.setText(answer);
				  }
				}	
				else
				{
				  if(operations == "sqrt")
				  {
						result = Math.sqrt(a);	
						answer = String.format("%.2f",result);
						textField.setText(answer);
						  
				  }
				  else if(operations == "log")
				  {
						result = Math.log(a);	
						answer = String.format("%.2f",result);
						textField.setText(answer);
						  
				  }
				  else if(operations == "sqr") {
					    result = a*a;	
						answer = String.format("%.2f",result);
						textField.setText(answer);
				  }
				  else if(operations == "sin") {
					    z = Math.toRadians(a);   
					    result =  Math.sin(z); ;	
						answer = String.format("%.2f",result);
						textField.setText(answer);
				  }
				  else if(operations == "cos") {
					    z = Math.toRadians(a);
					    result = Math.cos(z);	
						answer = String.format("%.2f",result);
						textField.setText(answer);
				  }
				  else if(operations == "tan")
				  {
					    z = Math.toRadians(a);
					    result = Math.tan(z);	
						answer = String.format("%.2f",result);
						textField.setText(answer);
				  }
				  else if(operations == "xinv") {
					    
						  result = Math.pow(a, -1);	
							answer = String.format("%.2f",result);
							textField.setText(answer);
				  }
				  
				}
			}
				
			});
		btnequal.setBounds(408, 532, 103, 57);
		frame.getContentPane().add(btnequal);
		
		JButton btnNewButton = new JButton("AC");
		btnNewButton.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\allclear.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(408, 368, 103, 54);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\del.jpg"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().substring(0, textField.getText().length() - 1)); 
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBounds(304, 367, 106, 57);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnlog = new JButton("log");
		btnlog.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\log.png"));
		btnlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "log";
				
			}
		});
		btnlog.setBounds(-3, 314, 106, 54);
		frame.getContentPane().add(btnlog);
		
		JButton btnsqr = new JButton("sqr");
		btnsqr.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\xs.png"));
		btnsqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "sqr";
			}
		});
		btnsqr.setBounds(101, 259, 103, 54);
		frame.getContentPane().add(btnsqr);
		
		JButton btnsin = new JButton("sin");
		 btnsin.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\sin.png"));
		btnsin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "sin";
			}
		});
		btnsin.setBounds(202, 314, 103, 54);
		frame.getContentPane().add(btnsin);
		
		JButton btncos = new JButton("cos");
		btncos.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\cos.png"));
		btncos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "cos";
			}
		});
		btncos.setBounds(304, 314, 106, 54);
		frame.getContentPane().add(btncos);
/////////////////////////////////////////////////////////////////////////////		
		JButton btn8 = new JButton("8");
		 btn8.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\8.png"));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setBounds(101, 367, 103, 57);
		frame.getContentPane().add(btn8);
///////////////////////////////////////////////////////////////////////////////		
		JButton btn7 = new JButton("7");
		btn7.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\7.png"));
		
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setBounds(-3, 367, 103, 57);
		frame.getContentPane().add(btn7);
////////////////////////////////////////////////////////////////////////////////		
		JButton btnNewButton_2 = new JButton("Ans");
		btnNewButton_2.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\ans.png"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(304, 535, 103, 54);
		frame.getContentPane().add(btnNewButton_2);
/////////////////////////////////////////////////////////////////////////////////		
		JButton tenx = new JButton("tenx");
		tenx.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\Untitled.png"));
		tenx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "tenx";
			}
		});
		tenx.setBounds(202, 535, 103, 54);
		frame.getContentPane().add(tenx);
/////////////////////////////////////////////////////////////////////////////////		
		JButton btnNewButton_2_1 = new JButton("point");
		btnNewButton_2_1.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\png.jpg"));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1.setBounds(101, 535, 101, 54);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\replay.png"));
		btnNewButton_4.setBounds(202, 200, 103, 113);
		frame.getContentPane().add(btnNewButton_4);
//////////////////////1		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\shift.png"));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(-3, 200, 113, 61);
		frame.getContentPane().add(btnNewButton_5);
///////////////////////2		
		JButton btnNewButton_5_1 = new JButton("");
		btnNewButton_5_1.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\alpha.png"));
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5_1.setBounds(101, 200, 103, 61);
		frame.getContentPane().add(btnNewButton_5_1);
/////////////////////3		
		JButton btnNewButton_5_2 = new JButton("");
		btnNewButton_5_2.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\mode.png"));
		btnNewButton_5_2.setBounds(408, 200, 103, 61);
		frame.getContentPane().add(btnNewButton_5_2);
////////////////////4		
		JButton btnNewButton_5_3 = new JButton("");
		btnNewButton_5_3.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\on.png"));
		btnNewButton_5_3.setBounds(304, 200, 103, 61);
		frame.getContentPane().add(btnNewButton_5_3);
///////////////////		
		JButton btnNewButton_6 = new JButton("tan");
		btnNewButton_6.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\tan.png"));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "tan";
			}
		});
		btnNewButton_6.setBounds(408, 314, 103, 54);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton xpow= new JButton("xpow");
		xpow.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\xpow.jpg"));
		xpow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    a = Double.parseDouble(textField.getText());
					textField.setText("");
					operations = "xpow";
			}
		});
		xpow.setBounds(304, 259, 103, 54);
		frame.getContentPane().add(xpow);
//////////////////////////////////////////////		
		JButton hyp = new JButton("hyp");
		hyp.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\hyp.png"));
		hyp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    a = Double.parseDouble(textField.getText());
					textField.setText("");
					operations = "hyp";
			}
		});
		hyp.setBounds(408, 259, 103, 54);
		frame.getContentPane().add(hyp);
/////////////////////////////////////////////		
		JButton btnNewButton_7 = new JButton("xinv");
		btnNewButton_7.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\xinv.png"));
		btnNewButton_7.setSelectedIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\xinv.png"));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "xinv";
			}
		});
		btnNewButton_7.setBounds(101, 313, 103, 56);
		frame.getContentPane().add(btnNewButton_7);
/////////////////////////////////////////////////////////////////////////////		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\head.png"));
		lblNewLabel.setBounds(-3, 0, 514, 74);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Calculator\\bottom.png"));
		lblNewLabel_1.setBounds(0, 588, 511, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		
	
/////////////////////////////////////////////////////////////////////////////		
	    
	
	}
}
