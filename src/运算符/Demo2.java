package 运算符;

public class Demo2 {
	public static void main(String[] args) {
//		>>表示右移，如果该数为正，则高位补0，若为负数，则高位补1；
//		>>>表示无符号右移，也叫逻辑右移，即若该数为正，则高位补0，而若该数为负数，则右移后高位同样补0。
		 System.out.println( Integer.toBinaryString(4 >>> 1)); // 快
		  System.out.println( Integer.toBinaryString(4)); // 快
		  System.out.println( Integer.toBinaryString(-4)); // 快
	     System.out.println( Integer.toBinaryString(-4 >>> 1)); // 快
		
	}
}
