
import java.util.Arrays;
import java.util.Scanner;


public class $07 {
    public static void main(String[] args) {
        // 정수 배열 5개를 할당하고 Arrays.sort를 활용해서 최소값과 최대값을 얻으세요

        int[] arr = new int[5];
        
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("정수 입력 : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("입력한 값 : ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("최소값 : " + arr[0]);
        System.out.println("최대값 : " + arr[arr.length - 1]);
        sc.close();        
    }
}
