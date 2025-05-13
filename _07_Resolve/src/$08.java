import java.util.Scanner;

public class $08 {
    public static void main(String[] args) {
        // 정수 배열 5개를 할당하고 Arrays.sort를 사용하지 말고 최소값과 최대값을 얻으세요

        int[] arr = new int[5];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
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

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("최소값 : " + min);
        System.out.println("최대값 : " + max);
        sc.close();
    }
}
