package hey;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JTextField;

public class component extends JFrame {

	private JPanel contentPane;
	private final JScrollPane scrollPane = new JScrollPane();
	private JTextField textField;
	private JTextField textField_1;
public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					component frame = new component();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
public component() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnSubmit = new JButton("LOGIN FORM");
		btnSubmit.setBounds(5, 5, 424, 31);
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSubmit.setForeground(Color.BLACK);
		btnSubmit.setBackground(Color.GREEN);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInternalMessageDialog(null,textField.getText());
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnSubmit);
		scrollPane.setBounds(5, 36, 2, 220);
		contentPane.add(scrollPane);
		
		textField = new JTextField();
		textField.setBounds(177, 70, 159, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "HELLO");
			}
		});
		textField_1.setColumns(10);
		textField_1.setBounds(177, 101, 159, 20);
		contentPane.add(textField_1);
		
		JButton btnUserName = new JButton("USER NAME");
		btnUserName.setForeground(Color.RED);
		btnUserName.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		btnUserName.setBackground(Color.GREEN);
		btnUserName.setBounds(20, 70, 110, 20);
		contentPane.add(btnUserName);
		
		JButton btnPassword = new JButton("PASSWORD");
		btnPassword.setForeground(Color.RED);
		btnPassword.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		btnPassword.setBackground(Color.GREEN);
		btnPassword.setBounds(20, 100, 110, 20);
		contentPane.add(btnPassword);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btnSubmit}));
	}
}
