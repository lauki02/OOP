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

public class GUI_1 {

	private JFrame frame;
	private final JToolBar toolBar = new JToolBar();
	private final JScrollBar scrollBar = new JScrollBar();

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
		frame.getContentPane().setBackground(new Color(0, 128, 255));
		scrollBar.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(scrollBar, BorderLayout.EAST);
		toolBar.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(toolBar, BorderLayout.NORTH);
		frame.setBounds(100, 100, 772, 592);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
