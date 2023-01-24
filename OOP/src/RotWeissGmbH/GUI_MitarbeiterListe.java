package RotWeissGmbH;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import RotWeissGmbH.GUI_Menue.Zurück_NeuerAuftragListener;

import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.Window;

public class GUI_MitarbeiterListe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_MitarbeiterListe frame = new GUI_MitarbeiterListe();
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
	public GUI_MitarbeiterListe() {
		setType(Type.UTILITY);
		setTitle("Mitarbeiter Liste");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();getContentPane().setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);getContentPane().setLayout(null);
		JButton btnZurück_MitarbeiterListe = new JButton("Zurück");
		btnZurück_MitarbeiterListe.setBounds(10, 231, 89, 23);
		contentPane.add(btnZurück_MitarbeiterListe);
		 btnZurück_MitarbeiterListe.addActionListener (new Zurück_MitarbeiterListeListener ());
	}
	
	class Zurück_MitarbeiterListeListener implements ActionListener {                               // Zurück-Button
		public void actionPerformed (ActionEvent event) {
			GUI_Dashboard.main(null);
			Window frmGui = null;
			frmGui.setVisible(false);
		}
	}
}
