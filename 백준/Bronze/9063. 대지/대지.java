import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int n=Integer.parseInt(br.readLine().trim());
			if(n==1) bw.write(String.valueOf(0));
			else {
				int minX=Integer.MAX_VALUE;
				int maxX=Integer.MIN_VALUE;
				int minY=Integer.MAX_VALUE;
				int maxY=Integer.MIN_VALUE;
				while(n-->0) {
					String[] input=br.readLine().trim().split(" ");
					int x=Integer.parseInt(input[0]);
					int y=Integer.parseInt(input[1]);
					if(x<minX) minX=x;
					if(x>maxX) maxX=x;
					if(y<minY) minY=y;
					if(y>maxY) maxY=y;
				}
				int area=(maxX-minX)*(maxY-minY);
				bw.write(String.valueOf(area));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
