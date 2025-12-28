import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int a=Integer.parseInt(br.readLine().trim());
			int b=Integer.parseInt(br.readLine().trim());
			int c=Integer.parseInt(br.readLine().trim());
			
			if(a+b+c!=180) bw.write("Error");
			else {
				String result= a==b && b==c ? "Equilateral" : (a==b || b==c || a==c ? "Isosceles" : "Scalene");
				bw.write(result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}