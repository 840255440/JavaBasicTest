package �����;

public class Demo1 {	
	public static void main(String[] args) {
		  /*
	    �����
	        ���������
	            + - * / %
	            �Ӻ�: �����ʱ�� �ӷ�
	                  #�ַ���# ���������
	        ��ֵ�����
	            = += -= *= /= %= ++ --
	            a +=1   <====>  a = a + 1
	            a -= 3  <====>  a = a - 3
	        �Ƚ������
	            < > <= >= == !=
	            ע��һ�� ==
	        �߼������
	            ! && ||
	        λ�����
	            ~ & | << >> >>> ^
	 */
		
		/*
          ��������
             ������������
                ��ֵ��
                    ����
                        ������ ������ 0
                        byte(1�ֽ�) short(2�ֽ�) int(4�ֽ�)(java������Ĭ�ϵ���������int) long(8�ֽ�)
                    ����
                    float(4�ֽڵ�����) double(8�ֽ�˫����)(java�����е�Ĭ��С������double)
                �ַ�
                    char(2�ֽ�)
                ����
                    boolean

            ������������
                class  (�ַ�������)
                interface
                []  ����Ϊɶ������������

     */
		
		
		// ��ͬ���͵��������� ����ֻ�������ȥת ������С��ȥת ���ȵĶ�ʧ
//         byte a = 10;
//         int b = 20;
//         b =  a + b;
//         System.out.println(b);//30
		
//		   byte a = 3;
//         int b = a + 3;
//         System.out.println(b);//6
		
//			byte a = 3;
//			byte b = 3;
//			b = a + b;    // ������  ����  ���Ա仯��ֵ
		
		// С���������� �������������ת  �ǲ���Ҫ���ĵ�
        // �����С��ת�о��ȵĶ�ʧ��  �൱����ĳ����λ������һ�� ���²���
		
		
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
//         System.out.println((char)(a - 10));  // W char��������ʱ�� ����ֱ�Ӵ�ӡ�ַ� ��Ҫȥת��һ��
//         System.out.println(a - 10);  // 87
		
//		 int a = 2;
//         int b = 3;
//         System.out.println(2/3f); // ֻҪ��һ���Ǹ��� ���յĽ�����Ǹ��� ���ǻ��������������ȥת
//         System.out.println(1/0); // java.lang.ArithmeticException: / by zero  ����Ϊ0
//         System.out.println(-1/0.0); // Infinity ����
		
//		   int a = 10;
//         a = ++a + 1; // a + 1  a+=1
//         int b = 20;
//         b = ++b;
//         System.out.println("a="+a+",b="+b);//a=12,b=21

	      /*
        λ�����
            ~ & | << >> >>> ^
			>>��ʾ���ƣ��������Ϊ�������λ��0����Ϊ���������λ��1��
			>>>��ʾ�޷������ƣ�Ҳ���߼����ƣ���������Ϊ�������λ��0����������Ϊ�����������ƺ��λͬ����0��
            << ����2
            >> ����2
     */
     System.out.println( 5 & 3);
     System.out.println( 5 | 3);
     System.out.println( 5 & 15);
     System.out.println( 4 / 2);
     System.out.println( 4 >> 1); // ��
     System.out.println( 4 >>> 1); // ��
     System.out.println( -4 >>> 1); // ��
     System.out.println( -4 >> 1); // ��
     System.out.println( 5 ^ 3 ^ 3); // ����5����
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
 //    System.out.println(5.2 | 0); // 5ȡ��
	}	
}
