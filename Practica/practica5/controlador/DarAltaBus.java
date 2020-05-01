package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


import vista.*;
import modelo.*;

public class DarAltaBus implements WindowListener, ActionListener{
	
	AltaBus vista = null;
	ModeloAlta modelo = null;
	
	public DarAltaBus (ModeloAlta modelo, AltaBus vista){
		this.modelo = modelo;
		this.vista = vista;
		vista.getBtnAceptar().addActionListener(this);
		vista.getBtnLimpiar().addActionListener(this);
		vista.addWindowListener(this);
		
	}
	
	



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

				if(vista.getBtnLimpiar().equals(e.getSource()))
				{
					vista.getTxtHorasServicio().selectAll();
					vista.getTxtHorasServicio().setText("");
					vista.getTxtHorasServicio().requestFocus();
					
					vista.getTxtModelo().selectAll();
					vista.getTxtModelo().setText("");
					vista.getTxtModelo().requestFocus();
					
					vista.getTxtAforo().selectAll();
					vista.getTxtAforo().setText("");
					vista.getTxtAforo().requestFocus();
					
					vista.getTxtMatricula().selectAll();
					vista.getTxtMatricula().setText("");
					vista.getTxtMatricula().requestFocus();
				}
				else if(vista.getBtnAceptar().equals(e.getSource()))
				{
					// Conectar BD
					modelo.insertar(modelo.conectar(), "bus", vista.getTxtHorasServicio().getText(), vista.getTxtModelo().getText(), vista.getTxtAforo().getText(), vista.getTxtMatricula().getText());

					vista.setVisible(false);
					
					vista.getTxtHorasServicio().selectAll();
					vista.getTxtHorasServicio().setText("");
					vista.getTxtHorasServicio().requestFocus();
					
					vista.getTxtModelo().selectAll();
					vista.getTxtModelo().setText("");
					vista.getTxtModelo().requestFocus();
					
					vista.getTxtAforo().selectAll();
					vista.getTxtAforo().setText("");
					vista.getTxtAforo().requestFocus();
					
					vista.getTxtMatricula().selectAll();
					vista.getTxtMatricula().setText("");
					vista.getTxtMatricula().requestFocus();
				}
			}
	
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		vista.setVisible(false);
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
