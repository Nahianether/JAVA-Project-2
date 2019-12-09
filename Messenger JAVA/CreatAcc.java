import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class CreatAcc
{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		/*EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreatAcc window = new CreatAcc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
	}

	/**
	 * Create the application.
	 */
	public CreatAcc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Messenger");
		frame.setBounds(100, 100, 282, 522);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(108, 77, 129, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(108, 227, 129, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(23, 80, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblPassward = new JLabel("Passward:");
		lblPassward.setBounds(23, 130, 61, 14);
		frame.getContentPane().add(lblPassward);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setBounds(23, 230, 100, 14);
		frame.getContentPane().add(lblId);
		
		JCheckBox chckbxMale = new JCheckBox("Male");
		chckbxMale.setBounds(108, 280, 58, 23);
		frame.getContentPane().add(chckbxMale);
		
		JCheckBox chckbxFemale = new JCheckBox("Female");
		chckbxFemale.setBounds(179, 280, 100, 23);
		frame.getContentPane().add(chckbxFemale);
		
		JLabel lblIAm = new JLabel("I am:");
		lblIAm.setBounds(23, 280, 34, 14);
		frame.getContentPane().add(lblIAm);
		
		JButton btnSignUp = new JButton("Create");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnSignUp, "Account Created.\nPlease Login");
				frame.setVisible(false);
				LogInn l=new LogInn();
			}
		});
		btnSignUp.setBounds(88, 330, 89, 23);
		frame.getContentPane().add(btnSignUp);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(108, 127, 129, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblConfirmPass = new JLabel("Confirm Pass:");
		lblConfirmPass.setBounds(23, 180, 100, 14);
		frame.getContentPane().add(lblConfirmPass);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(108, 177, 129, 20);
		frame.getContentPane().add(passwordField_1);
		frame.setVisible(true);
	}
}
