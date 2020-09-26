package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal {
	private static ArrayList<Ave> lista=new ArrayList<>();
	public static int halcones;
	public static int aguilas;
	private static int cantidadAves;
	private String colorPlumas;
	public Ave(){cantidadAves++;lista.add(this);}
	public Ave(String nombre, int edad, String habitat, String genero, Zona zona) {
		super(nombre, edad, habitat, genero, zona);
		lista.add(this);
		cantidadAves++;
	}
	public Ave(String nombre, int edad, String habitat, String genero, Zona zona,String colorPlumas) {
		super(nombre, edad, habitat, genero, zona);
		this.colorPlumas=colorPlumas;
		lista.add(this);
		cantidadAves++;
	}
	public Ave(String nombre, int edad, String habitat, String genero,String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas=colorPlumas;
		lista.add(this);
		cantidadAves++;
	}
	public static Ave crearHalcon(String nombre, int edad, String genero, Zona zona) {
		Ave a=new Ave(nombre,edad,"montanas",genero,zona,"cafe glorioso");
		halcones++;
		return a;
	}
	public static Ave crearAguila(String nombre, int edad, String genero, Zona zona) {
		Ave a=new Ave(nombre,edad,"montanas",genero,zona,"blanco y amarillo");
		aguilas++;
		return a;
	}
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave a=new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
		halcones++;
		return a;
	}
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave a=new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
		aguilas++;
		return a;
	}
	public static int cantidadAves() {
		return cantidadAves;
	}
	public String movimiento() {
		return "volar";
	}
	public static ArrayList<Ave> getLista() {
		return lista;
	}
	public static void setLista(ArrayList<Ave> lista) {
		Ave.lista = lista;
	}
	public static int getAguilas() {
		return aguilas;
	}
	public static void setAguilas(int aguilas) {
		Ave.aguilas = aguilas;
	}
	
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	

}
