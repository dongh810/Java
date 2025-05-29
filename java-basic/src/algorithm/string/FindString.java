package algorithm.string;

import java.util.Scanner;

public class FindString {
    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        System.out.println(str);
        System.out.println(t);

        for(int i=0; i<str.length(); i++) {
            if (str.charAt(i)==t) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        FindString T = new FindString();

        Scanner in = new Scanner(System.in);
        String firstString = in.next();
        char secondChar = in.next().charAt(0);
        System.out.println(T.solution(firstString,secondChar));

    }
}
