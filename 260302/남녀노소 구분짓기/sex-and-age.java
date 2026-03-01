import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gender = sc.nextInt(); // 0:남자 1:여자
        int age = sc.nextInt();

        if (age >= 19) {
            if (gender == 0) System.out.println("MAN");
            else System.out.println("WOMAN");
        } else {
            if (gender == 0) System.out.println("BOY");
            else System.out.println("GIRL");
        }
    }
}