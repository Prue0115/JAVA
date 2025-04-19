import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("음료 종류를 선택하세요");
        System.out.println("1. 아메리카노 3000원");
        System.out.println("2. 카페라떼 4000원");
        System.out.println("3. 카푸치노 4500원");

        int choice = sc.nextInt();
        int price = 0;
        if (choice == 1) price = 3000;
        else if (choice == 2) price = 4000;
        else if (choice == 3) price = 4500;
        else {
            System.out.println("지원하지 않는 메뉴입니다.");
            return;
        }

        System.out.println("음료 크기를 선택하세요");
        System.out.println("1. small");
        System.out.println("2. medium (+500)");
        System.out.println("3. large (+1000)");

        int choice2 = sc.nextInt();
        int size = 0;
        if (choice2 == 1) size = 0;
        else if (choice2 == 2) size = 500;
        else if (choice2 == 3) size = 1000;
        else {
            System.out.println("지원하지 않는 메뉴입니다.");
            return;
        }

        System.out.println("음료 옵션을 선택하세요");
        System.out.println("1. 기본");
        System.out.println("2. 샷추가 (+500)");
        System.out.println("3. 시럽추가 (+300)");

        int choice3 = sc.nextInt();
        int option = 0;
        if (choice3 == 1) option = 0;
        else if (choice3 == 2) option = 500;
        else if (choice3 == 3) option = 300;
        else {
            System.out.println("지원하지 않는 메뉴입니다.");
            return;
        }

        int finalPrice = price + size + option;
        System.out.println("총 금액은 " + finalPrice + "원 입니다.");
    }
}