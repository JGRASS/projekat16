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

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class UbaciTerenGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNaziv;
	private JLabel lblTipTerena;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnOdustani;
	private JButton btnDodajTeren;
	private JComboBox comboBox;

	

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
		contentPane.add(getLblTipTerena());
		contentPane.add(getBtnOdustani());
		contentPane.add(getBtnDodajTeren());
		contentPane.add(getComboBox());
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
	private JLabel getLblTipTerena() {
		if (lblTipTerena == null) {
			lblTipTerena = new JLabel("Tip terena :");
			lblTipTerena.setForeground(new Color(50, 205, 50));
			lblTipTerena.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblTipTerena.setBounds(24, 64, 97, 14);
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
			String naziv = textField.getText();
			String tip = (String) comboBox.getSelectedItem();
			
			
		}
		return btnDodajTeren;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"beton", "sljaka", "trava"}));
			comboBox.setBounds(161, 70, 86, 20);
		}
		return comboBox;
	}
}
