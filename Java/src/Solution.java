import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
    	char[] charArr = String.valueOf(n).toCharArray();
    	Arrays.sort(charArr); // 오름차순
    	StringBuilder sb = new StringBuilder(charArr.toString()).reverse();

        return Long.parseLong(sb.toString());
    }
}