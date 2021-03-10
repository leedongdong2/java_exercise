package Array;

public class ArrayExam5_6 {
// 머니를 냇을떄 머니의 금액을 동전으로 바꾸었을때 몇개의 동전이 필요한지 
//	계산해서 출력하라
	public static void main(String[] args) {
    int[] coinUnit = {500,100,50,10};
    int money = 2680;
    int coin = 0;
    System.out.println("money="+money);
    
    for(int i=0;i<coinUnit.length;i++) {
    	coin  = money/coinUnit[i];
    	money = money%coinUnit[i];
    	System.out.printf("%2d원:%d%n",coinUnit[i],coin);
    }
    }

	}

