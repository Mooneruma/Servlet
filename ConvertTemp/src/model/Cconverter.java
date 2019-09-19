package model;

public class Cconverter {

	private int temp;

	public Cconverter() {
		super();
	}

	public Cconverter(int temp) {
		super();
		this.temp = temp;
		setConversion(temp);
	}

	public int getTemp() {
		return (temp - 32) * (9 / 5);
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public void setConversion(int temp) {
		temp = (temp - 32) * (9 / 5);
	}

	public String toString() {
		return temp + " Celsius";
	}
}
