package Array;

public class ArrayExam5_8 {
//answer�� ��� �����͸� �а� �� ������ ������ ���� *�� ��� ��Ÿ���ÿ�
	
	public static void main(String[] args) {
	  int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
	//answer�� �ִ���� 4�̹Ƿ� ũ�� 4�� �迭 ����
	  int[] counter = new int[4];
	//answer [i]�����ǰ���  counter�� i-1�������ϰ� �׷������� ī���͸� �� �����Ѵ�
	  for(int i=0;i<answer.length;i++) {
		  counter[answer[i]-1]++;
	  }
	 //i���� �� ����ŭ *�� ���
	  for(int i=0;i<counter.length;i++) {
		  System.out.print(1+i+"�ǰ���"+counter[i]);
		  for(int j=0; j<counter[i];j++) {
			  System.out.print("*");
		  }
		  System.out.println();
	  }

	}

}
