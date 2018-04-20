/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.*;
public class PP 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,f=1,j,t=0,k=0;
        char s,p;
        String c[]={"E->TA","A->+TA|#","T->FB","B->*FB|#","E->(E)|a"};
        for(i=0;i<5;i++)
            System.out.println(c[i]);
            System.out.println("\n");
            char e[]=new char[30];
            for(i=0;i<5;i++)
            {
                s=c[i].charAt(3);
                System.out.println("First("+c[i].charAt(0)+")=");
            while(f==1||t==1)
            {
            switch(s)
            {
                case 'E':
                System.out.print("FOLLOW("+s+")=($");
                e[k]='$';
                j=3;
                do{
                p=c[4].charAt(j);
                j++;
                }while(p!='E');
                k=k+1;
                e[k]=c[4].charAt(j);
                System.out.print(","+e[k]+"}\n\n");
                k++;
                t=0;f=0;
                break;
                
                case 'A':
                System.out.print("FOLLOW("+s+")=");
                s=c[0].charAt(0);
                break;
                
                case 'B':
                System.out.print("FOLLOW("+s+")=");
                s=c[2].charAt(0);
                break;
                
                case 'T':
                if(t==0)
                {
                System.out.print("FIRST("+s+")=");
                s=c[2].charAt(3);
                }
                else
                {
                    System.out.print("FOLLOW("+s+")=");
                    s=c[1].charAt(0);
                }
                break;
                
                case 'F':
                System.out.println("FIRST("+s+")=");
                e[k]=c[4].charAt(3);
                System.out.println("("+e[k]);
                j=4;
                do
                {
                p=c[4].charAt(j);
                j++;
                }while(p!='|');
                k=k+1;
                e[k]=c[4].charAt(j);
                System.out.println(","+e[k]+")");
                k=k+1;
                e[k]='/';
                System.out.println("\n");
                f=0;t=0;
                k=k+1;
                break;
                    
                case '+':
                e[k]=s;
                System.out.println("("+e[k]);
                j=4;
                do
                {
                p=c[i].charAt(j);
                j++;
                }while(p!='|');
                    k=k+1;
                    e[k]=c[i].charAt(j);
                    System.out.print(","+e[k]+")\t\t");
                    k=k+1;
                    e[k]='&';
                    s=c[i].charAt(0);
                    k=k+1;
                    t=1;
                    break;
                   
                case '*':
                e[k]=s;
                System.out.print("{"+e[k]);
                j=4;
                    do
                    {
                        p=c[i].charAt(j);
                        j++;
                    }while(p!='|');
                    k=k+1;
                    e[k]=c[i].charAt(j);
                    System.out.print(","+e[k]+"}\t\t");
                   k=k+1;
                    e[k]='&';
                    s=c[i].charAt(0);
                    k=k+1;
                    t=1;
                    break;
                   
                case '(':
                    e[k]=s;
                    System.out.println("{"+e[k]);
                    j=4;
                    do
                    {
                        p=c[i].charAt(j);
                        j++;
                    }while(p!='|');
                    k=k+1;
                    e[k]=c[i].charAt(j);
                    System.out.print(","+e[k]+"}");
                   k=k+1;
                    e[k]='/';
                    System.out.print("\n");
                    s=c[i].charAt(0);
                    f=0;
                    break;
                    }
                    }
                    f=1;
                    }
                    j=0;
                    System.out.println("\t(\t*\t+\t$\t)\ta\n");
                    for(i=0;i<5;i++)
                    {
                           s=c[i].charAt(0);
                           System.out.println(s);
                           do
                           {
                               switch(e[j])
                               {
                                   case 'a':
                                       if(i==4)
                                         System.out.println("\t\t\t\t\t"+c[4].charAt(0)+"->"+e[j]);
                                       else
                                          System.out.println("\t\t\t\t\t"+c[i]+"\n");
                                   break;
                                   case '{':
                                       k=0;
                                       if(i==4)
                                       {
                                            p=c[4].charAt(k);
                                            System.out.println("\t");
                                            while(p!='|')
                                            {
                                                System.out.println(p);
                                                k++;
                                                p=c[4].charAt(k);
                                            }
                                       }
                                       else
                                           System.out.println("\t"+c[i]);
                                    break;
                                   case '+':
                                       k=0;
                                       System.out.println("\t\t\t");
                                       p=c[i].charAt(k);
                                       while(p!='|')
                                       {
                                           System.out.println(p);
                                           k++;
                                           p=c[1].charAt(k);
                                       }
                                       break;
                                       
                                   case '&':
                                       break;
                                   
                                   case '#':
                                        break;
                                   case '*':
                                       k=0;
                                       System.out.print("\t\t");
                                       p=c[3].charAt(k);
                                       while(p!='|')
                                       {
                                           System.out.print(p);
                                           k++;
                                           p=c[3].charAt(k);
                                       }
                                       System.out.print("\t");
                                       break;
                                       
                                   case '$':
                                       System.out.print("\t"+c[i].charAt(0)+"->#");
                                       break;
                                       
                                   case ')':
                                       System.out.print("\t"+c[i].charAt(0)+"->#\n");
                                       break;
                               }
                               
                              j=j+1;
                           }while(e[j]!='/');
                    }
    }
}
                                       
                                       
                                           
       