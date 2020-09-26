package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal {
	private static ArrayList<Mamifero> lista=new ArrayList<>();
	private static int cantidadMamiferos;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	public Mamifero() {cantidadMamiferos++;lista.add(this);}
	public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona,boolean pelaje,int patas) {
		super(nombre, edad, habitat, genero, zona);
		this.pelaje=pelaje;
		this.patas=patas;
		lista.add(this);
		cantidadMamiferos++;
	}
	public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona) {
		super(nombre, edad, habitat, genero, zona);
		lista.add(this);
		cantidadMamiferos++;
	}
	
	public static ArrayList<Mamifero> getLista() {
		return lista;
	}
	public static void setLista(ArrayList<Mamifero> lista) {
		Mamifero.lista = lista;
	}
	public boolean getPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public static Mamifero crearCaballo(String nombre, int edad, String genero, Zona zona) {
			Mamifero m=new Mamifero(nombre,edad,"pradera",genero,zona,true,4);
			caballos++;
			return m;
	}
	public static Mamifero crearLeon(String nombre, int edad, String genero, Zona zona) {
		Mamifero m=new Mamifero(nombre,edad,"selva",genero,zona,true,4);
		leones++;
		return m;
    }
	public static int cantidadMamiferos() {
		return cantidadMamiferos;
	}

}
