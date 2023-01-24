package RotWeissGmbH;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import RotWeissGmbH.GUI_MitarbeiterListe.Zurück_MitarbeiterListeListener;

import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class GUI_Kunden extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Kunden frame = new GUI_Kunden();
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
	public GUI_Kunden() {
		setType(Type.UTILITY);
		setTitle("Kunden");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();getContentPane().setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);getContentPane().setLayout(null);
		JButton btnZurück_Kunden = new JButton("Zurück");
		btnZurück_Kunden.setBounds(10, 231, 89, 23);
		contentPane.add(btnZurück_Kunden);
		btnZurück_Kunden.addActionListener (new Zurück_KundenListener ());
	}
	class Zurück_KundenListener implements ActionListener {                           // Zurück-Button
		@SuppressWarnings("null")
		public void actionPerformed (ActionEvent event) {
			GUI_Dashboard.main(null);
			Window frmGui = null;
			frmGui.setVisible(false);
		}
	}
}
