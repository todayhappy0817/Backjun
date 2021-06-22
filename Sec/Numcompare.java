package Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String str=bf.readLine();
			String[] Num = str.split(" ");
			
			int sum = Integer.parseInt(Num[0]) - Integer.parseInt(Num[1]);
			if(sum > 0 ) {
				bw.write(">");
			}
			else if(sum == 0){
				bw.write("==");
			}
			else {
				bw.write("<");
			}
			bf.close();
			bw.close();			
		}
		catch(IOException e) {
			
		}
	}
}
