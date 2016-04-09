class Commercial {
	private String name;

	void setName(String name) {
		this.name = name;

	}

	String getName() {
		return name;
	}

	void calculation(int units) {
		System.out.println("customer name=" + getName());
		System.out.println("amount of electricity=" + (5 * units));
	}
}

class Domestic extends Commercial {

	void calculation(int units) {
		System.out.println("customer name=" + getName());
		System.out.println("amount of electricity=" + (2.5 * units));
	}

}

public class Electricbilloverrid {

	
	public static void main(String[] args) {
		
		Commercial c=new Commercial();
		c.setName("shalu ");
		c.calculation(5);
		Domestic  d= new Domestic();
		d.setName("Shalu home");
		d.calculation(5);
		
		
	}

}
