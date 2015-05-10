package teniskiTereniGUI;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class RezervisiGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblIzaberiDan;
	private JComboBox comboBox;
	private JLabel lblTeren;
	private JComboBox comboBox_1;
	private JLabel lblTermin;
	private JComboBox comboBox_2;
	private JLabel lblNewLabel;
	private JComboBox comboBox_3;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JButton btnRezervisi;
	private JButton btnOdustani;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RezervisiGUI frame = new RezervisiGUI();
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
	public RezervisiGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblIzaberiDan());
		contentPane.add(getComboBox());
		contentPane.add(getLabel_1());
		contentPane.add(getComboBox_1());
		contentPane.add(getLabel_2());
		contentPane.add(getComboBox_2());
		contentPane.add(getLabel_3());
		contentPane.add(getComboBox_3());
		contentPane.add(getTextField());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getBtnRezervisi());
		contentPane.add(getBtnOdustani());
	}

	private JLabel getLblIzaberiDan() {
		if (lblIzaberiDan == null) {
			lblIzaberiDan = new JLabel("Izaberi dan :");
			lblIzaberiDan.setBounds(10, 11, 78, 14);
		}
		return lblIzaberiDan;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ponedeljak", "Utorak", "Sreda", "Cetvrtak", "Petak", "Subota", "Nedelja"}));
			comboBox.setBounds(81, 8, 113, 20);
		}
		return comboBox;
	}
	private JLabel getLabel_1() {
		if (lblTeren == null) {
			lblTeren = new JLabel("Teren:");
			lblTeren.setBounds(10, 62, 46, 14);
		}
		return lblTeren;
	}
	private JComboBox getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox();
			comboBox_1.setBounds(81, 59, 78, 20);
		}
		return comboBox_1;
	}
	private JLabel getLabel_2() {
		if (lblTermin == null) {
			lblTermin = new JLabel("Termin od :");
			lblTermin.setBounds(10, 118, 78, 14);
		}
		return lblTermin;
	}
	private JComboBox getComboBox_2() {
		if (comboBox_2 == null) {
			comboBox_2 = new JComboBox();
			comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"08:00", "09:00", "10:00", "11:00"}));
			comboBox_2.setBounds(81, 115, 86, 20);
		}
		return comboBox_2;
	}
	private JLabel getLabel_3() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Termin do:");
			lblNewLabel.setBounds(196, 118, 70, 14);
		}
		return lblNewLabel;
	}
	private JComboBox getComboBox_3() {
		if (comboBox_3 == null) {
			comboBox_3 = new JComboBox();
			comboBox_3.setBounds(292, 115, 78, 20);
		}
		return comboBox_3;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(100, 152, 113, 30);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Ime i prezime");
			lblNewLabel_1.setBounds(10, 168, 78, 14);
		}
		return lblNewLabel_1;
	}
	private JButton getBtnRezervisi() {
		if (btnRezervisi == null) {
			btnRezervisi = new JButton("Rezervisi");
			btnRezervisi.setBounds(70, 207, 89, 23);
		}
		return btnRezervisi;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.setBounds(256, 207, 89, 23);
		}
		return btnOdustani;
	}
}
