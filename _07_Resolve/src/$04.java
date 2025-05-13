import java.util.Scanner;

public class $04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int[] mult = new int[10];

        System.out.println("3의 배수를 차례대로 입력하세요.");

        for (int i = 0; i < mult.length; i++) {
            System.out.print((i+1) + "번째 배수 >> ");
            mult[i] = sc.nextInt();
            if (mult[i] % 3 != 0) {
                System.out.println("3의 배수가 아닙니다.");
                i--;
            }
        }

        for (int i = mult.length - 1; i >= 0; i--) {
            System.out.println((i + 1) + "번째 배수는 " + mult[i] + "입니다.");
            }
            sc.close();
        }
    }
