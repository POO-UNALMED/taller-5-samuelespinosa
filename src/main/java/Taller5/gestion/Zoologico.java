package gestion;
import java.util.ArrayList;

import zooAnimales.*;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas=new ArrayList<Zona>();
	
	public Zoologico(String nombre,String ubicacion,ArrayList<Zona> zonas){
		this.nombre=nombre;
		this.ubicacion=ubicacion;
		for(Zona z:zonas) {
			z.setZoo(this);
			this.zonas.add(z);
		}
	}
	public Zoologico(String nombre,String ubicacion,Zona zona){
		this.nombre=nombre;
		this.ubicacion=ubicacion;
		zona.setZoo(this);
		this.zonas.add(zona);
	}
	public Zoologico(String nombre,String ubicacion){
		this.nombre=nombre;
		this.ubicacion=ubicacion;
	}
	
	public ArrayList<Zona> getZonas() {
		return zonas;
	}
	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public int cantidadTotalAnimales(){
		int total=0;
		for(Zona z:zonas) {
			total +=z.cantidadAnimales();
		}
		return total;
	}
	public void agregarZonas(String nombre,ArrayList<Animal> animales) {
		Zona z=new Zona(nombre,this,animales);
		zonas.add(z);
	}
	
}
