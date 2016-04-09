//Dynamic polymorphism

class One {
	void calculate(double x) {
		System.out.println("Square value =" + (x * x));
	}
}

class Two extends One {
	void calculate(double x) {
		System.out.println("Sqaure root =" + Math.sqrt(x));

		/*
		 * writing two or more methods in super and sub classes such that the
		 * methods have same name with same signature is called method
		 * overriding.
		 */
	}
}

public class Polyoverride {

	public static void main(String[] args) {

		// Two t = new Two();
		One t = new Two();

		t.calculate(25);

	}

}
