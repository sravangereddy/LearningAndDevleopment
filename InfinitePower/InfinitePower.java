import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class InfinitePower {
	public static void main(String args[]) throws Exception 
	   {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int noOfTestCases = Integer.parseInt(br.readLine());
		 InfinitePowerNumber[] ipn=new InfinitePowerNumber[1000000];
		 for(int i=0;i<noOfTestCases;i++){
			ipn[i]=new InfinitePowerNumber();
			ipn[i].Number= Integer.parseInt(br.readLine());	 
		}
		for(int i=0;i<noOfTestCases;i++)
		{
			System.out.println(ipn[i].calcPowerNumber());
		}
	   
	}
}
class InfinitePowerNumber{
	int Number;
	String message="Unlimited Power";
	int intNumerator;
	int intDenominator;
	public String calcPowerNumber(){
		String numberString=Integer.toString(Number);
		String numerator="",denominator="";
		int numberLength = numberString.length();
		int numberATindex,i;
		boolean flagAtIndex=true;
		for(i=0;i<numberLength&&flagAtIndex;i++){
			if(Integer.parseInt(numberString.substring(i,i+1))%2==0){
				numerator=numerator+numberString.substring(i,i+1);
				denominator=numerator;
				flagAtIndex=true;
			}	
			else{
				//i++;
				//System.out.println(numerator);
				flagAtIndex=false;
				numerator=numerator+(Integer.parseInt(numberString.substring(i,i+1))+1);
				denominator=denominator+(Integer.parseInt(numberString.substring(i,i+1))-1);
				//System.out.println(i);
				
				for(++i;i<numberLength;i++){
					numerator=numerator+"0";
					denominator=denominator+"8";
				}
				/*System.out.println(Number);
				System.out.println(numerator);
				System.out.println(denominator);*/
				intNumerator=Integer.parseInt(numerator)-Number;
				//System.out.println(intNumerator);
				intDenominator=Number-Integer.parseInt(denominator);
				//System.out.println(intDenominator);
				int gcd = caluculateGCD(intNumerator,intDenominator);
				return intNumerator/gcd+"/"+intDenominator/gcd;
			}
		}
		
		return message;
	}
	public int caluculateGCD(int numerator,int denominator)
	{
		numerator = (numerator > denominator) ? numerator : denominator; 
        denominator = (numerator < denominator) ? numerator : denominator;
		int reminder=denominator;
		 while(numerator % denominator !=0)
            {
                reminder = numerator % denominator;
                numerator = denominator;
                denominator = reminder;
            }
		//System.out.println(reminder);
		return reminder;
	}
}
	