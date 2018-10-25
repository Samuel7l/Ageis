package Transaction;

import java.util.List;
import java.util.ArrayList;

public class Transaction {
	
	private double dinheiroDado;
	
	private double total;
	
	private List<Integer> notas =  new ArrayList<Integer>();
	private List<Integer> moedas =  new ArrayList<Integer>();
	
	public Transaction(double total, double dinheiroDado) throws Exception{
		notas.add(100);
		notas.add(50);
		notas.add(10);
		notas.add(5);
		notas.add(1);
		moedas.add(50);
		moedas.add(10);
		moedas.add(5);
		moedas.add(1);
		
		if(total > dinheiroDado){
			System.err.println("Quantia insuficiente!");
			throw new Exception("Quantia insuficiente");
		}
		
		if(total < 0) {
			System.err.println("Total Negativo - Valor incorreto");
			throw new Exception("Total Negativo - Valor incorreto");
		} else {
			this.total = total;
		}
		
		this.dinheiroDado = dinheiroDado;
	}
	
	public double retornaTroco(){
		return dinheiroDado - total;
	}
	
	public void imprimeCedulas(){
		double totalParcial = total;
		for (Integer nota : notas) {
			int totalNotas = (int)(totalParcial / nota);
			if(totalNotas>0){
				System.out.println("Notas de "+nota + ": " + totalNotas);
				totalParcial -= nota*totalNotas;
				
			}
		}
		if(totalParcial<1){
			imprimeMoedas((int)(totalParcial*100));
		}
	}
	
	public void imprimeMoedas(int totalParcial){
		for (Integer moeda : moedas) {
			int totalMoedas = (int)(totalParcial / moeda);
			if(totalMoedas>0){
				System.out.println("Moedas de "+moeda + " centavos: " + totalMoedas);
				totalParcial -= moeda*totalMoedas;
			}
		}
	}
}
