
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxi = 0;
        int mini = 1000;
        int sum = 0;
        
        System.out.print("Enter 5 number: ");
        for (int i = 0; i < 5; i++) {
           
            int num = sc.nextInt();

            maxi = Math.max(num,maxi);
            mini = Math.min(num,mini);
            sum += num;


        }
        

        
        double average = sum/5;

        System.out.println("\nMax: " + maxi);
        System.out.println("\nMin: " + mini);
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);

        
        

        sc.close();
    }
}
