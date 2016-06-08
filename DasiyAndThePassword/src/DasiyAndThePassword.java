import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class DasiyAndThePassword {
	public static void main(String args[]) throws Exception 
	   {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int noOfTestCases = Integer.parseInt(br.readLine());
		 String line;
		 MatchPassword[] mp=new MatchPassword[250];
		 for(int i=0;i<noOfTestCases;i++){
			line=br.readLine();
			//System.out.println(line.split(" ")[0]);
			mp[i]=new MatchPassword();
			mp[i].clue= line.split(" ")[0];
			mp[i].password= line.split(" ")[1];
			 
		 }
		 //MatchPassword mp = new MatchPassword();
		 /* mp.clue="Sravan";
		 mp.password="SravanSravan";
		 String str = "University";
        System.out.println(str.substring(0,5));
		*/
		//mp.tryPassword();
		 //System.out.println(mp.tryPassword());
		for(int i=0;i<noOfTestCases;i++){
			if(mp[i].tryPassword()==1)
				System.out.println("Possible");
			else
				System.out.println("Impossible");
			
			 
		 }
	   }
}
class MatchPassword{
	String clue,password;
	public int tryPassword()
	{
		if(clue.length()*2!=password.length())
			return -1; 
		else if (password.indexOf(clue)>0){
			int index=password.indexOf(clue);
			int clueLength=index+clue.length();
			int length=password.length();
			//password.substring(0,index).concat(password.substring(index,length));
			/*System.out.println(password.substring(0,index));
			System.out.println(password.substring(clueLength,length));
			System.out.println(password.substring(0,index).concat(password.substring(clueLength,length)));*/
			if(password.substring(0,index).concat(password.substring(clueLength,length)).equals(clue))
				return 1;
 
		}
		else if (password.indexOf(clue)==0){
			int clueLength=clue.length();
			int length=password.length();
			if(password.substring(clueLength,length).equals(clue))
				return 1;
			
		}
		//System.out.println(password.contains(clue));
		return -1;
		
		
		
	}
}