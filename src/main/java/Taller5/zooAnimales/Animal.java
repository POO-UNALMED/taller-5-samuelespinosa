package zooAnimales;
import gestion.*;
public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	public Animal(){totalAnimales++;}
	public Animal(String nombre, int edad, String habitat, String genero, Zona zona) {
		this(nombre,edad,habitat,genero);
		zona.agregarAnimales(this);
	}
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
	}
	
	
	public static int getTotalAnimales() {
		return totalAnimales;
	}


	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getHabitat() {
		return habitat;
	}


	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public Zona getZona() {
		return zona;
	}


	public void setZona(Zona zona) {
		this.zona = zona;
	}
	public static void main(String[] args) {
		System.out.print(Animal.totalPorTipo());
	}


	public static String totalPorTipo() {
		String retorno="Mamiferos: "+Mamifero.cantidadMamiferos()+"\n";
		retorno+="Aves: "+Ave.cantidadAves()+"\n";
		retorno+="Reptiles :"+Reptil.cantidadReptiles()+"\n";
		retorno+="Peces: "+Pez.cantidadPeces()+"\n";
		retorno+="Anfibios :"+Anfibio.cantidadAnfibios();
		return retorno;
	}
	
	public String toString() {
		String retorno="Mi nombre es "+ nombre+", ";
		retorno+="tengo una edad de "+edad+", ";
		retorno+="habito en "+habitat+" y mi genero es "+genero;
		if(zona!=null) {
			retorno+=", la zona en la que me ubico es "+zona.getNombre()+", ";
			retorno+="en el zoo"+zona.getZoo().getNombre();
		}
		return retorno;
	}
	
	public String movimiento() {
		return "desplazarse";
	}
}
