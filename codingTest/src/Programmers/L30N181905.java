package Programmers;

public class L30N181905 {
    public static void main(String[] args) {
        System.out.println(solution("Progra21Sremm3", 6, 12));
    }

    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181905 코딩테스트 연습 > 코딩 기초 트레이닝 > 문자열 뒤집기
    /**                                                                                                            */

    public static String solution(String my_string, int s, int e) {
        char[] charStr = my_string.toCharArray();
        int Iter = e;
        for (int i = s; i < Iter; i++) charStr = swap(charStr ,i ,Iter--);
        return String.valueOf(charStr);
    }

    private static char[] swap (char[] str, int index1, int index2) {
        char tmp = str[index1];
        str[index1] = str[index2];
        str[index2] = tmp;
        return str;
    }
}