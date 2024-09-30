package readJsonData;

public class Rating {
	
	private int rate;
	private int count;
	
	public Rating() {}
	public Rating(int rate, int count) {
		this.rate = rate;
		this.count = count;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Rating [rate=" + rate + ", count=" + count + "]";
	}
	
	
	

}
