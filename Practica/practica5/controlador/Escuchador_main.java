package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import modelo.ModeloAlta;
import vista.*;


public class Escuchador_main implements WindowListener, ActionListener {
	Menu_principal vista = null;
	
	public Escuchador_main (Menu_principal vista) {
		this.vista=vista;
		
		vista.getMniAltaBus().addActionListener(this);

		vista.getMniConsultaBus().addActionListener(this);

		vista.getMniBajaBus().addActionListener(this);

		vista.getMniModificaBus().addActionListener(this);

		vista.addWindowListener(this);
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		if(vista.getMniAltaBus().equals(e.getSource())) 
		{
			ModeloAlta modelo = new ModeloAlta();
			AltaBus vista = new AltaBus();
			new DarAltaBus(modelo, vista);
			
		}
		if(vista.getMniBajaBus().equals(e.getSource())) 
		{
			new BajaBus();
		}
		if(vista.getMniConsultaBus().equals(e.getSource())) 
		{
			new ConsultaBus();
		}
		if(vista.getMniModificaBus().equals(e.getSource())) 
		{
			new ModificaBus();
		}
	}
	

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
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
