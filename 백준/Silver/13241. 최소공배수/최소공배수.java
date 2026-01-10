import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
				
			String[] input=br.readLine().split(" ");
			long max=Math.max(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
			long min=Math.min(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
			long LCM=0;
			for(int i=1;i<=min;i++) {
				if(min%i==0 && max*i%min==0) {
					LCM=max*i;
					break;
				}
			}
			bw.write(String.valueOf(LCM));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}