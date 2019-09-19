package model;

public class Fconverter {

	private int temp;

	public Fconverter() {
		super();
	}

	public Fconverter(int temp) {
		super();
		this.temp = temp;
		setConversion(temp);
	}

	public int getTemp() {
		return temp * (9 / 5) + 32;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public void setConversion(int temp) {
		temp = (temp * (9 / 5)) + 32;
	}

	public String toString() {
		return temp + " Farenheit";
	}
}
