import java.util.Scanner;

public class $02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] name = new String[10];

        System.out.println("10명의 이름을 입력하세요.");

        for (int i = 0; i < name.length; i++) {
            System.out.print((i + 1) + "번째 이름 : ");
            name[i] = sc.nextLine();
        }

        System.out.println("입력한 이름을 역순으로 출력합니다.");

        for (int i = name.length -1; i>= 0; i--) {
            System.out.println((i + 1) + "번째 이름 : " + name[i]);

        }
        sc.close();
    }
}
