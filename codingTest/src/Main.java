public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(0, "wsdawsdassw") == -1);
    }
}


class Solution {
    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181926 코딩테스트 연습 > 코딩 기초 트레이닝 > 수 조작하기 1
    /**                                                                                                                */
    public int solution(int n, String control) {
        int answer = n;
        for (char c:
             control.toCharArray()) {
            switch (c) {
                case 'w':
                    answer += 1;
                    break;
                case 'a':
                    answer -= 10;
                    break;
                case 's':
                    answer -= 1;
                    break;
                case 'd':
                    answer += 10;
                    break;
            }

        }
        return answer;
    }
}