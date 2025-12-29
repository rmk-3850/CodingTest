import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			String[] input=br.readLine().trim().split(" ");
			int a1=Integer.parseInt(input[0]);
			int a0=Integer.parseInt(input[1]);
			
			int c=Integer.parseInt(br.readLine().trim());
			int n0=Integer.parseInt(br.readLine().trim());
			
			double x=a0/(double)(c-a1);
			
			String result="";
			
			if(a1<=0) {
				if(n0>=x) result="1";
				else result="0";
			}else {
				if(a1>c) result="0";
				else {
					if(n0>=x) result="1";
					else result="0";
				}
			}
			bw.write(result);

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
