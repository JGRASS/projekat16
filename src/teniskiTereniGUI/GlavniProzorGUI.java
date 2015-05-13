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
import java.util.LinkedList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Predstavlja glavni korisnicki prozor
 * @author Sasa
 *
 */
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
	private JMenuItem mntmPomoc;
	private JMenuItem mntmOProgramu;

	

	/**
	 * Create the frame.
	 */
	public GlavniProzorGUI() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				GUIKOntroler.ugasiAplikacijuGlavniProzor();
			}
		});
		setTitle("Zaposleni");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
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
			mnHelp.add(getMntmPomoc());
		}
		return mnHelp;
	}
	private JMenu getMnAbout() {
		if (mnAbout == null) {
			mnAbout = new JMenu("About");
			mnAbout.add(getMntmOProgramu());
		}
		return mnAbout;
	}
	private JMenuItem getMntmNovaRezervacija() {
		if (mntmNovaRezervacija == null) {
			mntmNovaRezervacija = new JMenuItem("New");
			mntmNovaRezervacija.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKOntroler.prikaziRezervisiGUI();
				}
			});
			mntmNovaRezervacija.setIcon(new ImageIcon(GlavniProzorGUI.class.getResource("/icons/1431487165_Add.png")));
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
			panel.setPreferredSize(new Dimension(150, 10));
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
			panel_2.add(getList_3());
			panel_2.add(getLblRezervacije());
		}
		return panel_2;
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
			btnDodajRezervaciju.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnDodajRezervaciju.setForeground(new Color(50, 205, 50));
			btnDodajRezervaciju.setBorder(UIManager.getBorder("Button.border"));
			btnDodajRezervaciju.setPreferredSize(new Dimension(140, 45));
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
			btnObrisiRezervaciju.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnObrisiRezervaciju.setForeground(new Color(50, 205, 50));
			btnObrisiRezervaciju.setBorder(UIManager.getBorder("Button.border"));
			btnObrisiRezervaciju.setPreferredSize(new Dimension(140, 45));
			btnObrisiRezervaciju.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(list_3.getSelectedValue() != null) {
						TeniskiTeren teren = (TeniskiTeren) list_3.getSelectedValue();
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
			mntmSave.setIcon(new ImageIcon(GlavniProzorGUI.class.getResource("/icons/1431487204_Save.png")));
		}
		return mntmSave;
	}
	private JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Open");
			mntmOpen.setIcon(new ImageIcon(GlavniProzorGUI.class.getResource("/icons/1431487446_Open_v2.png")));
		}
		return mntmOpen;
	}
	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.setIcon(new ImageIcon(GlavniProzorGUI.class.getResource("/icons/1431487154_Delete.png")));
			mntmExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKOntroler.ugasiAplikacijuGlavniProzor();
				}
			});
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
	private JMenuItem getMntmPomoc() {
		if (mntmPomoc == null) {
			mntmPomoc = new JMenuItem("Pomoc");
			mntmPomoc.setIcon(new ImageIcon(GlavniProzorGUI.class.getResource("/icons/1431487253_Help.png")));
		}
		return mntmPomoc;
	}
	private JMenuItem getMntmOProgramu() {
		if (mntmOProgramu == null) {
			mntmOProgramu = new JMenuItem("O programu");
			mntmOProgramu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKOntroler.prikaziAboutProzorGlavniProzor();
				}
			});
		}
		return mntmOProgramu;
	}

	/**
	 * puni status bar glavnog prozora
	 * @param status
	 */
	public void dodajStatusGlavni(String status) {
		getTextArea().append(status);
		
	}
	public void prikaziSveRezervacije(LinkedList rezervacije){
		
		list_3.setListData(rezervacije.toArray());
	}
}
