import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 1의 개수
        int count = (int) Integer.toBinaryString(n)
        		.chars()
        		.filter(ch -> ch == 1)
        		.count();

        return answer;
    }
}