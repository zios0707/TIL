import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("Progra21Sremm3", 6, 12));
    }
}


class Solution {
    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181905 코딩테스트 연습 > 코딩 기초 트레이닝 > 문자열 뒤집기
    /**                                                                                                            */
    public String solution(String my_string, int s, int e) {
        char[] charStr = my_string.toCharArray();
        int Iter = e;
        for (int i = s; i < Iter; i++) charStr = swap(charStr ,i ,Iter--);
        return String.valueOf(charStr);
    }

    private char[] swap (char[] str, int index1, int index2) {
        char tmp = str[index1];
        str[index1] = str[index2];
        str[index2] = tmp;
        return str;
    }
}