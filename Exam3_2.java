package Operator;

public class Exam3_2 {

	public static void main(String[] args) {
		/* 3-2
		 * �ѹٱ��Ͽ� ����� 10���� ���� �ִٸ� 
		 * ����� ��ƾ��� �ٱ��ϰ� � �ʿ����� ���϶�
		 * */
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = numOfApples/sizeOfBucket;
		if(numOfApples%sizeOfBucket!=0) {
			numOfBucket = numOfBucket + 1;
		}
		System.out.println("�ʿ��� �ٱ����� �� :" + numOfBucket);

	}

}
