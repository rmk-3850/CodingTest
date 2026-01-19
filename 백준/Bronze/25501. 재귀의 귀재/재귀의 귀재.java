import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {

			int T=Integer.parseInt(br.readLine());
			StringBuilder sb=new StringBuilder();
			boolean first=true;
			while(T-->0) {
				if(!first) sb.append(System.lineSeparator());
				String line=br.readLine();
				sb.append(isPalindrome(line)).append(" ").append(count);
				count=0;
				first=false;
			}
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static int count=0;
	static int recursion(String s,int l,int r) {
		count++;
		if(r<=l) return 1;
		else if(s.charAt(l) != s.charAt(r)) return 0;
		else return recursion(s, l+1, r-1);
	}
	static int isPalindrome(String s) {
		return recursion(s, 0, s.length()-1);
	}
}