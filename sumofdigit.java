import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int sum = 0;
        int num = 1;
        int n = sc.nextInt();
        while(num<=n){
            sum += num;
            num ++ ;

        }
        System.out.println(sum);
    }
    
}
