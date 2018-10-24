import org.junit.Test;
import org.hamcrest.CoreMatchers;
import static org.junit.Assert.assertThat;


import Transaction.Transaction;

public class TransactionTest {
	private double total;
	private double dinheiroDado; 
	
	@Test
	public void testRetornaTroco() throws Exception{
		dinheiroDado = 250;
		total = 251;
		Transaction transaction = new Transaction(total, dinheiroDado);
		assertThat(transaction.retornaTroco(), CoreMatchers.equalTo(1.0));
	}
	
	@Test
	public void testImprimeValor() throws Exception{
		dinheiroDado = 251;
		total = 250.5;
		Transaction transaction = new Transaction(total, dinheiroDado);
		transaction.imprimeCedulas();
	}
	
	@Test
	public void testImprimeCasoNegativo() throws Exception{
		dinheiroDado = 249;
		total = 250;
		Transaction transaction = new Transaction(total, dinheiroDado);
		transaction.imprimeCedulas();
	}
}
