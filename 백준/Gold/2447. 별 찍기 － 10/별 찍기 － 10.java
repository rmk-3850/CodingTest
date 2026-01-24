import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {

			int N=Integer.parseInt(br.readLine());
			arr=new char[N][N];
			for(char[] c:arr) {
				Arrays.fill(c, '*');
			}
			markBlank(arr, 0, 0, N);
			
			StringBuilder sb=new StringBuilder();
			boolean first=true;
			for(char[] c:arr) {
				if(!first) sb.append(System.lineSeparator());
				sb.append(c);
				first=false;
			}
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static char[][] arr;
	static void markBlank(char[][] arr, int sx,int sy,int size) {
		if(size>0) {
			int unit=size/3;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(i!=1 || j!=1) {
						markBlank(arr,sx+i*unit,sy+j*unit,unit);
					}
				}
			}
			for(int i=sx+unit;i<sx+2*unit;i++) {
				for(int j=sy+unit;j<sy+2*unit;j++) {
					arr[i][j]=' ';
				}
			}
		}
	}
}