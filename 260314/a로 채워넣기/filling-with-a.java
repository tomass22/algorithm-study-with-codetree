import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        
        // StringBuilder의 방법도 존재하나 필자는 char 배열로 변환하는 방식 채택
        char[] charArr = str.toCharArray();
        charArr[1] = 'a';
        charArr[charArr.length - 2] = 'a';

        System.out.println(String.valueOf(charArr));
    }
}