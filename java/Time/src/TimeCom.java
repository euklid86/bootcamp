//Describes an hour
public class TimeCom {
	//Attributes
	private int hour;
	private int minute;
	private int second;
	
	//Getters and Setters
	public int getHour() {return hour;}
	public void setHour(int hour) {
		if (hour>23)
			hour=hour%23;
		if (hour<0)
			hour=0;
		this.hour = hour;}
	
	public int getMinute() {return minute;}
	public void setMinute(int minute) {
		if (minute>59){
			this.hour=this.hour+(minute/60);
			minute=minute%60;}
		if (minute<0)
			minute=0;
		this.minute = minute;}
	
	public int getSecond() {return second;}
	public void setSecond(int second) {
		if (second>59){
			this.minute=this.minute+(second/60);
			second=second%60;}
		if (second<0)
			second=0;
		this.second = second;}
	
	public void setTime(int hour, int minute, int second){
		if (second>59){
			minute=minute+(second/60);
			second=second%60;}
		if (second<0)
			second=0;
		if (minute>59){
			hour=hour+(minute/60);
			minute=minute%60;}
		if (minute<0)
			minute=0;
		if (hour>23)
			hour=hour%23;
		if (hour<0)
			hour=0;
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	//Contractors
	TimeCom(){
		this.hour=1;
		this.minute=1;
		this.second=1;
	}
	TimeCom(int hour, int minute, int second){
		if (second>59){
			minute=minute+(second/60);
			second=second%60;}
		if (second<0)
			second=0;
		if (minute>59){
			hour=hour+(minute/60);
			minute=minute%60;}
		if (minute<0)
			minute=0;
		if (hour>23)
			hour=hour%23;
		if (hour<0)
			hour=0;
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	
	@Override
	public String toString() {return "TimeCom [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";}
	
	
}
