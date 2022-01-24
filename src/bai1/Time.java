package bai1;

public class Time implements Comparable<Time>{
	private int minute;
	private int second;

	public Time(int minute, int second) {
		this.minute = minute;
		this.second = second;
	}

	@Override
	public String toString() {
		return "Time [minute=" + minute + ", second=" + second + "]";
	}

	@Override
	public int compareTo(Time o) {
		return (minute * second) - (o.minute * o.second);
	}


}
