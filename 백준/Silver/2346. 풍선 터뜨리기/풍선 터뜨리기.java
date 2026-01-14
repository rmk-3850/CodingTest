import java.io.*;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			LinkedList<Integer> dq=new LinkedList<Integer>();
			int N=Integer.parseInt(br.readLine());
			String[] input=br.readLine().split(" ");
			int[] arr= new int[N];
			for(int i=0;i<input.length;i++) {
				arr[i]=Integer.parseInt(input[i]);
				dq.add(i+1);
			}
			StringBuilder sb=new StringBuilder();
			boolean first=true;
			int idx=0;
			int num=0;
			while(true) {
				int count=0;
				if(!first) sb.append(" ");
				sb.append(dq.get(idx));
				num++;
				if(num==N) break;
				dq.set(idx, 0);
				int x=arr[idx];
				if(x>0) {
					while(true) {
						if(dq.get(idx)!=0) count++;
						if(count==x) break;
						idx=idx+1>=N ? (idx+1)%N : idx+1;
					}
				}else {
					while(true) {
						if(dq.get(idx)!=0) count++;
						if(count==-x) break;
						idx=idx-1<0 ? idx-1+N : idx-1;
					}
				}
				first=false;
			}
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
