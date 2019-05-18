import java.util.ArrayList;
/*
Clase del nodo del arbol
 */
public class Nodo {

	String nombre;
	ArrayList<Nodo> hijos;
	int cantHojas;
	int cantHojasHermanos;

	public Nodo(String nombre,
				ArrayList<Nodo> hijos,
				int cantHojas,
				int cantHojasHermanos){
		this.nombre = nombre;
		this.hijos = hijos;
		this.cantHojas = cantHojas;
		this.cantHojasHermanos = cantHojasHermanos;
	}

	public double getPorcentaje(){
		return (double)cantHojas / (double)cantHojasHermanos;
	}

}
