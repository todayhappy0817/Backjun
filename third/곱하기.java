
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
			int N= Integer.parseInt(br.readLine());
			for(int i=1; i<10; i++) {
				bw.write(N+" * "+i+" = "+N*i+"\n");
				bw.flush();	
			}
			bw.close();
			br.close();
		}
		catch(IOException e) {
			
		}
	}
}
