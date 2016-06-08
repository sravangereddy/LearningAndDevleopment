import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FirstJavaProgramsMainMethod {
	 public static void main(String args[]) throws Exception 
	   {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int noOfTimes = Integer.parseInt(br.readLine());
         FirstJavaPgm fjp =  new FirstJavaPgm();
		 for(int i=0;i<noOfTimes;i++)
			 fjp.FirstMethod();
	   }
}

class FirstJavaPgm {

	public void FirstMethod(){
		System.out.println("This is my First Java Program");
	}
	
}

