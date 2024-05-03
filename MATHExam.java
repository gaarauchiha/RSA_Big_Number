import java.util.Random;

public class MATHExam {

	public static void main(String[] args) {
		Random rand = new Random();

		int a = rand.nextInt(900) + 100; 
		int b = rand.nextInt(900) + 100; 
		int c = rand.nextInt(900) + 100; 

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
}

