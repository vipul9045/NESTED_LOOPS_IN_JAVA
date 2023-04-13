import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the value of n for print the first n factorial numbers ");
        int n = sc.nextInt();
        // initialize the variable fact by 1 ;
        int fact = 1; 
        // logic for printing factorial ;
        for ( int i = 1 ; i <= n ; i++){
            fact = fact * i;
            System.out.println(fact);
        }
        
    }
    
}
