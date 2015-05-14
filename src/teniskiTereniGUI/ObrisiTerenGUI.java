package teniskiTereniGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;
import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.util.LinkedList;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JComboBox;

import teniskiTeren.TeniskiTeren;

public class ObrisiTerenGUI extends JFrame {

	private JPanel contentPane;
	private JButton btnObrisiTeren;
	private JButton btnOdustani;
	private JRadioButton rdbtnIzbrisiTeren;
	private JLabel lblTeren;
	private JComboBox jcbTeniskiTeren;


	/**
	 * Create the frame.
	 */
	public ObrisiTerenGUI() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ObrisiTerenGUI.class.getResource("/icons/1431487154_Delete.png")));
		setTitle("Obrisi teren");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnObrisiTeren());
		contentPane.add(getBtnOdustani());
		contentPane.add(getRdbtnIzbrisiTeren());
		contentPane.add(getLblTeren());
		contentPane.add(getJcbTeniskiTeren());
	}
	private JButton getBtnObrisiTeren() {
		if (btnObrisiTeren == null) {
			btnObrisiTeren = new JButton("Obrisi teren");
			btnObrisiTeren.setEnabled(false);
			btnObrisiTeren.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnObrisiTeren.setBounds(63, 197, 139, 51);
		}
		return btnObrisiTeren;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setBounds(240, 197, 139, 51);
		}
		return btnOdustani;
	}
	private JRadioButton getRdbtnIzbrisiTeren() {
		if (rdbtnIzbrisiTeren == null) {
			rdbtnIzbrisiTeren = new JRadioButton("Da li ste sigurni da zelite da izbrisete teren");
			rdbtnIzbrisiTeren.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (rdbtnIzbrisiTeren.isSelected())
						btnObrisiTeren.setEnabled(true);
					else 
						btnObrisiTeren.setEnabled(false);
				}
			});
			rdbtnIzbrisiTeren.setFont(new Font("Tahoma", Font.BOLD, 11));
			rdbtnIzbrisiTeren.setBackground(UIManager.getColor(new Color(128, 128, 128)));
			rdbtnIzbrisiTeren.setBounds(63, 158, 297, 32);
		}
		return rdbtnIzbrisiTeren;
	}
	private JLabel getLblTeren() {
		if (lblTeren == null) {
			lblTeren = new JLabel("TEREN:");
			lblTeren.setForeground(new Color(0, 204, 0));
			lblTeren.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblTeren.setBounds(82, 70, 87, 50);
		}
		return lblTeren;
	}
	public JComboBox getJcbTeniskiTeren() {
		if (jcbTeniskiTeren == null) {
			jcbTeniskiTeren = new JComboBox();
			jcbTeniskiTeren.setBounds(66, 125, 111, 20);
			LinkedList<String> tipoviTerena = GUIKontroler.vratiTipoveTerena();
			for (int i = 0; i < tipoviTerena.size(); i++) {
				jcbTeniskiTeren.addItem(tipoviTerena.get(i).toString());
			}
		}
		return jcbTeniskiTeren;
	}
	
}
