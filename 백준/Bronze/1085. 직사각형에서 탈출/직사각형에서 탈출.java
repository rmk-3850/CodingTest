import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			String[] input=br.readLine().trim().split(" ");
			int x=Integer.parseInt(input[0]);
			int y=Integer.parseInt(input[1]);
			int w=Integer.parseInt(input[2]);
			int h=Integer.parseInt(input[3]);
			
			int min1=Math.min(x, y);
			int min2=Math.min(w-x, h-y);
			int min=Math.min(min1, min2);
			bw.write(String.valueOf(min));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}