import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {

			String line="";
			StringBuilder sb=new StringBuilder();
			boolean first=true;
			while((line=br.readLine())!=null) {
				if(!first) sb.append(System.lineSeparator());
				int N=Integer.parseInt(line);
				int maxIndex=(int)(Math.pow(3, N))-1;
				char[] arr=new char[maxIndex+1];
				Arrays.fill(arr, '-');
				cantor(arr, 0, maxIndex);
				sb.append(String.valueOf(arr));
				first=false;
			}
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static void cantor(char[] arr,int s,int e) {
		if(s<e) {
			int unit=(e-s+1)/3;
			int point=s+unit;
			cantor(arr, s, point-1);
			Arrays.fill(arr, point, point+unit, ' ');
			cantor(arr, point+unit, e);
		}
	}
}
