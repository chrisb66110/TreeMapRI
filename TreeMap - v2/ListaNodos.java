import java.util.ArrayList;
/*
Arbol
 */
public class ListaNodos {

	ArrayList<Nodo> arbol;

	public ListaNodos(int arbol){
		switch(arbol){
			case 1:
				crearArbol1();
				break;
			case 2:
				crearArbol2();
				break;
			case 3:
				crearArbol3();
				break;
			case 4:
				crearArbol4();
				break;
			case 5:
				crearArbol5();
				break;
			default:
				this.arbol = null;
		}
	}

	public ArrayList<Nodo> getArbol(){
		return this.arbol;
	}

	public void crearArbol1(){
		Nodo nodoG = new Nodo("G", null, 1, 2);
		
		Nodo nodoF = new Nodo("F", null, 1, 2);
		
		ArrayList<Nodo> hijosE = new ArrayList<Nodo>();
		hijosE.add(nodoG);
		hijosE.add(nodoF);
		Nodo nodoE = new Nodo("E", hijosE, 2, 3);

		Nodo nodoD = new Nodo("D", null, 1, 3);

		ArrayList<Nodo> hijosB = new ArrayList<Nodo>();
		hijosB.add(nodoD);
		hijosB.add(nodoE);
		Nodo nodoB = new Nodo("B", hijosB, 3, 4);
		
		Nodo nodoC = new Nodo("C", null, 1, 4);
		
		ArrayList<Nodo> hijosA = new ArrayList<Nodo>();
		hijosA.add(nodoB);
		hijosA.add(nodoC);
		Nodo nodoA = new Nodo("A", hijosA, 4, 4);

		this.arbol = new ArrayList<Nodo>();
		this.arbol.add(nodoA);
		this.arbol.add(nodoB);
		this.arbol.add(nodoC);
		this.arbol.add(nodoD);
		this.arbol.add(nodoE);
		this.arbol.add(nodoF);
		this.arbol.add(nodoG);
	}

	public void crearArbol2(){
		Nodo nodoY = new Nodo("Y", null, 1, 2);
		
		Nodo nodoZ = new Nodo("Z", null, 1, 2);

		ArrayList<Nodo> hijosX = new ArrayList<Nodo>();
		hijosX.add(nodoY);
		hijosX.add(nodoZ);
		Nodo nodoX = new Nodo("X", hijosX, 2, 3);
		
		Nodo nodoW = new Nodo("W", null, 1, 3);
		
		ArrayList<Nodo> hijosS = new ArrayList<Nodo>();
		hijosS.add(nodoW);
		hijosS.add(nodoX);
		Nodo nodoS = new Nodo("S", hijosS, 3, 4);
		
		Nodo nodoR = new Nodo("R", null, 1, 4);
		
		ArrayList<Nodo> hijosM = new ArrayList<Nodo>();
		hijosM.add(nodoR);
		hijosM.add(nodoS);
		Nodo nodoM = new Nodo("M", hijosM, 4, 6);
		
		Nodo nodoP = new Nodo("P", null, 1, 2);
		
		Nodo nodoQ = new Nodo("Q", null, 1, 2);
		
		ArrayList<Nodo> hijosL = new ArrayList<Nodo>();
		hijosL.add(nodoP);
		hijosL.add(nodoQ);
		Nodo nodoL = new Nodo("L", hijosL, 2, 6);

		ArrayList<Nodo> hijosG = new ArrayList<Nodo>();
		hijosG.add(nodoL);
		hijosG.add(nodoM);
		Nodo nodoG = new Nodo("G", hijosG, 6, 7);
		
		Nodo nodoF = new Nodo("F", null, 1, 7);
		
		ArrayList<Nodo> hijosC = new ArrayList<Nodo>();
		hijosC.add(nodoF);
		hijosC.add(nodoG);
		Nodo nodoC = new Nodo("C", hijosC, 7, 13);

		Nodo nodoT = new Nodo("T", null, 1, 2);
		
		Nodo nodoU = new Nodo("U", null, 1, 2);
		
		ArrayList<Nodo> hijosN = new ArrayList<Nodo>();
		hijosN.add(nodoT);
		hijosN.add(nodoU);
		Nodo nodoN = new Nodo("N", hijosN, 2, 3);
		
		Nodo nodoO = new Nodo("O", null, 1, 3);
		
		ArrayList<Nodo> hijosI = new ArrayList<Nodo>();
		hijosI.add(nodoN);
		hijosI.add(nodoO);
		Nodo nodoI = new Nodo("I", hijosI, 3, 4);

		Nodo nodoH = new Nodo("H", null, 1, 4);
		
		ArrayList<Nodo> hijosD = new ArrayList<Nodo>();
		hijosD.add(nodoH);
		hijosD.add(nodoI);
		Nodo nodoD = new Nodo("D", hijosD, 4, 6);
		
		Nodo nodoJ = new Nodo("J", null, 1, 2);
		
		Nodo nodoK = new Nodo("K", null, 1, 2);
		
		ArrayList<Nodo> hijosE = new ArrayList<Nodo>();
		hijosE.add(nodoJ);
		hijosE.add(nodoK);
		Nodo nodoE = new Nodo("E", hijosE, 2, 6);
		
		ArrayList<Nodo> hijosB = new ArrayList<Nodo>();
		hijosB.add(nodoD);
		hijosB.add(nodoE);
		Nodo nodoB = new Nodo("B", hijosB, 6, 13);
		
		ArrayList<Nodo> hijosA = new ArrayList<Nodo>();
		hijosA.add(nodoB);
		hijosA.add(nodoC);
		Nodo nodoA = new Nodo("A", hijosA, 13, 13);
		


		this.arbol = new ArrayList<Nodo>();
		this.arbol.add(nodoA);
		this.arbol.add(nodoB);
		this.arbol.add(nodoC);
		this.arbol.add(nodoD);
		this.arbol.add(nodoE);
		this.arbol.add(nodoF);
		this.arbol.add(nodoG);
		this.arbol.add(nodoH);
		this.arbol.add(nodoI);
		this.arbol.add(nodoJ);
		this.arbol.add(nodoK);
		this.arbol.add(nodoL);
		this.arbol.add(nodoM);
		this.arbol.add(nodoN);
		this.arbol.add(nodoO);
		this.arbol.add(nodoP);
		this.arbol.add(nodoQ);
		this.arbol.add(nodoR);
		this.arbol.add(nodoS);
		this.arbol.add(nodoT);
		this.arbol.add(nodoU);
		this.arbol.add(nodoW);
		this.arbol.add(nodoX);
		this.arbol.add(nodoY);
		this.arbol.add(nodoZ);
	}

	public void crearArbol3(){
		Nodo nodoG = new Nodo("G", null, 1, 2);
		
		Nodo nodoF = new Nodo("F", null, 1, 2);
		
		ArrayList<Nodo> hijosC = new ArrayList<Nodo>();
		hijosC.add(nodoF);
		hijosC.add(nodoG);
		Nodo nodoC = new Nodo("C", hijosC, 2, 6);

		
		
		Nodo nodoI = new Nodo("I", null, 1, 2);

		Nodo nodoH = new Nodo("H", null, 1, 2);
		
		ArrayList<Nodo> hijosD = new ArrayList<Nodo>();
		hijosD.add(nodoH);
		hijosD.add(nodoI);
		Nodo nodoD = new Nodo("D", hijosD, 2, 4);
		
		Nodo nodoJ = new Nodo("J", null, 1, 2);
		
		Nodo nodoK = new Nodo("K", null, 1, 2);
		
		ArrayList<Nodo> hijosE = new ArrayList<Nodo>();
		hijosE.add(nodoJ);
		hijosE.add(nodoK);
		Nodo nodoE = new Nodo("E", hijosE, 2, 4);
		
		ArrayList<Nodo> hijosB = new ArrayList<Nodo>();
		hijosB.add(nodoD);
		hijosB.add(nodoE);
		Nodo nodoB = new Nodo("B", hijosB, 4, 6);
		
		ArrayList<Nodo> hijosA = new ArrayList<Nodo>();
		hijosA.add(nodoB);
		hijosA.add(nodoC);
		Nodo nodoA = new Nodo("A", hijosA, 6, 6);
		


		this.arbol = new ArrayList<Nodo>();
		this.arbol.add(nodoA);
		this.arbol.add(nodoB);
		this.arbol.add(nodoC);
		this.arbol.add(nodoD);
		this.arbol.add(nodoE);
		this.arbol.add(nodoF);
		this.arbol.add(nodoG);
		this.arbol.add(nodoH);
		this.arbol.add(nodoI);
		this.arbol.add(nodoJ);
		this.arbol.add(nodoK);
	}

	public void crearArbol4(){
		Nodo nodoG = new Nodo("G", null, 1, 2);
		
		Nodo nodoF = new Nodo("F", null, 1, 2);
		
		ArrayList<Nodo> hijosE = new ArrayList<Nodo>();
		hijosE.add(nodoF);
		hijosE.add(nodoG);
		Nodo nodoE = new Nodo("E", hijosE, 2, 3);

		Nodo nodoD = new Nodo("D", null, 1, 3);

		ArrayList<Nodo> hijosC = new ArrayList<Nodo>();
		hijosC.add(nodoD);
		hijosC.add(nodoE);
		Nodo nodoC = new Nodo("C", hijosC, 3, 4);
		
		Nodo nodoB = new Nodo("B", null, 1, 4);
		
		ArrayList<Nodo> hijosA = new ArrayList<Nodo>();
		hijosA.add(nodoB);
		hijosA.add(nodoC);
		Nodo nodoA = new Nodo("A", hijosA, 4, 4);

		this.arbol = new ArrayList<Nodo>();
		this.arbol.add(nodoA);
		this.arbol.add(nodoB);
		this.arbol.add(nodoC);
		this.arbol.add(nodoD);
		this.arbol.add(nodoE);
		this.arbol.add(nodoF);
		this.arbol.add(nodoG);
	}

	public void crearArbol5(){
		Nodo nodoD = new Nodo("D", null, 1, 7);

		Nodo nodoH = new Nodo("H", null, 1, 2);

		Nodo nodoI = new Nodo("I", null, 1, 2);
		
		ArrayList<Nodo> hijosC = new ArrayList<Nodo>();
		hijosC.add(nodoH);
		hijosC.add(nodoI);
		Nodo nodoC = new Nodo("C", hijosC, 2, 7);

		Nodo nodoJ = new Nodo("J", null, 1, 2);
		Nodo nodoK = new Nodo("K", null, 1, 2);

		ArrayList<Nodo> hijosF = new ArrayList<Nodo>();
		hijosF.add(nodoJ);
		hijosF.add(nodoK);
		Nodo nodoF = new Nodo("F", hijosF, 2, 4);
		
		Nodo nodoE = new Nodo("E", null, 1, 4);

		Nodo nodoG = new Nodo("G", null, 1, 4);
		
		ArrayList<Nodo> hijosB = new ArrayList<Nodo>();
		hijosB.add(nodoE);
		hijosB.add(nodoF);
		hijosB.add(nodoG);
		Nodo nodoB = new Nodo("B", hijosB, 4, 7);
		
		ArrayList<Nodo> hijosA = new ArrayList<Nodo>();
		hijosA.add(nodoB);
		hijosA.add(nodoC);
		hijosA.add(nodoD);
		Nodo nodoA = new Nodo("A", hijosA, 7, 7);

		this.arbol = new ArrayList<Nodo>();
		this.arbol.add(nodoA);
		this.arbol.add(nodoB);
		this.arbol.add(nodoC);
		this.arbol.add(nodoD);
		this.arbol.add(nodoE);
		this.arbol.add(nodoF);
		this.arbol.add(nodoG);
		this.arbol.add(nodoH);
		this.arbol.add(nodoI);
		this.arbol.add(nodoJ);
		this.arbol.add(nodoK);
	}

}
