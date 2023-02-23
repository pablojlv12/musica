package musica;

public class Guitarra extends Instrumento {

	private int teclas;

	public Guitarra(String familia, String marca, float precio, int teclas) {

		super(familia, marca, precio);
		this.teclas = teclas;
	}

	@Override
	public String tocar() {

		return "wa wa";
	}
}
