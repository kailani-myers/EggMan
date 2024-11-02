package EggMan;

public class eggMan {
// This program produces a design using egg shapes.
	
	public static void main(String[] args) {
		System.out.println("Hello World! \nThis is my first Java Program!");
		topEgg();
		bottomEgg();
		bottomEgg();
		System.out.println("   +--------+");
		topEgg();
		System.out.println(" |    STOP    |");
		bottomEgg();
		topEgg();
		System.out.println("   +--------+");
		System.out.println("Go Hatters! \nProgram by: Kailani Myers");
		
	}
	//this method creates the top of the egg
	public static void topEgg() {
		System.out.println("   ----------");
		System.out.println("  /          \\");
		System.out.println(" /            \\");
	}
	//this method creates the bottom of the egg
	public static void bottomEgg() {
		System.out.println(" \\            /");
		System.out.println("  \\          /");
		System.out.println("   ----------");
	}


}
