import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("banana"));
    }
}


class Solution {
    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181909 코딩테스트 연습 > 코딩 기초 트레이닝 > 접미사 배열
    /**                                                                                                            */
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) list.add(my_string.substring(i));

        list.sort(String::compareTo);

        String[] result = list.toArray(new String[list.size()]);

        return result;
    }
}