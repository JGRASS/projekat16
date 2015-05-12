package teniskiTereniGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

import java.awt.Dimension;

import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.AbstractListModel;

import java.awt.Font;
import java.awt.FlowLayout;

import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

import teniskiTeren.TeniskiTeren;

import java.util.Date;
import java.util.Calendar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GlavniProzorGUI extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnHelp;
	private JMenu mnAbout;
	private JMenuItem mntmNovaRezervacija;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JList list;
	private JList list_3;
	private JButton btnDodajRezervaciju;
	private JButton btnObrisiRezervaciju;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JMenuItem mntmSave;
	private JMenuItem mntmOpen;
	private JMenuItem mntmExit;
	private JLabel lblRezervacije;
	private JSpinner spinner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GlavniProzorGUI frame = new GlavniProzorGUI();
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
	public GlavniProzorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 467);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanel(), BorderLayout.EAST);
		contentPane.add(getPanel_1(), BorderLayout.SOUTH);
		contentPane.add(getPanel_2(), BorderLayout.CENTER);
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnHelp());
			menuBar.add(getMnAbout());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMntmNovaRezervacija());
			mnFile.add(getMntmSave());
			mnFile.add(getMntmOpen());
			mnFile.add(getMntmExit());
		}
		return mnFile;
	}
	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
		}
		return mnHelp;
	}
	private JMenu getMnAbout() {
		if (mnAbout == null) {
			mnAbout = new JMenu("About");
		}
		return mnAbout;
	}
	private JMenuItem getMntmNovaRezervacija() {
		if (mntmNovaRezervacija == null) {
			mntmNovaRezervacija = new JMenuItem("Nova rezervacija");
			mntmNovaRezervacija.setIcon(null);
		}
		return mntmNovaRezervacija;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(128, 128, 128));
			FlowLayout flowLayout = (FlowLayout) panel.getLayout();
			flowLayout.setVgap(15);
			panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			panel.setPreferredSize(new Dimension(135, 10));
			panel.add(getBtnDodajRezervaciju());
			panel.add(getBtnObrisiRezervaciju());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBackground(new Color(128, 128, 128));
			panel_1.setBorder(new TitledBorder(null, "Status", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setPreferredSize(new Dimension(10, 80));
			panel_1.setLayout(new BorderLayout(0, 0));
			panel_1.add(getScrollPane(), BorderLayout.CENTER);
		}
		return panel_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setBackground(new Color(128, 128, 128));
			panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			panel_2.setLayout(null);
			panel_2.add(getList());
			panel_2.add(getList_3());
			panel_2.add(getLblRezervacije());
		}
		return panel_2;
	}
	private JList getList() {
		if (list == null) {
			list = new JList();
			list.setBounds(10, 21, 1, 1);
		}
		return list;
	}
	private JList getList_3() {
		if (list_3 == null) {
			list_3 = new JList();
			list_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			list_3.setBounds(20, 46, 453, 241);
		}
		return list_3;
	}
	private JButton getBtnDodajRezervaciju() {
		if (btnDodajRezervaciju == null) {
			btnDodajRezervaciju = new JButton("Dodaj rezervaciju");
			btnDodajRezervaciju.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKOntroler.prikaziRezervisiGUI();
				}
			});
			btnDodajRezervaciju.setBackground(new Color(128, 128, 128));
		}
		return btnDodajRezervaciju;
	}
	private JButton getBtnObrisiRezervaciju() {
		if (btnObrisiRezervaciju == null) {
			btnObrisiRezervaciju = new JButton("Obrisi rezervaciju");
			btnObrisiRezervaciju.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(list.getSelectedValue() != null) {
						TeniskiTeren teren = (TeniskiTeren) list.getSelectedValue();
						GUIKOntroler.obrisiRezervaciju(teren);
					}
				}
			});
			btnObrisiRezervaciju.setBackground(new Color(128, 128, 128));
		}
		return btnObrisiRezervaciju;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setEditable(false);
		}
		return textArea;
	}
	private JMenuItem getMntmSave() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Save");
		}
		return mntmSave;
	}
	private JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Open");
		}
		return mntmOpen;
	}
	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
		}
		return mntmExit;
	}
	private JLabel getLblRezervacije() {
		if (lblRezervacije == null) {
			lblRezervacije = new JLabel("Rezervacije:");
			lblRezervacije.setForeground(new Color(50, 205, 50));
			lblRezervacije.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblRezervacije.setBounds(21, 21, 96, 14);
		}
		return lblRezervacije;
	}
}
