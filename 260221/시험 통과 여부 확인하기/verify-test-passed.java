import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println( n >= 80 ? "pass" : Math.abs(n-80) + " more score");
    }
}