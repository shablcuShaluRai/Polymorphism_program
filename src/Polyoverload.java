class Sample {
/*
 * the polymorphism exhibited at runtime is called Dynamic polymorphism.
 * 
 */
	void add(int a, int b) {
		System.out.println("addition =" + (a + b));
	}

	void add(int a, int b, int c) {
		System.out.println("addition =" + (a + b + c));
	}
/*
 * writing two or more method in same class with different parameter is called method overloading.
 * 
 *  java compiler does not know which method is called at the time of compilation ,only JVM knows at 
 *  runtime which method is to be executed.
 * 
 */
}

public class Polyoverload {

	public static void main(String[] args) {
		Sample s = new Sample();
		s.add(10, 20);
		s.add(20, 40, 10);

	}

}
