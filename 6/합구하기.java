package Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main{
    long sum(int[] a) {
    	int i;
        long ans = 0;
        for(i=0;i<a.length;i++) {
			ans+=a[i];
		}
        return ans;
    }
	public static void main(String[] args) {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb= new StringBuilder();
    	
    	int[] num;
    	int i;
    	try {
    		String[] str=bf.readLine().split(" ");
    		num=new int[str.length];
    		for(i=0;i<str.length;i++) {
    			num[i]=Integer.parseInt(str[i]);
    		}
    		Main t1=new Main();
    		
    		sb.append(t1.sum(num));
    		System.out.println(sb);
    	}
    	catch(IOException e) {
    		
    	}

    }
    
}


