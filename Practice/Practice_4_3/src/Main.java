public class Main {
    public static void main(String[] args) {
        // 주어진 값들
        double doubleValue = 2.71828;

        // double에서 다른 타입으로의 형변환 결과 출력
        System.out.println("\n=== double 형변환 ===");
        System.out.println("1. double -> byte: " + (byte)doubleValue);
        System.out.println("2. double -> short: " + (short)doubleValue);
        System.out.println("3. double -> int: " + (int)doubleValue);
        System.out.println("4. double -> long: " + (long)doubleValue);
        System.out.println("5. double -> float: " + (float)doubleValue);
    }
}

// byte, short, int, long 정수형
// float 실수형



















// byte(1바이트), short(2바이트), int(4바이트), long(8바이트), - 부호 있는 정수
// float(4바이트) - 부동 소수 점형
// byte 범위 - 128에서 127
// short 범위 - 32768에서32767
// int 범위 - 2147483648에서 2147483647 (20억 정도)
// long  범위 - 9223372036854775808에서 9223372036854775807
// float 범위 - 약 ± 3.40282347 * 10