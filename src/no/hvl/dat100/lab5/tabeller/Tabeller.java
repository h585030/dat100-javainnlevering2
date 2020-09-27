package no.hvl.dat100.lab5.tabeller;

import static java.lang.Integer.*;
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO
		for (int i=0; i<tabell.length; i++) {
			String helTall = showInputDialog(
					"Velg tall nr." + i + ": ");
			tabell[i] = parseInt (helTall);
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		String innholdet = " ";
		for (int i=0; i<tabell.length; i++)
			innholdet += i + "   ";
		return innholdet;
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
