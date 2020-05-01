package vista;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;


public class AltaBus extends Frame
{
	private static final long serialVersionUID = 1L;
	Frame altaBus = new Frame ("");
	Label lblHorasServicio = new Label("Horas de servicio:");
	private TextField txtHorasServicio = new TextField(20);
	Label lblModelo = new Label("Modelo:                   ");
	private TextField txtModelo = new TextField(20);
	Label lblAforo = new Label("Cap. del vehículo: ");
	private TextField txtAforo = new TextField(20);
	Label lblMatricula = new Label("Matrícula:                ");
	private TextField txtMatricula = new TextField(20);
	private Button btnAceptar = new Button("Aceptar");
	private Button btnLimpiar = new Button("Limpiar");

	public AltaBus()
	{
		setTitle("ALTA de Autobuses");
		setLayout(new FlowLayout());
		add(lblHorasServicio);
		add(getTxtHorasServicio());
		add(lblModelo);
		add(getTxtModelo());
		add(lblAforo);
		add(getTxtAforo());
		add(lblMatricula);
		add(getTxtMatricula());
		add(getBtnAceptar());
		add(getBtnLimpiar());
		setSize(330,200);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public Button getBtnAceptar() {
		return btnAceptar;
	}

	public void setBtnAceptar(Button btnAceptar) {
		this.btnAceptar = btnAceptar;
	}

	public Button getBtnLimpiar() {
		return btnLimpiar;
	}

	public void setBtnLimpiar(Button btnLimpiar) {
		this.btnLimpiar = btnLimpiar;
	}

	public TextField getTxtHorasServicio() {
		return txtHorasServicio;
	}

	public void setTxtHorasServicio(TextField txtHorasServicio) {
		this.txtHorasServicio = txtHorasServicio;
	}

	public TextField getTxtAforo() {
		return txtAforo;
	}

	public void setTxtAforo(TextField txtAforo) {
		this.txtAforo = txtAforo;
	}

	public TextField getTxtModelo() {
		return txtModelo;
	}

	public void setTxtModelo(TextField txtModelo) {
		this.txtModelo = txtModelo;
	}

	public TextField getTxtMatricula() {
		return txtMatricula;
	}

	public void setTxtMatricula(TextField txtMatricula) {
		this.txtMatricula = txtMatricula;
	}
}