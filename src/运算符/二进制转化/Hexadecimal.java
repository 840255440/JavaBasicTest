package 运算符.二进制转化;

import java.util.Arrays;

public class Hexadecimal {
	
	int num;
	public Hexadecimal(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
	}
	
	public String toHexadecimal(){
		char[] hex = new char[8];
		for(int i=0; i<8; i++){
			int temp = num & 15;
			if(temp > 9){
				hex[i] = (char) (temp+97-10);
			}else{
				hex[i] = (char) (temp+48);
			}
			num >>= 4;	
		}
		//直接数组交换反转
		for(int i=0,j=hex.length-1; i<j;i++,j--){
			char temp = hex[i];
			hex[i] = hex[j];
			hex[j] = temp;
		}
		return Arrays.toString(hex);
	}
	
	public static void main(String[] args) {
		Hexadecimal b = new Hexadecimal(143);
		System.out.println(b.toHexadecimal());
	}
}
