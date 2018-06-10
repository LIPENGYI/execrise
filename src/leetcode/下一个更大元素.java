package leetcode;
import java.util.Dictionary;
import java.util.HashMap;
public class 下一个更大元素 {
	public int[] NextGreaterElement(int[] findNums, int[] nums) {
        int[] resultArr = new int[findNums.length];
        HashMap<Integer, Integer> indexDict = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length;i++ )
        {
            indexDict.put(nums[i], i);
        }
        for (int i = 0; i < findNums.length; i++)
        {
           // int index = indexDict[findNums[i]];
            int index = indexDict.get(nums[i]);
            int num = -1;
            for (; index < nums.length; index++)
            {
                if (nums[index] > findNums[i])
                {
                    num = nums[index];
                    break;
                }
            }
            resultArr[i] = num;
        }
        return resultArr;
    }
}
