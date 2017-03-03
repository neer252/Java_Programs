import java.math.BigInteger;
import java.util.Scanner;


public class UseOfBigInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     BigInteger bi1 = new BigInteger(sc.nextLine());
	     BigInteger bi2 = new BigInteger("1");
	     BigInteger bi3=new BigInteger("0");
	     BigInteger bi5=new BigInteger("1");
	     while(true){
	    	 if(bi1.equals(bi3)){
	    		 break;
	    	 }
	    	 bi2=bi2.multiply(bi1);
	    	 bi1=bi1.subtract(bi5);
	     }
	     System.out.println(bi2);
	     
	}
}
