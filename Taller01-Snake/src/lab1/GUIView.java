package lab1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUIView extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	
	public GUIView() {
		setSize(600,500); //tamaño de la ventana
		//setLocation(350, 125); //posicion de la ventana
		//this.setBounds(int,int,int,int); // posicion y tamaño de la ventana
		setLocationRelativeTo(null); //ubica la ventana en el centro
		
		agregarPanel();
		agregarBotones();
	}
	
	private void agregarPanel() {
		
		panel= new JPanel();
		this.getContentPane().add(panel);//agregamos el panel a la ventana
		panel.setBackground(Color.GRAY);//cambia de color el panel
	}
	
	private void agregarBotones() {
		JButton boton1 = new JButton("Fondo Azul");
		boton1.setForeground(Color.blue); //color de la letra del botón
		boton1.setFont(new Font("cooper black",3,30)); //Fuente de la letra del botón; 3 es para cursiva
		//boton1.setBounds(300,300,300,40);
			
		JButton boton2 = new JButton("Fondo Negro");
		boton2.setForeground(Color.BLACK); //color de la letra del botón
		boton2.setFont(new Font("cooper black",3,30));

		JButton boton3 = new JButton("Fondo Rojo");
		boton3.setForeground(Color.RED); //color de la letra del botón
		boton3.setFont(new Font("cooper black",3,30));
		
		ActionListener evento1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.blue);
				
			}
		};
		
		ActionListener evento2 = 
				new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.black);
				
			}
		};
		
		ActionListener evento3 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.red);
				
			}
		};
		
		boton1.addActionListener(evento1);
		boton2.addActionListener(evento2);
		boton3.addActionListener(evento3);
		
		panel.add(boton1);
		panel.add(boton2);
		panel.add(boton3);
	
	}
}
