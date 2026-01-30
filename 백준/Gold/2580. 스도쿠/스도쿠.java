import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			for(int i=0;i<9;i++) {
				String[] line=br.readLine().split(" ");
				for(int j=0;j<9;j++) {
					int x=Integer.parseInt(line[j]);
					board[i][j]=x;
					if(x==0) {
						place.add(new int[] {i,j});
					}
				}
			}
			dfs(0);
			
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static StringBuilder sb=new StringBuilder();
	static void record() {
		for(int i=0;i<9;i++) {
			if(i>0)sb.append(System.lineSeparator());
			for(int j=0;j<9;j++) {
				if(j>0)sb.append(' ');
				sb.append(board[i][j]);
			}
		}
	}
	static int[][] board=new int[9][9];
	static ArrayList<int[]> place=new ArrayList<>();
	static boolean check(int x,int y,int one) {
		for(int i=0;i<9;i++) {
			if(i!=y && one==board[x][i]) return false;
		}
		for(int i=0;i<9;i++) {
			if(i!=x && one==board[i][y]) return false;
		}
		for(int i=x/3*3;i<x/3*3+3;i++) {
			for(int j=y/3*3;j<y/3*3+3;j++) {
				if(!(i==x && j==y) && one==board[i][j]) return false;
			}
		}
		return true;
	}
	static boolean dfs(int depth) {
		if(depth==place.size()) {
			record();
			return true;
		}
		int x=place.get(depth)[0];
		int y=place.get(depth)[1];
		for(int i=1;i<10;i++) {
			if(check(x, y, i)) {
				board[x][y]=i;
				if(dfs(depth+1)) return true;
				board[x][y]=0;
			}
		}
		return false;
	}
}