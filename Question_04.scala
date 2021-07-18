//19001861
//Q4
import java.util.Scanner;
import scala.io.StdIn.readInt;

object Question_04{

	def isEven(x:Int): Boolean=x match{
        	case 0 => true
		case _ => isOdd(x-1)
   	}
	
	def isOdd(x:Int): Boolean={
     		! (isEven(x)) 
   	}


	def main(args:Array[String]){
		
		var input = new Scanner (System.in);
		print("Determine given number is odd or even\n");
		print("Enter number :");
		val n=input.nextInt();

		if(isOdd(n))
			println("Odd");
		else
			println("Even");
	}
}
