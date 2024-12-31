package arrayJava;

public class MultidimensionalArrayBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int arr[] = new int[5];
		int a[][] = new int[2][3];
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 7;
		
		int i, j, k=0, l=0; // i-->Row, j-->Column
		for(i=0; i<=1; i++) {
			for(j=0;j<=2;j++) {
				System.out.println(a[i][j]);
			}
		}
		// another way for defining array
		int b[] = {7, 5, 15};
		int smallestNum = b[0];
		for(i=1; i<=b.length-1; i++) {
			if(b[i]<smallestNum) {
				smallestNum = b[i];
			}
		}
		System.out.println(smallestNum);
		
		System.out.println("******************************************");
		int c[][] = {{23, 0, 14}, {110, 100, 10}, {1, 50, 60}};
		int smallestNumInC = c[0][0];
		for(i=0; i<=2; i++) {
			for(j=0; j<=2; j++) {
				if(c[i][j] < smallestNumInC) {
					smallestNumInC = c[i][j];
					k=j;
					l=i;
				}
			}
		}
		System.out.println(smallestNumInC);
		System.out.println("******************************************");
		System.out.println("Minimum number found in column number: " + k);
		int maxInColumn = c[0][k];
		for(i=0;i<=2;i++) {
			if(c[i][k] > maxInColumn) {
				maxInColumn = c[i][k];
			}
		}
		System.out.println(maxInColumn);
		System.out.println("******************************************");
		System.out.println("Minimum number found in row number: " + l);
		int maxInRow = c[l][0];
		for(j=0; j<=2; j++) {
			if(c[l][j] > maxInRow) {
				maxInRow = c[l][j];
			}
		}
		System.out.println(maxInRow);
	}

}
