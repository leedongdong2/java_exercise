package Array;

public class ArrayExam5_4 {
//2차원 배열 arr에 담긴 모든값의 총합과 평균을 구하는 프로그램을 완성하시오.
	public static void main(String[] args) {
		int[][] arr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
        
		int total = 0;
        double average =0;
		
        for(int i=0;i<arr.length;i++) {
        	for(int j=0;j<arr[i].length;j++) {
        		total = total + arr[i][j];
        	}
        }
        
        average = (double)total/(arr.length*arr[0].length);
		
		
		
		System.out.println("total="+total);
		System.out.println("average="+average);
		
		
	}

}
