package gestion;
import java.util.ArrayList;

import zooAnimales.*;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales= new ArrayList<Animal>();
	
	public 	Zona() {}
	public Zona(String nombre,Zoologico zoo,ArrayList<Animal> animales){
		this.nombre=nombre;
		this.zoo=zoo;
		zoo.getZonas().add(this);
		for(Animal a:animales) {
			this.agregarAnimales(a);
		}
	}
	public Zona(String nombre,Zoologico zoo,Animal animal){
		this.nombre=nombre;
		this.zoo=zoo;
		zoo.getZonas().add(this);
		this.agregarAnimales(animal);
	}
	public Zona(String nombre,Zoologico zoo){
		this.nombre=nombre;
		this.zoo=zoo;
		zoo.getZonas().add(this);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Zoologico getZoo() {
		return zoo;
	}
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	
	public void agregarAnimales(Animal a){
		a.setZona(this);
		animales.add(a);
	}
	public int cantidadAnimales(){
		return animales.size();
	}
	
	
}
