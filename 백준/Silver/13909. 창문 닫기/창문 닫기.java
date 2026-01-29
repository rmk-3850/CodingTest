import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int N=Integer.parseInt(br.readLine());
			
			int count=0;
			for(int i=1;i*i<=N;i++) {
				count++;
			}
			
			bw.write(String.valueOf(count));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
