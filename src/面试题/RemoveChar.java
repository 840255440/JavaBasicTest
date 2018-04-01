package ÃæÊÔÌâ;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//É¾³ı×Ö·û´®ÖĞÖØ¸´×Ö·û 
public class RemoveChar {
	String s;
	public RemoveChar(String s) {
		this.s = s;
		// TODO Auto-generated constructor stub
	}
	
	public String RemoveChar(){
		char[] s1 = s.toCharArray();
		System.out.println(s1);
		for(int i=0; i<s.length();i++){
			for(int j=i+1; j<s.length(); j++){
				if(s1[j] == '0'){
					continue;
				}
				if(s1[i] == s1[j]){
					s1[j] = '0';
				}
			}
		}
		
		
		String s= "";
		for (int i = 0, n = 0; i < s1.length; i++)
	    {
	        if (s1[i] != '0'){
	            s+=s1[i];
	        }
	    }
		System.out.println(s);
		return s;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		RemoveChar re = new RemoveChar(line);
		System.out.println(re.RemoveChar());
	}
}
