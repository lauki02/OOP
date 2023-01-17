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
	private JTable table_2;
	private JTable table_4;
	private JTable table_5;
	private JTable table_6;
	private JTable table_7;
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
	private void initialize() {
		frmGui = new JFrame();
		frmGui.getContentPane().setForeground(new Color(192, 192, 192));
		frmGui.setAutoRequestFocus(false);			
		frmGui.setBounds(new Rectangle(0, 0, 400, 400));
		frmGui.setType(Type.UTILITY);
		frmGui.setTitle("Start"); 											//Titel Fenster
		frmGui.setAlwaysOnTop(true);
		frmGui.setBackground(new Color(192, 192, 192));
		frmGui.getContentPane().setBackground(new Color(192, 192, 192));
		frmGui.getContentPane().setLayout(null);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		table_1.setBounds(110, 100, 54, 160);
		frmGui.getContentPane().add(table_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 842, 22);
		frmGui.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menü");
		menuBar.add(mnNewMenu);
		
		JButton btnNewButton_1 = new JButton("CSV Druck");
		btnNewButton_1.setMaximumSize(new Dimension(100, 21));
		mnNewMenu.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Neuer Auftag");
		btnNewButton_2.setMaximumSize(new Dimension(100, 21));
		mnNewMenu.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Mitarbeiter");
		btnNewButton_3.setMaximumSize(new Dimension(100, 21));
		btnNewButton_3.setToolTipText("");
		mnNewMenu.add(btnNewButton_3);
		
		JTextArea txtrAuftragsnr = new JTextArea();
		txtrAuftragsnr.setText("Auftragsnr.");
		txtrAuftragsnr.setBounds(110, 68, 54, 22);
		frmGui.getContentPane().add(txtrAuftragsnr);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setBounds(174, 68, 54, 22);
		frmGui.getContentPane().add(textArea_1_1);
		
		JTextArea textArea_1_1_1 = new JTextArea();
		textArea_1_1_1.setBounds(238, 68, 54, 22);
		frmGui.getContentPane().add(textArea_1_1_1);
		
		JTextArea textArea_1_1_1_1 = new JTextArea();
		textArea_1_1_1_1.setBounds(302, 68, 54, 22);
		frmGui.getContentPane().add(textArea_1_1_1_1);
		
		JTextArea textArea_1_1_1_1_1 = new JTextArea();
		textArea_1_1_1_1_1.setBounds(366, 68, 54, 22);
		frmGui.getContentPane().add(textArea_1_1_1_1_1);
		
		JTextArea textArea_1_1_1_1_1_1 = new JTextArea();
		textArea_1_1_1_1_1_1.setBounds(430, 68, 54, 22);
		frmGui.getContentPane().add(textArea_1_1_1_1_1_1);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		table_2.setBounds(174, 100, 54, 160);
		frmGui.getContentPane().add(table_2);
		
		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		table_4.setBounds(238, 100, 54, 160);
		frmGui.getContentPane().add(table_4);
		
		table_5 = new JTable();
		table_5.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		table_5.setBounds(302, 100, 54, 160);
		frmGui.getContentPane().add(table_5);
		
		table_6 = new JTable();
		table_6.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		table_6.setBounds(366, 100, 54, 160);
		frmGui.getContentPane().add(table_6);
		
		table_7 = new JTable();
		table_7.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		table_7.setBounds(430, 100, 54, 160);
		frmGui.getContentPane().add(table_7);
		
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
}
