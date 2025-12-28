import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			String[] input1=br.readLine().trim().split(" ");
			String[] input2=br.readLine().trim().split(" ");
			String[] input3=br.readLine().trim().split(" ");
			
			StringBuilder sb=new StringBuilder();
			
			int x1=Integer.parseInt(input1[0]);
			int y1=Integer.parseInt(input1[1]);
			
			int x2=Integer.parseInt(input2[0]);
			int y2=Integer.parseInt(input2[1]);
			
			int x3=Integer.parseInt(input3[0]);
			int y3=Integer.parseInt(input3[1]);
			
			int x4= x1==x2 ? x3 : (x1==x3 ? x2 : x1);
			int y4= y1==y2 ? y3 : (y1==y3 ? y2 : y1);
			
			sb.append(String.valueOf(x4)).append(" ").append(String.valueOf(y4));
			bw.write(sb.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}