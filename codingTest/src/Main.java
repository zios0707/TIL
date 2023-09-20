public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("1BASVmka1sdkn1aSDKOIN"));
    }
}


class Solution {
    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181932 코딩테스트 연습 > 코딩 기초 트레이닝 > 코드 처리하기
    /**                                                                                                               */
    public String solution(String code) {
        String answer = "";
        Boolean mode = false;
        int i = 0;
        for (char c: code.toCharArray()) {
            if(c == '1') mode = mode.equals(false);
            else if(i % 2 == 0 && !mode) answer += c;
            else if(i % 2 == 1 && mode) answer += c;
            i++;
        }
        if(answer.isEmpty()) return "EMPTY";
        return answer;
    }
}