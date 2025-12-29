import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			String[] input=br.readLine().trim().split(" ");
			int a=Integer.parseInt(input[0]);
			int b=Integer.parseInt(input[1]);
			int c=Integer.parseInt(input[2]);
			int d=Integer.parseInt(input[3]);
			int e=Integer.parseInt(input[4]);
			int f=Integer.parseInt(input[5]);
			
			int x=(c*e-b*f)/(a*e-b*d);
			int y=(c*d-a*f)/(b*d-a*e);
			
			StringBuilder sb=new StringBuilder();
			
			sb.append(x).append(" ").append(y);
			
			bw.write(sb.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}