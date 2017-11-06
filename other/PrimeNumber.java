//质数的判断（2、3、5……）
public class PrimeNumber {
	public boolean isPrimeNumber(Integer number) {
		if(number<=3)
			return number>1;
		else {
			for(int i=2;i<Math.sqrt(number);i++) {
				if(number%i==0)
					return false;
			}//for
			return true;
		}//else	
	}
}
