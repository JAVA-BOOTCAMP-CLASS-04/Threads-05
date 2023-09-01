import java.util.Arrays;

public class PruebaSecuencial {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente("CLIENTE-1", Arrays.asList(1, 3, 2, 4, 1, 1));
		Cliente cli2 = new Cliente("CLIENTE-2", Arrays.asList(3, 1, 1, 2));
		
		CajeroSecuencial caj1 = new CajeroSecuencial("CAJERO-1");
		CajeroSecuencial caj2 = new CajeroSecuencial("CAJERO-2");
		
		long initTime = System.currentTimeMillis();
		
		caj1.procesarCompra(cli1, initTime);
		caj2.procesarCompra(cli2, initTime);
	}

}
