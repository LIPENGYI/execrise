package ��ָOffer;

public class ��֪�������η� {
	public double Power(double base, int exponent) {
		double result = 1.0;
        if(exponent>0){
            for(int i=1;i<=exponent;i++){
                result = result*base;
            }
        }else if(exponent<0){
            for(int i=1;i<=-exponent;i++){
                result = result*base;
            }
            result=1/result;
        }else{
            result=1.0;
        }
		return result;
	  }
}
