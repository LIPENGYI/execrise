import java.util.Scanner;
public class Test11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner readLine = new Scanner(System.in);
		int row = readLine.nextInt();
		int cor = readLine.nextInt();
		int [][] numbers = new int[row][cor]; 
		for(int i=0;i<row;i++){
			for(int j=0;j<cor;j++)
			{
				while(readLine.hasNextInt())
				numbers[i][j] = readLine.nextInt();
			}
		}
		int[] bagua = new int[8];
		int k =0;
		int max =0;
		int min =0;
		//分别找出八个单阵，并计算其值（找出最大值最小值）
		for(int i=1;i<20;i++){
			for(int j=1;j<20;j++){
				
				bagua[k]  = numbers[i][j];
				if(numbers[i-1][j]==0&&numbers[i+1][j]==0&&numbers[i][j-1]==0&&numbers[i][j+1]==0
						&&numbers[i+1][j+1]==0&&numbers[i+1][j-1]==0&&numbers[i-1][j+1]==0&&numbers[i+1][j-1]==0){
					k++;
				}
				if(bagua[k]>max){
					max = bagua[k];
				}else if(bagua[k]<min){
					min = bagua[k];
				}
			}
			if (k==7){
				break;
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
