public class Hello {
    public static void main(String[] args) {

        for(int i=1; i<10; i++) { // 각 단의 반복. 1단에서 9단
            for(int j=1; j<10; J++) { // 각 단의 곱셈
                System.out.print(i + "x" + j + "=" + i*j); //구구셈 출력
                System.out.print('\t'); // 하나씩 탭으로 띄기
            }
            System.out.println();// 한 단어 끝나면 다음 줄로 커서 이동
        }
    }
}
