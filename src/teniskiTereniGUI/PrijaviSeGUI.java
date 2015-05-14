package teniskiTereniGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JPasswordField;

import java.awt.Color;

import javax.swing.DropMode;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * predstavlja prozor za indetifikaciju administratora
 * @author Sasa
 *
 */
public class PrijaviSeGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField kornisickoIme;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JPasswordField sifra;



	/**
	 * Create the frame.
	 */
	public PrijaviSeGUI() {
		setResizable(false);
		setTitle("Prijava");
		setIconImage(Toolkit.getDefaultToolkit().getImage(PrijaviSeGUI.class.getResource("/icons/1431287210_Tennis_Ball-32.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 344, 225);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getKornisickoIme());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getSifra());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Korisnicko ime:");
			lblNewLabel.setForeground(new Color(50, 205, 50));
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel.setBounds(30, 28, 129, 14);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\u0160ifra:");
			lblNewLabel_1.setForeground(new Color(50, 205, 50));
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1.setBounds(30, 63, 46, 14);
		}
		return lblNewLabel_1;
	}
	private JTextField getKornisickoIme() {
		if (kornisickoIme == null) {
			kornisickoIme = new JTextField();
			kornisickoIme.setBounds(169, 27, 130, 20);
			kornisickoIme.setColumns(10);
		}
		return kornisickoIme;
	}
	
	/**
	 * vrsi se provera unesenih Stringova i otvara se administrator prozor
	 * @return
	 */
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Prijavi se");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String password = new String(sifra.getPassword());
					if(kornisickoIme.getText().equals("nikola") && password.equals("tesla")){
						GUIKontroler.prikaziAdminProzorGUI();
					 dispose();
					 GUIKontroler.zatvoriPocetniProzor();}
					else
						JOptionPane.showMessageDialog(contentPane, "Pogresno korisnicko ime i lozinka");
						
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnNewButton.setBounds(30, 116, 102, 52);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Odustani");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
					
				}
			});
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnNewButton_1.setBounds(197, 116, 102, 52);
		}
		return btnNewButton_1;
	}
	private JPasswordField getSifra() {
		if (sifra == null) {
			sifra = new JPasswordField();
			sifra.setBounds(169, 63, 130, 20);
		}
		return sifra;
	}
}
