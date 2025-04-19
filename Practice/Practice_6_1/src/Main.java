import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tired;
        System.out.println("당신의 피곤함을 적으시오.");
        tired = sc.nextInt();
        if(tired < 80) {
            System.out.println("학교를 간다.");
        }else{
            System.out.println("자체 휴강을 한다.");
        }
    }
}