import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MathTasks {

	private JFrame frmMathSumTasks;
	private JTextField textField;
	private JTextField textField_1;
	
	int firstnum=(int)(Math.random()*100);
	int secnum=(int)(Math.random()*100);
	int res;
	String operator= "+";
	int total=0;
	String answer;
	private JTextField textField_2;
	
	private void check() {
		res= firstnum+secnum;
		if(textField.getText().equals("")) {
			textField_2.setText("Enter result!!");
		}
		else if(!textField.getText().equals("")){
		total= Integer.parseInt(textField.getText());
		}
		if(total == res ) {
			
			textField_2.setText("Correct!");
			firstnum=(int)(Math.random()*100);
			secnum=(int)(Math.random()*100);
			textField_1.setText(firstnum + operator + secnum);
			textField.setText("");
		}
		else {
			textField_2.setText("Incorrect!    " +firstnum + " + " + secnum + " = " + res);
			firstnum=(int)(Math.random()*100);
			secnum=(int)(Math.random()*100);
			textField_1.setText(firstnum + operator + secnum);
			textField.setText("");
			
		}
			
	    
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MathTasks window = new MathTasks();
					window.frmMathSumTasks.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MathTasks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frmMathSumTasks = new JFrame();
		frmMathSumTasks.setTitle("Math tasks");
		frmMathSumTasks.getContentPane().setBackground(new Color(204, 255, 255));
		frmMathSumTasks.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
					if (e.getKeyCode()==KeyEvent.VK_ENTER){			
						check();
					    }
				
			}
		});
		textField.setFont(new Font("Rockwell", Font.PLAIN, 14));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(209, 59, 153, 62);
		frmMathSumTasks.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnCheck = new JButton("Check");
		btnCheck.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 15));
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				check();
				}
		});
		btnCheck.setBounds(366, 59, 147, 62);
		frmMathSumTasks.getContentPane().add(btnCheck);
		
		
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText(firstnum + operator + secnum);
		textField_1.setEditable(false);
		textField_1.setBounds(10, 59, 169, 62);
		frmMathSumTasks.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("      =");
		label.setBounds(171, 83, 46, 14);
		frmMathSumTasks.getContentPane().add(label);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(0, 172, 523, 14);
		frmMathSumTasks.getContentPane().add(horizontalStrut);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Minion Pro Cond", Font.PLAIN, 25));
		textField_2.setForeground(new Color(255, 255, 255));
		textField_2.setBackground(new Color(0, 0, 153));
		textField_2.setBounds(10, 172, 503, 115);
		frmMathSumTasks.getContentPane().add(textField_2);
		textField_2.setColumns(2);
		frmMathSumTasks.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Nemanja\\eclipse-workspace\\SoloProject\\abacus-addition-arithmetic-1019470.jpg"));
		frmMathSumTasks.setBounds(100, 100, 539, 334);
		frmMathSumTasks.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
