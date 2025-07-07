import java.util.Arrays;
import java.util.Collections;

class Solution {
	public static void main(String[] args) {
		System.out.println(solution("Zbcdefg"));
	}

    public static String solution(String s) {
    	char[] charArr = String.valueOf(s).toCharArray();

    	Character[] characters = new Character[charArr.length];
        for (int i = 0; i < charArr.length; i++) {
            characters[i] = charArr[i];
        }
        
    	Arrays.sort(characters, Collections.reverseOrder()); // 내림차순
    	
    	

    	
        String answer = "";
        return answer;
    }
}