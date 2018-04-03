package ÔËËã·û;

public class Test {
	int n;
	public Test(int n) {
		this.n = n;
		// TODO Auto-generated constructor stub
	}
	
	public void show(){
		for(int i=0; i<n; i++){
			for(int j=0; j<n-i;j++){
				System.out.print(" ");
			}
			for(int k=0; k<2*i+1; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Test t = new Test(10);
		t.show();
	}
}
