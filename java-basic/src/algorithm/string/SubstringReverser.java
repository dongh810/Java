package algorithm.string;

import java.util.Scanner;

public class SubstringReverser {
    public String solution(String str){
        String answer;
        char[] s = str.toCharArray();
        int lt=0, rt=str.length()-1;
        while(lt<rt) {
            if(!Character.isAlphabetic(s[lt])) lt ++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        String str = in.next();

        SubstringReverser T = new SubstringReverser();
        System.out.println(T.solution(str));
    }
}
