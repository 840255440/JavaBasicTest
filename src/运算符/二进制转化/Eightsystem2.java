package �����.������ת��;

import java.util.Arrays;

public class Eightsystem2 {
	
	int num;
	public Eightsystem2(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
	}
	
	public String toBinarysystem(){
		int[] hex = new int[8];
		for(int i=0; i<8; i++){
			int temp = num & 7;
			hex[i] = temp;
			num >>= 3;	
		}
		//ֱ�����齻����ת
		for(int i=0,j=hex.length-1; i<j;i++,j--){
			hex[i] = hex[i]^hex[j];
			hex[j] = hex[i]^hex[j];
			hex[i] = hex[i]^hex[j];
		}
		return Arrays.toString(hex);
	}
	
	public static void main(String[] args) {
		Eightsystem2 b = new Eightsystem2(70);
		System.out.println(b.toBinarysystem());
	}
}
