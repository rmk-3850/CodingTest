import java.io.*;
import java.util.HashSet;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			String line="";
			double totalSum=0;
			double totalCredit=0;
			while((line=br.readLine())!=null) {
				String[] inputArr=line.trim().split(" ");
				double credit=Double.parseDouble(inputArr[1]);
				String grade=inputArr[2];
				if(grade.equalsIgnoreCase("p")) continue;
				totalCredit+=credit;
				totalSum+=credit*gradeToPoint(grade);
			}
			bw.write(String.valueOf(totalSum/totalCredit));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static double gradeToPoint(String grade) {
		switch (grade) {
			case "A+":
				return 4.5;
			case "A0":
				return 4.0;
			case "B+":
				return 3.5;
			case "B0":
				return 3.0;
			case "C+":
				return 2.5;
			case "C0":
				return 2.0;
			case "D+":
				return 1.5;
			case "D0":
				return 1.0;
			default:
				return 0.0;
		}
	}
}