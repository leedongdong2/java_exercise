package Array;

public class ArrayExam5_6 {
// �Ӵϸ� ������ �Ӵ��� �ݾ��� �������� �ٲپ����� ��� ������ �ʿ����� 
//	����ؼ� ����϶�
	public static void main(String[] args) {
    int[] coinUnit = {500,100,50,10};
    int money = 2680;
    int coin = 0;
    System.out.println("money="+money);
    
    for(int i=0;i<coinUnit.length;i++) {
    	coin  = money/coinUnit[i];
    	money = money%coinUnit[i];
    	System.out.printf("%2d��:%d%n",coinUnit[i],coin);
    }
    }

	}

