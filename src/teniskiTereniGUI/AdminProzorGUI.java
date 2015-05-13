package teniskiTereniGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;

import java.awt.Dimension;

import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import java.awt.Toolkit;
import java.awt.FlowLayout;

import javax.swing.JMenu;
import javax.swing.UIManager;

import java.awt.Color;

import javax.swing.JMenuItem;

import java.awt.Font;

import javax.swing.AbstractListModel;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;

import java.awt.ComponentOrientation;

import net.miginfocom.swing.MigLayout;

import javax.swing.BoxLayout;
import javax.swing.JDesktopPane;

import java.awt.GridLayout;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;

import java.awt.Component;

import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

import java.util.Date;
import java.util.Calendar;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

import teniskiTeren.TeniskiTeren;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdminProzorGUI extends JFrame {
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnHelp;
	private JMenu mnAbout;
	private JMenuItem mntmNew;
	private JMenuItem mntmOpen;
	private JMenuItem mntmSave;
	private JMenuItem mntmExit;
	private JPanel panel;
	private JPanel panel_2;
	private JButton btnDodajTeren;
	private JButton btnIzbrisiTeren;
	private JButton btnDodajRezervaciju;
	private JButton btnIzbrisiRezervaciju;
	private JMenuItem mntmOProgramu;
	private JMenuItem mntmPomoc;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JSpinner spinner;
	private JLabel lblNewLabel;
	private JList list;
    
	

	/**
	 * Create the frame.
	 */
	public AdminProzorGUI() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
			GUIKOntroler.ugasiAplikacijuAdminProzor();	
				
			}
		});
		setTitle("Administrator");
		setMinimumSize(new Dimension(705, 435));
		setIconImage(Toolkit.getDefaultToolkit().getImage(AdminProzorGUI.class.getResource("/icons/1431287210_Tennis_Ball-32.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 669, 435);
		setJMenuBar(getMenuBar_1());
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().add(getScrollPane(), BorderLayout.SOUTH);
		getContentPane().add(getPanel(), BorderLayout.WEST);
		getContentPane().add(getPanel_2(), BorderLayout.CENTER);
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
			mnFile.add(getMntmNew());
			mnFile.add(getMntmOpen());
			mnFile.add(getMntmSave());
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
	private JMenuItem getMntmNew() {
		if (mntmNew == null) {
			mntmNew = new JMenuItem("New");
		}
		return mntmNew;
	}
	private JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Open");
		}
		return mntmOpen;
	}
	private JMenuItem getMntmSave() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Save");
		}
		return mntmSave;
	}
	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKOntroler.ugasiAplikacijuAdminProzor();
				}
			});
		}
		return mntmExit;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(128, 128, 128));
			panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			FlowLayout flowLayout = (FlowLayout) panel.getLayout();
			flowLayout.setVgap(10);
			panel.setPreferredSize(new Dimension(155, 10));
			panel.add(getBtnDodajTeren());
			panel.add(getBtnIzbrisiTeren());
			panel.add(getBtnDodajRezervaciju());
			panel.add(getBtnIzbrisiRezervaciju());
		}
		return panel;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setBackground(new Color(128, 128, 128));
			panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			panel_2.setLayout(null);
			panel_2.add(getLblNewLabel());
			panel_2.add(getList());
		}
		return panel_2;
	}
	private JButton getBtnDodajTeren() {
		if (btnDodajTeren == null) {
			btnDodajTeren = new JButton("Dodaj teren");
			btnDodajTeren.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKOntroler.prikaziDodajTerenProzor();
				}
			});
			btnDodajTeren.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnDodajTeren.setBackground(new Color(128, 128, 128));
			btnDodajTeren.setPreferredSize(new Dimension(150, 30));
		}
		return btnDodajTeren;
	}
	private JButton getBtnIzbrisiTeren() {
		if (btnIzbrisiTeren == null) {
			btnIzbrisiTeren = new JButton("Izbrisi teren");
			btnIzbrisiTeren.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnIzbrisiTeren.setBackground(new Color(128, 128, 128));
			btnIzbrisiTeren.setPreferredSize(new Dimension(150, 30));
		}
		return btnIzbrisiTeren;
	}
	private JButton getBtnDodajRezervaciju() {
		if (btnDodajRezervaciju == null) {
			btnDodajRezervaciju = new JButton("Dodaj rezervaciju");
			btnDodajRezervaciju.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnDodajRezervaciju.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKOntroler.prikaziRezervisiGUI();
				}
			});
			btnDodajRezervaciju.setBackground(new Color(128, 128, 128));
			btnDodajRezervaciju.setPreferredSize(new Dimension(150, 30));
		}
		return btnDodajRezervaciju;
	}
	private JButton getBtnIzbrisiRezervaciju() {
		if (btnIzbrisiRezervaciju == null) {
			btnIzbrisiRezervaciju = new JButton("Izbrisi rezervaciju");
			btnIzbrisiRezervaciju.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnIzbrisiRezervaciju.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(list.getSelectedValue() != null) {
						TeniskiTeren teren = (TeniskiTeren) list.getSelectedValue();
						GUIKOntroler.obrisiRezervaciju(teren);
					}
				}
			});
			btnIzbrisiRezervaciju.setBackground(new Color(128, 128, 128));
			btnIzbrisiRezervaciju.setPreferredSize(new Dimension(150, 30));
		}
		return btnIzbrisiRezervaciju;
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
	private JMenuItem getMntmPomoc() {
		if (mntmPomoc == null) {
			mntmPomoc = new JMenuItem("Pomoc?");
		}
		return mntmPomoc;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBackground(new Color(128, 128, 128));
			scrollPane.setBorder(new TitledBorder(null, "Status", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			scrollPane.setPreferredSize(new Dimension(2, 90));
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setEditable(false);
			textArea.setAlignmentY(2.0f);
			textArea.setAlignmentX(2.0f);
		}
		return textArea;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Rezervacije:");
			lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel.setForeground(new Color(50, 205, 50));
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel.setBounds(10, 11, 158, 26);
		}
		return lblNewLabel;
	}
	private JList getList() {
		if (list == null) {
			list = new JList();
			list.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			list.setBounds(37, 41, 473, 234);
		}
		return list;
	}

	public void dodajStatusAdmin(String status) {
		textArea.append(status);
		
	}
	
	
}
