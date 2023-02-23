package musica;

public class Piano extends Instrumento {

	private int teclas;

	public Piano(String familia, String marca, float precio, int teclas) {

		super(familia, marca, precio);
		this.teclas = teclas;

	}

	@Override
	public String tocar() {

		return "plin plin";
	}

}
