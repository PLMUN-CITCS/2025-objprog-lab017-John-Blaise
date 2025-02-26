import java.util.Scanner;

public class GradeCalculator
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Enter your score: ");
        int score = scanner.nextInt();

    if (score >= 90) {
        System.out.print("your grade is: ");
        System.out.print("A");
    }
    
    else if (score >= 80) {
        System.out.print("your grade is: ");
        System.out.print("B");
    }
    
    else if (score >= 70) {
        System.out.print("your grade is: ");
        System.out.print("C");
    }
    
    else if (score >= 60) {
        System.out.print("your grade is: ");
        System.out.print("D");
    }
    
    else if (score < 60) {
        System.out.print("your grade is: ");
        System.out.print("F");
    }
    
	}
}