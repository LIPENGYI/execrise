package leetcode;

class ������ {
	public boolean isPowerOfTwo(int n){
		if(n == 1){
			return true;
		}
		if(n>=2 && n%2 == 0){
			return isPowerOfTwo(n/2);
		}
		return false;
	}
}
class ������1{
	public boolean isPowerOfTwo(int n){
		if(n<=0)
			return false;
		return countBit(n) == 1;
	}

	public int countBit(int num) {
		// TODO Auto-generated method stub
		int count = 0;
		while(num!=0){
			count+=(num&1);
			num>>=1;
		}
		return count;
	}
}
class ������2{
	public boolean isPowerOfTwo1(int n){
		if(n<=0)
			return false;
		return (n&(n-1)) == 0;	
	}
}
