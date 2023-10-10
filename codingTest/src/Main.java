public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("ihrhbakrfpndopljhygc",4, 2));
    }
}


class Solution {
    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181904 코딩테스트 연습 > 코딩 기초 트레이닝 > 세로 읽기
    /**                                                                                                            */
    public String solution(String my_string, int m, int c) {
        String result = "";
        for (int i = c - 1; i < my_string.length(); i += m) {
            result += my_string.charAt(i);
        }
        return result;
    }
}