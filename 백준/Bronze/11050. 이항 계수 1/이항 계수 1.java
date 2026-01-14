import java.io.*;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {

			String[] input=br.readLine().split(" ");
			int N=Integer.parseInt(input[0]);
			int K=Integer.parseInt(input[1]);
			int result= permutation(N, K)/factorial(K);
			bw.write(String.valueOf(result));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static int factorial(int n) {
		if(n==0)return 1;
		else {
			int result=1;
			while(n>0) {
				result*=n--;
			}
			return result;
		}
	}
	static int permutation(int n,int k) {
		int result=1;
		int bound=n-k;
		while(n>bound) {
			result*=n--;
		}
		return result;
	}
}