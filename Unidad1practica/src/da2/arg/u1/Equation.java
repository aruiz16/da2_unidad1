package da2.arg.u1;

import java.io.Serializable;

public class Equation implements Serializable{
	private double valueX;
	private double valueY;
	private double Result;
	
	public double getResult() {
		return (4*(2*valueX+3*valueY) + 2*(5*valueY+3*valueX));
	}

	public void setResult(double result) {
		this.Result = result;
	}

	public double getValueX() {
		return valueX;
	}
	
	public double getValueY() {
		return valueY;
	}
	
	
	public void setValueX(double valueX) {
		this.valueX = valueX;
	}
	
	public void setValueY(double valueY) {
		this.valueY = valueY;
	}
	


	@Override
	public String toString() {
		return "Equation [valueX=" + valueX + ", valueY=" + valueY + "]";
	}
	
	
}
