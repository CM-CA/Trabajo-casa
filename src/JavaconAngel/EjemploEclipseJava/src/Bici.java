package JavaconAngel.EjemploEclipseJava.src;


public class Bici {
	private String marca;
	private float posicion;
	private float velocidad;
	public String setMarca;


	public Bici() {
		super();
		this.marca = marca;
		this.posicion = posicion;
		this.velocidad = velocidad;
	}

	public Bici(String string, int i, int j) {
		// TODO Auto-generated constructor stub
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPosicion() {
		return posicion;
	}

	public void setPosicion(float posicion) {
		this.posicion = posicion;
	}

	public float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(float velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "bicicleta [marca=" + marca + ", posicion=" + posicion + ", velocidad=" + velocidad + "]";
	}

	void avanzar(float cantidad) {
		// TODO tengo que hacer que la bici se mueva.
	}

	void dibujar() {
		// TODO tengo que pintar la bici en pantalla.
	}

	public void timbrar(int i) {
		// TODO Auto-generated method stub
		
	}
}
