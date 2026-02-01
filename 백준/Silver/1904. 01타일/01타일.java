import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int N=Integer.parseInt(br.readLine());
			binarySeq=new int[N+1];
			init();
			bw.write(String.valueOf(binarySeq[N]));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static int[] binarySeq;
	static void init() {
		binarySeq[1]=1;
		if(binarySeq.length>2) {
			binarySeq[2]=2;
		}
		for(int i=3;i<binarySeq.length;i++) {
			binarySeq[i]=(binarySeq[i-1]+binarySeq[i-2])%15746;
		}
	}
}