import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {
	static Stack<Character> S=new Stack<>();
	static String check(String str) {
		for(char c:str.toCharArray()) {
			if(c=='(' || c=='[') S.push(c);
			else if(c==')' || c==']') {
				if(S.empty()) return "no";
				else if(c==')') {
					char prev=S.peek();
					if(prev=='[') return "no";
					else S.pop();
				}else if(c==']') {
					char prev=S.peek();
					if(prev=='(') return "no";
					else S.pop();
				}
			}
		}
		if(S.empty()) return "yes";
		else return "no";
	}
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			StringBuilder sb=new StringBuilder();
			boolean first=true;
			String input="";
			while(!(input=br.readLine()).equals(".")) {
				if(!first)sb.append(System.lineSeparator());	
				sb.append(check(input));
				S.clear();
				first=false;
			}
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}