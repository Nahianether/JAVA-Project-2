import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class LogInn {

	private JFrame f1;
	private JTextField textField;
	private JPasswordField pass1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					LogInn window = new LogInn();
//					window.f1.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
		new LogInn();
	}

	/**
	 * Create the application.
	 */
	public LogInn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		f1 = new JFrame("Messenger");
		f1.setBounds(100, 100, 282, 522);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.getContentPane().setLayout(null);
		
		textField= new JTextField();
		textField.setBounds(60, 124, 152, 20);
		f1.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel txtrName = new JLabel();
		txtrName.setText("User Name:");
		txtrName.setBounds(60, 91, 100, 22);
		f1.getContentPane().add(txtrName);
		
		pass1 = new JPasswordField();
		pass1.setBounds(60, 215, 152, 20);
		f1.getContentPane().add(pass1);
		
		JLabel txtrPassward = new JLabel();
		txtrPassward.setText("Passward:");
		txtrPassward.setBounds(60, 185, 76, 20);
		f1.getContentPane().add(txtrPassward);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setBounds(93, 304, 89, 23);
		f1.getContentPane().add(btnLogIn);
		
		JButton btnCreatNewAccount = new JButton("Creat New Account");
		btnCreatNewAccount.setBounds(60, 425, 164, 23);
		f1.getContentPane().add(btnCreatNewAccount);
		btnCreatNewAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f1.setVisible(false);
				CreatAcc c=new CreatAcc();
			}
		});
		
		JCheckBox chckbxKeepMeLogged = new JCheckBox("  Keep Me Logged In  ");
		chckbxKeepMeLogged.setBounds(70, 259, 250, 23);
		f1.getContentPane().add(chckbxKeepMeLogged);
		
		f1.setVisible(true);
	}
}
