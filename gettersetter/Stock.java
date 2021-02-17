package gettersetter;

public class Stock {
	public String symbol;
	public String name;
	public double prevClosP;
	public double currP;
	
	Stock(String symbol, String name, double prevClosP){
		this.symbol=symbol;
		this.name= name;
		this.prevClosP= prevClosP;
		//this.currP= currP;
	}
	
	public void setCurP(double newV) {
		this.currP = newV;
	}
	
	double getChPer() {
		double max=1,min=1,change,changePer;
		if(prevClosP>currP) {
			max = prevClosP;
			min = currP;
		}
		else {
			max = currP;
			min = prevClosP;
		}
		
		change = max-min;
		changePer = (change/max)*100;
		return changePer;
	}

}
