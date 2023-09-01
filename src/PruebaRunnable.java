import java.util.Arrays;

public class PruebaRunnable {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente("CLIENTE-1", Arrays.asList(1, 3, 2, 4, 1, 1));
		Cliente cli2 = new Cliente("CLIENTE-2", Arrays.asList(3, 1, 1, 2));
		
		long initTime = System.currentTimeMillis();

		CajeroRunnable caj1 = new CajeroRunnable("CAJERO-1", cli1, initTime);
		CajeroRunnable caj2 = new CajeroRunnable("CAJERO-2", cli2, initTime);
		
		Thread t1 = new Thread(caj1);
		Thread t2 = new Thread(caj2);
		
		t1.start();
		t2.start();
	}

}
