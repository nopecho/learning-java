package ch7_MyTv;

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;
	
	final int MAX_VOLUME=100;
	final int MIN_VOLUME=0;
	final int MAX_CHANNEL=100;
	final int MIN_CHANNEL=1;
	
	void powerOnOff() {
		if(!isPowerOn) isPowerOn=true;
		isPowerOn=false;
	}
	void setChannel(int ch) {
		if(ch>MAX_CHANNEL) channel=MIN_CHANNEL;
		else if(ch<MIN_CHANNEL) channel=MAX_CHANNEL;
		prevChannel=channel;
		channel=ch;
	}
	int getChannel() {return channel;}

	void setvolume(int vol) {
		if(vol>MAX_VOLUME) volume=MIN_VOLUME;
		else if(vol<MIN_VOLUME) volume=MAX_VOLUME;
		volume=vol;
	}
	int getVolume() {return volume;}
	
	void gotoPrevChannel() {
		setChannel(prevChannel);
	}
}
