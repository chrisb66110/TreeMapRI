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
		System.out.println("Entro nodo: " + nodo.nombre);
		System.out.println("Entro x: " + x);
		System.out.println("Entro y: " + y);
		System.out.println("Entro largo: " + largo);
		System.out.println("Entro ancho: " + ancho);
		System.out.println("Entro modificarX: " + modificarX);
		if(nodo.hijos == null){
			interfaz.dibujarPanel(nodo.nombre, x, y, largo, ancho);
			System.out.println("Llegue a la hoja: " + nodo.nombre);
		}else{
			ArrayList<Nodo> hijosNodo = nodo.hijos;
			int nuevoX = x;
			int nuevoY = y;
			int nuevoLargo = largo;
			int nuevoAncho = ancho;
			for(int i = 0; i < hijosNodo.size(); i++){
				Nodo nodoHijo = hijosNodo.get(i);
				if(modificarX){
					System.out.println("1Envio a " + nodoHijo.nombre);
					System.out.println("1Envio porcentaje: " + nodoHijo.getPorcentaje());
					nuevoLargo = (int)( ((double)largo /*- (double)x*/) * nodoHijo.getPorcentaje() );
					procArbol( nodoHijo , nuevoX, nuevoY, nuevoLargo, nuevoAncho, !modificarX);
					nuevoX += nuevoLargo;
				}else{
					System.out.println("2Envio a " + nodoHijo.nombre);
					System.out.println("2Envio porcentaje: " + nodoHijo.getPorcentaje());
					nuevoAncho = (int)( ((double)ancho /*- (double)y*/) * nodoHijo.getPorcentaje() );
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
