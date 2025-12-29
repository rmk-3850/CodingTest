import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int N=Integer.parseInt(br.readLine().trim());
			
			int maxCountOf5=N/5;
			
			int count=0;
			
			while(maxCountOf5>=0) {
				if((N-maxCountOf5*5)%3==0) break;
				maxCountOf5--;
			}
			
			if(maxCountOf5==-1) bw.write(String.valueOf(-1));
			else {
				int countOf3=(N-maxCountOf5*5)/3;
				bw.write(String.valueOf(maxCountOf5+countOf3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}