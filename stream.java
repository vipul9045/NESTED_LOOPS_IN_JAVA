import java.util.Scanner;
public class stream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to be sum of the stream of integers");
        int num = sc.nextInt();
        int sum = 0;
        while(num != -1){
            sum += num;
         num = sc.nextInt();
        }
        System.out.println(sum);

    }
    
}
