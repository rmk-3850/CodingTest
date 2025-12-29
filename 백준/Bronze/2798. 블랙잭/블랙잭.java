import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			String[] input1=br.readLine().trim().split(" ");
			
			int N=Integer.parseInt(input1[0]);
			int M=Integer.parseInt(input1[1]);
			
			String[] input2=br.readLine().trim().split(" ");
			
			List<Integer> list=new ArrayList<Integer>();
			
			for(int i=0;i<input2.length-2;i++) {
				int x=Integer.parseInt(input2[i]);
				for(int j=i+1;j<input2.length-1;j++) {
					int y=Integer.parseInt(input2[j]);
					for(int k=j+1;k<input2.length;k++) {
						int z=Integer.parseInt(input2[k]);
						if(x+y+z<=M) list.add(x+y+z);
					}
				}
			}
			
			list.sort(Comparator.naturalOrder());
			
			bw.write(String.valueOf(list.get(list.size()-1)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
