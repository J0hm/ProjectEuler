import java.util.Scanner;

public class Main {
	
	// greedy method, doesnt work
	public static int greedyMaxTriangle(int[] triangle, int totalRows) {
		int index = 0;
		int row = 1; 
		int sum = triangle[0];
		
		while(row != totalRows) {
			if(triangle[index+row] > triangle[index+row+1]) {
				System.out.println("R: " + row + " I: " + index + " T[i+r]: " + triangle[index+row]);
				sum+= triangle[index+row];
				index = index + row;
				row++;
				
			}else {
				System.out.println("R: " + row + " I: " + index + " T[i+r+1]: " + triangle[index+row+1]);
				sum+= triangle[index+row+1];
				index = index + row+1;
				row++;
				
			}
		}
		
		return sum;
		
	}
	
	public static int maxTriangle(int[] triangle, int totalRows) {
		int maxSum = 0;
		int rowLength = 1;
		int sum;
		
		for(int i = 1; i < totalRows; i++) { // iterate through rows
			sum = triangle[0]; // starting val
			
		}
		
		return maxSum;
	}
	
    static int maxPathSum(int tri[][], int m, int n) 
    { 

        for (int i = m - 1; i >= 0; i--) 
        { 
            for (int j = 0; j <= i; j++) 
            { 
                if (tri[i + 1][j] > tri[i + 1][j + 1]) 
                    tri[i][j] += tri[i + 1][j]; 
                else
                    tri[i][j] += tri[i + 1][j + 1]; 
            } 
        } 
      
        return tri[0][0]; 
    } 
	
	public static void main(String[] args) {
		int[][] triangle;
		int row = 1;
		String[] temp;
		Scanner s = new Scanner(System.in);
		
		
		triangle = new int[16][16];
		
		while(s.hasNextLine() && row < 15) {
			temp = s.nextLine().trim().split(" ");
			for(int j = 0; j < temp.length; j++) {
				triangle[row][j] = Integer.parseInt(temp[j]);
			}
			row++;
		}
		
		s.close();
		
		System.out.println(maxPathSum(triangle, 15, 15));
		
	}

}
