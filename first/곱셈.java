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
			int fir= Integer.parseInt(bf.readLine()) ; //첫번째 값
			String Sec = bf.readLine();
		
			for(int i=0; i<Sec.length(); i++) {
				bw.write(fir*Integer.parseInt(Sec.substring(Sec.length()-1-i,Sec.length()-i))+"\n");
				
			}
			bw.write(fir*Integer.parseInt(Sec)+"\n");
			
			bw.flush();
			bw.close();
			bf.close();
			
		}
		catch(IOException e) {
			
		}
	}
}
