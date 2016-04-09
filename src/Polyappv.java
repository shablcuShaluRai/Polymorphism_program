class Plant {
	void grow() {
		System.out.println("plant grows");
	}
	
}

class Tree extends Plant {
	void grow() {
		System.out.println("Tree  grows");
	}
	void shadleaves(){
		System.out.println("leaves shaded");
	}
	
}

public class Polyappv {

	public static void main(String[] args) {
 Plant p1=new Plant();
 Tree t1=new Tree();
 
 
 Plant p2=t1;
 
		
		p2.grow();
		p1.grow();
   dogrow(t1);
	}
	public static void dogrow(Plant plant){
		plant.grow();
	}
}
