import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			StringBuilder sb=new StringBuilder();
			boolean first=true;
			init();
			while(true) {
				String[] line=br.readLine().split(" ");
				int a=Integer.parseInt(line[0]);
				int b=Integer.parseInt(line[1]);
				int c=Integer.parseInt(line[2]);
				if(a==-1 && b==-1 && c==-1) break;
				if(!first) sb.append(System.lineSeparator());
				sb.append("w(").append(a).append(", ").append(b).append(", ").append(c).append(") = ")
					.append(w(a,b,c));
				first=false;
			}
			bw.write(sb.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static int[][][] arr=new int[21][21][21];
	static void init() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				for(int k=0;k<arr.length;k++) {
					if(i<=0 || j<=0 || k<=0) arr[i][j][k]= 1;
					else if(i<j && j<k) arr[i][j][k]= arr[i][j][k-1]+arr[i][j-1][k-1]-arr[i][j-1][k];
					else arr[i][j][k]= arr[i-1][j][k]+arr[i-1][j-1][k]+arr[i-1][j][k-1]-arr[i-1][j-1][k-1];
				}
			}
		}
	}
	static int w(int a,int b,int c) {
		if(a<=0 || b<=0 || c<=0) return 1;
		else if(a>20 || b>20 || c>20) return arr[20][20][20];
		else return arr[a][b][c];
		
	}
}