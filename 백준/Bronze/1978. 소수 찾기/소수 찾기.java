import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int number=Integer.parseInt(br.readLine().trim());
			String[] input=br.readLine().trim().split(" ");
			int count=0;
			
			Loop : while(number-->0) {
				int x=Integer.parseInt(input[number]);
				if(x%2==0 && x>2 || x==1) continue;
				for(int i=3;i<=x/2;i++) {
					if(x%i==0) continue Loop;
				}
				count++;
			}
			bw.write(String.valueOf(count));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
