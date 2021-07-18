
//19001861
//Q3
import java.util.Scanner;
import scala.io.StdIn.readInt;

object Question_03{


	def addNumber(p:Int,q:Int=0): Int=p match{
		case 0 =>q
		case x if x>0 => addNumber((p-1),(p+q))
   	}

	
	def main(args:Array[String]){
		
		var input = new Scanner (System.in);
		print("Get addition of numbers from 1 to n\n");
		print("Enter number :");
		val n=input.nextInt();

		println(addNumber(n));	
	}
}

