package Programmers;

public class L30N181915 {
    public static void main(String[] args) {
        System.out.println(solution("cvsgiorszzzmrpaqpe", new int[]{16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7}));
    }

    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181915 코딩테스트 연습 > 코딩 기초 트레이닝 > 글자 이어 붙여 문자열 만들기
    /**                                                                                                                             */

    public static String solution(String my_string, int[] index_list) {
        String result = "";
        for (int i: index_list
        ) {
            result += my_string.charAt(i);
        }
        System.out.println(result);
        return result;
    }
}