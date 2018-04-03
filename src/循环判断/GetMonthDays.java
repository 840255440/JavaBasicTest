package 循环判断;

import java.util.Scanner;

public class GetMonthDays {
	static int[] month1 = {31,28,31,30,31,30,31,31,30,31,30,31};
	static int[] month2 = {31,29,31,30,31,30,31,31,30,31,30,31};
	
	private int year;
	private int month;
	
	public GetMonthDays(int year, int month) {
		super();
		this.year = year;
		this.month = month-1;
	}
	
	public int GetDay(){
		int days = 0;
		boolean yearDay = false;
		if(this.year%400==0||(this.year%4==0&&!(this.year%100==0))){
			yearDay = true;
		}
		switch (this.month) {
		case 0:
			days = month1[0];
			break;
		case 1:
			if(yearDay == true)
				days = month2[1];
			else
				days = month1[1];
			break;
		case 2:
			days = month1[2];
			break;
		case 3:
			days = month1[3];
			break;
		case 4:
			days = month1[4];
			break;
		case 5:
			days = month1[5];
			break;
		case 6:
			days = month1[6];
			break;
		case 7:
			days = month1[7];
			break;
		case 8:
			days = month1[8];
			break;
		case 9:
			days = month1[9];
			break;
		case 10:
			days = month1[10];
			break;
		case 11:
			days = month1[11];
			break;
		default:
			System.out.println("输入错误");
			break;
		}
		return days;
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = sc.nextInt();
		System.out.println("请输入月份：");
		int month = sc.nextInt();
		
		GetMonthDays get = new GetMonthDays(year, month);
		System.out.println(get.GetDay());
	}
	
}
