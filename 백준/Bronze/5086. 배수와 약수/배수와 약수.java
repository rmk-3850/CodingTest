import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			StringBuilder sb= new StringBuilder();
			while(true) {
				String line=br.readLine().trim();
				if(line.equals("0 0")) break;
				String[] lineArr=line.split(" ");
				int a=Integer.parseInt(lineArr[0]);
				int b=Integer.parseInt(lineArr[1]);
				
				if(a%b==0) {
					sb.append("multiple").append(System.lineSeparator());
				}else if(a<b) {
					if(b%a==0) sb.append("factor").append(System.lineSeparator());
					else sb.append("neither").append(System.lineSeparator());
				}else {
					sb.append("neither").append(System.lineSeparator());
				}
				
			}
			bw.write(String.valueOf(sb.toString()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
