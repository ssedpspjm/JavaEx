public class $05Assignment {
    public static void main(String[] args) {
        int num = 1;

        // =(대입 연산자) 우측의 연산이 모두 끝나면 좌축으로 대입
        // 변수는 = 우측은 변수의 값을 의미
        // = 좌측은 변수의 저장 공간을 의미
        num = num + 1; // num을 1 증가
        System.out.println(num);
        num += 1; // num을 1 증가
        System.out.println(num);
        num++; // num을 1 증가
        System.out.println(num);
        ++num; // num을 1 증가
        System.out.println(num);
    }
}
