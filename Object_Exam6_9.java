package Object_orientde_Programming1;
// 다음은 컴퓨터 게임의 병사 를 클래스로 정의한 것이다 이 클래스의 멤버 (marine) .
// 를 클래스로 정의한 것이다 (marine) .중에 을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가 static  을 붙여야 하는 것은 어떤 것들이고 
// 그 이유는 무엇인가 static ?( , .단 모든 병사의 공격력과 방어력은 같아야 한다
public class Object_Exam6_9 {
int x=0,y=0;
int hp = 60;
static int weapon = 6;
static int armor = 0;

void weaponUp() {
	weapon++;
}

void armorUp() {
	armor++;
}

void move(int x,int y) {
	this.x=  x;
	this.y = y;
}

public static void main(String[] args) {
	System.out.println("모든 병사의 공격력과 방어력은 같아야하니 weapon,armor에 붙여 클래스에서 한번에 바뀔수 있도록 해줘야한다");
	int i = 2;
	String e = "*";
	System.out.println(i+e+i);
	
}
}
