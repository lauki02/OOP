package RotWeissGmbH;


import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JScrollBar;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.JTree;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Point;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.table.DefaultTableModel;
import java.awt.Window.Type;
import java.awt.ComponentOrientation;
import javax.swing.JTextPane;
import java.awt.Rectangle;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;


public class GUI_Dashboard { 

	private JFrame frmGui;
	private JTable table;
	private JTable table_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Dashboard window = new GUI_Dashboard();
					window.frmGui.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_Dashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmGui = new JFrame();
		frmGui.getContentPane().setForeground(new Color(192, 192, 192));
		frmGui.setAutoRequestFocus(false);			
		frmGui.setBounds(new Rectangle(0, 0, 800, 800));
		frmGui.setType(Type.UTILITY);
		frmGui.setTitle("Start"); 											//Titel Fenster
		frmGui.setAlwaysOnTop(true);
		frmGui.setBackground(new Color(192, 192, 192));
		frmGui.getContentPane().setBackground(new Color(192, 192, 192));
		frmGui.getContentPane().setLayout(null);
		
		table_1 = new JTable();
		table_1.setSurrendersFocusOnKeystroke(true);
		table_1.setInheritsPopupMenu(true);
		table_1.setIgnoreRepaint(true);
		table_1.setFocusCycleRoot(true);
		table_1.setFocusTraversalPolicyProvider(true);
		table_1.setFillsViewportHeight(true);
		table_1.setDoubleBuffered(true);
		table_1.setDragEnabled(true);
		table_1.setColumnSelectionAllowed(true);
		table_1.setCellSelectionEnabled(true);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Auftragsnummer", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true, true, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_1.setBounds(31, 51, 462, 160);
		frmGui.getContentPane().add(table_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 842, 22);
		frmGui.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menü");
		menuBar.add(mnNewMenu);
		
		JButton btnDruck = new JButton("CSV Druck");
		btnDruck.setMinimumSize(new Dimension(200, 23));
		btnDruck.setMaximumSize(new Dimension(200, 21));
		mnNewMenu.add(btnDruck);
		btnDruck.addActionListener (new DruckFensterListener ());
		
		
		JButton btnAuftragFenster = new JButton("Neuer Auftag");
		btnAuftragFenster.setMinimumSize(new Dimension(200, 23));
		btnAuftragFenster.setMaximumSize(new Dimension(200, 21));
		mnNewMenu.add(btnAuftragFenster);
		btnAuftragFenster.addActionListener (new AuftragFensterListener ());
		
		
		JButton btnMitarbeiter = new JButton("Mitarbeiterzugang");
		btnMitarbeiter.setMinimumSize(new Dimension(200, 23));
		btnMitarbeiter.setMaximumSize(new Dimension(200, 21));
		btnMitarbeiter.setToolTipText("");
		mnNewMenu.add(btnMitarbeiter);
		btnMitarbeiter.addActionListener (new MitarbeiterFensterListener ());
		
		JButton btnMitarbeiterListe = new JButton("Mitarbeiterliste");
		btnMitarbeiterListe.setMaximumSize(new Dimension(200, 23));
		btnMitarbeiterListe.setMinimumSize(new Dimension(200, 23));
		mnNewMenu.add(btnMitarbeiterListe);
		btnMitarbeiterListe.addActionListener (new MitarbeiterListeFensterListener ());
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setAutoCreateRowSorter(true);
		table.setOpaque(false);
		table.setPreferredSize(new Dimension(100, 100));
		table.setName("GUI_1");
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"L\u00F6schen", "Auftragsnummer", "Kundennummer", "Kundenname", "Auftrag", "Datum", "Service-Techn.", "Kosten"},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"L\u00F6schen", "Auftragsnummer", "Kundennummer", "Kundenname", "Auftrag", "F\u00E4lligkeitsdatum", "Mitarbeiter", "Kosten"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setGridColor(new Color(192, 192, 192));   					//Tabelle Farben
		table.setForeground(new Color(255, 255, 255));
		table.setBackground(new Color(255, 255, 255));
		table.setAutoscrolls(false);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setAutoCreateColumnsFromModel(false);
		table.setAlignmentY(1.0f);
		table.setAlignmentX(1.0f);
		frmGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class AuftragFensterListener implements ActionListener {
		public void actionPerformed (ActionEvent event) {
			GUI_Menue.main(null);
			frmGui.setVisible(false);
			
		}
	}
	
	class DruckFensterListener implements ActionListener { //Noch zu erledigen
		public void actionPerformed (ActionEvent event) {
			//.main(null);
			
		}
	}
	
	class MitarbeiterFensterListener implements ActionListener {
		public void actionPerformed (ActionEvent event) {
			GUI_Access.main(null);
			frmGui.setVisible(false);
			
		}
	}
	class MitarbeiterListeFensterListener implements ActionListener {
		public void actionPerformed (ActionEvent event) {
			GUI_MitarbeiterListe.main(null);
			frmGui.setVisible(false);
			
		}
	}
}
