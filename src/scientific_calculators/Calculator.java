package scientific_calculators;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Font;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Calculator extends Calculator_main{

	public final int WIDTH=1920;
	public final int HEIGHT=1080;
	public static JFrame jframe;
	static JTextField textField;
	static JLabel calculation;
	static JLabel declbl;
	static JLabel binlbl;
	static JLabel octlbl;
	static JLabel hexlbl;
	static JCheckBoxMenuItem StandardCheck;
	static JCheckBoxMenuItem ScientificCheck;
	static JCheckBoxMenuItem ProgrammerCheck;
	static JCheckBoxMenuItem ConvertorCheck;
	static Calculator calculators;
	public final String PLUS="+";
	public final String MINUS="-";
	public final String MULTI="x";
	public final String DIVIDE="÷";
	public final String MOD="%";
	public final String DOT=".";
	public final int DECIMALPLACES=9;
	public static double[] History=new double[5];
	public static int i;
	public static int count=0;
	public static int countup=0;
	public static boolean negate;
	public static boolean checkst;
	public static boolean checkpr;
	public static boolean checksc;
	public static boolean checkcv;
	public static boolean historyUsed;
	public static boolean dividedbyzero;
	public static JTextField txtConv;
	public static JLabel convertedLbl;
	public static JLabel convertedLbl2;
	public static JLabel convertedLbl3;
	public static JLabel convertedLbl4;
	public static JLabel convertedLbl5;
	public static JComboBox<?> comboBox_1;
	public static JComboBox<?> comboBox;
	public static JComboBox<?> comboBox_2;
	public static JComboBox<?> comboBox_3;
	public static JComboBox<?> comboBox_4;
	public static JComboBox<?> comboBox_5;
	public static JComboBox<?> comboBox_6;
	public static JComboBox<?> comboBox_7;
	public static JComboBox<?> comboBox_8;
	public static JComboBox<?> comboBox_9;
	public static JComboBox<?> comboBox_10;
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run()
			{
				try {
				calculators=new Calculator();
				jframe.setVisible(true);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	public Calculator()
	{
		initialize();
	}
	public void initialize()
	{
		Border emptyBorder= BorderFactory.createEmptyBorder();
		
		jframe= new JFrame();
		jframe.getContentPane().setBackground(Color.WHITE);
		jframe.setResizable(false);
		jframe.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 12));
		jframe.getContentPane().setFont(new Font("Tekton Pro", Font.BOLD, 13));
		jframe.getContentPane().setLayout(null);
		jframe.setTitle("Calculator By Hisham Maged");
		jframe.setBounds(WIDTH/2-190,HEIGHT/2-350,450,547);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent typed) {
			char c=typed.getKeyChar();
			if(!(Character.isDigit(c)) || Character.isDigit(c)) {
				typed.consume();
			}
			}
		});
		jframe.getContentPane().add(textField);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 49));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBackground(UIManager.getColor("Button.light"));
		textField.setBorder(emptyBorder);
		textField.setColumns(10);
		textField.setBounds(0, 40, 439, 106);
		calculation = new JLabel();
		calculation.setBorder(emptyBorder);
		calculation.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		calculation.setVerticalAlignment(SwingConstants.TOP);
		calculation.setHorizontalAlignment(SwingConstants.RIGHT);
		calculation.setBounds(125, 13, 307, 35);
		jframe.getContentPane().add(calculation);
		JLabel lblBin = new JLabel("Hex");
		JLabel lblOct = new JLabel("Oct");
		JLabel label_1 = new JLabel("Bin");
		JLabel lblDec = new JLabel("Dec");
		declbl = new JLabel();
		hexlbl = new JLabel();
		octlbl = new JLabel();
		binlbl = new JLabel();
		
		JButton button = new JButton("%");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				if(negate)
				{
				if(!(calculation.getText().contains(MOD)) && !(textField.getText().contains(MOD))
					&& (!(calculation.getText().contains(PLUS)) && !(textField.getText().contains(PLUS)))
					&& (!(calculation.getText().contains(MULTI)) && !(textField.getText().contains(MULTI)))
					&& (!(calculation.getText().contains(DIVIDE)) && !(textField.getText().contains(DIVIDE)))
						)
				{
				if(!(textField.getText()==null)) {
				number=Double.parseDouble(textField.getText());
				setoperation(8);
				calculation.setText(number+" % ");
				textField.setText("");
				}
				negate=false;
				}
				}
				else if(!historyUsed)
				{
					if(!(calculation.getText().contains(MOD)) && !(textField.getText().contains(MOD))
							&& (!(calculation.getText().contains(PLUS)) && !(textField.getText().contains(PLUS)))
							&& (!(calculation.getText().contains(MINUS)) && !(textField.getText().contains(MINUS)))
							&& (!(calculation.getText().contains(MULTI)) && !(textField.getText().contains(MULTI)))
							&& (!(calculation.getText().contains(DIVIDE)) && !(textField.getText().contains(DIVIDE)))
								)
					{
						if(!(textField.getText().equals(""))) {
						number=Double.parseDouble(textField.getText());
					setoperation(8);
					textField.setText("");
					calculation.setText(number+" % ");
					}
					}
					}
				else
				{
					if(!(calculation.getText().contains(MOD)) || !(textField.getText().contains(MOD))
							&& (!(calculation.getText().contains(PLUS)) || !(textField.getText().contains(PLUS)))
							&& (!(calculation.getText().contains(MINUS)) || !(textField.getText().contains(MINUS)))
							&& (!(calculation.getText().contains(MULTI)) || !(textField.getText().contains(MULTI)))
							&& (!(calculation.getText().contains(DIVIDE)) || !(textField.getText().contains(DIVIDE)))
								)
					{
						if(!(textField.getText().equals(""))) {
						number=Double.parseDouble(textField.getText());
					setoperation(8);
					textField.setText("");
					calculation.setText(number+" % ");
					}
					}
					historyUsed=false;
				}
				}
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button.setBackground(SystemColor.menu);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button.setBackground(Color.WHITE);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button.setBackground(SystemColor.menu);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button.setIcon(null);
		button.setBackground(new Color(255, 255, 255));
		button.setFont(new Font("Segoe UI Semilight", Font.BOLD, 27));
		button.setBounds(0, 146, 112, 58);
		button.setBorder(emptyBorder);
		jframe.getContentPane().add(button);
		
		JButton btnNewButton = new JButton("1/x");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!numericalconversiondone)
				{
					if(dividedbyzero)
					{
						textField.setText("Zero");
						calculation.setText("0/"+number);
						History();
						delete=true;
						dividedbyzero=false;
					}
					else
					{
				number=Double.parseDouble(textField.getText());
				setoperation(7);
				operations();
				calculation.setText("1/"+number);
				delete=true;
					}
			}
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Semilight", Font.BOLD, 27));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				btnNewButton.setBackground(SystemColor.menu);
				
			}

			public void mouseExited(MouseEvent arg0) {
				btnNewButton.setBackground(Color.WHITE);
				
			}

			public void mousePressed(MouseEvent arg0) {
				btnNewButton.setBackground(SystemColor.menu);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		btnNewButton.setBorder(emptyBorder);
		btnNewButton.setBounds(331, 146, 115, 58);
		jframe.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("√");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
				if(!numericalconversiondone)
				{
				number=Double.parseDouble(textField.getText());
				setoperation(6);
				operations();
				calculation.setText("Sqrt("+number+")");
				delete=true;
			}
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		btnNewButton_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 27));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_1.setBackground(SystemColor.menu);
				
			}

			public void mouseExited(MouseEvent arg0) {
				btnNewButton_1.setBackground(Color.WHITE);
				
			}

			public void mousePressed(MouseEvent arg0) {
				btnNewButton_1.setBackground(SystemColor.menu);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		btnNewButton_1.setBorder(emptyBorder);
		btnNewButton_1.setBounds(108, 146, 112, 58); 
		jframe.getContentPane().add(btnNewButton_1);
		
		
		
		JButton btnNewButton_2 = new JButton("x²");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				number=Double.parseDouble(textField.getText());
				setoperation(5);
				operations();
				calculation.setText(number+" ^2 ");
				delete=true;
			}
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		btnNewButton_2.setFont(new Font("Segoe UI Semilight", Font.BOLD, 27));
		
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_2.setBackground(SystemColor.menu);
				
			}

			public void mouseExited(MouseEvent arg0) {
				btnNewButton_2.setBackground(Color.WHITE);
				
			}

			public void mousePressed(MouseEvent arg0) {
				btnNewButton_2.setBackground(SystemColor.menu);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		btnNewButton_2.setBorder(emptyBorder);
		btnNewButton_2.setBounds(219, 146, 112, 58);
		jframe.getContentPane().add(btnNewButton_2);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				calculation.setText("");
				numericalconversiondone=false;
				declbl.setText(textField.getText());
				binlbl.setText(textField.getText());
				octlbl.setText(textField.getText());
				hexlbl.setText(textField.getText());
			}
		});
		btnCe.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				btnCe.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				btnCe.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				btnCe.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		btnCe.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		btnCe.setBackground(SystemColor.menu);
		btnCe.setBorder(emptyBorder);
		btnCe.setBounds(0, 202, 112, 58);
		jframe.getContentPane().add(btnCe);
		
		JButton btnC = new JButton("M-");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
					textField.setText("Memory Cleared");
					calculation.setText("");
					Historylbl.setLength(0);
					Historytxt.setLength(0);
					countertxt=0;
					counterlbl=0;
					ifpresslbl=0;
					ifpresstxt=0;
			}
		});
		btnC.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		btnC.setBorder(emptyBorder);
		btnC.setBackground(SystemColor.menu);
		btnC.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				btnC.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				btnC.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				btnC.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		btnC.setBounds(108, 202, 112, 58);
		jframe.getContentPane().add(btnC);
		
		JButton button_3 = new JButton("←");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equalsIgnoreCase("syntax error") || textField.getText().equalsIgnoreCase("cannot divide by zero"))
				{
					textField.setText("");
				}
				else
				{
				int length=textField.getText().length();
				int numbertobedeleted=length-1;
				String store;
				if(length > 0)
				{
					StringBuilder Backspace=new StringBuilder(textField.getText());
					Backspace.deleteCharAt(numbertobedeleted);
					store=Backspace.toString();
					textField.setText(store);
					length=textField.getText().length();
					if(length > 0)
					{
					numberconvnumerical=Double.parseDouble(textField.getText());
					declbl.setText(textField.getText());
					binlbl.setText(toBinary(numberconvnumerical,DECIMALPLACES));
					octlbl.setText(toOct(numberconvnumerical,DECIMALPLACES));
					hexlbl.setText(toHex(numberconvnumerical,DECIMALPLACES));
					}
					else
					{
						declbl.setText(textField.getText());
						binlbl.setText("");
						octlbl.setText("");
						hexlbl.setText("");
					}
					
				}
				if(textField.getText().equals(""))
				{
					calculation.setText("");
				}
			}
			}
		});
		button_3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_3.setBackground(SystemColor.menu);
		button_3.setBorder(emptyBorder);
		button_3.setBounds(219, 202, 112, 58);
		button_3.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_3.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_3.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_3.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		jframe.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("÷");
		button_4.setBackground(SystemColor.menu);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				if(negate)
				{
				if(!(calculation.getText().contains(MOD)) && !(textField.getText().contains(MOD))
						&& (!(calculation.getText().contains(PLUS)) && !(textField.getText().contains(PLUS)))
						&& (!(calculation.getText().contains(MULTI)) && !(textField.getText().contains(MULTI)))
						&& (!(calculation.getText().contains(DIVIDE)) && !(textField.getText().contains(DIVIDE)))
							)
				{
				if(!(textField.getText().equals(""))) {
				number=Double.parseDouble(textField.getText());
				setoperation(4);
				textField.setText("");
				calculation.setText(number+" ÷ ");
				}
				negate=false;
				}
				}
				else if(!historyUsed)
				{
					if(!(calculation.getText().contains(MOD)) && !(textField.getText().contains(MOD))
							&& (!(calculation.getText().contains(PLUS)) && !(textField.getText().contains(PLUS)))
							&& (!(calculation.getText().contains(MINUS)) && !(textField.getText().contains(MINUS)))
							&& (!(calculation.getText().contains(MULTI)) && !(textField.getText().contains(MULTI)))
							&& (!(calculation.getText().contains(DIVIDE)) && !(textField.getText().contains(DIVIDE)))
								)
					{
						if(!(textField.getText().equals(""))) {
						number=Double.parseDouble(textField.getText());
					setoperation(4);
					textField.setText("");
					calculation.setText(number+" ÷ ");
					}
					}
					}
				else
				{
					if(!(calculation.getText().contains(MOD)) || !(textField.getText().contains(MOD))
							&& (!(calculation.getText().contains(PLUS)) || !(textField.getText().contains(PLUS)))
							&& (!(calculation.getText().contains(MINUS)) || !(textField.getText().contains(MINUS)))
							&& (!(calculation.getText().contains(MULTI)) || !(textField.getText().contains(MULTI)))
							&& (!(calculation.getText().contains(DIVIDE)) || !(textField.getText().contains(DIVIDE)))
								)
					{
						if(!(textField.getText().equals(""))) {
						number=Double.parseDouble(textField.getText());
					setoperation(4);
					textField.setText("");
					calculation.setText(number+" ÷ ");
					}
					}
					historyUsed=false;
				}
				}
				}catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_4.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_4.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_4.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_4.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_4.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		
		button_4.setBorder(emptyBorder);
		button_4.setBounds(331, 202, 115, 58);
		jframe.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("X");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				if(negate)
				{
				if(!(calculation.getText().contains(MOD)) && !(textField.getText().contains(MOD))
						&& (!(calculation.getText().contains(PLUS)) && !(textField.getText().contains(PLUS)))
						&& (!(calculation.getText().contains(MULTI)) && !(textField.getText().contains(MULTI)))
						&& (!(calculation.getText().contains(DIVIDE)) && !(textField.getText().contains(DIVIDE)))
							)
				{
					if(!(textField.getText().equals(""))) {
					number=Double.parseDouble(textField.getText());
				setoperation(3);
				textField.setText("");
				calculation.setText(number+" x ");
				}
					negate=false;
				}
				}
			else if(!historyUsed)
			{
				if(!(calculation.getText().contains(MOD)) && !(textField.getText().contains(MOD))
						&& (!(calculation.getText().contains(PLUS)) && !(textField.getText().contains(PLUS)))
						&& (!(calculation.getText().contains(MINUS)) && !(textField.getText().contains(MINUS)))
						&& (!(calculation.getText().contains(MULTI)) && !(textField.getText().contains(MULTI)))
						&& (!(calculation.getText().contains(DIVIDE)) && !(textField.getText().contains(DIVIDE)))
							)
				{
					if(!(textField.getText().equals(""))) {
					number=Double.parseDouble(textField.getText());
				setoperation(3);
				textField.setText("");
				calculation.setText(number+" x ");
				}
				}
				}
			else
			{
				if(!(calculation.getText().contains(MOD)) || !(textField.getText().contains(MOD))
						&& (!(calculation.getText().contains(PLUS)) || !(textField.getText().contains(PLUS)))
						&& (!(calculation.getText().contains(MINUS)) || !(textField.getText().contains(MINUS)))
						&& (!(calculation.getText().contains(MULTI)) || !(textField.getText().contains(MULTI)))
						&& (!(calculation.getText().contains(DIVIDE)) || !(textField.getText().contains(DIVIDE)))
							)
				{
					if(!(textField.getText().equals(""))) {
					number=Double.parseDouble(textField.getText());
				setoperation(3);
				textField.setText("");
				calculation.setText(number+" x ");
				}
				}
				historyUsed=false;
			}
			}
				}catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		
		button_5.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_5.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_5.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_5.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_5.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_5.setBackground(SystemColor.menu);
		button_5.setBorder(emptyBorder);
		button_5.setBounds(331, 259, 115, 58);
		jframe.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("-");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
					
				if(negate)
				{
				if(!(calculation.getText().contains(MOD)) && !(textField.getText().contains(MOD))
						&& (!(calculation.getText().contains(PLUS)) && !(textField.getText().contains(PLUS)))
						&& (!(calculation.getText().contains(MULTI)) && !(textField.getText().contains(MULTI)))
						&& (!(calculation.getText().contains(DIVIDE)) && !(textField.getText().contains(DIVIDE)))
							)
				{
					if(!(textField.getText().equals(""))) {
					number=Double.parseDouble(textField.getText());
				setoperation(2);
				textField.setText("");
				calculation.setText(number+" - ");
					}
					negate=false;
					}
				}
				else if(!historyUsed)
				{
					if(!(calculation.getText().contains(MOD)) && !(textField.getText().contains(MOD))
							&& (!(calculation.getText().contains(PLUS)) && !(textField.getText().contains(PLUS)))
							&& (!(calculation.getText().contains(MINUS)) && !(textField.getText().contains(MINUS)))
							&& (!(calculation.getText().contains(MULTI)) && !(textField.getText().contains(MULTI)))
							&& (!(calculation.getText().contains(DIVIDE)) && !(textField.getText().contains(DIVIDE)))
								)
					{
						if(!(textField.getText().equals(""))) {
						number=Double.parseDouble(textField.getText());
					setoperation(2);
					textField.setText("");
					calculation.setText(number+" - ");
					}
					}
					}
				else
				{
					if(!(calculation.getText().contains(MOD)) || !(textField.getText().contains(MOD))
							&& (!(calculation.getText().contains(PLUS)) || !(textField.getText().contains(PLUS)))
							&& (!(calculation.getText().contains(MINUS)) || !(textField.getText().contains(MINUS)))
							&& (!(calculation.getText().contains(MULTI)) || !(textField.getText().contains(MULTI)))
							&& (!(calculation.getText().contains(DIVIDE)) || !(textField.getText().contains(DIVIDE)))
								)
					{
						if(!(textField.getText().equals(""))) {
						number=Double.parseDouble(textField.getText());
					setoperation(2);
					textField.setText("");
					calculation.setText(number+" - ");
					}
					}
					historyUsed=false;
				}
				}
				}catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_6.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 47));
		button_6.setBackground(SystemColor.menu);
		button_6.setBorder(emptyBorder);
		button_6.setBounds(331, 315, 115, 58);
		button_6.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_6.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_6.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_6.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		jframe.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("6");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numericalconversiondone=false;
				if(delete)
				{
					textField.setText("");
					delete=false;
				}
				textField.setText(textField.getText()+"6");
				declbl.setText(textField.getText());
				binlbl.setText(toBinary(Double.parseDouble(textField.getText()),DECIMALPLACES));
				octlbl.setText(toOct(Double.parseDouble(textField.getText()),DECIMALPLACES));
				hexlbl.setText(toHex(Double.parseDouble(textField.getText()),DECIMALPLACES));
			}
		});
		button_7.setFont(new Font("Segoe UI Semilight", Font.BOLD, 27));
		button_7.setBorder(emptyBorder);
		button_7.setBackground(SystemColor.menu);
		button_7.setBounds(219, 315, 112, 58);
		button_7.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_7.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_7.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_7.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		jframe.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numericalconversiondone=false;
				if(delete)
				{
					textField.setText("");
					delete=false;
				}
				textField.setText(textField.getText()+"9");
				declbl.setText(textField.getText());
				binlbl.setText(toBinary(Double.parseDouble(textField.getText()),DECIMALPLACES));
				octlbl.setText(toOct(Double.parseDouble(textField.getText()),DECIMALPLACES));
				hexlbl.setText(toHex(Double.parseDouble(textField.getText()),DECIMALPLACES));
			}
		});
		button_8.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_8.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_8.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_8.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_8.setFont(new Font("Segoe UI Semilight", Font.BOLD, 27));
		button_8.setBorder(emptyBorder);
		button_8.setBackground(SystemColor.menu);
		button_8.setBounds(219, 259, 112, 58);
		jframe.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("8");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numericalconversiondone=false;
				if(delete)
				{
					textField.setText("");
					delete=false;
				}
				textField.setText(textField.getText()+"8");
				declbl.setText(textField.getText());
				binlbl.setText(toBinary(Double.parseDouble(textField.getText()),DECIMALPLACES));
				octlbl.setText(toOct(Double.parseDouble(textField.getText()),DECIMALPLACES));
				hexlbl.setText(toHex(Double.parseDouble(textField.getText()),DECIMALPLACES));
			}
		});
		button_9.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_9.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_9.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_9.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_9.setFont(new Font("Segoe UI Semilight", Font.BOLD, 27));
		button_9.setBorder(emptyBorder);
		button_9.setBackground(SystemColor.menu);
		button_9.setBounds(108, 259, 112, 58);
		jframe.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("5");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numericalconversiondone=false;
				if(delete)
				{
					textField.setText("");
					delete=false;
				}
				textField.setText(textField.getText()+"5");
				declbl.setText(textField.getText());
				binlbl.setText(toBinary(Double.parseDouble(textField.getText()),DECIMALPLACES));
				octlbl.setText(toOct(Double.parseDouble(textField.getText()),DECIMALPLACES));
				hexlbl.setText(toHex(Double.parseDouble(textField.getText()),DECIMALPLACES));
			}
		});
		button_10.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_10.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_10.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_10.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_10.setFont(new Font("Segoe UI Semilight", Font.BOLD, 27));
		button_10.setBorder(emptyBorder);
		button_10.setBackground(SystemColor.menu);
		button_10.setBounds(108, 315, 112, 58);
		jframe.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("4");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numericalconversiondone=false;
				if(delete)
				{
					textField.setText("");
					delete=false;
				}
				textField.setText(textField.getText()+"4");
				declbl.setText(textField.getText());
				binlbl.setText(toBinary(Double.parseDouble(textField.getText()),DECIMALPLACES));
				octlbl.setText(toOct(Double.parseDouble(textField.getText()),DECIMALPLACES));
				hexlbl.setText(toHex(Double.parseDouble(textField.getText()),DECIMALPLACES));
			}
		});
		button_11.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_11.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_11.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_11.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_11.setFont(new Font("Segoe UI Semilight", Font.BOLD, 27));
		button_11.setBorder(emptyBorder);
		button_11.setBackground(SystemColor.menu);
		button_11.setBounds(0, 315, 112, 58);
		jframe.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("7");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numericalconversiondone=false;
				if(delete)
				{
					textField.setText("");
					delete=false;
				}
				textField.setText(textField.getText()+"7");
				declbl.setText(textField.getText());
				binlbl.setText(toBinary(Double.parseDouble(textField.getText()),DECIMALPLACES));
				octlbl.setText(toOct(Double.parseDouble(textField.getText()),DECIMALPLACES));
				hexlbl.setText(toHex(Double.parseDouble(textField.getText()),DECIMALPLACES));
			}
		});
		button_12.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_12.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_12.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_12.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_12.setFont(new Font("Segoe UI Semilight", Font.BOLD, 27));
		button_12.setBorder(emptyBorder);
		button_12.setBackground(SystemColor.menu);
		button_12.setBounds(0, 259, 112, 58);
		jframe.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("1");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numericalconversiondone=false;
				if(delete)
				{
					textField.setText("");
					delete=false;
				}
				textField.setText(textField.getText()+"1");
				declbl.setText(textField.getText());
				binlbl.setText(toBinary(Double.parseDouble(textField.getText()),DECIMALPLACES));
				octlbl.setText(toOct(Double.parseDouble(textField.getText()),DECIMALPLACES));
				hexlbl.setText(toHex(Double.parseDouble(textField.getText()),DECIMALPLACES));
			}
		});
		button_13.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_13.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_13.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_13.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_13.setFont(new Font("Segoe UI Semilight", Font.BOLD, 27));
		button_13.setBorder(emptyBorder);
		button_13.setBackground(SystemColor.menu);
		button_13.setBounds(0, 372, 112, 58);
		jframe.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("2");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numericalconversiondone=false;
				if(delete)
				{
					textField.setText("");
					delete=false;
				}
				textField.setText(textField.getText()+"2");
				declbl.setText(textField.getText());
				binlbl.setText(toBinary(Double.parseDouble(textField.getText()),DECIMALPLACES));
				octlbl.setText(toOct(Double.parseDouble(textField.getText()),DECIMALPLACES));
				hexlbl.setText(toHex(Double.parseDouble(textField.getText()),DECIMALPLACES));
			}
		});
		button_14.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_14.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_14.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_14.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_14.setFont(new Font("Segoe UI Semilight", Font.BOLD, 27));
		button_14.setBorder(emptyBorder);
		button_14.setBackground(SystemColor.menu);
		button_14.setBounds(108, 372, 112, 58);
		jframe.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("3");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numericalconversiondone=false;
				if(delete)
				{
					textField.setText("");
					delete=false;
				}
				textField.setText(textField.getText()+"3");
				declbl.setText(textField.getText());
				binlbl.setText(toBinary(Double.parseDouble(textField.getText()),DECIMALPLACES));
				octlbl.setText(toOct(Double.parseDouble(textField.getText()),DECIMALPLACES));
				hexlbl.setText(toHex(Double.parseDouble(textField.getText()),DECIMALPLACES));
			}
		});
		button_15.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_15.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_15.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_15.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_15.setFont(new Font("Segoe UI Semilight", Font.BOLD, 27));
		button_15.setBorder(emptyBorder);
		button_15.setBackground(SystemColor.menu);
		button_15.setBounds(219, 372, 112, 58);
		jframe.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("+");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				
				if(negate)
				{
				if(!(calculation.getText().contains(MOD)) && !(textField.getText().contains(MOD))
						&& (!(calculation.getText().contains(PLUS)) && !(textField.getText().contains(PLUS)))
						&& (!(calculation.getText().contains(MULTI)) && !(textField.getText().contains(MULTI)))
						&& (!(calculation.getText().contains(DIVIDE)) && !(textField.getText().contains(DIVIDE)))
							)
				{
					if(!(textField.getText().equals(""))) {
					number=Double.parseDouble(textField.getText());
				setoperation(1);
				textField.setText("");
				calculation.setText(number+" + ");
					}
					negate=false;
					}
			}
				else if(!historyUsed)
				{
					if(!(calculation.getText().contains(MOD)) && !(textField.getText().contains(MOD))
							&& (!(calculation.getText().contains(PLUS)) && !(textField.getText().contains(PLUS)))
							&& (!(calculation.getText().contains(MINUS)) && !(textField.getText().contains(MINUS)))
							&& (!(calculation.getText().contains(MULTI)) && !(textField.getText().contains(MULTI)))
							&& (!(calculation.getText().contains(DIVIDE)) && !(textField.getText().contains(DIVIDE)))
								)
					{
						if(!(textField.getText().equals(""))) {
						number=Double.parseDouble(textField.getText());
					setoperation(1);
					textField.setText("");
					calculation.setText(number+" + ");
					}
					}
					}
				else
				{
					if(!(calculation.getText().contains(MOD)) || !(textField.getText().contains(MOD))
							&& (!(calculation.getText().contains(PLUS)) || !(textField.getText().contains(PLUS)))
							&& (!(calculation.getText().contains(MINUS)) || !(textField.getText().contains(MINUS)))
							&& (!(calculation.getText().contains(MULTI)) || !(textField.getText().contains(MULTI)))
							&& (!(calculation.getText().contains(DIVIDE)) || !(textField.getText().contains(DIVIDE)))
								)
					{
						if(!(textField.getText().equals(""))) {
						number=Double.parseDouble(textField.getText());
					setoperation(1);
					textField.setText("");
					calculation.setText(number+" + ");
					}
					}
					historyUsed=false;
				}
				}
				}catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_16.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_16.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_16.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_16.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_16.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 40));
		button_16.setBackground(SystemColor.menu);
		button_16.setBorder(emptyBorder);
		button_16.setBounds(331, 372, 115, 58);
		jframe.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("=");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				operations();
				calculation.setText("");
				if(!(textField.getText().equals("Infinity")))
				{
				declbl.setText(textField.getText());
				binlbl.setText(toBinary(Double.parseDouble(textField.getText()),DECIMALPLACES));
				octlbl.setText(toOct(Double.parseDouble(textField.getText()),DECIMALPLACES));
				hexlbl.setText(toHex(Double.parseDouble(textField.getText()),DECIMALPLACES));
				delete=true;
				}
				else
				{
					textField.setText("Cannot Divide by zero");
					declbl.setText("");
					binlbl.setText("");
					octlbl.setText("");
					hexlbl.setText("");
					delete=true;
					dividedbyzero=true;
				}
				}
				catch(Exception v)
				{
					textField.setText("Syntax Error");
					calculation.setText("");
					declbl.setText("");
					binlbl.setText("");
					octlbl.setText("");
					hexlbl.setText("");
					delete=true;
				}
				
			}
		});
		button_17.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_17.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_17.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_17.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_17.setFont(new Font("Segoe UI Semilight", Font.BOLD, 27));
		button_17.setBackground(SystemColor.menu);
		button_17.setBorder(emptyBorder);
		button_17.setBounds(331, 429, 115, 58);
		jframe.getContentPane().add(button_17);
		
		JButton button_20 = new JButton(".");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dividedbyzero)
				{
					textField.setText("");
					dividedbyzero=false;
				}
				numericalconversiondone=false;
				
				if(!(textField.getText().equals("")))
				{
					
				if(!(textField.getText().contains(DOT)))
						{
						
				textField.setText(textField.getText()+".");
						}
				}
				}
		});
		button_20.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_20.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_20.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_20.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_20.setFont(new Font("Segoe UI Semilight", Font.BOLD, 27));
		button_20.setBackground(SystemColor.menu);
		button_20.setBorder(emptyBorder);
		button_20.setBounds(219, 429, 112, 58);
		jframe.getContentPane().add(button_20);
		
		JButton button_21 = new JButton("0");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numericalconversiondone=false;
				if(delete)
				{
					textField.setText("");
					calculation.setText("");
					delete=false;
				}
				textField.setText(textField.getText()+"0");
			}
		});
		button_21.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_21.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_21.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_21.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_21.setFont(new Font("Segoe UI Semilight", Font.BOLD, 27));
		button_21.setBackground(SystemColor.menu);
		button_21.setBorder(emptyBorder);
		button_21.setBounds(108, 429, 112, 58);
		jframe.getContentPane().add(button_21);
		
		
		JButton button_24 = new JButton("±");
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				number=Double.parseDouble(textField.getText());
				setoperation(9);
				operations();
				delete=true;
				negate=true;
				calculation.setText("Negate("+number+")");
			}
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_24.setFont(new Font("Segoe UI Semilight", Font.BOLD, 35));
		button_24.setBackground(SystemColor.menu);
		button_24.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_24.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_24.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_24.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_24.setBorder(emptyBorder);
		button_24.setBounds(0, 429, 112, 58);
		jframe.getContentPane().add(button_24);
		
		JButton button_1 = new JButton("Log");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				number=Double.parseDouble(textField.getText());
				setoperation(10);
				operations();
				calculation.setText("Log("+number+")");
				delete=true;
			}
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_1.setBackground(Color.WHITE);
		button_1.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_1.setBackground(SystemColor.menu);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_1.setBackground(Color.WHITE);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_1.setBackground(SystemColor.menu);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_1.setBorder(emptyBorder);
		button_1.setBounds(442, 146, 112, 58);
		jframe.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Sin");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				number=Double.parseDouble(textField.getText());
				setoperation(11);
				operations();
				calculation.setText("Sin("+Math.toDegrees(number)+")");
				delete=true;
			}
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_2.setBackground(Color.WHITE);
		button_2.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_2.setBackground(SystemColor.menu);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_2.setBackground(Color.WHITE);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_2.setBackground(SystemColor.menu);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_2.setBorder(emptyBorder);
		button_2.setBounds(550, 146, 112, 58);
		jframe.getContentPane().add(button_2);
		
		JButton button_25 = new JButton("Sinh");
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				number=Double.parseDouble(textField.getText());
				setoperation(12);
				operations();
				calculation.setText("Sinh("+Math.toDegrees(number)+")");
				delete=true;
			}
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_25.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_25.setBackground(Color.WHITE);
		button_25.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_25.setBackground(SystemColor.menu);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_25.setBackground(Color.WHITE);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_25.setBackground(SystemColor.menu);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_25.setBorder(emptyBorder);
		button_25.setBounds(661, 146, 112, 58);
		jframe.getContentPane().add(button_25);
		
		JButton button_26 = new JButton("Mod");
		button_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				number=Double.parseDouble(textField.getText());
				setoperation(20);
				operations();
				calculation.setText("Mod("+number+")");
				delete=true;
			}
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_26.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_26.setBorder(emptyBorder);
		button_26.setBackground(Color.WHITE);
		button_26.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_26.setBackground(SystemColor.menu);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_26.setBackground(Color.WHITE);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_26.setBackground(SystemColor.menu);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_26.setBounds(773, 146, 115, 58);
		jframe.getContentPane().add(button_26);
		
		JButton button_27 = new JButton("lnx");
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				number=Double.parseDouble(textField.getText());
				setoperation(21);
				operations();
				calculation.setText("Ln("+number+")");
				delete=true;
			}
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_27.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_27.setBorder(emptyBorder);
		button_27.setBackground(SystemColor.menu);
		button_27.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_27.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_27.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_27.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_27.setBounds(773, 202, 115, 58);
		jframe.getContentPane().add(button_27);
		
		JButton button_28 = new JButton("EXP");
		button_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(delete)
				{
					textField.setText("");
					delete=false;
				}
				setoperation(34);
				operations();
				calculation.setText("E");
				delete=true;
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_28.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_28.setBorder(emptyBorder);
		button_28.setBackground(SystemColor.menu);
		button_28.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_28.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_28.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_28.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_28.setBounds(773, 259, 115, 58);
		jframe.getContentPane().add(button_28);
		
		JButton button_29 = new JButton("n!");
		button_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				number=Double.parseDouble(textField.getText());
				setoperation(32);
				operations();
				calculation.setText(number+" ! ");
				delete=true;
			}
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_29.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_29.setBorder(emptyBorder);
		button_29.setBackground(SystemColor.menu);
		button_29.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_29.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_29.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_29.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_29.setBounds(773, 315, 115, 58);
		jframe.getContentPane().add(button_29);
		
		JButton button_30 = new JButton("Octal");
		button_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				number=Double.parseDouble(textField.getText());
				setoperation(28);
				operations();
				if(numericalconversiondone)
				{
				calculation.setText("Octal("+keepnumber+")");
				}
				else
				{
					calculation.setText("Octal("+number+")");
					
				}
				delete=true;
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_30.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_30.setBorder(emptyBorder);
		button_30.setBackground(SystemColor.menu);
		button_30.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_30.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_30.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_30.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_30.setBounds(883, 259, 115, 58);
		jframe.getContentPane().add(button_30);
		
		JButton button_31 = new JButton("Hex");
		button_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				number=Double.parseDouble(textField.getText());
				setoperation(29);
				operations();
				if(numericalconversiondone)
				{
					calculation.setText("HexaDecimal("+keepnumber+")");
					
				}
				else
				{
				calculation.setText("HexaDecimal("+number+")");
				}
				delete=true;
				
			}
				
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_31.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_31.setBorder(emptyBorder);
		button_31.setBackground(SystemColor.menu);
		button_31.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_31.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_31.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_31.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_31.setBounds(886, 202, 112, 58);
		jframe.getContentPane().add(button_31);
		
		JButton button_32 = new JButton("Bin");
		button_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				number=Double.parseDouble(textField.getText());
				}
				setoperation(27);
				operations();
				if(numericalconversiondone)
				{
				calculation.setText("Binary("+keepnumber+")");
				}
				else
				{
					calculation.setText("Binary("+number+")");
				}
				delete=true;
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_32.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_32.setBorder(emptyBorder);
		button_32.setBackground(Color.WHITE);
		button_32.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_32.setBackground(SystemColor.menu);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_32.setBackground(Color.WHITE);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_32.setBackground(SystemColor.menu);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_32.setBounds(886, 146, 112, 58);
		jframe.getContentPane().add(button_32);
		
		JButton button_33 = new JButton("x^3");
		button_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				number=Double.parseDouble(textField.getText());
				setoperation(23);
				operations();
				calculation.setText(number+" ^3 ");
				delete=true;
			}
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_33.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_33.setBorder(emptyBorder);
		button_33.setBackground(SystemColor.menu);
		button_33.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_33.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_33.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_33.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_33.setBounds(442, 372, 112, 58);
		jframe.getContentPane().add(button_33);
		
		JButton button_34 = new JButton("x^y");
		button_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				number=Double.parseDouble(textField.getText());
				setoperation(22);
				textField.setText("");
				calculation.setText(number+" ^ ");
			}
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_34.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_34.setBorder(emptyBorder);
		button_34.setBackground(SystemColor.menu);
		button_34.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_34.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_34.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_34.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_34.setBounds(442, 315, 112, 58);
		jframe.getContentPane().add(button_34);
		
		JButton button_35 = new JButton("Floor");
		button_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				number=Double.parseDouble(textField.getText());
				setoperation(33);
				operations();
				calculation.setText("Floor("+number+")");
				delete=true;
			}
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_35.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 25));
		button_35.setBackground(SystemColor.menu);
		button_35.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_35.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_35.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_35.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_35.setBorder(emptyBorder);
		button_35.setBounds(442, 259, 112, 58);
		jframe.getContentPane().add(button_35);
		
		JButton button_36 = new JButton("π");
		button_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(delete)
				{
					textField.setText("");
					delete=false;
				}
				setoperation(25);
				operations();
				delete=true;
				
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_36.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_36.setBackground(SystemColor.menu);
		button_36.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_36.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_36.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_36.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_36.setBorder(emptyBorder);
		button_36.setBounds(442, 202, 112, 58);
		jframe.getContentPane().add(button_36);
		
		JButton button_37 = new JButton("Cos");
		button_37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				number=Double.parseDouble(textField.getText());
				setoperation(14);
				operations();
				calculation.setText("Cos("+Math.toDegrees(number)+")");
				delete=true;
			}
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_37.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_37.setBackground(SystemColor.menu);
		button_37.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_37.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_37.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_37.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_37.setBorder(emptyBorder);
		button_37.setBounds(550, 202, 112, 58);
		jframe.getContentPane().add(button_37);
		
		JButton button_38 = new JButton("Cosh");
		button_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				number=Double.parseDouble(textField.getText());
				setoperation(15);
				operations();
				calculation.setText("Cosh("+Math.toDegrees(number)+")");
				delete=true;
			}
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_38.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_38.setBackground(SystemColor.menu);
		button_38.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_38.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_38.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_38.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_38.setBorder(emptyBorder);
		button_38.setBounds(661, 202, 112, 58);
		jframe.getContentPane().add(button_38);
		
		JButton button_39 = new JButton("Tanh");
		button_39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				number=Double.parseDouble(textField.getText());
				setoperation(18);
				operations();
				calculation.setText("Tanh("+Math.toDegrees(number)+")");
				delete=true;
			}
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_39.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_39.setBackground(SystemColor.menu);
		button_39.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_39.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_39.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_39.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_39.setBorder(emptyBorder);
		button_39.setBounds(661, 259, 112, 58);
		jframe.getContentPane().add(button_39);
		
		JButton button_40 = new JButton("Tan");
		button_40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				number=Double.parseDouble(textField.getText());
				setoperation(17);
				operations();
				calculation.setText("Tan("+Math.toDegrees(number)+")");
				delete=true;
			}
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_40.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_40.setBackground(SystemColor.menu);
		button_40.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_40.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_40.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_40.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_40.setBorder(emptyBorder);
		button_40.setBounds(550, 259, 112, 58);
		jframe.getContentPane().add(button_40);
		
		JButton button_41 = new JButton("Cbr");
		button_41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				number=Double.parseDouble(textField.getText());
				setoperation(30);
				operations();
				calculation.setText("Cbrt("+number+")");
				delete=true;
			}
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_41.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_41.setBackground(SystemColor.menu);
		button_41.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_41.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_41.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_41.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_41.setBorder(emptyBorder);
		button_41.setBounds(550, 315, 112, 58);
		jframe.getContentPane().add(button_41);
		
		JButton button_42 = new JButton("Ceil");
		button_42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				number=Double.parseDouble(textField.getText());
				setoperation(31);
				operations();
				calculation.setText("Ceil("+number+")");
				delete=true;
			}
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_42.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_42.setBackground(SystemColor.menu);
		button_42.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_42.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_42.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_42.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_42.setBorder(emptyBorder);
		button_42.setBounds(661, 315, 112, 58);
		jframe.getContentPane().add(button_42);
		
		JButton button_43 = new JButton("x^4");
		button_43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				number=Double.parseDouble(textField.getText());
				setoperation(24);
				operations();
				calculation.setText(number+" ^4 ");
				delete=true;
			}
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_43.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_43.setBackground(SystemColor.menu);
		button_43.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_43.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_43.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_43.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_43.setBorder(emptyBorder);
		button_43.setBounds(442, 429, 112, 58);
		jframe.getContentPane().add(button_43);
		
		JButton button_44 = new JButton("ArcSin");
		button_44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				number=Double.parseDouble(textField.getText());
				setoperation(13);
				operations();
				calculation.setText("SinInverse("+Math.toDegrees(number)+")");
				delete=true;
			}
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_44.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_44.setBackground(SystemColor.menu);
		button_44.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_44.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_44.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_44.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_44.setBorder(emptyBorder);
		button_44.setBounds(550, 429, 112, 58);
		jframe.getContentPane().add(button_44);
		
		JButton button_45 = new JButton("ArcCos");
		button_45.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				number=Double.parseDouble(textField.getText());
				setoperation(16);
				operations();
				calculation.setText("CosInverse("+Math.toDegrees(number)+")");
				delete=true;
			}
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_45.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_45.setBackground(SystemColor.menu);
		button_45.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_45.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_45.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_45.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_45.setBorder(emptyBorder);
		button_45.setBounds(661, 429, 112, 58);
		jframe.getContentPane().add(button_45);
		
		JButton button_46 = new JButton("ArcTan");
		button_46.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				number=Double.parseDouble(textField.getText());
				setoperation(19);
				operations();
				calculation.setText("TanInverse("+Math.toDegrees(number)+")");
				delete=true;
			}
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_46.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_46.setBackground(SystemColor.menu);
		button_46.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_46.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_46.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_46.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_46.setBorder(emptyBorder);
		button_46.setBounds(773, 429, 115, 58);
		jframe.getContentPane().add(button_46);
		
		JButton button_22 = new JButton("Radians");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				number=Double.parseDouble(textField.getText());
				setoperation(37);
				operations();
				calculation.setText("Radians("+number+")");
				delete=true;
			}
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_22.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_22.setBackground(SystemColor.menu);
		button_22.setBorder(emptyBorder);
		button_22.setBounds(773, 372, 115, 58);
		button_22.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_22.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_22.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_22.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		jframe.getContentPane().add(button_22);
		
		JButton button_23 = new JButton("Degrees");
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				number=Double.parseDouble(textField.getText());
				setoperation(36);
				operations();
				calculation.setText("Degree("+number+")");
				delete=true;
			}
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_23.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_23.setBackground(SystemColor.menu);
		button_23.setBorder(emptyBorder);
		button_23.setBounds(661, 372, 112, 58);
		button_23.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_23.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_23.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_23.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		jframe.getContentPane().add(button_23);
		
		JButton button_47 = new JButton("e^y");
		button_47.addActionListener(new ActionListener() {
			
				public void actionPerformed(ActionEvent e) {
					try
					{
					if(!numericalconversiondone)
					{
					number=Double.parseDouble(textField.getText());
					setoperation(35);
					operations();
					calculation.setText("e^"+number);
					delete=true;
				}
				}
					catch(Exception v)
					{
						textField.setText("Please enter a number");
						delete=true;
					}
				}
				});
		button_47.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_47.setBackground(SystemColor.menu);
		button_47.setBorder(emptyBorder);
		button_47.setBounds(550, 372, 112, 58);
		button_47.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_47.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_47.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_47.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		jframe.getContentPane().add(button_47);
		
		JButton button_48 = new JButton("And");
		button_48.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				number=Double.parseDouble(textField.getText());
				setoperation(38);
				textField.setText("");
				calculation.setText(number+" && ");
				
			}
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_48.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_48.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_48.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_48.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_48.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_48.setBackground(SystemColor.menu);
		button_48.setBorder(emptyBorder);
		button_48.setBounds(886, 316, 112, 58);
		jframe.getContentPane().add(button_48);
		
		JButton button_49 = new JButton("Or");
		button_49.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				number=Double.parseDouble(textField.getText());
				setoperation(39);
				textField.setText("");
				calculation.setText(number+" || ");
			}
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_49.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_49.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_49.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_49.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_49.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_49.setBackground(SystemColor.menu);
		button_49.setBorder(emptyBorder);
		button_49.setBounds(886, 372, 112, 58);
		jframe.getContentPane().add(button_49);
		
		JButton button_50 = new JButton("XoR");
		button_50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				if(!numericalconversiondone)
				{
				number=Double.parseDouble(textField.getText());
				setoperation(40);
				textField.setText("");
				calculation.setText(number+" ^^ ");
			}
			}
				catch(Exception v)
				{
					textField.setText("Please enter a number");
					delete=true;
				}
			}
			});
		button_50.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_50.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_50.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_50.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_50.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 27));
		button_50.setBackground(SystemColor.menu);
		button_50.setBorder(emptyBorder);
		button_50.setBounds(883, 429, 115, 58);
		jframe.getContentPane().add(button_50);
		
		JButton btnPrev = new JButton("Prev.");
		btnPrev.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				btnPrev.setBackground(SystemColor.menu);
				
			}

			public void mouseExited(MouseEvent arg0) {
				btnPrev.setBackground(Color.WHITE);
				
			}

			public void mousePressed(MouseEvent arg0) {
				btnPrev.setBackground(SystemColor.menu);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		btnPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String outlbl=Historylbl.toString();
			String[] outputlbl = outlbl.split(",");
			historyUsed=true;
			if(ifpresslbl==0)
			{
				calculation.setText("No operation");
			}
			else if(ifpresslbl>0)
			{
				calculation.setText(outputlbl[(ifpresslbl-1)]);
				ifpresslbl--;
			}				
			String outtxt=Historytxt.toString();
			String[] outputtxt = outtxt.split(",");
			
			if(ifpresstxt==0)
			{
				textField.setText("");
			}
			else if(ifpresstxt>0)
			{
				textField.setText(outputtxt[(ifpresstxt-1)]);
				ifpresstxt--;
			}		
			}	
		});
		
		btnPrev.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 12));
		btnPrev.setBorder(emptyBorder);
		btnPrev.setBackground(Color.WHITE);
		btnPrev.setBounds(0, 0, 71, 35);
		jframe.getContentPane().add(btnPrev);
		
		JButton button_51 = new JButton("Nxt");
		button_51.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 12));
		button_51.setBackground(Color.WHITE);
		button_51.setBorder(emptyBorder);
		button_51.setBounds(70, 0, 71, 35);
		button_51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String outlbl=Historylbl.toString();
				String[] outputlbl = outlbl.split(",");
				historyUsed=true;
				if(!(ifpresslbl>=counterlbl) && !(ifpresstxt>=countertxt))
				{
					calculation.setText(outputlbl[(ifpresslbl)]);
					ifpresslbl++;
					
				String outtxt=Historytxt.toString();
				String[] outputtxt = outtxt.split(",");
				
					textField.setText(outputtxt[(ifpresstxt)]);
					ifpresstxt++;		
				}
			}
			
		});
		button_51.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_51.setBackground(SystemColor.menu);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_51.setBackground(Color.WHITE);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_51.setBackground(SystemColor.menu);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		jframe.getContentPane().add(button_51);
	//Convertor GUI	
		txtConv = new JTextField();
		txtConv.setForeground(Color.BLACK);
		txtConv.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 35));
		txtConv.setBorder(emptyBorder);
		txtConv.setHorizontalAlignment(SwingConstants.LEFT);
		txtConv.setBounds(996, 2, 431, 46);
		jframe.getContentPane().add(txtConv);
		txtConv.setColumns(10);
		txtConv.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent typed) {
			char c=typed.getKeyChar();
			if(!(Character.isDigit(c)) || Character.isDigit(c)) {
				typed.consume();
			}
			}
		});
		
		
		
		JButton button_18 = new JButton("1");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtConv.setText(txtConv.getText()+"1");
				numberconv=Double.parseDouble(txtConv.getText());
				switch(MaincomboboxIndex)
				{
				case 0:Conversion();
				break;
				case 1:ConversionA();
				break;
				case 2:ConversionV();
				break;
				case 3:ConversionT();
				break;
				case 4:ConversionW();
				break;
				}
			}
		});
		button_18.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_18.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_18.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_18.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_18.setFont(new Font("Segoe UI Semilight", Font.BOLD, 27));
		button_18.setBackground(SystemColor.menu);
		button_18.setBounds(996, 258, 112, 58);
		button_18.setBorder(emptyBorder);
		jframe.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("2");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtConv.setText(txtConv.getText()+"2");
				numberconv=Double.parseDouble(txtConv.getText());
				switch(MaincomboboxIndex)
				{
				case 0:Conversion();
				break;
				case 1:ConversionA();
				break;
				case 2:ConversionV();
				break;
				case 3:ConversionT();
				break;
				case 4:ConversionW();
				break;
				}
			}
		});
		button_19.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_19.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_19.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_19.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_19.setFont(new Font("Segoe UI Semilight", Font.BOLD, 27));
		button_19.setBackground(SystemColor.menu);
		button_19.setBounds(1104, 258, 112, 58);
		button_19.setBorder(emptyBorder);
		jframe.getContentPane().add(button_19);
		
		JButton button_52 = new JButton("3");
		button_52.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtConv.setText(txtConv.getText()+"3");
				numberconv=Double.parseDouble(txtConv.getText());
				switch(MaincomboboxIndex)
				{
				case 0:Conversion();
				break;
				case 1:ConversionA();
				break;
				case 2:ConversionV();
				break;
				case 3:ConversionT();
				break;
				case 4:ConversionW();
				break;
				}
			}
		});
		button_52.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_52.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_52.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_52.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_52.setFont(new Font("Segoe UI Semilight", Font.BOLD, 27));
		button_52.setBackground(SystemColor.menu);
		button_52.setBounds(1215, 258, 112, 58);
		button_52.setBorder(emptyBorder);
		jframe.getContentPane().add(button_52);
		
		JButton button_53 = new JButton("6");
		button_53.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtConv.setText(txtConv.getText()+"6");
				numberconv=Double.parseDouble(txtConv.getText());
				switch(MaincomboboxIndex)
				{
				case 0:Conversion();
				break;
				case 1:ConversionA();
				break;
				case 2:ConversionV();
				break;
				case 3:ConversionT();
				break;
				case 4:ConversionW();
				break;
				}
				}
		});
		button_53.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_53.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_53.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_53.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_53.setFont(new Font("Segoe UI Semilight", Font.BOLD, 27));
		button_53.setBackground(SystemColor.menu);
		button_53.setBounds(1215, 201, 112, 58);
		button_53.setBorder(emptyBorder);
		jframe.getContentPane().add(button_53);
		
		JButton button_54 = new JButton("9");
		button_54.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtConv.setText(txtConv.getText()+"9");
				numberconv=Double.parseDouble(txtConv.getText());
					switch(MaincomboboxIndex)
					{
					case 0:Conversion();
					break;
					case 1:ConversionA();
					break;
					case 2:ConversionV();
					break;
					case 3:ConversionT();
					break;
					case 4:ConversionW();
					break;
					}	
					}
		});
		button_54.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_54.setBackground(SystemColor.menu);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_54.setBackground(Color.WHITE);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_54.setBackground(SystemColor.menu);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_54.setFont(new Font("Segoe UI Semilight", Font.BOLD, 27));
		button_54.setBackground(Color.WHITE);
		button_54.setBounds(1215, 145, 112, 58);
		button_54.setBorder(emptyBorder);
		jframe.getContentPane().add(button_54);
		
		JButton button_55 = new JButton("8");
		button_55.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtConv.setText(txtConv.getText()+"8");
				numberconv=Double.parseDouble(txtConv.getText());
				switch(MaincomboboxIndex)
				{
				case 0:Conversion();
				break;
				case 1:ConversionA();
				break;
				case 2:ConversionV();
				break;
				case 3:ConversionT();
				break;
				case 4:ConversionW();
				break;
				}
				
			}
		});
		button_55.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_55.setBackground(SystemColor.menu);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_55.setBackground(Color.WHITE);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_55.setBackground(SystemColor.menu);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_55.setFont(new Font("Segoe UI Semilight", Font.BOLD, 27));
		button_55.setBackground(Color.WHITE);
		button_55.setBounds(1104, 145, 112, 56);
		button_55.setBorder(emptyBorder);
		jframe.getContentPane().add(button_55);
		
		JButton button_56 = new JButton("5");
		button_56.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtConv.setText(txtConv.getText()+"5");
				numberconv=Double.parseDouble(txtConv.getText());
				switch(MaincomboboxIndex)
				{
				case 0:Conversion();
				break;
				case 1:ConversionA();
				break;
				case 2:ConversionV();
				break;
				case 3:ConversionT();
				break;
				case 4:ConversionW();
				break;
				}
				}
		});
		button_56.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_56.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_56.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_56.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_56.setFont(new Font("Segoe UI Semilight", Font.BOLD, 27));
		button_56.setBackground(SystemColor.menu);
		button_56.setBounds(1104, 201, 112, 58);
		button_56.setBorder(emptyBorder);
		jframe.getContentPane().add(button_56);
		
		JButton button_57 = new JButton("4");
		button_57.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtConv.setText(txtConv.getText()+"4");
				numberconv=Double.parseDouble(txtConv.getText());
				switch(MaincomboboxIndex)
				{
				case 0:Conversion();
				break;
				case 1:ConversionA();
				break;
				case 2:ConversionV();
				break;
				case 3:ConversionT();
				break;
				case 4:ConversionW();
				break;
				}
				}
		});
		button_57.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_57.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_57.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_57.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_57.setFont(new Font("Segoe UI Semilight", Font.BOLD, 27));
		button_57.setBackground(SystemColor.menu);
		button_57.setBounds(996, 201, 112, 58);
		button_57.setBorder(emptyBorder);
		jframe.getContentPane().add(button_57);
		
		JButton button_58 = new JButton("7");
		button_58.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtConv.setText(txtConv.getText()+"7");
				numberconv=Double.parseDouble(txtConv.getText());
				switch(MaincomboboxIndex)
				{
				case 0:Conversion();
				break;
				case 1:ConversionA();
				break;
				case 2:ConversionV();
				break;
				case 3:ConversionT();
				break;
				case 4:ConversionW();
				break;
				}
				
			}
		});
		button_58.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_58.setBackground(SystemColor.menu);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_58.setBackground(Color.WHITE);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_58.setBackground(SystemColor.menu);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_58.setFont(new Font("Segoe UI Semilight", Font.BOLD, 27));
		button_58.setBackground(Color.WHITE);
		button_58.setBounds(996, 145, 112, 58);
		button_58.setBorder(emptyBorder);
		jframe.getContentPane().add(button_58);
		
		JButton button_59 = new JButton("0");
		button_59.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtConv.setText(txtConv.getText()+"0");
				numberconv=Double.parseDouble(txtConv.getText());
				switch(MaincomboboxIndex)
				{
				case 0:Conversion();
				break;
				case 1:ConversionA();
				break;
				case 2:ConversionV();
				break;
				case 3:ConversionT();
				break;
				case 4:ConversionW();
				break;
				}
				}
		});
		button_59.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_59.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_59.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_59.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_59.setFont(new Font("Segoe UI Semilight", Font.BOLD, 27));
		button_59.setBackground(SystemColor.menu);
		button_59.setBounds(996, 315, 220, 58);
		button_59.setBorder(emptyBorder);
		jframe.getContentPane().add(button_59);
		
		JButton button_60 = new JButton(".");
		button_60.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtConv.setText(txtConv.getText()+".");
				numberconv=Double.parseDouble(txtConv.getText());
				switch(MaincomboboxIndex)
				{
				case 0:Conversion();
				break;
				case 1:ConversionA();
				break;
				case 2:ConversionV();
				break;
				}			}
		});
		button_60.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_60.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_60.setBackground(SystemColor.menu);				
			}

			public void mousePressed(MouseEvent arg0) {
				button_60.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		button_60.setFont(new Font("Segoe UI Semilight", Font.BOLD, 27));
		button_60.setBackground(SystemColor.menu);
		button_60.setBounds(1215, 315, 112, 58);
		button_60.setBorder(emptyBorder);
		jframe.getContentPane().add(button_60);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtConv.setText("");
				convertedLbl.setText("");
			}
		});
		btnClear.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				btnClear.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				btnClear.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				btnClear.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		btnClear.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 44));
		btnClear.setBackground(SystemColor.menu);
		btnClear.setBounds(996, 372, 220, 58);
		btnClear.setBorder(emptyBorder);
		jframe.getContentPane().add(btnClear);
		
		JButton button_61 = new JButton("←");
		button_61.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 46));
		button_61.setBackground(SystemColor.menu);
		button_61.setBounds(1215, 372, 112, 58);
		button_61.setBorder(emptyBorder);
		button_61.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length=txtConv.getText().length();
				int numbertobedeleted=length-1;
				String store;
				if(length > 0)
				{
					StringBuilder Backspace=new StringBuilder(txtConv.getText());
					Backspace.deleteCharAt(numbertobedeleted);
					store=Backspace.toString();
					txtConv.setText(store);
					numberconv=Double.parseDouble(txtConv.getText());
					switch(MaincomboboxIndex)
					{
					case 0: Conversion();
					break;
					case 1: ConversionA();
					break;
					case 2: ConversionV();
					break;
					case 3: ConversionT();
					break;
					}
					
				}
				if(textField.getText().equals(""))
				{
					calculation.setText("");
				}
			}
		});
		button_61.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
			}

			public void mouseEntered(MouseEvent arg0) {
				button_61.setBackground(Color.LIGHT_GRAY);
				
			}

			public void mouseExited(MouseEvent arg0) {
				button_61.setBackground(SystemColor.menu);
				
			}

			public void mousePressed(MouseEvent arg0) {
				button_61.setBackground(Color.LIGHT_GRAY);
				
			}
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
		});
		jframe.getContentPane().add(button_61);
		
		comboBox_2 = new JComboBox();
		comboBox = new JComboBox();
		comboBox_1 = new JComboBox();
		convertedLbl = new JLabel();
		comboBox_3 = new JComboBox();
		convertedLbl2 = new JLabel();
		comboBox_4 = new JComboBox();
		comboBox_5 = new JComboBox();
		convertedLbl3 = new JLabel();
		convertedLbl4 = new JLabel();
		convertedLbl5 = new JLabel();
		comboBox_6 = new JComboBox();
		comboBox_7 = new JComboBox();
		comboBox_8 = new JComboBox();
		comboBox_9 = new JComboBox();
		comboBox_10 = new JComboBox();
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getMainComboIndex();
				if(MaincomboboxIndex==0)
				{
					comboBox_3.setVisible(false);
					comboBox_4.setVisible(false);
					convertedLbl2.setVisible(false);
					comboBox_5.setVisible(false);
					comboBox_6.setVisible(false);
					convertedLbl3.setVisible(false);
					comboBox_7.setVisible(false);
					comboBox_8.setVisible(false);
					convertedLbl4.setVisible(false);
					comboBox_9.setVisible(false);
					comboBox_10.setVisible(false);
					convertedLbl5.setVisible(false);
					
					comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nanometer", "Millimeter", "Centimeter", "Meter", "Kilometer"}));
					comboBox.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
					comboBox.setBackground(Color.WHITE);
					comboBox.setBorder(emptyBorder);
					comboBox.setBounds(996, 50, 138, 22);
					comboBox.setSelectedIndex(2);
					comboBox.setVisible(true);
					comboboxIndex=2;
					comboBox.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							Conversion();
						}
					});
					jframe.getContentPane().add(comboBox);
					
					
					convertedLbl.setBackground(Color.BLACK);
					convertedLbl.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 34));
					convertedLbl.setHorizontalAlignment(SwingConstants.LEFT);
					convertedLbl.setBorder(emptyBorder);
					convertedLbl.setVisible(true);
					convertedLbl.setBounds(996, 76, 431, 46);
					jframe.getContentPane().add(convertedLbl);
					
					
					comboBox_1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Conversion();
						}
					});
					comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Nanometer", "Millimeter", "Centimeter", "Meter", "Kilometer"}));
					comboBox_1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
					comboBox_1.setBackground(Color.WHITE);
					comboBox_1.setBackground(Color.WHITE);
					comboBox_1.setBounds(996, 120, 138, 22);
					comboBox_1.setVisible(true);
					comboBox_1.setSelectedIndex(3);
					combobox_1Index=3;
					jframe.getContentPane().add(comboBox_1);
					Conversion();
				}
				else if(MaincomboboxIndex==1)
				{
					comboBox.setVisible(false);
					comboBox_1.setVisible(false);
					convertedLbl.setVisible(false);
					comboBox_5.setVisible(false);
					comboBox_6.setVisible(false);
					convertedLbl3.setVisible(false);
					comboBox_7.setVisible(false);
					comboBox_8.setVisible(false);
					convertedLbl3.setVisible(false);
					comboBox_9.setVisible(false);
					comboBox_10.setVisible(false);
					convertedLbl5.setVisible(false);
					
					
					comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Nanometer Squared", "Millimeter Squared", "Centimeter Squared", "Meter Squared", "Kilometer Squared"}));
					comboBox_3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
					comboBox_3.setBackground(Color.WHITE);
					comboBox_3.setBorder(emptyBorder);
					comboBox_3.setBounds(996, 50, 138, 22);
					comboBox_3.setSelectedIndex(2);
					comboBox_3.setVisible(true);
					comboboxIndexA=2;
					comboBox_3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							ConversionA();
						}
					});
					jframe.getContentPane().add(comboBox_3);
					
					
					convertedLbl2.setBackground(Color.BLACK);
					convertedLbl2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 34));
					convertedLbl2.setHorizontalAlignment(SwingConstants.LEFT);
					convertedLbl2.setBorder(emptyBorder);
					convertedLbl2.setVisible(true);
					convertedLbl2.setBounds(996, 76, 431, 46);
					jframe.getContentPane().add(convertedLbl2);
					
					
					comboBox_4.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							ConversionA();
						}
					});
					comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Nanometer Squared", "Millimeter Squared", "Centimeter Squared", "Meter Squared", "Kilometer Squared"}));
					comboBox_4.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
					comboBox_4.setBackground(Color.WHITE);
					comboBox_4.setBackground(Color.WHITE);
					comboBox_4.setBounds(996, 120, 138, 22);
					comboBox_4.setVisible(true);
					comboBox_4.setSelectedIndex(3);
					combobox_1IndexA=3;
					jframe.getContentPane().add(comboBox_4);
					ConversionA();
				}
				else if(MaincomboboxIndex==2)
				{
					comboBox_3.setVisible(false);
					comboBox_4.setVisible(false);
					convertedLbl2.setVisible(false);
					comboBox.setVisible(false);
					comboBox_1.setVisible(false);
					convertedLbl.setVisible(false);
					comboBox_7.setVisible(false);
					comboBox_8.setVisible(false);
					convertedLbl4.setVisible(false);
					comboBox_9.setVisible(false);
					comboBox_10.setVisible(false);
					convertedLbl5.setVisible(false);
					
					
					comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Nanometer Cubed", "Millimeter Cubed", "Centimeter Cubed", "Meter Cubed", "Kilometer Cubed"}));
					comboBox_5.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
					comboBox_5.setBackground(Color.WHITE);
					comboBox_5.setBorder(emptyBorder);
					comboBox_5.setBounds(996, 50, 138, 22);
					comboBox_5.setVisible(true);
					comboBox_5.setSelectedIndex(2);
					comboboxIndexV=2;
					comboBox_5.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							ConversionV();
						}
					});
					jframe.getContentPane().add(comboBox_5);
					
					
					convertedLbl3.setBackground(Color.BLACK);
					convertedLbl3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 34));
					convertedLbl3.setHorizontalAlignment(SwingConstants.LEFT);
					convertedLbl3.setBorder(emptyBorder);
					convertedLbl3.setVisible(true);
					convertedLbl3.setBounds(996, 76, 431, 46);
					jframe.getContentPane().add(convertedLbl3);
					
					
					comboBox_6.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							ConversionV();
						}
					});
					comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Nanometer Cubed", "Millimeter Cubed", "Centimeter Cubed", "Meter Cubed", "Kilometer Cubed"}));
					comboBox_6.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
					comboBox_6.setBackground(Color.WHITE);
					comboBox_6.setBackground(Color.WHITE);
					comboBox_6.setBounds(996, 120, 138, 22);
					comboBox_6.setVisible(true);
					comboBox_6.setSelectedIndex(3);
					combobox_1IndexV=3;
					jframe.getContentPane().add(comboBox_6);
					ConversionV();
				}
				else if(MaincomboboxIndex==3)
				{
					comboBox_3.setVisible(false);
					comboBox_4.setVisible(false);
					convertedLbl2.setVisible(false);
					comboBox.setVisible(false);
					comboBox_1.setVisible(false);
					convertedLbl.setVisible(false);
					comboBox_5.setVisible(false);
					comboBox_6.setVisible(false);
					convertedLbl3.setVisible(false);
					comboBox_9.setVisible(false);
					comboBox_10.setVisible(false);
					convertedLbl5.setVisible(false);
				
				
					
					
					comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"Milliseconds", "Seconds", "Minutes", "Hours"}));
					comboBox_7.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
					comboBox_7.setBackground(Color.WHITE);
					comboBox_7.setBorder(emptyBorder);
					comboBox_7.setBounds(996, 50, 138, 22);
					comboBox_7.setVisible(true);
					comboBox_7.setSelectedIndex(2);
					comboboxIndexT=2;
					comboBox_7.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							ConversionT();
						}
					});
					jframe.getContentPane().add(comboBox_7);
					
					
					convertedLbl4.setBackground(Color.BLACK);
					convertedLbl4.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 34));
					convertedLbl4.setHorizontalAlignment(SwingConstants.LEFT);
					convertedLbl4.setBorder(emptyBorder);
					convertedLbl4.setVisible(true);
					convertedLbl4.setBounds(996, 76, 431, 46);
					jframe.getContentPane().add(convertedLbl4);
					
					
					comboBox_8.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							ConversionT();
						}
					});
					comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"Milliseconds", "Seconds", "Minutes", "Hours"}));
					comboBox_8.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
					comboBox_8.setBackground(Color.WHITE);
					comboBox_8.setBackground(Color.WHITE);
					comboBox_8.setBounds(996, 120, 138, 22);
					comboBox_8.setVisible(true);
					comboBox_8.setSelectedIndex(1);
					combobox_1IndexT=1;
					jframe.getContentPane().add(comboBox_8);
					ConversionT();
				}
				else if(MaincomboboxIndex==4)
				{
					comboBox_3.setVisible(false);
					comboBox_4.setVisible(false);
					convertedLbl2.setVisible(false);
					comboBox.setVisible(false);
					comboBox_1.setVisible(false);
					convertedLbl.setVisible(false);
					comboBox_5.setVisible(false);
					comboBox_6.setVisible(false);
					convertedLbl3.setVisible(false);
					comboBox_7.setVisible(false);
					comboBox_8.setVisible(false);
					convertedLbl4.setVisible(false);
					
					
					comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"Grams", "Kilograms"}));
					comboBox_9.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
					comboBox_9.setBackground(Color.WHITE);
					comboBox_9.setBorder(emptyBorder);
					comboBox_9.setBounds(996, 50, 138, 22);
					comboBox_9.setVisible(true);
					comboBox_9.setSelectedIndex(0);
					comboboxIndexW=0;
					comboBox_9.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							ConversionW();
						}
					});
					jframe.getContentPane().add(comboBox_9);
					
					
					convertedLbl5.setBackground(Color.BLACK);
					convertedLbl5.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 34));
					convertedLbl5.setHorizontalAlignment(SwingConstants.LEFT);
					convertedLbl5.setBorder(emptyBorder);
					convertedLbl5.setVisible(true);
					convertedLbl5.setBounds(996, 76, 431, 46);
					jframe.getContentPane().add(convertedLbl5);
					
					
					comboBox_10.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							ConversionW();
						}
					});
					comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"Grams", "Kilograms"}));
					comboBox_10.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
					comboBox_10.setBackground(Color.WHITE);
					comboBox_10.setBackground(Color.WHITE);
					comboBox_10.setBounds(996, 120, 138, 22);
					comboBox_10.setVisible(true);
					comboBox_10.setSelectedIndex(1);
					combobox_1IndexV=1;
					jframe.getContentPane().add(comboBox_10);
					ConversionW();
				}
			}
		});
		comboBox_2.setBackground(SystemColor.menu);	
		comboBox_2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 39));
		comboBox_2.setBorder(emptyBorder);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Length", "Area", "Volume", "Time", "Weight"}));
		comboBox_2.setBounds(996, 429, 331, 58);
		comboBox_2.setSelectedIndex(0);
		MaincomboboxIndex=0;
		jframe.getContentPane().add(comboBox_2);
		
		
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setBackground(Color.WHITE);
		jframe.setJMenuBar(menuBar);
		JLabel modeLabel = new JLabel();
		JMenu ModeMenu = new JMenu("Mode");
		menuBar.add(ModeMenu);
		menuBar.add(modeLabel);
		
		StandardCheck = new JCheckBoxMenuItem("Standard");
		ModeMenu.add(StandardCheck);
		StandardCheck.setSelected(true);
		modeLabel.setText("Standard");
		StandardCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Standard) {
				jframe.setTitle("Calculator By Hisham Maged");
				jframe.setBounds(WIDTH/2-190,HEIGHT/2-350,450,547);
				calculation.setBounds(125, 13, 307, 35);
				modeLabel.setText("Standard");
				textField.setBounds(0, 40, 444, 106);
				checkst=true;
				ScientificCheck.setSelected(false); checksc=false;
				ProgrammerCheck.setSelected(false); checkpr=false;
				ConvertorCheck.setSelected(false);  checkcv=false;
				if(checkst ^ (checksc && checkpr && checkcv))
				{
					StandardCheck.setSelected(true);
				}
			}
		});
		ScientificCheck = new JCheckBoxMenuItem("Scientific");
		ModeMenu.add(ScientificCheck);
		ScientificCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Scientific)
			{
				jframe.setTitle("Calculator By Hisham Maged");
				jframe.setBounds(WIDTH/2-360,HEIGHT/2-350,894,547);
				calculation.setBounds(167, 13, 709, 35);
				textField.setBounds(0, 40, 880, 106);
				modeLabel.setText("Scientific");
				checksc=true;
				StandardCheck.setSelected(false); checkst=false;
				ProgrammerCheck.setSelected(false); checkpr=false;
				ConvertorCheck.setSelected(false); checkcv=false;
				if(checksc ^ (checkst && checkpr && checkcv))
				{
					ScientificCheck.setSelected(true);
				}
				
			}
		});
		
		ProgrammerCheck = new JCheckBoxMenuItem("Programmer");
		ModeMenu.add(ProgrammerCheck);
		
		ProgrammerCheck.addActionListener(new ActionListener()
				{
				public void actionPerformed(ActionEvent Programmer)
				{
					jframe.setTitle("Calculator By Hisham Maged");
					jframe.setBounds(WIDTH/2-420,HEIGHT/2-350,998,547);
					textField.setBounds(223, 44, 757, 106);
					calculation.setBounds(167, 13, 709, 35);
					modeLabel.setText("Programmer");
					checkpr=true;
					StandardCheck.setSelected(false); checkst=false;
					ScientificCheck.setSelected(false); checksc=false;
					ConvertorCheck.setSelected(false); checkcv=false;
					if(checkpr ^ (checkst && checksc && checkcv))
					{
						ProgrammerCheck.setSelected(true);
					}
					
					lblBin.setBounds(10, 102, 37, 21);
					jframe.getContentPane().add(lblBin);
					
					
					lblOct.setBounds(10, 84, 37, 21);
					jframe.getContentPane().add(lblOct);
					
					
					label_1.setBounds(10, 64, 37, 21);
					jframe.getContentPane().add(label_1);
					
					
					lblDec.setBounds(10, 44, 37, 21);
					jframe.getContentPane().add(lblDec);
					
					
					declbl.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
					declbl.setHorizontalAlignment(SwingConstants.LEFT);
					declbl.setBounds(47, 44, 173, 21);
					jframe.getContentPane().add(declbl);
					
					 
					hexlbl.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
					hexlbl.setHorizontalAlignment(SwingConstants.LEFT);
					hexlbl.setBounds(47, 102, 163, 21);
					jframe.getContentPane().add(hexlbl);
					
					
					octlbl.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
					octlbl.setHorizontalAlignment(SwingConstants.LEFT);
					octlbl.setBounds(47, 84, 163, 21);
					jframe.getContentPane().add(octlbl);
					
					
					binlbl.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
					binlbl.setHorizontalAlignment(SwingConstants.LEFT);
					binlbl.setBounds(47, 64, 173, 21);
					jframe.getContentPane().add(binlbl);
				}
				});
		
		ConvertorCheck= new JCheckBoxMenuItem("Convertor");
		ModeMenu.add(ConvertorCheck);
		ConvertorCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Standard) {
				jframe.setTitle("Calculator By Hisham Maged");
				calculation.setBounds(125, 13, 307, 35);
				jframe.setBounds(WIDTH/2-600,HEIGHT/2-350,1330,547);
				modeLabel.setText("Convertor");
				textField.setBounds(0, 40, 444, 106);
				checkcv=true;
				ScientificCheck.setSelected(false); checksc=false;
				ProgrammerCheck.setSelected(false); checkpr=false;
				StandardCheck.setSelected(false); 	checkst=false;
				if(checkcv ^ (checksc && checkpr && checkst))
				{
					ConvertorCheck.setSelected(true);
				}
			}
		});
		
		JMenuItem mntmndDegreeFactorization = new JMenuItem("2nd Degree Factorization");
		mntmndDegreeFactorization.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SecondDegree frame=new SecondDegree();
				frame.setVisible(true);
				
				
			}
		});
		ModeMenu.add(mntmndDegreeFactorization);
		JMenuItem ExitItem = new JMenuItem("Exit");
		ModeMenu.add(ExitItem);
		ExitItem.addActionListener(new ActionListener()
				{
				public void actionPerformed(ActionEvent Exit)
				{
					System.exit(0);
				}
				});
		
	}
}
