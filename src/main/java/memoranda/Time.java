package main.java.memoranda;

public class Time {

	int hour;
	int minute;
	int period;
	
	
	public Time(int hour, int minute, int period) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.period = period;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	
}
