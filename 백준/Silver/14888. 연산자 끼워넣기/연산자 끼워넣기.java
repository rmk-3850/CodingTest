import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int N=Integer.parseInt(br.readLine());
			A=new int[N];
			String[] line1=br.readLine().split(" ");
			for(int i=0;i<A.length;i++) {
				A[i]=Integer.parseInt(line1[i]);
			}
			opList=new String[N-1];
			visited=new boolean[N-1];
			String[] line2=br.readLine().split(" ");
			int idx=0;
			for(int i=0;i<line2.length;i++) {
				int x=Integer.parseInt(line2[i]);
				if(x>0) {
					for(int j=0;j<x;j++) {
						opList[idx++]=opAllList[i];
					}
				}
			}
			dfs(0,A[0]);
			resultList.sort(Comparator.reverseOrder());
			StringBuilder sb=new StringBuilder();
			sb.append(resultList.get(0)).append(System.lineSeparator()).append(resultList.get(resultList.size()-1));
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static int[] A;
	static String[] opAllList= {"+","-","*","/"};
	static String[] opList;
	static boolean[] visited;
	static ArrayList<Integer> resultList=new ArrayList<Integer>();
	static void dfs(int depth,int result) {
		if(depth==opList.length) {
			resultList.add(result);
			return;
		}
		int prevResult=result;
		int a=A[depth+1];
		
		for(int i=0;i<opList.length;i++) {
			if(!visited[i]) {
				visited[i]=true;
				switch (opList[i]) {
					case "+": 
						result+=a;
						break;
					case "-": 
						result-=a;
						break;
					case "*": 
						result*=a;
						break;
					case "/": 
						result/=a;
						break;
					default : break;
				}
				dfs(depth+1,result);
				visited[i]=false;
				result=prevResult;
			}
		}
	}
	
}