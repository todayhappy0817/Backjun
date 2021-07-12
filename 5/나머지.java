
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		int i,j,count=0;
		int[] num = new int[10];
		try {
			for(i=0;i<10;i++) //10개 집어 넣음
				num[i]=Integer.parseInt(bf.readLine())%42;
			
			for(i=0;i<10;i++) {
				count++;
				for(j=0;j<i;j++)
					if(num[i]==num[j]) {
						count--;
						break;
					}
			}
			sb.append(count);
			System.out.println(sb);
			bf.close();
		}
		catch(IOException e) {
			
		}
	}
}
