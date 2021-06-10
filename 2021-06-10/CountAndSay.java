package Jp;

public class CountAndSay {

	public static String countAndSay(int n) {
		if(n <= 0) {
			return "";
		}
		
		String result = "1";
		
		while(n >1) {
			StringBuilder curr = new StringBuilder();
			for(int temp = 0; temp < result.length(); temp++) {
				int count = 1;
				while(temp + 1 < result.length() && result.charAt(temp) == result.charAt(temp+1)) {
					temp++;
					count++;
				}
				curr.append(count).append(result.charAt(temp));
			}
			result = curr.toString();
			n--;
		}
		return result;
	}
	public static void main(String[] args) {
		String result = countAndSay(4);
		System.out.println(result);
	}
}
