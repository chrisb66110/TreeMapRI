import java.awt.Color;
import java.util.ArrayList;
/*
Clase encargada de la logica de la aplicacion
 */
public class TreeMap {

	int tamano = 800; //Tamano de la ventana
	int arbolActual = 5; //Arbol a utilizar
	Interfaz interfaz; //Interfaz

	/*
	Constructor
	*/
	public TreeMap(){
		interfaz = new Interfaz(tamano);
	}

	/*
	Metodo que procesa el arbol para calcular los tamanos y posiciones
	*/
	public void procArbol(Nodo nodo, int x, int y, int largo, int ancho, boolean modificarX){
		if(nodo.hijos == null){
			interfaz.dibujarPanel(nodo.nombre, x, y, largo, ancho);
		}else{
			ArrayList<Nodo> hijosNodo = nodo.hijos;
			int nuevoX = x;
			int nuevoY = y;
			int nuevoLargo = largo;
			int nuevoAncho = ancho;
			for(int i = 0; i < hijosNodo.size(); i++){
				Nodo nodoHijo = hijosNodo.get(i);
				if(modificarX){
					nuevoLargo = (int)( ((double)largo) * nodoHijo.getPorcentaje() );
					procArbol( nodoHijo , nuevoX, nuevoY, nuevoLargo, nuevoAncho, !modificarX);
					nuevoX += nuevoLargo;
				}else{
					nuevoAncho = (int)( ((double)ancho) * nodoHijo.getPorcentaje() );
					procArbol( nodoHijo , nuevoX, nuevoY, nuevoLargo, nuevoAncho, !modificarX);
					nuevoY += nuevoAncho;
				}
			}
		}
	}

	/*
	Metodo para inciar la logica del sistema
	*/
	public void iniciar(){
		ListaNodos listaNodos = new ListaNodos(this.arbolActual);
		ArrayList<Nodo> arbol = listaNodos.getArbol();
		procArbol(arbol.get(0), 0, 0, this.tamano, this.tamano, true);
	}

	/*
	Metodo que inicia el programa
	*/
	public static void main(String[] args) {
	    TreeMap treemap = new TreeMap();
	    treemap.iniciar();
	}
}
