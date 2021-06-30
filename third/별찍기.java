import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		try {
			int count=Integer.parseInt(br.readLine());
			for(int i=1; i<=count; i++) {
				for(int j=0; j<i; j++) {
					sb.append("*");
				}
				sb.append("\n");
			}
			System.out.println(sb);
			br.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
