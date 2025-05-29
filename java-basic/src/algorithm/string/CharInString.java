package algorithm.string;

import java.util.Scanner;

public class CharInString {
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for(String x : s) {     // s라는 컬렉션의 요소를 x에 하나씩 담아서 반복
            int len = x.length();
            if (len > m) {
                m = len;
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        CharInString T = new CharInString();

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        // nextLine() 다음에 오는 문장 단위로 입력받음
        // next() 다음에 오는 단어 단위로 입력받음

        System.out.println(T.solution(str));
    }
}
