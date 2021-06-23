package Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
				
				
		try {
			shortint year= Integer.parseInt(bf.readLine());
			
			if((year%4)==0 && ( (year/4)%100 !=25 && (year/4)%100 !=50 && (year/4)%100 !=75 )) {
				bw.write(1+"\n");
			}
			else {
				bw.write(0+"\n");
			}
			bw.flush();
			bw.close();
			bf.close();
			
		}
		catch(IOException e) {
			
		}
		
	}
}
