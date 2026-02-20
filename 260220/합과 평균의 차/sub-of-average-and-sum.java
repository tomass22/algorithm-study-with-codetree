import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int totalSum = a + b + c;
        int avg = totalSum / 3;

        System.out.println(totalSum);
        System.out.println(avg);
        System.out.println(totalSum - avg);
    }
}