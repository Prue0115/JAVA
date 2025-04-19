import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("국어 점수를 입력하세요: ");
        int kor = sc.nextInt();

        System.out.print("영어 점수를 입력하세요: ");
        int eng = sc.nextInt();

        System.out.print("수학 점수를 입력하세요: ");
        int mat = sc.nextInt();

        System.out.print("과학 점수를 입력하세요: ");
        int sci = sc.nextInt();

        int sum = kor + eng + mat + sci;
        int intAvg = sum / 4;
        double doubleAvg = sum / 4.0;

        System.out.println("합계: " + sum);
        System.out.println("정수 평균: " + intAvg);
        System.out.println("실수 평균: " + doubleAvg);
    }
}