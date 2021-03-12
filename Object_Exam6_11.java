package Object_orientde_Programming1;

public class Object_Exam6_11 {

	public static void main(String[] args) {
   //TvŬ������ �־��� ������� �ϼ��Ͻÿ�. �ϼ��� �Ŀ� �����ؼ� �־��� �������� ��ġ�ϴ��� Ȯ���Ͻÿ�
    MyTv t = new MyTv();
    
    t.channel = 100;
    t.volume = 0;
    System.out.println("CH:"+t.channel+", VOL:"+t.volume);
    t.channelDown();
    t.volumDown();
    System.out.println("CH:"+t.channel+", VOL:"+t.volume);
    
    t.volume = 100;
    t.channelUp();
    t.volumUp();
    System.out.println("CH:"+t.channel+", VOL:"+t.volume);
    t.channelUp();
    t.volumUp();
    System.out.println("CH:"+t.channel+", VOL:"+t.volume);
    t.channelDown();
    System.out.println("CH:"+t.channel);
	}

}
class MyTv{
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOff() {
		if(isPowerOn) {
			isPowerOn = false;
		}else {
			isPowerOn = true;
		}
	}
	
	void volumUp() {
		if(volume<MAX_VOLUME) {
			volume++;
		}
	}
	
	void volumDown() {
		if(volume>MIN_VOLUME) {
			volume--;
		}
	}
	
	void channelUp() {
		channel++;
		if(channel>MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		}
	}
	
	void channelDown() {
		channel--;
		if(channel<MIN_CHANNEL) {
			channel=MAX_CHANNEL;
		}
	}
	
	
	
}
