package Ch7_Object_Oriented_Programming;

class MyTv2 {
    private boolean isPowerOn;
    int prevChannel;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    // 알맞은 코드를 넣으시오
    // 변수들은 클래스 외부에서 접근 불가능
    // getter와 setter를 만들어서 내용을 변경할 수 있음
    public void setIsPowerOn(boolean isPowerOn) {
        this.isPowerOn = !isPowerOn;
    }

    public void getIsPowerOn(boolean isPowerOn) {
        this.isPowerOn = isPowerOn;
    }

    public int getChannel() {
        return this.channel;
    }

    public void setChannel(int channel) {
        if (channel > MAX_CHANNEL || channel < MIN_CHANNEL)
            return;
        prevChannel = this.channel;
        this.channel = channel;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        if (volume > MAX_VOLUME || volume < MIN_VOLUME)
            return;
        this.volume = volume;
    }

    void gotoPrevChannel() {
        int tmp = 0;
        tmp = channel;
        channel = prevChannel;
        prevChannel = tmp;
    } // end of gotoPrevChannel

} // end of class MyTv

public class Practice7_5 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH: " + t.getChannel());
        t.setChannel(20);
        System.out.println("CH: " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH: " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH: " + t.getChannel());
    } // end of main
} // end of class
