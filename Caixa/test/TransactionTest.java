import org.junit.Test;

import Transaction.Transaction;

public class TransactionTest {
	private double dinheiroDado = 22.5;
	private double total = 18.3; 
	
	@Test
	public void testRetornaTroco(){
		Transaction transaction = new Transaction(total, dinheiroDado);
		//assertThat(transaction.retornaTroco(), );
	}
}
