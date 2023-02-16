package RotWeissGmbH;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.event.*;
import java.util.ArrayList;

//import RotWeissGmbH.Serviceauftrag;
//import RotWeissGmbH.Test;

//import RotWeissGmbH.GUI_Menue.Zurück_NeuerAuftragListener;

/*




public class GUI_Access extends JFrame {

	private JPanel contentPane;
	private JTextField NeueKosten_Kosten;
	private JTextField NeueKosten_Auftrag;
	private JButton btnBack_Mitarbeiter;
	private JButton btnSpeichern;
	public static JList list_4;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Access frame = new GUI_Access();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public GUI_Access() {
		//Test.kostenUpdaten();
		list_4 = new JList();
		setType(Type.UTILITY);
		setTitle("Mitarbeiterzugang:");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 500);
		contentPane = new JPanel(); 
		getContentPane().setLayout(null); 
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane); 
		getContentPane().setLayout(null); 
		
		list_4.setBounds(10, 30, 400, 350); 
		contentPane.add(list_4);
		list_4.setVisibleRowCount(10); 
		list_4.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_4.addListSelectionListener(new SelectionListener());
 
		JLabel lblNewLabel = new JLabel("Neue Kosteneingabe:");
		lblNewLabel.setBounds(450, 10, 134, 13);
		contentPane.add(lblNewLabel);
 
		NeueKosten_Kosten = new JTextField();
		NeueKosten_Kosten.setBounds(450, 34, 96, 19);
		contentPane.add(NeueKosten_Kosten);
		NeueKosten_Kosten.setColumns(10);
 
		JLabel lblNewLabel_1 = new JLabel("Auftrag:");
		lblNewLabel_1.setBounds(450, 78, 160, 13);
		contentPane.add(lblNewLabel_1);
 
		NeueKosten_Auftrag = new JTextField();
		NeueKosten_Auftrag.setBounds(450, 101, 96, 19);
		contentPane.add(NeueKosten_Auftrag);
		NeueKosten_Auftrag.setColumns(10);
 
		btnSpeichern = new JButton("Speichern");
		btnSpeichern.setBounds(550, 232, 110, 21);
		contentPane.add(btnSpeichern);
		btnSpeichern.addActionListener(new SpeichernListener());
 
		btnBack_Mitarbeiter = new JButton("Back");
		btnBack_Mitarbeiter.setBounds(420, 231, 89, 23);
		contentPane.add(btnBack_Mitarbeiter);
		btnBack_Mitarbeiter.addActionListener (new Back_MitarbeiterListener ());
	}
	
	private class SelectionListener implements ListSelectionListener {
		public void valueChanged (ListSelectionEvent event) {
			
			
		}
	}
	
	private class Back_MitarbeiterListener implements ActionListener {                   // Zurück-Button auf Test
		public void actionPerformed (ActionEvent event) {
			Test.main(null);
			//Window frmGui = null;
			//frmGui.setVisible(false);
			
		}
	}
	
	private class SpeichernListener implements ActionListener {							//Speichern-Button
		public void actionPerformed (ActionEvent event) {
			list_4.getSelectedIndex();
		}
	}
	

		
	
}
*/
