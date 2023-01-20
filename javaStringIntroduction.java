package hackerrank;

import java.util.*;

public class javaStringIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0 ? "Yes" : "No");
            
        String aux = (A.substring(0,1)).toUpperCase();
        String aux2 = A.substring(1);
        System.out.print(aux+aux2+" ");
        
        aux = (B.substring(0,1)).toUpperCase();
        aux2 = B.substring(1);
        System.out.print(aux+aux2);
        
        sc.close();
    }
}