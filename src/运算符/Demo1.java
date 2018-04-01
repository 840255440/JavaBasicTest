package 运算符;

public class Demo1 {	
	public static void main(String[] args) {
		  /*
	    运算符
	        算术运算符
	            + - * / %
	            加号: 运算的时候 加法
	                  #字符串# 代表的连接
	        赋值运算符
	            = += -= *= /= %= ++ --
	            a +=1   <====>  a = a + 1
	            a -= 3  <====>  a = a - 3
	        比较运算符
	            < > <= >= == !=
	            注意一下 ==
	        逻辑运算符
	            ! && ||
	        位运算符
	            ~ & | << >> >>> ^
	 */
		
		/*
          数据类型
             基本数据类型
                数值型
                    整数
                        正整数 负整数 0
                        byte(1字节) short(2字节) int(4字节)(java中所有默认的整数都是int) long(8字节)
                    浮点
                    float(4字节单精度) double(8字节双精度)(java中所有的默认小数都是double)
                字符
                    char(2字节)
                布尔
                    boolean

            引用数据类型
                class  (字符串属于)
                interface
                []  数组为啥属于引用类型

     */
		
		
		// 不同类型的整数运算 最终只能往大的去转 不能往小的去转 精度的丢失
//         byte a = 10;
//         int b = 20;
//         b =  a + b;
//         System.out.println(b);//30
		
//		   byte a = 3;
//         int b = a + 3;
//         System.out.println(b);//6
		
//			byte a = 3;
//			byte b = 3;
//			b = a + b;    // 报错了  变量  可以变化的值
		
		// 小的数据类型 往大的数据类型转  是不需要担心的
        // 大的往小的转有精度的丢失的  相当于你某个部位被砍了一刀 你怕不怕
		
		
        // System.out.println(10 + 10 + "10");  // 2010
        // System.out.println(10 + "10" + 10);  // 101010
        // char a = 'a';
        // char b = 'b';
        // char c = 'c';
        // System.out.println(a + b + c);  // abc
//		
//		 char a = 97;
//         System.out.println((char)a);  // a
//         System.out.println(a);  // a
//         System.out.println((char)(a - 10));  // W char做减法的时候 不会直接打印字符 需要去转化一下
//         System.out.println(a - 10);  // 87
		
//		 int a = 2;
//         int b = 3;
//         System.out.println(2/3f); // 只要有一个是浮点 最终的结果就是浮点 还是会往大的数据类型去转
//         System.out.println(1/0); // java.lang.ArithmeticException: / by zero  除数为0
//         System.out.println(-1/0.0); // Infinity 无穷
		
//		   int a = 10;
//         a = ++a + 1; // a + 1  a+=1
//         int b = 20;
//         b = ++b;
//         System.out.println("a="+a+",b="+b);//a=12,b=21

	      /*
        位运算符
            ~ & | << >> >>> ^
			>>表示右移，如果该数为正，则高位补0，若为负数，则高位补1；
			>>>表示无符号右移，也叫逻辑右移，即若该数为正，则高位补0，而若该数为负数，则右移后高位同样补0。
            << 乘以2
            >> 除以2
     */
     System.out.println( 5 & 3);
     System.out.println( 5 | 3);
     System.out.println( 5 & 15);
     System.out.println( 4 / 2);
     System.out.println( 4 >> 1); // 快
     System.out.println( 4 >>> 1); // 快
     System.out.println( -4 >>> 1); // 快
     System.out.println( -4 >> 1); // 快
     System.out.println( 5 ^ 3 ^ 3); // 还是5本身
     int a = 10;
     int b = 20;
     System.out.println( a+"=========="+b);
     int temp = 0;
     temp = a;
     a = b;
     b = temp;
     System.out.println( a+"=========="+b);

     System.out.println( a+"=========="+b);
     a = a ^ b;
     b = a ^ b;
     a = a ^ b;
     System.out.println( a+"=========="+b);
 //    System.out.println(5.2 | 0); // 5取整
	}	
}
