package Transaction;

public class Transaction {
	private double dinheiroDado;
	private double total;
	
	public Transaction(double total, double dinheiroDado){
		this.total = total;
		this.dinheiroDado = dinheiroDado;
	}
	
	public double retornaTroco(){
		return total - dinheiroDado;
	}
}
