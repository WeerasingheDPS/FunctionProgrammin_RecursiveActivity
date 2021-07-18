//19001861
//Q1
import java.util.Scanner;
import scala.io.StdIn.readInt;

object Question_01{

    def GCD(p:Int,q:Int):Int = q match{
        case 0 => p
        case x if x>p => GCD(x,p)
        case _ => GCD(q,p%q)
    }

    def prime(p:Int, q:Int=2):Boolean = q match{
        case x if(x==p) => true
        case x if GCD(p,x)>1 =>false
        case x => prime(p,x+1)
    }
  
    def main(args:Array[String]){
        var input = new Scanner(System.in);
        println("Enter the number:");
        val n = input.nextInt();
        println(prime(n));
    }
}