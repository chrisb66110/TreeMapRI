import java.util.ArrayList;

/*
Clase del nodo del arbol
 */
public class Nodo {

	String nombre; //Nombre del nodo
	ArrayList<Nodo> hijos; //Lista de hijos del nodo
	int cantHojas; //Cantidad de hojas de mis decendientes
	int cantHojasHermanos; //Cantidad de hojas de los decendientes de mi padre

	/*
	Constructor
	*/
	public Nodo(String nombre,
				ArrayList<Nodo> hijos,
				int cantHojas,
				int cantHojasHermanos){
		this.nombre = nombre;
		this.hijos = hijos;
		this.cantHojas = cantHojas;
		this.cantHojasHermanos = cantHojasHermanos;
	}

	/*
	Retorna el porcentaje de hojas que tiene los decendientes de el, respecto a las que tiene los decendientes de su padre
	*/
	public double getPorcentaje(){
		return (double)cantHojas / (double)cantHojasHermanos;
	}

}
