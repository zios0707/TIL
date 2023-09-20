public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}).equals("wsdawsdassw"));
    }
}


class Solution {
    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181925 코딩테스트 연습 > 코딩 기초 트레이닝 > 수 조작하기 2
    /**                                                                                                                */
    public String solution(int[] numLog) {
        String answer = "";
        Integer tmp = null;
        for (int i:
             numLog) {
            if(tmp != null) {
                int gap = i - tmp;
                switch (gap) {
                    case 1:
                        answer += "w";
                        break;
                    case 10:
                        answer += "d";
                        break;
                    case -1:
                        answer += "s";
                        break;
                    case -10:
                        answer += "a";
                        break;
                }
            }
            tmp = i;
            System.out.println(answer);
        }

        return answer;
    }
}