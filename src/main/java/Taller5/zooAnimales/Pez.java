package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal {
	private static ArrayList<Pez> lista=new ArrayList<>();
	public static int salmones;
	public static int bacalaos;
	private static int cantidadPeces;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {cantidadPeces++;lista.add(this);}
	public Pez(String nombre, int edad, String habitat, String genero, Zona zona) {
		super(nombre, edad, habitat, genero, zona);
		cantidadPeces++;
		lista.add(this);
	}
	public Pez(String nombre, int edad, String habitat, String genero, Zona zona,String colorEscamas,int cantidadAletas) {
		super(nombre, edad, habitat, genero, zona);
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
		cantidadPeces++;
		lista.add(this);
	}
	public static int cantidadPeces() {
		return cantidadPeces;
	}
	public static Pez crearSalmon(String nombre, int edad,String genero, Zona zona,String colorEscamas,int largoCola) {
		Pez s=new Pez(nombre,edad,"oceano",genero,zona,"rojo",6);
		salmones++;
		return s;
	}
	public static Pez crearSerpiente(String nombre, int edad,String genero, Zona zona,String colorEscamas,int largoCola) {
		Pez b=new Pez(nombre,edad,"oceano",genero,zona,"gris",6);
		bacalaos++;
		return b;
	}
	public String movimiento() {
		return "nadar";
	}
	public static ArrayList<Pez> getLista() {
		return lista;
	}
	public static void setLista(ArrayList<Pez> lista) {
		Pez.lista = lista;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	

}
