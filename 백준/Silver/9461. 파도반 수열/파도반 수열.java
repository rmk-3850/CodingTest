import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int N=Integer.parseInt(br.readLine());
			StringBuilder sb=new StringBuilder();
			boolean first=true;
			while(N-->0) {
				if(!first) sb.append(System.lineSeparator());
				int x=Integer.parseInt(br.readLine());
				P=new long[x+1];
				init();
				sb.append(P[x]);
				first=false;
			}
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static long[] P;
	static void init() {
		for(int i=1;i<P.length;i++) {
			if(i==1 || i==2 || i==3) P[i]=1;
			else if(i==4 || i==5) P[i]=2;
			else P[i]=P[i-1]+P[i-5];
			
		}
	}
}