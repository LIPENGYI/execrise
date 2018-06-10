package leetcode;

public class jump_game_ii {
	public static int jump(int[] A){
		int lastFarst = 0;
		int curFarest = 0;
		int jump = 0;
		for(int i=0;i<A.length;i++){
			if(i>lastFarst){
				jump++;
				lastFarst = curFarest;
			}
			curFarest = A[i]+i>curFarest?A[i]+i:curFarest;
		}
		if(lastFarst>=A.length-1){
			return jump;
		}
		return -1;		
	}
}
