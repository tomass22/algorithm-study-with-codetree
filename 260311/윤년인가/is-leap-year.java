import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // "4년마다 오지만, 너무 자주 오면 오차가 생기니 100년 단위로 한 번씩 건너뛰고, 다시 400년 단위로는 포함시킨다"

        int y = sc.nextInt();

        if (y % 4 != 0 || (y % 100 == 0 && y % 400 != 0)) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}