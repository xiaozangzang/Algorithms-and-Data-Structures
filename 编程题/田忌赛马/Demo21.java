package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 * 4
 * 9 7 5 3
 * 10 8 5 2
 * @author Joy
 *
 */
public class Demo21 {

	  public static void main(String args[]){ 
	        int n, m; 
	        List<Integer>  list1=new ArrayList<Integer>();
	        List<Integer>  list2=new ArrayList<Integer>();
	        Scanner scanner = new Scanner(System.in);
	        while(true){ 
	          n = scanner.nextInt();
	          if(n==0) 
	        	  break;
	            for(int i = 0; i < n; ++i) 
	            { 
	                list1.add(scanner.nextInt()); 
	            } 
	            for(int i = 0; i < n; ++i) 
	            { 
	                 list2.add(scanner.nextInt()); 
	            } 
	            Collections.sort(list1); 
	            Collections.sort(list2); 
	            int i=0, j=0, x=n-1, y=n-1,count=0; 
	            boolean bLast=true; 
	            while(bLast)     
	            { 
	                if(x==i) 
	                    bLast=false; 
	                if(list1.get(x) > list2.get(y)) 
	                {//如果田忌当前最好的马可以胜齐王最好的马，那么比一场 
	                    x--; 
	                    y--; 
	                    count+=100; 
	                } 
	                else if(list1.get(i)> list2.get(j)) 
	                {//如果田忌当前最差的马可以胜齐王最差的马，那么比一场 
	                    i++; 
	                    j++; 
	                    count += 100; 
	                } 
	                else 
	                {//否则，让田忌最差的马和齐王最好的好比一场 
	                    if(list1.get(i) < list2.get(y)) 
	                        count -= 100; 
	                    i++; 
	                    y--; 
	                } 
	            } 
	           System.out.println(count);
	           list1.clear();           
	           list2.clear();
	        } 
	       
	       }
	    } 
