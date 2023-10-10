package Programmers;

public class L30N181911 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"progressive", "hamburger", "hammer", "ahocorasick"}, new int[][]{{0, 4}, {1, 2}, {3, 5}, {7, 7}}));
    }

    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181911 코딩테스트 연습 > 코딩 기초 트레이닝 > 부분 문자열 이어 붙여 문자열 만들기
    /**                                                                                                                                 */

    public static String solution(String[] my_strings, int[][] parts) {
        String result = "";

        for (int i = 0; i < my_strings.length; i++) {
            result += my_strings[i].substring(parts[i][0], parts[i][1] + 1);
        }

        return result;
    }
}
