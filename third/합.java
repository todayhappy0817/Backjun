import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum=0;
		try {
			int count=Integer.parseInt(br.readLine());
			for(int i=1; i<=count; i++) {
				sum+=i;
			}
			bw.write(sum+"\n");
			bw.close();
			br.close();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
