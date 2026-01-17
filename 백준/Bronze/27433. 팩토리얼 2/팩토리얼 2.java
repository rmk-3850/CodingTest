import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			int N=Integer.parseInt(br.readLine());
			bw.write(String.valueOf(fac(N)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static long fac(int i) {
		if(i==0) return 1;
		return i*fac(i-1);
	}
}