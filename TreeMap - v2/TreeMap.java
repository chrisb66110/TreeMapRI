import java.awt.Color;
import java.util.ArrayList;
/*
La clase CuatroEnRaya es la encargada de iniciar la aplicacion
 */
public class TreeMap {

	int tamano = 800;
	int arbolActual = 2;
	Interfaz interfaz;

	public TreeMap(){
		interfaz = new Interfaz(tamano);
	}

	public void procArbol(Nodo nodo, int x, int y, int largo, int ancho, boolean modificarX){
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
					nuevoLargo = (int)( ((double)largo /*- (double)x*/) * nodoHijo.getPorcentaje() );
					procArbol( nodoHijo , nuevoX, nuevoY, nuevoLargo, nuevoAncho, !modificarX);
					nuevoX += nuevoLargo;
				}else{
					nuevoAncho = (int)( ((double)ancho /*- (double)y*/) * nodoHijo.getPorcentaje() );
					procArbol( nodoHijo , nuevoX, nuevoY, nuevoLargo, nuevoAncho, !modificarX);
					nuevoY += nuevoAncho;
				}
			}
		}
	}

	public void iniciar(){
		ListaNodos listaNodos = new ListaNodos(this.arbolActual);
		ArrayList<Nodo> arbol = listaNodos.getArbol();
		procArbol(arbol.get(0), 0, 0, this.tamano, this.tamano, true);
	}

	public static void main(String[] args) {
	    TreeMap treemap = new TreeMap();
	    treemap.iniciar();
	}
}
