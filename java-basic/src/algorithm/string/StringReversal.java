package algorithm.string;

import java.util.ArrayList;
import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        StringReversal T = new StringReversal();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = in.next();
        }
        for (String x : T.solution(n, str)) {
            System.out.println(x);
        }
    }

    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        // reverse()활용 뒤집기
        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        // 직접 뒤집기
//        for (String x : str) {
//            char[] s = x.toCharArray();
//            int lt = 0, rt = x.length() - 1;
//            while (lt < rt) {
//                char tmp = s[lt];
//                s[lt] = s[rt];
//                s[rt] = tmp;
//                lt++;
//                rt--;
//            }
//        }


        return answer;
    }
}
