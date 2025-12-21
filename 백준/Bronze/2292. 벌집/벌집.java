import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			long roomNumber=Integer.parseInt(br.readLine().trim());
			
			int roomsToPass=1;
			
			long number=1;
			
			while(roomNumber>number) {
				number+=6*roomsToPass;
				roomsToPass++;
			}
			bw.write(String.valueOf(roomsToPass));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
