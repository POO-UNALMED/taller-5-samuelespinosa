package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> lista=new ArrayList<>();
	public static int ranas;
	public static int salamandras;
	private static int cantidadAnfibios;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {cantidadAnfibios++;lista.add(this);}
	public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona) {
		super(nombre, edad, habitat, genero, zona);
		cantidadAnfibios++;
		lista.add(this);
	}
	public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona,String colorPiel,boolean venenoso) {
		super(nombre, edad, habitat, genero, zona);
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
		cantidadAnfibios++;
		lista.add(this);
	}
	public static int cantidadAnfibios() {
		return cantidadAnfibios;
	}
	public static Anfibio crearRana(String nombre, int edad,String genero, Zona zona,String colorEscamas,int largoCola) {
		Anfibio s=new Anfibio(nombre,edad,"selva",genero,zona,"rojo",true);
		ranas++;
		return s;
	}
	public static Anfibio crearSalamandra(String nombre, int edad,String genero, Zona zona,String colorEscamas,int largoCola) {
		Anfibio b=new Anfibio(nombre,edad,"selva",genero,zona,"negro y amarillo”,",false);
		salamandras++;
		return b;
	}
	public String movimiento() {
		return "saltar";
	}
	public static ArrayList<Anfibio> getLista() {
		return lista;
	}
	public static void setLista(ArrayList<Anfibio> lista) {
		Anfibio.lista = lista;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	

}
