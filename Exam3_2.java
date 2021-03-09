package Operator;

public class Exam3_2 {

	public static void main(String[] args) {
		/* 3-2
		 * 한바구니에 사과를 10개씩 들어갈수 있다면 
		 * 사과를 담아야할 바구니가 몇개 필요한지 구하라
		 * */
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = numOfApples/sizeOfBucket;
		if(numOfApples%sizeOfBucket!=0) {
			numOfBucket = numOfBucket + 1;
		}
		System.out.println("필요한 바구니의 수 :" + numOfBucket);

	}

}
