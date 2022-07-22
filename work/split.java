package work;

import java.util.Scanner;
//import java.util.*;

public class split {
    public static void main(String[] args){
    Scanner ip_in= new Scanner(System.in);
    System.out.println("输入需要分割的字符");

    String ip=ip_in.next();
    System.out.println(ip);

    String[] ip_div=ip.split("\\.");
    for (String a : ip_div) {
        System.out.print("[" + a + "]");
    }
    }
}
