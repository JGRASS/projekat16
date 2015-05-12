package teniskiTereniGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UbaciTerenGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNaziv;
	private JCheckBox chckbxZatvoren;
	private JCheckBox chckbxOtvoren;
	private JTextField textField_1;
	private JLabel lblTipTerena;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnOdustani;
	private JButton btnDodajTeren;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UbaciTerenGUI frame = new UbaciTerenGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UbaciTerenGUI() {
		setResizable(false);
		setTitle("Ubaci teren");
		setIconImage(Toolkit.getDefaultToolkit().getImage(UbaciTerenGUI.class.getResource("/icons/1431287210_Tennis_Ball-32.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 198);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTextField());
		contentPane.add(getLblNaziv());
		contentPane.add(getChckbxZatvoren());
		contentPane.add(getChckbxOtvoren());
		contentPane.add(getTextField_1());
		contentPane.add(getLblTipTerena());
		contentPane.add(getBtnOdustani());
		contentPane.add(getBtnDodajTeren());
	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(161, 36, 86, 23);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv terena :");
			lblNaziv.setForeground(new Color(50, 205, 50));
			lblNaziv.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNaziv.setBounds(24, 39, 97, 14);
		}
		return lblNaziv;
	}
	private JCheckBox getChckbxZatvoren() {
		if (chckbxZatvoren == null) {
			chckbxZatvoren = new JCheckBox("Zatvoren");
			chckbxZatvoren.setForeground(new Color(50, 205, 50));
			chckbxZatvoren.setBackground(new Color(128, 128, 128));
			chckbxZatvoren.setFont(new Font("Tahoma", Font.BOLD, 13));
			buttonGroup.add(chckbxZatvoren);
			chckbxZatvoren.setBounds(253, 35, 97, 23);
		}
		return chckbxZatvoren;
	}
	private JCheckBox getChckbxOtvoren() {
		if (chckbxOtvoren == null) {
			chckbxOtvoren = new JCheckBox("Otvoren");
			chckbxOtvoren.setForeground(new Color(50, 205, 50));
			chckbxOtvoren.setBackground(new Color(128, 128, 128));
			chckbxOtvoren.setFont(new Font("Tahoma", Font.BOLD, 13));
			buttonGroup.add(chckbxOtvoren);
			chckbxOtvoren.setBounds(253, 61, 97, 23);
		}
		return chckbxOtvoren;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(161, 62, 86, 22);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JLabel getLblTipTerena() {
		if (lblTipTerena == null) {
			lblTipTerena = new JLabel("Tip terena :");
			lblTipTerena.setForeground(new Color(50, 205, 50));
			lblTipTerena.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblTipTerena.setBounds(34, 64, 97, 14);
		}
		return lblTipTerena;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setBackground(new Color(255, 255, 255));
			btnOdustani.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnOdustani.setBounds(241, 103, 135, 46);
		}
		return btnOdustani;
	}
	private JButton getBtnDodajTeren() {
		if (btnDodajTeren == null) {
			btnDodajTeren = new JButton("Dodaj teren");
			btnDodajTeren.setBackground(new Color(255, 255, 255));
			btnDodajTeren.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnDodajTeren.setForeground(new Color(0, 0, 0));
			btnDodajTeren.setBounds(75, 103, 135, 46);
		}
		return btnDodajTeren;
	}
}
