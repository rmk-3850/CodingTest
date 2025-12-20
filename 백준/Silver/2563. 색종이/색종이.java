import java.io.*;
import java.util.HashSet;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int lineCount=Integer.parseInt(br.readLine().trim());
			int[][] arr=new int[lineCount][2];
			int minRow=Integer.MAX_VALUE;
			int maxRow=Integer.MIN_VALUE;
			int minCol=Integer.MAX_VALUE;
			int maxCol=Integer.MIN_VALUE;
			for(int i=0;i<lineCount;i++) {
				String[] input=br.readLine().trim().split(" ");
				int x=Integer.parseInt(input[0]);
				int y=Integer.parseInt(input[1]);
				arr[i][0]=x;
				arr[i][1]=y;
				minRow=Math.min(minRow, x);
				minCol=Math.min(minCol, y);
				maxRow=Math.max(maxRow, x+10);
				maxCol=Math.max(maxCol, y+10);
				
				
			}
			int area=0;
			boolean isChecked=true;
			for(int i=minRow;i<=maxRow;i++) {
				for(int j=minCol;j<=maxCol;j++) {
					for(int k=0;k<arr.length;k++) {
						if(arr[k][0]<=i && i<arr[k][0]+10 && arr[k][1]<j && j<=arr[k][1]+10 && isChecked) {
							area++;
							isChecked=false;
						}
					}
					isChecked=true;
					
				}
			}
			bw.write(String.valueOf(area));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}