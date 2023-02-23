package musica;

public class Start {

	public static void main(String[] args) {

		Piano yamaha = new Piano("Cuerda percutida", "Yamaha", 3000f, 88);
		Guitarra fender = new Guitarra("Cuerda", "Fender", 534f, 6);
		Bateria pearl = new Bateria("Percusión", "Pearl", 6890f, 2);

		System.out.println(yamaha.tocar());
		System.out.println(fender.tocar());
		System.out.println(pearl.tocar());

		Instrumento[] instrumentos = new Instrumento[5];
		instrumentos[0] = new Piano("Cuerda percutida", "Yamaha", 3000f, 88);
		instrumentos[1] = new Bateria("Percusión", "Pearl", 6890f, 2);
		instrumentos[2] = new Piano("Cuerda percutida", "Yamaha", 400f, 86);
		instrumentos[3] = new Guitarra("Cuerda", "Fender", 534f, 6);
		instrumentos[4] = new Bateria("Percusión", "Pearl", 765f, 4);

		
		for (Instrumento instru : instrumentos) {

			System.out.println(instru.tocar());
		}

	}

}
