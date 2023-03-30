package Java_task1;

import java.util.Scanner;

public class ReversedString {

	public static void main(String[] args) {
		String str="sundaram";
		StringBuffer sb= new StringBuffer();
		sb.append(str);
		StringBuffer sr=sb.reverse();
		System.out.println(sr);	
		String str1="abba";	
		String str11="";
		for(int i=str11.length()-1; i>=0; i--) {
			System.out.println(str11.charAt(i)); //printing reverse string
		    str11=str11+str11.charAt(i);		
		}
		System.out.println(str11);
	
	
				}
		}


