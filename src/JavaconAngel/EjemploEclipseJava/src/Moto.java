package JavaconAngel.EjemploEclipseJava.src;


public class Moto extends vehiculo{
	//String marca;
	String numRuedas;
	String color;
	String matricula;
	int cilindrada;
	//float posicion;
	//float velocidad;
	private String marca;
	private float posicion;
	private float velocidad;

	public Moto(String marca, String numRuedas, String color, String matricula, int cilindrada, float posicion,
			float velocidad) {
		super();
		this.marca = marca;
		this.numRuedas = numRuedas;
		this.color = color;
		this.matricula = matricula;
		this.cilindrada = cilindrada;
		this.posicion = posicion;
		this.velocidad = velocidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(String numRuedas) {
		this.numRuedas = numRuedas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
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
		return "Moto [marca=" + marca + ", color=" + color + "]";
	}

}
