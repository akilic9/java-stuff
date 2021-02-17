package getSet;

public class Stok {
	String symbol,name;
	double prevClP, currP;
	
	Stok(String symbol, String name, double prevClP, double currP){
		this.symbol=symbol;
		this.name=name;
		this.prevClP=prevClP;
		this.currP=currP;
	}
	
	double getPer() {
		double per = ((currP-prevClP)/prevClP)*100;
		return per;
	}

}
