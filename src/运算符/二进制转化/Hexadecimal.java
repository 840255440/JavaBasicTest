package 运算符.二进制转化;

import java.util.Arrays;

public class Hexadecimal {
	
	int num;
	int size;
	public Hexadecimal(int num,int size) {
		// TODO Auto-generated constructor stub
		this.num = num;
		this.size = size;
	}
	
	public String ToHex(){
		String result = null;
		switch(size){
			case 16:result = toHex16decimal(num);break;
			case 2:result = toHex2decimal(num);break;
			case 8:result = toHex8decimal(num);break;
			default:result = "输入有误";
		}
		return result;
	}
	
	
	public String toHex16decimal(int num){
		char[] hex = new char[32];
		for(int i=0; i<32; i++){
			int temp = num & 15;
			if(temp > 9){
				hex[i] = (char) (temp+97-10);
			}else{
				hex[i] = (char) (temp+48);
			}
			num >>= 4;	
		}
	
		int start = 0;
		int end = 0;
		for(int i=0; i<hex.length-1; i++){
			if(hex[i] !='0'){
				end = i;
			}
		}
		//直接数组交换反转
		for(int i=0,j=end; i<j;i++,j--){
			char temp = hex[i];
			hex[i] = hex[j];
			hex[j] = temp;
		}
		
		String result = "";
		for(int i=start; i<=end; i++){
			result +=hex[i];
		}
		return result;
	}
	
	public String toHex2decimal(int num){
		int[] hex = new int[32];
		for(int i=0; i<32; i++){
			int temp = num & 1;
			hex[i] = temp;
			num >>= 1;	
		}
		
		int start = 0;
		int end = 0;
		for(int i=0; i<hex.length-1; i++){
			if(hex[i] !=0){
				end = i;
			}
		}
		//直接数组交换反转
		for(int i=0,j=end; i<j;i++,j--){
			hex[i] = hex[i]^hex[j];
			hex[j] = hex[i]^hex[j];
			hex[i] = hex[i]^hex[j];
		}
		
		String result = "";
		for(int i=start; i<=end; i++){
			result +=hex[i];
		}
		return result;
	}	

	public String toHex8decimal(int num){
		int[] hex = new int[32];
		for(int i=0; i<32; i++){
			int temp = num & 7;
			hex[i] = temp;
			num >>= 3;	
		}

		int start = 0;
		int end = 0;
		for(int i=0; i<hex.length-1; i++){
			if(hex[i] !=0){
				end = i;
			}
		}
		//直接数组交换反转
		for(int i=0,j=end; i<j;i++,j--){
			hex[i] = hex[i]^hex[j];
			hex[j] = hex[i]^hex[j];
			hex[i] = hex[i]^hex[j];
		}

		String result = "";
		for(int i=start; i<=end; i++){
			result +=hex[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		Hexadecimal b = new Hexadecimal(2712,2);
		System.out.println(b.ToHex());
		Hexadecimal b2 = new Hexadecimal(2712,8);
		System.out.println(b2.ToHex());
		Hexadecimal b3 = new Hexadecimal(2712,16);
		System.out.println(b3.ToHex());
		Hexadecimal b4 = new Hexadecimal(2712,1);
		System.out.println(b4.ToHex());
	}
}
