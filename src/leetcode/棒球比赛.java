package leetcode;

public class ������� {
	public int calPoints(String[] ops){
		if(ops.length == 0)
			return 0;
		int sum = 0;
		int[] nums = new int[ops.length];
		int index = 0;
		for(int i = 0;i<ops.length;i++){
			char op = ops[i].toCharArray()[0];
			switch (op) {    
            case '+':    
                //�������    
                int numP=nums[index - 1] + nums[index - 2];    
                nums[index++] = numP;    
                break;    
            case 'D':    
                int numD=nums[index-1]*2;    
                nums[index++] = numD;    
                break;    
            case 'C':    
                nums[--index] = 0;    
                break;    
            default:    
                //����    
                nums[index++] = Integer.parseInt(ops[i]);    
                break;    
			}    
		}
		for(int j = 0;j<nums.length;j++){
			sum +=nums[j];
		}
		return sum;
		
	}
}
