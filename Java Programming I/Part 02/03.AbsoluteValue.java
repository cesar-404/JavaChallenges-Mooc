import java.util.Scanner;
	 
  public class AbsoluteValue {
	 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	      
	        int numb = Integer.parseInt(scanner.nextLine());
	        System.out.println("hello");
	        if(numb < 0) {
	            System.out.println(numb * -1);
	        } else {
	            System.out.println(numb);
	        }
	        
	    }
	}
	 
