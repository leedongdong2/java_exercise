package Array;

public class ArrayExam5_8 {
//answer에 담긴 데이터를 읽고 각 숫자의 갯수를 세어 *를 찍어 나타내시오
	
	public static void main(String[] args) {
	  int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
	//answer의 최대수가 4이므로 크기 4의 배열 생성
	  int[] counter = new int[4];
	//answer [i]번지의값을  counter의 i-1번지로하고 그럴떄마다 카운터를 세 저장한다
	  for(int i=0;i<answer.length;i++) {
		  counter[answer[i]-1]++;
	  }
	 //i번의 의 값만큼 *를 출력
	  for(int i=0;i<counter.length;i++) {
		  System.out.print(1+i+"의개수"+counter[i]);
		  for(int j=0; j<counter[i];j++) {
			  System.out.print("*");
		  }
		  System.out.println();
	  }

	}

}
