//19001861
//Q5
import java.util.Scanner;
import scala.io.StdIn.readInt;

object Question_05{

    def isEven(a:Int): Boolean=a match{
        	case 0 => true
		case _ => isOdd(a-1)
   	}
	
	def isOdd(a:Int): Boolean={
     		! (isEven(a)) 
   	}
	
	def add(a:Int, b:Int=0 ,res:Int=0) : Int =b match{
		case x if (x==a) => res
		case x if ((x<a) && (isOdd(b))) => add(a,b+1,res)
		case x if ((x<a) && (! isOdd(b))) => add(a,b+1,res+b)
	}

    def main(args:Array[String]){
        var input = new Scanner(System.in);
        println("Enter the no:");
        val n = input.nextInt();
        println(add(n));
    }
}