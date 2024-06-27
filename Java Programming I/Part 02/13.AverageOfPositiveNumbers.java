import java.util.Scanner;
	 
	public class AverageOfPositiveNumbers {
	 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double numbers = 0;
	        double sum = 0;
	        
	        while(true) {
	            double number = Double.parseDouble(scanner.nextLine());
	            
	            if(number != 0) {
	                if(number > 0){
	                    numbers += 1;
	                    sum += number;
	                }
	                continue;
	            }
	            break;
	        }
	        
	        double average = sum / numbers;
	        
	        if(numbers == 0) {
	            System.out.println("Cannot calculate the average");
	        } else {
	            System.out.println(average);
	        }
	    }
	}
