package Str;

import java.util.Collections;

import javax.swing.Spring;

public class StribgBufferBuilder 
{
	
public static void main(String[] args) 
{
	
	String s = "Nishant";
	
	StringBuffer s1 = new StringBuffer(s);
	
	s1.append(" Shivaji Mane 1");
	
	System.out.println(s1);
	
	System.out.println(s1.charAt(5));
	
	System.out.println(s1.indexOf("1"));
	
	s1.deleteCharAt(21);
	
	System.out.println(s1);
	
	System.out.println(s1.indexOf("a", 13));
	
	System.out.println(s1.lastIndexOf("a"));
	
	System.out.println(s1.indexOf("S"));
	System.out.println(s1.lastIndexOf("i"));
	
	System.out.println(s1.delete(8, 16));
	
	System.out.println(s1.replace(0, 7, "Prajakta"));
	
	System.out.println(s1.substring(0, 8));
	
	//s1.reverse();
	
	System.out.println(s1);
	
	System.out.println(s1.lastIndexOf("kta"));
	
	char[] b = {'h','g'};
	
	String sw = String.valueOf(b);
	
	System.out.println(sw);
	
	

}
	

}
