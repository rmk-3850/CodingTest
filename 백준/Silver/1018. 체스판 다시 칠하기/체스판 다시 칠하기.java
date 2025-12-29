import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			boolean[][] arrA=new boolean[8][8];
			boolean[][] arrB=new boolean[8][8];
			
			for(int i=0;i<arrA.length;i++) {
				for(int j=0;j<arrA[i].length;j++) {
					if((i+j)%2==0) {
						arrA[i][j]=true;
						arrB[i][j]=false;
					}else {
						arrA[i][j]=false;
						arrB[i][j]=true;
					}
				}
			}
			
			String[] input=br.readLine().trim().split(" ");
			int N=Integer.parseInt(input[0]);
			int M=Integer.parseInt(input[1]);
			
			boolean[][] arr=new boolean[N][M];
			for(int i=0;i<arr.length;i++) {
				String line=br.readLine().trim();
				for(int j=0;j<arr[i].length;j++) {
					if(line.charAt(j)=='B')arr[i][j]=true;
					else arr[i][j]=false;					
				}
			}
			
			List<Integer> list=new ArrayList<Integer>();
			
			int k=0;
			while(k<N-7) {
				int l=0;
				
				while(l<M-7) {
					int a=0;
					int b=0;
					for(int i=k;i<k+8;i++) {
						for(int j=l;j<l+8;j++) {
							if(arrA[i-k][j-l]!=arr[i][j]) a++;
							if(arrB[i-k][j-l]!=arr[i][j]) b++;
						}
					}
					list.add(Math.min(a, b));
					l++;
				}
				k++;
			}
			
			
			list.sort(Comparator.naturalOrder());
			bw.write(String.valueOf(list.get(0)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}