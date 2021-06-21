package Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try{
			String str= bf.readLine();
			StringTokenizer stt= new StringTokenizer(str, " ");
			int A = Integer.parseInt(stt.nextToken());
			int B = Integer.parseInt(stt.nextToken());
			int C = Integer.parseInt(stt.nextToken());
			
			bw.write( (A+B)%C+"\n" );
			bw.write( ((A%C) + (B%C))%C+"\n" );
			bw.write( (A*B)%C+"\n" );
			bw.write( ((A%C) * (B%C))%C+"\n" );
			
			bw.flush();
			bw.close();
			bf.close();
			
		}
		catch(IOException e){
			
		}
	}
	
}

flush 각각 사용시 메모리는 작지만 속도가 느림
flush 한번 사용시 메모리는 크지만 속도가 
