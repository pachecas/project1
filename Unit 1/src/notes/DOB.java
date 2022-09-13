package notes;

public class DOB {
	private int year;
	private int month;
	private int day;
	public DOB(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "DOB [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	
}
