package calc_spe;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;

public class Calculator {

	private JFrame frame;
	private JTextField textField_1;

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
		frame.setBounds(100, 100, 250, 400 );
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(12, 12, 216, 43);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		final JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Dialog", Font.BOLD, 20));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField_1.getText() + btn7.getText();
				textField_1.setText(number);
			}
		});
		btn7.setBounds(12, 83, 50, 50);
		frame.getContentPane().add(btn7);
		
		final JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Dialog", Font.BOLD, 20));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField_1.getText() + btn8.getText();
				textField_1.setText(number);
			}
		});
		btn8.setBounds(68, 83, 50, 50);
		frame.getContentPane().add(btn8);
		

		final JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Dialog", Font.BOLD, 20));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 	
				String number = textField_1.getText() + btn9.getText();
				textField_1.setText(number);
			}
		});
		btn9.setBounds(124, 83, 50, 50);
		frame.getContentPane().add(btn9);
		
		final JButton btnFact = new JButton("!");
		btnFact.setForeground(SystemColor.desktop);
		btnFact.setFont(new Font("Dialog", Font.BOLD, 18));
		btnFact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField_1.getText() + btnFact.getText();
				textField_1.setText(number);
			}
		});
		btnFact.setBounds(180, 83, 60, 50);
		frame.getContentPane().add(btnFact);
		
		final JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Dialog", Font.BOLD, 20));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField_1.getText() + btn4.getText();
				textField_1.setText(number);
			}
		});
		btn4.setBounds(12, 139, 50, 50);
		frame.getContentPane().add(btn4);
		
		final JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Dialog", Font.BOLD, 20));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField_1.getText() + btn5.getText();
				textField_1.setText(number);
			}
		});
		btn5.setBounds(68, 139, 50, 50);
		frame.getContentPane().add(btn5);
		

		final JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Dialog", Font.BOLD, 20));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField_1.getText() + btn6.getText();
				textField_1.setText(number);
			}
		});
		btn6.setBounds(124, 139, 50, 50);
		frame.getContentPane().add(btn6);
		
		final JButton btnLog = new JButton("ln");
		btnLog.setForeground(SystemColor.desktop);
		btnLog.setFont(new Font("Dialog", Font.BOLD, 18));
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField_1.getText() + btnLog.getText();
				textField_1.setText(number);
			}
		});
		btnLog.setBounds(180, 139, 60, 50);
		frame.getContentPane().add(btnLog);
		
		
		final JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Dialog", Font.BOLD, 20));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField_1.getText() + btn1.getText();
				textField_1.setText(number);
			}
		});
		btn1.setBounds(12, 195, 50, 50);
		frame.getContentPane().add(btn1);
		
		final JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Dialog", Font.BOLD, 20));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField_1.getText() + btn2.getText();
				textField_1.setText(number);
			}
		});
		btn2.setBounds(68, 195, 50, 50);
		frame.getContentPane().add(btn2);
		

		final JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Dialog", Font.BOLD, 20));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField_1.getText() + btn3.getText();
				textField_1.setText(number);
			}
		});
		btn3.setBounds(124, 195, 52, 50);
		frame.getContentPane().add(btn3);
		
		final JButton btnSqrt = new JButton("???");
		btnSqrt.setForeground(SystemColor.desktop);
		btnSqrt.setFont(new Font("Dialog", Font.BOLD, 18));
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField_1.getText() + btnSqrt.getText();
				textField_1.setText(number);
			}
		});
		btnSqrt.setBounds(180, 195, 60, 50);
		frame.getContentPane().add(btnSqrt);
		
		final JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Dialog", Font.BOLD, 20));
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField_1.getText() + btnDot.getText();
				textField_1.setText(number);
			}
		});
		btnDot.setBounds(12, 251, 52, 50);
		frame.getContentPane().add(btnDot);
		
		final JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Dialog", Font.BOLD, 20));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField_1.getText() + btn0.getText();
				textField_1.setText(number);
			}
		});
		btn0.setBounds(68, 251, 52, 50);
		frame.getContentPane().add(btn0);
		

		JButton btnEq = new JButton("\u003D");
		btnEq.setForeground(SystemColor.desktop);
		btnEq.setFont(new Font("Dialog", Font.BOLD, 20));
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            double result = Evaluate.evaluate(textField_1.getText());
	            String output = Double.toString(result);
	            textField_1.setText(output);
			}
		});
		btnEq.setBounds(124, 251, 52, 50);
		frame.getContentPane().add(btnEq);
		
		final JButton btnPower = new JButton("^");
		btnPower.setForeground(SystemColor.desktop);
		btnPower.setFont(new Font("Dialog", Font.BOLD, 18));
		btnPower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField_1.getText() + btnPower.getText();
				textField_1.setText(number);
			}
		});
		btnPower.setBounds(180, 251, 60, 50);
		frame.getContentPane().add(btnPower);
		
		JButton btnClear = new JButton("C");
		btnClear.setForeground(SystemColor.desktop);
		btnClear.setFont(new Font("Dialog", Font.BOLD, 18));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str = textField_1.getText();
				String result = "";
				if ((str != null) && (str.length() > 0)) {
				      result = str.substring(0, str.length() - 1);
				   }
				textField_1.setText(result);
			}
		});
		btnClear.setBounds(80, 310, 68, 50);
		frame.getContentPane().add(btnClear);
		
		JButton btnAllClear = new JButton("AC");
		btnAllClear.setForeground(SystemColor.desktop);
		btnAllClear.setFont(new Font("Dialog", Font.BOLD, 18));
		btnAllClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_1.setText("");
			}
		});
		btnAllClear.setBounds(160, 310, 68, 50);
		frame.getContentPane().add(btnAllClear);
		
		
	}
}
