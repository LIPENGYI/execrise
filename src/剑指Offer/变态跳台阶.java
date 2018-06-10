package ½£Ö¸Offer;

public class ±äÌ¬ÌøÌ¨½× {
      public int JumpFloorII(int target) {
		  if(target<=0){
			  return 0;
		  }else if(target==1){
			  return 1;
		  }else if(target ==2){
			  return 2;
		  }else{
			  return JumpFloorII(target-1)*2;
		  }  	
    }
}
