public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(10, 20));
    }
}


class Solution {
    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181921 코딩테스트 연습 > 코딩 기초 트레이닝 > 배열 만들기
    /**                                                                                                            */
    public int[] solution(int l, int r) {
        int[] arr = new int[100];
        int Iter = 0;
        boolean a = true;
        for (int i = l; i <= r; i++) {
            String str = String.valueOf(i);
            int count = 0;
            for (char c: str.toCharArray()
                 ) {
                if(!(c == '5' || c == '0')) {
                    count = 1;
                }
            }
            if(count == 0) {
                arr[Iter++] = Integer.valueOf(str);
            }
        }

        if(Iter == 0) {
            Iter = 1;
            a = false;
        }
        int[] result = new int[Iter];

        if(a) {
            for(int i = 0; i < Iter; i++) {
                result[i] = arr[i];
            }
        }else {
            result[0] = -1;
        }

        return result;
    }
}