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
			int x= Integer.parseInt(bf.readLine());
			int y= Integer.parseInt(bf.readLine());
			
			if(x>0 && y>0) {
				bw.write(1+"\n");
			}
			else if(x>0 && y<0){
				bw.write(4+"\n");
			}
			else if(x<0 && y>0){
				bw.write(2+"\n");
			}
			else {
				bw.write(3+"\n");
			}
			bw.flush();
			bw.close();
			bf.close();
			
		}
		catch(IOException e) {
			
		}
	}
}
