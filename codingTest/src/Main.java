public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("rermgorpsam", new int[][]{{2, 3}, {0, 7}, {5, 9}, {6, 10}}));
    }
}


class Solution {
    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181913 코딩테스트 연습 > 코딩 기초 트레이닝 > 문자열 여러 번 뒤집기
    /**                                                                                                                    */
    public String solution(String my_string, int[][] queries) {
        char[] charString = my_string.toCharArray();
        for (int[] query:queries) {
            int j = query[1];
            for (int i = query[0]; i < j; i++) {
                char tmp = charString[i];
                charString[i] = charString[j];
                charString[j--] = tmp;
            }
        }
        return String.valueOf(charString);
    }
}