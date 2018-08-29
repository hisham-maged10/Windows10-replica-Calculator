package scientific_calculators;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SecondDegree extends JFrame {

	public static JPanel contentPane;
	public static JTextField txtA;
	public static JTextField txtB;
	public static JTextField txtC;
	public static JLabel label;
	public static JLabel label_1;
	public static int counter=1;
	public static double answer1;
	public static double answer2;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondDegree frame = new SecondDegree();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SecondDegree() {
		setTitle("2nd Degree Factorization By Hisham Maged");
		setBounds(100, 100, 685, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterA = new JLabel("Enter a:");
		lblEnterA.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 21));
		lblEnterA.setBounds(12, 73, 76, 62);
		contentPane.add(lblEnterA);
		
		
		JLabel lblAx = new JLabel("ax²±bx±c=0");
		lblAx.setHorizontalAlignment(SwingConstants.CENTER);
		lblAx.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		lblAx.setBounds(102, 31, 429, 40);
		contentPane.add(lblAx);
		
		JLabel lblEnterB = new JLabel("Enter b:");
		lblEnterB.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 21));
		lblEnterB.setBounds(12, 130, 76, 62);
		contentPane.add(lblEnterB);
		
		JLabel lblEnterC = new JLabel("Enter c:");
		lblEnterC.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 21));
		lblEnterC.setBounds(12, 185, 76, 62);
		contentPane.add(lblEnterC);
		
		txtA = new JTextField();
		txtA.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent typed) {
			char c=typed.getKeyChar();
			if(!(Character.isDigit(c)) || Character.isDigit(c)) {
					typed.consume();
			}
			}
		});
		txtA.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		txtA.setBounds(87, 97, 233, 22);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent typed) {
			char c=typed.getKeyChar();
			if(!(Character.isDigit(c)) || Character.isDigit(c)) {
				typed.consume();
		}
		}
		});
		txtB.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		txtB.setColumns(10);
		txtB.setBounds(87, 154, 233, 22);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent typed) {
			char c=typed.getKeyChar();
			if(!(Character.isDigit(c)) || Character.isDigit(c)) {
				typed.consume();
		}
		}
		});
		txtC.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		txtC.setColumns(10);
		txtC.setBounds(87, 209, 233, 22);
		contentPane.add(txtC);
		
		JLabel lblRoot1 = new JLabel("Root 1:");
		lblRoot1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 21));
		lblRoot1.setBounds(183, 227, 76, 62);
		contentPane.add(lblRoot1);
		
		JLabel lblRoot = new JLabel("Root 2:");
		lblRoot.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 21));
		lblRoot.setBounds(422, 227, 76, 62);
		contentPane.add(lblRoot);
		
		 label = new JLabel();
		label.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 21));
		label.setBounds(250, 235, 158, 40);
		contentPane.add(label);
		
		 label_1 = new JLabel();
		label_1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 21));
		label_1.setBounds(497, 235, 158, 40);
		contentPane.add(label_1);
		
		JButton btnNewButton = new JButton("Solve");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operation();
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(12, 250, 145, 25);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(counter)
				{
				case 1:txtA.setText(txtA.getText()+"1");
				break;
				case 2:txtB.setText(txtB.getText()+"1");
				break;
				case 3:txtC.setText(txtC.getText()+"1");
				break;
				}
			}
		});
		button.setBackground(Color.LIGHT_GRAY);
		button.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 11));
		button.setBounds(392, 96, 39, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(counter)
				{
				case 1:txtA.setText(txtA.getText()+"2");
				break;
				case 2:txtB.setText(txtB.getText()+"2");
				break;
				case 3:txtC.setText(txtC.getText()+"2");
				break;
				}
			}
		});
		button_1.setBackground(Color.LIGHT_GRAY);
		button_1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 10));
		button_1.setBounds(434, 96, 39, 25);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(counter)
				{
				case 1:txtA.setText(txtA.getText()+"3");
				break;
				case 2:txtB.setText(txtB.getText()+"3");
				break;
				case 3:txtC.setText(txtC.getText()+"3");
				break;
				}
			}
		});
		button_2.setBackground(Color.LIGHT_GRAY);
		button_2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 10));
		button_2.setBounds(476, 96, 39, 25);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("6");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(counter)
				{
				case 1:txtA.setText(txtA.getText()+"6");
				break;
				case 2:txtB.setText(txtB.getText()+"6");
				break;
				case 3:txtC.setText(txtC.getText()+"6");
				break;
				}
			}
		});
		button_3.setBackground(Color.LIGHT_GRAY);
		button_3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 10));
		button_3.setBounds(476, 130, 39, 25);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(counter)
				{
				case 1:txtA.setText(txtA.getText()+"4");
				break;
				case 2:txtB.setText(txtB.getText()+"4");
				break;
				case 3:txtC.setText(txtC.getText()+"4");
				break;
				}
			}
		});
		button_4.setBackground(Color.LIGHT_GRAY);
		button_4.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 10));
		button_4.setBounds(392, 130, 39, 25);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(counter)
				{
				case 1:txtA.setText(txtA.getText()+"5");
				break;
				case 2:txtB.setText(txtB.getText()+"5");
				break;
				case 3:txtC.setText(txtC.getText()+"5");
				break;
				}
			}
		});
		button_5.setBackground(Color.LIGHT_GRAY);
		button_5.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 10));
		button_5.setBounds(434, 130, 39, 25);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("9");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(counter)
				{
				case 1:txtA.setText(txtA.getText()+"9");
				break;
				case 2:txtB.setText(txtB.getText()+"9");
				break;
				case 3:txtC.setText(txtC.getText()+"9");
				break;
				}
			}
		});
		button_6.setBackground(Color.LIGHT_GRAY);
		button_6.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 10));
		button_6.setBounds(476, 167, 39, 25);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.setBackground(Color.LIGHT_GRAY);
		button_7.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 10));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(counter)
				{
				case 1:txtA.setText(txtA.getText()+"7");
				break;
				case 2:txtB.setText(txtB.getText()+"7");
				break;
				case 3:txtC.setText(txtC.getText()+"7");
				break;
				}
			}
		});
		button_7.setBounds(392, 167, 39, 25);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(counter)
				{
				case 1:txtA.setText(txtA.getText()+"8");
				break;
				case 2:txtB.setText(txtB.getText()+"8");
				break;
				case 3:txtC.setText(txtC.getText()+"8");
				break;
				}
			}
		});
		button_8.setBackground(Color.LIGHT_GRAY);
		button_8.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 10));
		button_8.setBounds(434, 167, 39, 25);
		contentPane.add(button_8);
		
		JButton btnNewButton_1 = new JButton("Nxt");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter=2;
			}
		});
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 5));
		btnNewButton_1.setBounds(323, 96, 27, 25);
		contentPane.add(btnNewButton_1);
		
		JButton button_9 = new JButton("New button");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter=3;
			}
		});
		button_9.setBackground(Color.LIGHT_GRAY);
		button_9.setBounds(323, 153, 27, 25);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("New button");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter=1;
			}
		});
		button_10.setBackground(Color.LIGHT_GRAY);
		button_10.setBounds(323, 208, 27, 25);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton(".");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(counter)
				{
				case 1:txtA.setText(txtA.getText()+".");
				break;
				case 2:txtB.setText(txtB.getText()+".");
				break;
				case 3:txtC.setText(txtC.getText()+".");
				break;
				}
			}
		});
		button_11.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		button_11.setBackground(Color.LIGHT_GRAY);
		button_11.setBounds(434, 205, 39, 25);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("0");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switch(counter)
				{
				case 1:txtA.setText(txtA.getText()+"0");
				break;
				case 2:txtB.setText(txtB.getText()+"0");
				break;
				case 3:txtC.setText(txtC.getText()+"0");
				break;
				}
			}
		});
		button_12.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 10));
		button_12.setBackground(Color.LIGHT_GRAY);
		button_12.setBounds(392, 205, 39, 25);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("←");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(counter)
				{
				case 1:
				int length=txtA.getText().length();
				int numbertobedeleted=length-1;
				String store;
				if(length > 0)
				{
					StringBuilder Backspace=new StringBuilder(txtA.getText());
					Backspace.deleteCharAt(numbertobedeleted);
					store=Backspace.toString();
					txtA.setText(store);
				}
				break;
				case 2:
					int length2=txtB.getText().length();
				int numbertobedeleted2=length2-1;
				String store2 = null;
				if(length2 > 0)
				{
					StringBuilder Backspace=new StringBuilder(txtB.getText());
					Backspace.deleteCharAt(numbertobedeleted2);
					store=Backspace.toString();
					txtB.setText(store2);
				}
				break;
				case 3:
				int length3=txtC.getText().length();
				int numbertobedeleted3=length3-1;
				String store3 = null;
				if(length3 > 0)
				{
					StringBuilder Backspace=new StringBuilder(txtC.getText());
					Backspace.deleteCharAt(numbertobedeleted3);
					store2=Backspace.toString();
					txtC.setText(store3);
				}
				break;
				}
				
			}
			
		}
		);
		button_13.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 6));
		button_13.setBackground(Color.LIGHT_GRAY);
		button_13.setBounds(476, 205, 39, 25);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("-");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(counter)
				{
				case 1:txtA.setText(txtA.getText()+"-");
				break;
				case 2:txtB.setText(txtB.getText()+"-");
				break;
				case 3:txtC.setText(txtC.getText()+"-");
				break;
				}
			}
		});
		button_14.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 10));
		button_14.setBackground(Color.LIGHT_GRAY);
		button_14.setBounds(527, 96, 39, 25);
		contentPane.add(button_14);
		
		JLabel lblIfTheCoefficient = new JLabel("If the coefficient doesn't exist please input zero");
		lblIfTheCoefficient.setBounds(380, 13, 275, 16);
		contentPane.add(lblIfTheCoefficient);
		
	}
	public void operation()
	{
		double a=Double.parseDouble(txtA.getText());
		double b=Double.parseDouble(txtB.getText());
		double c=Double.parseDouble(txtC.getText());
		if(txtA.getText().equals(""))
		{
			a=0;
		}
		if(txtB.getText().equals(""))
		{
			b=0;
		}
		if(txtC.getText().equals(""))
		{
			c=0;
		}
		 answer1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		 answer2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		 if(Double.isNaN(answer1) || Double.isNaN(answer2))
		 {
			label.setText("Imaginary");
			label_1.setText("Imaginary"); 
		 }
		 else
		 {
		 label.setText(Double.toString(answer1));
		 label_1.setText(Double.toString(answer2));
		 }
		 }
}
