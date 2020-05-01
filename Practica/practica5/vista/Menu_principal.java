package vista;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;


import es.studium.Practica2.LogIn;

public class Menu_principal extends Frame
{
	private static final long serialVersionUID = 1L;
	
	LogIn login;
	
	MenuBar barraMenu = new MenuBar();
	
	Menu mnuBus = new Menu("Autobuses");
	private MenuItem mniAltaBus = new MenuItem("Alta");
	private MenuItem mniBajaBus = new MenuItem("Baja");
	private MenuItem mniConsultaBus = new MenuItem("Consulta");
	private MenuItem mniModificaBus = new MenuItem("Modificación");
	
	public Menu_principal()	{
		
		setTitle("Empresa de Limpieza");
		setLayout(new FlowLayout());
		mnuBus.add(getMniAltaBus());
		mnuBus.add(getMniBajaBus());
		mnuBus.add(getMniConsultaBus());
		mnuBus.add(getMniModificaBus());
		
		barraMenu.add(mnuBus);
		
		
		setMenuBar(barraMenu);
		setSize(400,150);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}


	public MenuItem getMniAltaBus() {
		return mniAltaBus;
	}

	public void setMniAltaBus(MenuItem mniAltaBus) {
		this.mniAltaBus = mniAltaBus;
	}

	public MenuItem getMniConsultaBus() {
		return mniConsultaBus;
	}

	public void setMniConsultaBus(MenuItem mniConsultaBus) {
		this.mniConsultaBus = mniConsultaBus;
	}

	public MenuItem getMniBajaBus() {
		return mniBajaBus;
	}

	public void setMniBajaBus(MenuItem mniBajaBus) {
		this.mniBajaBus = mniBajaBus;
	}

	public MenuItem getMniModificaBus() {
		return mniModificaBus;
	}

	public void setMniModificaBus(MenuItem mniModificaBus) {
		this.mniModificaBus = mniModificaBus;
	}
}