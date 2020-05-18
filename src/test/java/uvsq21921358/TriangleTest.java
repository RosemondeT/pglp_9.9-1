package uvsq21921358;

import static org.junit.Assert.*;

import org.junit.Test;

import FORME_GRAPHIQUE.Affichage;
import FORME_GRAPHIQUE.Triangle;

public class TriangleTest {

	/**
	 * Methode de test de deplacement du Triangle
	 */
	@Test()
	public void moveTriangleTest() {
		Affichage A =new Affichage();
		Triangle T =new Triangle ("TT",1,2,3,4,5,6);
		A.afficher(T.toString());
		T.move(2, 3);
		A.afficher(T.toString());
	}
	
	@Test()
	public void vu() { 
		Triangle Tvu =new Triangle ("TT",1,2,3,4,5,6);
		Tvu.print();
	}

}
