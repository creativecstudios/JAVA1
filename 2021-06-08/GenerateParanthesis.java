package Jp;
import java.util.List;
import java.util.ArrayList;
public class GenerateParanthesis {

	public static List<String> generateParanthesis(int num){
		
		List<String> ans = new ArrayList();
		backtrack(ans,new StringBuilder(),0,0,num);
		return ans;
	}
	
	public static void backtrack(List<String> ans, StringBuilder cur,int open, int close, int max ) {
		if(cur.length() == max*2) {
			ans.add(cur.toString());
			return;
		}
		
		if(open < max) {
			cur.append("(");
			backtrack(ans,cur,open+1,close,max);
			cur.deleteCharAt(cur.length() -1);
		}
		
		if(close < open) {
			cur.append(")");
			backtrack(ans,cur,open,close+1,max);
			cur.deleteCharAt(cur.length()-1);
		}
	}
	public static void main(String[] args) {
	
		Float f1 = new Float("2.0");
		List<String> result = generateParanthesis(3);
		System.out.println(result);
	}
}
