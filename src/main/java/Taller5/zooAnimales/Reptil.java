package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal {
	private static ArrayList<Reptil> lista=new ArrayList<>();
	public static int iguanas;
	public static int serpientes;
	private static int cantidadReptiles;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {cantidadReptiles++;lista.add(this);}
	public Reptil(String nombre, int edad, String habitat, String genero, Zona zona) {
		super(nombre, edad, habitat, genero, zona);
		cantidadReptiles++;
		lista.add(this);
	}
	public Reptil(String nombre, int edad, String habitat, String genero, Zona zona,String colorEscamas,int largoCola) {
		super(nombre, edad, habitat, genero, zona);
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;
		cantidadReptiles++;
		lista.add(this);
	}
	public Reptil(String nombre, int edad, String habitat, String genero,String colorEscamas,int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;
		cantidadReptiles++;
		lista.add(this);
	}
	public static int cantidadReptiles() {
		return cantidadReptiles;
	}
	public static Reptil crearIguana(String nombre, int edad,String genero, Zona zona) {
		Reptil r=new Reptil(nombre,edad,"humedal",genero,zona,"verde",3);
		iguanas++;
		return r;
	}
	public static Reptil crearSerpiente(String nombre, int edad,String genero, Zona zona) {
		Reptil r=new Reptil(nombre,edad,"jungla",genero,zona,"blanco",1);
		serpientes++;
		return r;
	}
	public static Reptil crearIguana(String nombre, int edad,String genero) {
		Reptil r=new Reptil(nombre,edad,"humedal",genero,"verde",3);
		iguanas++;
		return r;
	}
	public static Reptil crearSerpiente(String nombre, int edad,String genero) {
		Reptil r=new Reptil(nombre,edad,"jungla",genero,"blanco",1);
		serpientes++;
		return r;
	}
	public String movimiento() {
		return "reptar";
	}
	public static ArrayList<Reptil> getLista() {
		return lista;
	}
	public static void setLista(ArrayList<Reptil> lista) {
		Reptil.lista = lista;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	

}
