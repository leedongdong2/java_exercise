package Array;

public class ArrayExam5_7 {
//거스름돈과 남은 잔액을 구하고 거스름돈이 없으면 거스름돈이 없다고 하세요
	public static void main(String[] args) {
	int money = 2680;
	System.out.println("money="+money);
	
	int[] coinUnit = {500,100,50,10};
	int[] coin = {5,5,5,5};
	
	System.out.println("-------거스름돈-----------");
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
		System.out.println(coinUnit[i]+"원:"+coinNum);
	}

if(money>0) {
System.out.println("거스름돈이 모잘라요");
}







System.out.println("-------남은잔액-----------");
for(int i=0;i<coin.length;i++) {
	System.out.printf("%2d원:%d%n",coinUnit[i],coin[i]);
}

	}

}
