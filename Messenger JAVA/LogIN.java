import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class LogIN {

	JFrame frame;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIN window = new LogIN();
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
	public LogIN() {
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
		
		textField_1 = new JTextField();
		textField_1.setBounds(60, 124, 152, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JTextArea txtrName = new JTextArea();
		txtrName.setText("Name:");
		txtrName.setBounds(60, 91, 44, 22);
		frame.getContentPane().add(txtrName);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(60, 215, 152, 20);
		frame.getContentPane().add(passwordField);
		
		JTextArea txtrPassward = new JTextArea();
		txtrPassward.setText("Passward:");
		txtrPassward.setBounds(60, 185, 76, 20);
		frame.getContentPane().add(txtrPassward);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setBounds(93, 304, 89, 23);
		frame.getContentPane().add(btnLogIn);
		
		JButton btnCreatNewAccount = new JButton("Creat New Account");
		btnCreatNewAccount.setBounds(60, 425, 164, 23);
		frame.getContentPane().add(btnCreatNewAccount);
		
		JCheckBox chckbxKeepMeLogged = new JCheckBox("  Keep Me Logged In  ");
		chckbxKeepMeLogged.setBounds(60, 259, 139, 23);
		frame.getContentPane().add(chckbxKeepMeLogged);
		
		JLabel lblMessenger = new JLabel("Messenger");
		lblMessenger.setBounds(106, 31, 58, 23);
		frame.getContentPane().add(lblMessenger);
	}
}
