package Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			String[] Aram=br.readLine().split(" ");
			
			int h = Integer.parseInt(Aram[0]);
			int m = Integer.parseInt(Aram[1])-45;
			
			if(m<0 && h==0) {
				h=23;
				m +=60;
				bw.write(h+" "+m);
				
			}
			else if(m<0 && h!=0) {
				h--;
				m +=60;
				bw.write(h+" "+m);
			}
			else {
				bw.write(h+" "+m);
			}
			bw.flush();
			bw.close();
			br.close();
		}
		catch(IOException e) {
			
		}
	}
}
