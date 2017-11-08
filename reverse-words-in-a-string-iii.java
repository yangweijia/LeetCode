//https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
import java.util.ArrayDeque;//队列
import java.util.Stack;//栈

public class Solution557 {
	public String reverseWords(String s)
	{
		Stack<Character> words=new Stack<Character>();
		ArrayDeque<Character> sentence=new ArrayDeque<Character>();
		StringBuffer result=new StringBuffer("");
		int i=0;
		while(i<=s.length()) {
			if((i==s.length())||(s.charAt(i)==' ')) {
				if(!words.isEmpty()) {
					if(!sentence.isEmpty())
						sentence.add(' ');
					while(!words.isEmpty())
						sentence.add(words.pop());
				}//if
			}//if
			else
				words.push(s.charAt(i));
		i++;
		}//while
		while(!sentence.isEmpty())
			result.append(sentence.remove());
		return result.toString();	
	}
}
