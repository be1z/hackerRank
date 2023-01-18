package hackerrank;

import java.util.*;

public class javaStaticInitializerBlock {

static int H = 0, B = 0;
static boolean flag = false;

static {
Scanner scan = new Scanner(System.in);

B = scan.nextInt();
scan.nextLine();
H = scan.nextInt();
scan.close();

if(B>0 && H>0)
    flag = true;
    else
    System.out.println("java.lang.Exception: Breadth and height must be positive");
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class