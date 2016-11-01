import java.util.*;
public class Insurance{
	protected final int inscode;
	protected static Insurance[] insurances = new Insurance[10];
	protected int custcode;
	protected int duration;
	protected static int count;

	Insurance(){
		this.count++;
		this.inscode=this.count;
		insurances[inscode-1] = this;
		}
	public static int getCount(){
		return count;}
	public int getInsCode(){
		return this.inscode;}
	public void setCustcode(int custcode){
		this.custcode=custcode;}
	public int getCustcode(){
		return this.custcode;}
	public void setDuration(int duration){
		this.duration=duration;}
	public int getDuration(){
		return this.duration;}
	public String toString(){
		String x="Insurance Code: "+this.inscode+", Customer Code: "+this.custcode+", Duration: "+this.duration;
		return x;}
	public int insurance_cost(){
		return 100;}

	public static void printAll(){
		for (Insurance insurance : insurances)
			System.out.println(insurance.toString());}

	public static void printInsurance(int inscode){
		for (Insurance insurance : insurances) {
			if (insurance.getInsCode() == inscode) {
				System.out.println(insurance.toString());
				break;}
			}
		}

}