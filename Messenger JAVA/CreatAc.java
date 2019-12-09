import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class CreatAc {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreatAc window = new CreatAc();
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
	public CreatAc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 282, 522);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(113, 94, 129, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(113, 142, 129, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(113, 189, 129, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(57, 97, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblPassward = new JLabel("Passward:");
		lblPassward.setBounds(42, 145, 61, 14);
		frame.getContentPane().add(lblPassward);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setBounds(73, 192, 19, 14);
		frame.getContentPane().add(lblId);
		
		JCheckBox chckbxMale = new JCheckBox("Male");
		chckbxMale.setBounds(113, 236, 61, 23);
		frame.getContentPane().add(chckbxMale);
		
		JCheckBox chckbxFemale = new JCheckBox("Female");
		chckbxFemale.setBounds(181, 236, 61, 23);
		frame.getContentPane().add(chckbxFemale);
		
		JLabel lblIAm = new JLabel("I am:");
		lblIAm.setBounds(69, 240, 34, 14);
		frame.getContentPane().add(lblIAm);
		
		JLabel lblMessenger = new JLabel("Messenger");
		lblMessenger.setBounds(106, 31, 58, 23);
		frame.getContentPane().add(lblMessenger);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setBounds(93, 314, 89, 23);
		frame.getContentPane().add(btnSignUp);
	}

}
