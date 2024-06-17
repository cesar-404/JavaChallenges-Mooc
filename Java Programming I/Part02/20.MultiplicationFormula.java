	import java.util.Scanner;
	 
	public class MultiplicationFormula {
	 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	 
	        // Write your program here
	        System.out.println("Give the first number:");
	        int numb1 = Integer.valueOf(scanner.nextLine());
	        System.out.println("Give the second number:");
	        int numb2 = Integer.valueOf(scanner.nextLine());
	        
	        System.out.println(numb1+" * "+numb2+" = "+numb1*numb2);
	    }
	}
