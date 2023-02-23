package musica;

public class Bateria extends Instrumento {

	private int platos;

	public Bateria(String familia, String marca, float precio, int platos) {

		super(familia, marca, precio);
		this.platos = platos;

	}

	@Override
	public String tocar() {

		return "BADABUM";
	}
}
