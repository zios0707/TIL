import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(10));
    }
}


class Solution {
    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181919 코딩테스트 연습 > 코딩 기초 트레이닝 > 콜라츠 수열 만들기
    /**                                                                                                                  */
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while (n != 1) {
            if(n % 2 == 0) n /= 2;
            else n = n * 3 + 1;
            list.add(n);
        }
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}