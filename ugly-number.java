//https://leetcode.com/problems/ugly-number/description/
public class Solution263 {
	public boolean isUgly(int number) {
		if(number<=0)
			return false;
		else if(number==1)
			return true;
		else{
			while(number!=1) {
			if(number%2==0)
				number=number/2;
			else if(number%3==0)
				number=number/3;
			else if(number%5==0)
				number=number/5;
			else
				break;				
		    }//while
		    }//else
		if(number==1)
			return true;
		else
			return false;
	}
}
