import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int lineCount=Integer.parseInt(br.readLine().trim());
			int[] unit= {25,10,5,1};
			StringBuilder sb=new StringBuilder();
			while(lineCount-->0) {
				int C= Integer.parseInt(br.readLine().trim());
				for(int i=0;i<unit.length;i++) {
					sb.append(C/unit[i]).append(" ");
					if(C>=unit[i])
						C%=unit[i];
				}
				sb.append(System.lineSeparator());
			}
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}