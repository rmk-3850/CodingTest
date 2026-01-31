import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int N=Integer.parseInt(br.readLine());
			long start=0;
			S=new int[N][N];
			startTeam=new int[N/2];
			linkTeam=new int[N/2];
			for(int i=0;i<N;i++) {
				String[] line=br.readLine().split(" ");
				for(int j=0;j<line.length;j++) {
					S[i][j]=Integer.parseInt(line[j]);
				}
			}
			startTeam[0]=0;
			dfs(1,1);
			bw.write(String.valueOf(MIN));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static int[][] S;
	static int[] startTeam;
	static int[] linkTeam;
	static int MIN=Integer.MAX_VALUE;
	static void dfs(int depth,int startIdx) {
		if(depth==startTeam.length) {
			int startTeamAbility=0;
			int linkTeamAbility=0;
			int idx=0;
			Loop:for(int i=0;i<S.length;i++) {
				for(int j=0;j<startTeam.length;j++) {
					if(i==startTeam[j])continue Loop;
				}
				linkTeam[idx++]=i;
			}
			for(int i=0;i<startTeam.length;i++) {
				for(int j=0;j<startTeam.length;j++) {
					startTeamAbility+=S[startTeam[i]][startTeam[j]];
				}
			}
			for(int i=0;i<linkTeam.length;i++) {
				for(int j=0;j<linkTeam.length;j++) {
					linkTeamAbility+=S[linkTeam[i]][linkTeam[j]];
				}
			}
			int diff=Math.abs(linkTeamAbility-startTeamAbility);
			MIN=Math.min(MIN, diff);
			return;
		}
		for(int i=startIdx;i<S.length;i++) {
			startTeam[depth]=i;
			dfs(depth+1,i+1);
		}
	}
}