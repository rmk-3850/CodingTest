import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int T=Integer.parseInt(br.readLine());
			String[] input=br.readLine().split(" ");
			int[] arr=new int[input.length];
			for(int i=0;i<arr.length;i++) {
				arr[i]=Integer.parseInt(input[i]);
			}
			Arrays.sort(arr);
			int result;
			if(T%2==0) {
				result=arr[0]*arr[arr.length-1];
			}else {
				result=arr[(arr.length-1)/2]*arr[(arr.length-1)/2];
			}
			bw.write(String.valueOf(result));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}