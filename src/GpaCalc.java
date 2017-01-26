import java.util.Scanner;

public class GpaCalc {

	public static void main(String[] args) {
		
		double numOfClasses, total = 0.0d, point;
		String grades = "";
		
		Scanner scanner = new Scanner(System.in);
	    System.out.print("How many classes do you have?\n");
	    
	    numOfClasses = scanner.nextDouble();
	    
	    for (int i = 0; i < numOfClasses; i++) {

	        System.out.print("\nWhat is your Grade?: Pick between (A , B , C , D and F ) \t" );
	        Scanner scanner2 = new Scanner(System.in);
	        grades = scanner2.nextLine();


	        if (grades.equalsIgnoreCase("A")){
	        point = 4; 
	        total += point;

	    } else if (grades.equalsIgnoreCase("B")){
	    	point = 3;
	        total += point;

	    } else if (grades.equalsIgnoreCase("C")){
	    	point = 2;
	        total += point;

	    } else if (grades.equalsIgnoreCase("D")){
	    	point = 1;
	        total += point;

	    } else if (grades.equalsIgnoreCase("F")){
	    	point = 0;
	        total += point;

	    }
		
	}
	System.out.println("\nYour GPA is: " + (total/numOfClasses));
	}
}