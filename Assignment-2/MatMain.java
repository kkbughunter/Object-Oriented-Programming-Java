import java.util.*;


class Matrix{
	Scanner sc = new Scanner(System.in);
	private int[][] matA = new int[4][4];
	private int[][] matB = new int[4][4];
	private int[][] matC = new int[4][4];
	private int n,m;

	void getmat(){
		System.out.print("Enter the number of Col : ");
		n = sc.nextInt();
		System.out.print("Enter the number of row : ");
		m = sc.nextInt();
		System.out.print("Enter the Matrix A \n");
		for(int i =0; i<n; i++){
			for(int j=0; j<m; j++){
				System.out.printf("Enter the element %d %d : ",i,j);
				matA[i][j] = sc.nextInt();
			}
		}
		System.out.print("Enter the Matrix B \n");
		for(int i =0; i<n; i++){
			for(int j=0; j<m; j++){
				System.out.printf("Enter the element %d %d : ",i,j);
				matB[i][j] = sc.nextInt();
			}
		}
	}

	void addition(){
		for(int i =0; i<n; i++){
			for(int j=0; j<m; j++){
				matC[i][j] = matA[i][j] + matB[i][j];
			}
		}
	}
	void subtraction(){
		for(int i =0; i<n; i++){
			for(int j=0; j<m; j++){
				matC[i][j] = matA[i][j] - matB[i][j];
			}
		}
	}

	void multiplication(){
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				for(int k=0; k<m; k++){
					matC[i][j] += matA[i][k] * matB[k][j];
				}
			}
		}
	}
	void matdisp(){
		for(int i =0; i<n; i++){
			for(int j=0; j<m; j++){
				System.out.print(matC[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

}

class MatMain{

	public static void main(String[] argc){
		Scanner sb = new Scanner(System.in);
		int opt=0;
		Matrix mat = new Matrix();
		System.out.print("1.Input mat\n2.Mat Additio\n3.Mat Subraction\n4.Mat Multiplication\n5.Display result\n");
		while(true){
			System.out.print("Enter your option : ");
			opt = sb.nextInt();
			switch(opt){
				case 1:
					mat.getmat();
					break;
				case 2:
					mat.addition();
					break;
				case 3:
					mat.subtraction();
					break;
				case 4:
					mat.multiplication();
					break;
				case 5:
					mat.matdisp();
					break;
				default:
					System.out.println("Enter the correct option...");
			}

		}
	}

}
