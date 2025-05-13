import java.util.Arrays;

public class $10 {
    public static void main(String[] args) {
        // 정수 배열 5개를 할당하고Arrays.sort를 사용하지 말고
        // 배열을 오름차순으로 정렬하도록 저장하세요.
        // 그리고 출력하세요.

        int[] arr = new int[5];
        int tmp = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("정렬 전 : " + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("정렬 후 : " + Arrays.toString(arr));
    }
}
