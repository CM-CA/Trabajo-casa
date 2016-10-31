package JavaconAngel.EjemploEclipseJava.src;

import java.util.ArrayList;

public class Principal {

	public Principal() {

		/*
		 * coche c1= new coche(); c1.marca="Opel"; c1.velocidad=10;
		 * c1.avanzar(10); c1.dibujar(); c1.setColor("azul");
		 * System.out.println("El color del coche es: "+ c1.getColor());
		 * System.out.println("El coche: " + c1);
		 */

		Bici b1 = new Bici();
		b1.setMarca = ("BH");
		b1.avanzar(30);
		b1.dibujar();

		Bici bici2 = new Bici("orbea", 10, 20);
		bici2.avanzar(10);
		bici2.dibujar();
		bici2.timbrar(10);
		
		Bici[] arrayBicis =new Bici[3];
		arrayBicis[0]=null;
		arrayBicis[1]=b1;
		arrayBicis[2]=bici2;
		
		ArrayList lista=new ArrayList();
		lista.add(b1);

	}


	

	public static void main(String[] args) {
		new Principal();
	}

}
