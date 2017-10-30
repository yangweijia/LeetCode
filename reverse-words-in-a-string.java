import java.util.Stack;

//https://leetcode.com/problems/reverse-words-in-a-string/description/
public class Solution {
	public String reverseWords(String s) {	
		Stack<Character> a=new Stack<Character>();
		Stack<Character> b=new Stack<Character>();
		StringBuffer result =new StringBuffer("");
		int i=0;
		while(i<=s.length()) {
			if(i==s.length()||s.charAt(i)==' ') {
				if(!a.empty()) {
					if(!b.empty()) {
						b.push(' ');
					}
					while(!a.empty()) {
						b.push(a.pop());
					}
				}//if
				}//if
			else
				a.push(s.charAt(i));
			i++;
			}//while		
			
		while(!b.empty())
			result.append(b.pop());
		return result.toString();
	}
}//class
