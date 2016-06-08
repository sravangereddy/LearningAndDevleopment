import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;
 
public class ProductDivisors {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numbers = Integer.parseInt(br.readLine());
		long product=1,count=0;
		long countp=0,countr=0;
		String line;		
		//long[] pd=new long[1000];
		line=br.readLine();
		for(int i=0;i<numbers;i++){
			product=product* Long.parseLong(line.split(" ")[i]);			 
		}
		
		/*for(int i=0;i<numbers;i++){
			System.out.println(pd[i]) ;
		}*/
		/*System.out.println(product) ;
		for(long i=1;i<=product;i++){
			if(product%i==0){
				System.out.print(i+" ") ;
				countp++;
			}
		}
		System.out.println("------------");*/
		/*for(long i=1;i<=product;i++){
			if(product%i==0){
				System.out.print(product+"bfore ") ;
				product=product/i;
				countr++;
				System.out.print(product+"after ") ;
				System.out.print(i+" ") ;
				System.out.println() ;
			}
		}
		System.out.println(countp+" "+countr );*/
		/*System.out.println("------------");
		System.out.println(product+" "+Math.sqrt(product));*/
		long productSqrt = (long)Math.sqrt(product);
		//System.out.println(productSqrt);
		for(long i = 2; i <= productSqrt; i++)
		{
			if(product % i == 0)
			{
				count++;
				long d = product/i;
				if(d!=i)
					count++;
			}
		}
		System.out.println((count+2)%1000000007);
		
	}
}