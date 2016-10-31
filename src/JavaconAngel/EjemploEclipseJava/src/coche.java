package JavaconAngel.EjemploEclipseJava.src;


public class coche {
	String marca;
	private String color;
	private String matricula;
	int numPlazas;
	float velocidad;

	String getMatricula() {
		return matricula;
	}

	void setMatricula(String c) {
		matricula = c;
	}

	String getColor() {
		return color;
	}

	void setColor(String c) {
		c = c.toLowerCase(); // pasa a minúsculas
		c = c.trim();// quita los espacios en blanco de los laterales
		color = c;
	}

	coche() {
		color = "rojo";
		numPlazas = 4;
	}

	coche(String marcaCoche, String color, String matrícula, int numPlazas) {
		marca = marcaCoche;
		this.color = color;

	}

	void avanzar(float cantidad) {
		velocidad = velocidad * cantidad;
	}

	public void dibujar() {
		// TODO Tengo que pintar el coche en pantalla.

	}

	@Override
	public String toString() {
		return marca + "" + color;
	}
}
