//19001861
//Q6
import java.util.Scanner;
import scala.io.StdIn.readInt;

object Question_06{

    def fibonacai(a:Int):Int= a match{
        case 0=>0
        case x if(x==1) => 1
        case _ => fibonacai(a-1)+fibonacai(a-2)
    }

    def fibonacaiSeq(a:Int):Unit={
        if(a>0){
            fibonacaiSeq(a-1)
            println(fibonacai(a))
        }
    }

    def main(args:Array[String]){
        var input = new Scanner(System.in);
        println("Enter the number:");
        val n = input.nextInt();
        fibonacaiSeq(n);
    }
} 