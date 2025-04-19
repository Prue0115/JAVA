import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num3 = 0;
        System.out.print("숫자를 입력하시오;");
        int num = sc.nextInt();
        System.out.print("한번 더 입력해;");
        int num2 = sc.nextInt();
        System.out.print("한번 더 입력해;");
        num3 = sc.nextInt();
        System.out.println(num - num2 - num3);
    }
}