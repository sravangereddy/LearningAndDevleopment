import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
 
public class BooBooAndUpsolvin {
	public static void main(String args[]) throws Exception 
	   {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String line=br.readLine();
		 int noOfProblems = Integer.parseInt(line.split(" ")[0]);
		 long noOfDays = Long.parseLong(line.split(" ")[1]);
		 line=br.readLine();
		 List probelmTime = new ArrayList();
		 long output=Long.parseLong(line.split(" ")[0]);
		 for(int i=1;i<noOfProblems;i++){
			if(output<Long.parseLong(line.split(" ")[i]))
				output=Long.parseLong(line.split(" ")[i]);
		 }
		 System.out.println(output);
		  // System.out.println(probelmTime);
		/* if (probelmTime.contains(noOfDays)) {
            System.out.println(noOfDays);
        }
		else{
			for(long i=noOfDays-1;i>0;i--)
				 if (probelmTime.contains(i)) {
					System.out.println(i);
					i=0;
				}
		}*/


	}
}