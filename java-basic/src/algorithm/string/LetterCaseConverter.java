package algorithm.string;

import java.util.Scanner;

public class LetterCaseConverter {
    public String solution(String str) {
        String answer = "";
        for(int i=0; i<str.length(); i++) {
            if(Character.isLowerCase(str.charAt(i))){
                answer = answer + Character.toUpperCase(str.charAt(i));
            } else {
                answer = answer + Character.toLowerCase(str.charAt(i));
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        LetterCaseConverter T = new LetterCaseConverter();

        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(T.solution(str));
    }
}
