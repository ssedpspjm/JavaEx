import java.util.Arrays;
import java.util.Scanner;

public class $09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numArr = new int[5];
        for (int i = 0; i < numArr.length; i++) {
            System.out.print("정수 입력 : ");
            numArr[i] = sc.nextInt();
        }

        System.out.println("입력한 값 : " + Arrays.toString(numArr));

        for (int i = 0, j = numArr.length - 1; i < j; i++, j--) {
            int tmp = numArr[i];
            numArr[i] = numArr[j];
            numArr[j] = tmp;
        }

        System.out.println("거꾸로 출력 : " + Arrays.toString(numArr));

        sc.close();
    }
}
