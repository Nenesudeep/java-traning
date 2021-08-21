package com.company;

public class greatest {



    public static void main(String[] args){
        int a=3;
        int b=4;
        int c=1;

           if (a>b){
               if(a>c){
                   System.out.println(a);
               }
           }
           else if (b>a){
               if (b>c){
                   System.out.println(b);
               }
           }
           else {
               System.out.println(c);
           }
    }

}
