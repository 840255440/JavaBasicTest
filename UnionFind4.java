package ���鼯;

public class UnionFind4 {
	//����union������find�����ڸ߶�(������)
	   private int[] parent;
	    private int[] height;
	    int size;
	 
	    public UnionFind4(int size) {
	        this.size = size;
	        this.parent = new int[size];
	        this.height = new int[size];
	        for (int i = 0; i < size; i++) {
	            parent[i] = i;
	            height[i] = 1;
	        }
	    }
	 
	    public int find(int element) {
	        while (element != parent[element]) {
	            element = parent[element];
	        }
	        return element;
	    }
	 
	    public boolean isConnected(int firstElement, int secondElement) {
	        return find(firstElement) == find(secondElement);
	    }
	 
	    public void unionElements(int firstElement, int secondElement) {
	        int firstRoot = find(firstElement);
	        int secondRoot = find(secondElement);
	 
	        if (height[firstRoot] < height[secondRoot]) {
	            parent[firstRoot] = secondRoot;
	        } else if (height[firstRoot] > height[secondRoot]) {
	            parent[secondRoot] = firstRoot;
	        } else {
	            parent[firstRoot] = secondRoot;
	            height[secondRoot] += 1;
	        }
	    }
	 
	                /*
	              ���Ҫ�ϲ����������ϸ߶�һ������ô����ѡһ����Ϊ��
	              ������ѡ������secondRoot��Ϊ�¼��ϵĸ���
	              Ȼ��secondRoot�߶ȸ���һ�㣬����+1
	            */
	 
	    private void printArr(int[] arr){
	        for(int p : arr){
	            System.out.print(p+"\t");
	        }
	        System.out.println();
	    }
	 
	    public static void main(String[] args) {
	        int n = 10;
	        UnionFind4 union = new UnionFind4(n);
	 
	        System.out.println("��ʼparent��");
	        union.printArr(union.parent);
	        System.out.println("��ʼheight��");
	        union.printArr(union.height);
	 
	        System.out.println("������5 6 ֮���parent��");
	        union.unionElements(5, 6);
	        union.printArr(union.parent);
	        System.out.println("������5 6 ֮���height��");
	        union.printArr(union.height);
	 
	        System.out.println("������1 2 ֮���parent��");
	        union.unionElements(1, 2);
	        union.printArr(union.parent);
	        System.out.println("������1 2 ֮���height��");
	        union.printArr(union.height);
	 
	        System.out.println("������2 3 ֮���parent��");
	        union.unionElements(2, 3);
	        union.printArr(union.parent);
	        System.out.println("������2 3 ֮���height��");
	        union.printArr(union.height);
	 
	        System.out.println("������1 4 ֮���parent��");
	        union.unionElements(1, 4);
	        union.printArr(union.parent);
	        System.out.println("������1 4 ֮���height��");
	        union.printArr(union.height);
	 
	        System.out.println("������1 5 ֮���parent��");
	        union.unionElements(1, 5);
	        union.printArr(union.parent);
	        System.out.println("������1 5 ֮���height��");
	        union.printArr(union.height);
	 
	        System.out.println("1  6 �Ƿ����ӣ�" + union.isConnected(1, 6));
	 
	        System.out.println("1  8 �Ƿ����ӣ�" + union.isConnected(1, 8));
	    }
}
