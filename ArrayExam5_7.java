package Array;

public class ArrayExam5_7 {
//�Ž������� ���� �ܾ��� ���ϰ� �Ž������� ������ �Ž������� ���ٰ� �ϼ���
	public static void main(String[] args) {
	int money = 2680;
	System.out.println("money="+money);
	
	int[] coinUnit = {500,100,50,10};
	int[] coin = {5,5,5,5};
	
	System.out.println("-------�Ž�����-----------");
	for(int i=0;i<coin.length;i++) {
		int coinNum = 0;
		
		coinNum = money/coinUnit[i];
		
		if(coin[i]>=coinNum) {
		coin[i] = coin[i] - coinNum;
		}else if(coin[i]<coinNum)	{
			coinNum = coin[i];
			coin[i] = 0;
		}
		money = money-(coinNum*coinUnit[i]);
		System.out.println(coinUnit[i]+"��:"+coinNum);
	}

if(money>0) {
System.out.println("�Ž������� ���߶��");
}







System.out.println("-------�����ܾ�-----------");
for(int i=0;i<coin.length;i++) {
	System.out.printf("%2d��:%d%n",coinUnit[i],coin[i]);
}

	}

}
