import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int N=Integer.parseInt(br.readLine());
			Map<Integer, Integer> map=new HashMap<Integer, Integer>(N);
			for(int i=0;i<N;i++) {
				String[] line=br.readLine().split(" ");
				int key=Integer.parseInt(line[0]);
				int value=Integer.parseInt(line[1]);
				map.put(key, value);
			}
			List<Integer> list=new ArrayList<Integer>(map.keySet());
			list.sort(Comparator.naturalOrder());
			int[] A=new int[N];
			for(int i=0;i<N;i++) {
				A[i]=map.get(list.get(i));
			}
			int[] dp=new int[N];
			Arrays.fill(dp, 1);
			int max=1;
			for(int i=1;i<N;i++) {
				for(int j=0;j<i;j++) {
					if(A[i]>A[j]) {
						dp[i]=Math.max(dp[i], dp[j]+1);
						max=Math.max(max, dp[i]);
					}
				}
			}
			bw.write(String.valueOf(N-max));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}