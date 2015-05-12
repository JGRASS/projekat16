package teniskiTereniGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;

import java.awt.Toolkit;

import javax.swing.JList;
import javax.swing.border.EtchedBorder;

import java.awt.Font;

import javax.swing.AbstractListModel;

import teniskiTeren.TeniskiTeren;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RezervisiGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblTeren;
	private JComboBox tip;
	private JTextField imeIPrezime;
	private JLabel lblNewLabel_1;
	private JButton btnRezervisi;
	private JButton btnOdustani;
	private JSpinner dan;
	private JLabel lblTerminOd;
	private JLabel lblNewLabel;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JList list;
	private JTextField brojTelefona;
    
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
		setTitle("Nova rezervacija");
		setIconImage(Toolkit.getDefaultToolkit().getImage(RezervisiGUI.class.getResource("/icons/1431287210_Tennis_Ball-32.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 366, 327);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLabel_1());
		contentPane.add(getTip());
		contentPane.add(getImeIPrezime());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getBtnRezervisi());
		contentPane.add(getBtnOdustani());
		contentPane.add(getDan());
		contentPane.add(getLblTerminOd());
		contentPane.add(getLabel_2());
		contentPane.add(getList());
		contentPane.add(getBrojTelefona());
	}
	private JLabel getLabel_1() {
		if (lblTeren == null) {
			lblTeren = new JLabel("Teren:");
			lblTeren.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblTeren.setForeground(new Color(50, 205, 50));
			lblTeren.setBounds(10, 126, 46, 14);
		}
		return lblTeren;
	}
	private JComboBox getTip() {
		if (tip == null) {
			tip = new JComboBox();
			tip.setModel(new DefaultComboBoxModel(new String[] {"beton", "sljaka", "trava"}));
			tip.setBounds(64, 125, 113, 20);
		}
		return tip;
	}
	private JTextField getImeIPrezime() {
		if (imeIPrezime == null) {
			imeIPrezime = new JTextField();
			imeIPrezime.setBounds(10, 34, 167, 20);
			imeIPrezime.setColumns(10);
		}
		return imeIPrezime;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Ime i prezime:");
			lblNewLabel_1.setForeground(new Color(50, 205, 50));
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1.setBounds(10, 14, 118, 14);
		}
		return lblNewLabel_1;
	}
	private JButton getBtnRezervisi() {
		if (btnRezervisi == null) {
			btnRezervisi = new JButton("Rezervisi");
			btnRezervisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					TeniskiTeren teren = new TeniskiTeren();
					teren.setImeKorisnika(imeIPrezime.getText());
					teren.setBrojTelefona(brojTelefona.getText());
					teren.setDatum((GregorianCalendar) dan.getValue());
					if (tip.getSelectedItem().equals("beton")) 
						teren.setTipTerena("beton");
					if (tip.getSelectedItem().equals("sljaka")) 
						teren.setTipTerena("sljaka");
					if (tip.getSelectedItem().equals("trava")) 
						teren.setTipTerena("trava");
					 String a=GUIKOntroler.vratiListuTerena((teren.getTipTerena()));
					 if(a==null){
						 JOptionPane.showMessageDialog(contentPane, "Nema slobodnih termina u ovom vremanu");
						 return;
					 }
					 teren.setNazivTerena(a);
					
					
					GUIKOntroler.dodajRezervaciju(teren);
				}
			});
			btnRezervisi.setBounds(10, 213, 169, 23);
		}
		return btnRezervisi;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.setBounds(10, 247, 169, 23);
		}
		return btnOdustani;
	}
	private JSpinner getDan() {
		if (dan == null) {
			dan = new JSpinner();
			dan.setFont(new Font("Tahoma", Font.PLAIN, 13));
			dan.setModel(new SpinnerDateModel(new Date(1431208800000L), null, null, Calendar.DAY_OF_MONTH));
			dan.setBounds(66, 171, 113, 20);
			JSpinner.DateEditor de_dan = new JSpinner.DateEditor(dan, "dd-MMM-yyyy");
			dan.setEditor(de_dan);
		}
		return dan;
	}
	private JLabel getLblTerminOd() {
		if (lblTerminOd == null) {
			lblTerminOd = new JLabel("Datum:");
			lblTerminOd.setForeground(new Color(50, 205, 50));
			lblTerminOd.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblTerminOd.setBounds(10, 170, 64, 20);
		}
		return lblTerminOd;
	}
	private JLabel getLabel_2() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Satnica :");
			lblNewLabel.setForeground(new Color(50, 205, 50));
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel.setBounds(220, 11, 69, 20);
		}
		return lblNewLabel;
	}
	private JList getList() {
		if (list == null) {
			list = new JList();
			list.setModel(new AbstractListModel() {
				String[] values = new String[] {"08:00-09:00", "09:00-10:00", "10:00-11:00", "11:00-12:00", "12:00-13:00", "13:00-14:00", "14:00-15:00", "15:00-16:00", "16:00-17:00", "17:00-18:00", "18:00-19:00"};
				public int getSize() {
					return values.length;
				}
				public Object getElementAt(int index) {
					return values[index];
				}
			});
			list.setFont(new Font("SansSerif", Font.BOLD, 12));
			list.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			list.setBounds(223, 32, 80, 204);
		}
		return list;
	}
	private JTextField getBrojTelefona() {
		if (brojTelefona == null) {
			brojTelefona = new JTextField();
			brojTelefona.setToolTipText("Unesite Vas broj telefona");
			brojTelefona.setBounds(10, 81, 167, 20);
			brojTelefona.setColumns(10);
		}
		return brojTelefona;
	}
}
