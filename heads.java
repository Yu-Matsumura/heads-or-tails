import java.util.Random;
import java.util.Scanner;
public class heads {

	public static void main(String[] args) {
		int a=0;
		System.out.println("Who are you?\n>");
 Scanner scan = new Scanner(System.in);
 String str = scan.next();
 System.out.println("Hello, "+str+"!\nTossing a coin. . .\n");
String[] Rand = {"Heads","Tails"};
Random r = new Random();
for(int i=0;i<3;i++) {
	String or = Rand[r.nextInt(2)];
	if(or=="Heads") {
		a++;
	}
	System.out.println("Round "+(i+1)+":"+or);
}
	System.out.println("Heads :"+a+", Tails :"+(3-a));
	if(a>1) {System.out.println(str+" won!");}
	else System.out.println(str+" lost!");
	}

}



