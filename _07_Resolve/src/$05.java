
import java.util.Scanner;

public class $05 {
    public static void main(String[] args) {
        // int배열을 10개 생성하세요. 사용자로부터 10개의 값을 입력받고 순서대로 출력하고  총합을 구하세요

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("정수 입력 : ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("입력한 값 : ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("총합 : " + sum);
        sc.close();
        
    }
}
