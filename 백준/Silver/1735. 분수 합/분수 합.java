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
				
			String[] line1=br.readLine().split(" ");
			int x1=Integer.parseInt(line1[0]);
			int y1=Integer.parseInt(line1[1]);
			
			String[] line2=br.readLine().split(" ");
			int x2=Integer.parseInt(line2[0]);
			int y2=Integer.parseInt(line2[1]);
			
			int x3=x1*y2+x2*y1;
			int y3=y1*y2;
			
			int gcd=getGCD(x3, y3);
			
			int x=x3/gcd;
			int y=y3/gcd;
			
			bw.write(x+" "+y);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static int getGCD(int a,int b) {
		int min=Math.min(a, b);
		int max=Math.max(a, b);
		int gcd=0;
		for(int i=min;i>0;i--) {
			if(min%i==0 && max%i==0) {
				gcd=i;
				break;
			}
		}
		return gcd;
	}
}
