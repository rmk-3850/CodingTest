import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			StringBuilder sb=new StringBuilder();
			while(true) {
				String[] input=br.readLine().trim().split(" ");
				int a=Integer.parseInt(input[0]);
				int b=Integer.parseInt(input[1]);
				int c=Integer.parseInt(input[2]);
				
				if(a*b*c==0) break;
				
				int max=Math.max(a,Math.max(b, c));
				int elseSum= max==a ? b+c : max==b ? a+c : a+b;
				if(max>=elseSum) {
					sb.append("Invalid").append(System.lineSeparator());
				}
				else {
					String result= a==b && b==c ? "Equilateral" : a==b || b==c || a==c ? "Isosceles" : "Scalene";
					sb.append(result).append(System.lineSeparator());
				}
			}
			bw.write(sb.toString());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}