package musica;

public class Instrumento {

	protected String familia;
	protected String marca;
	protected float precio;

	public Instrumento(String familia, String marca, float precio) {

		this.familia = familia;
		this.marca = marca;
		this.precio = precio;
	}

	public String tocar() {

		return "clin";
	}
}
