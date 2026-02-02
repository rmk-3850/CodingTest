import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int n=Integer.parseInt(br.readLine());
			int[][] tri=new int[n][];
			int i=0;
			while(n-->0) {
				String[] input=br.readLine().split(" ");
				int[] col=new int[i+1];
				for(int j=0;j<col.length;j++) {
					col[j]=Integer.parseInt(input[j]);
				}
				tri[i]=col;
				i++;
			}
			int[][] cost=new int[tri.length][];
			for(int j=0;j<cost.length;j++) {
				cost[j]=new int[j+1];
			}
			cost[0][0]=tri[0][0];
			for(int j=1;j<cost.length;j++) {
				for(int k=0;k<cost[j].length;k++) {
					if(k==0) cost[j][k]=cost[j-1][k]+tri[j][k];
					else if(k==cost[j].length-1)cost[j][k]=cost[j-1][k-1]+tri[j][k];
					else cost[j][k]=Math.max(cost[j-1][k-1], cost[j-1][k])+tri[j][k];
				}
			}
			int max=Integer.MIN_VALUE;
			for(int j=0;j<cost[cost.length-1].length;j++) {
				max=Math.max(max, cost[cost.length-1][j]);
			}
			bw.write(String.valueOf(max));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}