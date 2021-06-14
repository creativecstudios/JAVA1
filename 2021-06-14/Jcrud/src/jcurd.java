import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class jcurd {

	private JFrame frame;
	private JTextField bookfield;
	private JTextField editionfield;
	private JTextField pricefield;
	private JTextField bookidfield;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jcurd window = new jcurd();
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
	public jcurd() {
		initialize();
		connect();
	}
	
	Connection con;
	PreparedStatement prp;
	
	public void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/bootstrap","root","");
		}
		catch(ClassNotFoundException e){
			
		}
		catch(SQLException e) {
			
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1069, 734);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Book Shop");
		lblNewLabel.setFont(new Font("FreeSans", Font.BOLD, 30));
		lblNewLabel.setBounds(498, 36, 170, 63);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Registration", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(96, 101, 474, 312);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Book Name");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1.setBounds(44, 49, 171, 30);
		panel.add(lblNewLabel_1);
		
		bookfield = new JTextField();
		bookfield.setBounds(217, 49, 245, 30);
		panel.add(bookfield);
		bookfield.setColumns(10);
		
		editionfield = new JTextField();
		editionfield.setColumns(10);
		editionfield.setBounds(217, 99, 245, 30);
		panel.add(editionfield);
		
		JLabel lblNewLabel_1_1 = new JLabel("Edition");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(44, 99, 171, 30);
		panel.add(lblNewLabel_1_1);
		
		pricefield = new JTextField();
		pricefield.setColumns(10);
		pricefield.setBounds(217, 158, 245, 30);
		panel.add(pricefield);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Price");
		lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(44, 158, 171, 30);
		panel.add(lblNewLabel_1_1_1);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String bname,edition,price;
				
				bname = bookfield.getText();
				edition = editionfield.getText();
				price = pricefield.getText();
				
				try {
					prp = con.prepareStatement("insert into Book(name,edition,price)values(?,?,?)");
					prp.setString(1,bname);
					prp.setString(2, edition);
					prp.setString(3, price);
					prp.executeUpdate();
				}catch(SQLException e) {
					
				}
				
				
				
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton.setBounds(105, 454, 125, 46);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBackground(Color.CYAN);
		btnEdit.setFont(new Font("Dialog", Font.BOLD, 20));
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEdit.setBounds(268, 454, 125, 46);
		frame.getContentPane().add(btnEdit);
		
		JButton btnNewButton_1_1 = new JButton("Clear");
		btnNewButton_1_1.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton_1_1.setBackground(Color.YELLOW);
		btnNewButton_1_1.setBounds(424, 454, 125, 46);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(105, 525, 479, 79);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("BookId");
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(31, 23, 171, 30);
		panel_1.add(lblNewLabel_1_2);
		
		bookidfield = new JTextField();
		bookidfield.setColumns(10);
		bookidfield.setBounds(204, 23, 245, 30);
		panel_1.add(bookidfield);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(604, 100, 431, 400);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Dialog", Font.BOLD, 20));
		btnUpdate.setBackground(Color.GREEN);
		btnUpdate.setBounds(678, 525, 125, 46);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Dialog", Font.BOLD, 20));
		btnDelete.setBackground(Color.RED);
		btnDelete.setBounds(841, 525, 125, 46);
		frame.getContentPane().add(btnDelete);
	}
}
