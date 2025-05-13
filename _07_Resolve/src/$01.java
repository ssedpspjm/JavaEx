
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

// String 배열을 10명의 이름으로 초기화하고 순서대로 출력하세요
public class $01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        String[] name = new String[10];

        System.out.println("10명의 이름을 입력하세요.");

        for (int i = 0; i < name.length; i++) {
            System.out.print((i + 1) + "번째 이름 : ");
            name[i] = sc.nextLine();
        }

        System.out.println("입력한 이름은 다음과 같습니다.");

        for (int i = 0; i < name.length; i++) {
            System.out.println((i + 1) + "번째 이름 : " + name[i]);
        }
        sc.close();
    }
}
