class Solution {
	public static void main(String[] args) {
		System.out.println(solution("abcd"));
	}

	public static String solution(String s) {
		int len = s.length();
		if(len % 2 != 0) {
			return s.substring(len/2, len /2+1);
		} else {
			return s.substring(len/2-1, len/2+1);
		}
	}
}