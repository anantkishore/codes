package com.kishore.anant.codility;

import java.util.TreeSet;

public class TestClass {
    public static void main(String args[]) {
      /*  Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n>100000) {
            System.out.println("-1");
            return;
        }
*/
//System.out.println(fun());

        TreeSet<StringBuffer> t = new TreeSet<StringBuffer>();
        t.add(new StringBuffer("H"));
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("C"));
        t.add(new StringBuffer("K"));

        System.out.println(t);

        double a = 295.04;
        int b = 300;
        byte c = (byte) a;
        byte d = (byte) b;


        //System.out.println(c+" "+d);

    /*  byte a[] ={65,66,67,68,69,70};
      byte b[]={71,72,73,74,75,76};

      System.arraycopy(a,2,b,1,a.length-3);
      System.out.println(new String(a)+ new String(b));*/
    }

    static int fun() {
        return 20;
    }
}
