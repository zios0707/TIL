public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(3, 1, "qjnwezgrpirldywt"));
    }
}


class Solution {
    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181903 코딩테스트 연습 > 코딩 기초 트레이닝 > qr code
    /**                                                                                                            */
    public String solution(int q, int r, String code) {
        String result = "";
        for (int i = r; i < code.length(); i += q) {
            result += code.charAt(i);
        }
        return result;
    }
}