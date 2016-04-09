class One1 {

	static void calculation(double x) {
		System.out.println("Square value " + (x * x));

	}

}

class Two2 extends One1 {
	static void calculation(double x) {
		System.out.println("square root " + Math.sqrt(x));
	}
}

public class Statpoly {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// One1 t = new One1();
		// Two2 t=new Two2();
		// if the subclass reference is used to called the calculate method,then
		// the subclass method is called.
		One1 t = new Two2();
		// super class method is called because the refrence of super class
		// used.
		// super class references to subclass object
		t.calculation(25);

	}

}
