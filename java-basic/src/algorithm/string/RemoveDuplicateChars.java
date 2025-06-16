package algorithm.string;

import java.util.Scanner;

public class RemoveDuplicateChars {
    public String solution(String str) {
        String answer="";
        for (int i = 0; i < str.length(); i++) {
           // System.out.println(str.charAt(i) + " " + i + " " +str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        RemoveDuplicateChars T = new RemoveDuplicateChars();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(T.solution(str));
    }
}
