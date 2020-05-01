package test;

import vista.*;
import controlador.*;

public class Test {
	public static void main(String[] args) {
		Menu_principal main = new Menu_principal();
		new Escuchador_main(main);
	}
}
