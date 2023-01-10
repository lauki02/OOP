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

public class GUI_1 {

	private JFrame frame;
	private final JScrollBar scrollBar = new JScrollBar();
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_1 window = new GUI_1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setBackground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		scrollBar.setForeground(new Color(0, 128, 0));
		scrollBar.setAutoscrolls(true);
		scrollBar.setBackground(new Color(0, 128, 64));
		frame.getContentPane().add(scrollBar, BorderLayout.EAST);
		
		table = new JTable();
		table.setBackground(new Color(0, 0, 0));
		table.setAutoscrolls(false);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setAutoCreateColumnsFromModel(false);
		table.setAlignmentY(1.0f);
		table.setAlignmentX(1.0f);
		frame.getContentPane().add(table, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
