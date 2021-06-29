import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw =new BufferedWriter( new OutputStreamWriter(System.out));
		try {
			int num=Integer.parseInt(bf.readLine());
			for(int i=1; i<=num; i++) {
				bw.write(i+"\n");
			}
			bw.flush();
			bw.close();
			bf.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
