package jkammellander;

public class StartThread {
	public static void main(String[] args) {
		PrimeNumberList primesList = new PrimeNumberList();
		
		GeneratePrimes gp1 = new GeneratePrimes(primesList);
		GeneratePrimes gp2 = new GeneratePrimes(primesList);
		GeneratePrimes gp3 = new GeneratePrimes(primesList);
		
		new Thread(gp1).start();
		new Thread(gp2).start();
		new Thread(gp3).start();
		
		ReadPrimes rp1 = new ReadPrimes("1", primesList);
		ReadPrimes rp2 = new ReadPrimes("2", primesList);
		
		new Thread(rp1).start();
		new Thread(rp2).start();
		
		try {
			Thread.sleep(2000);
			gp1.shutdown();
			gp2.shutdown();
			gp3.shutdown();
			rp1.shutdown();
			rp2.shutdown();
		} catch (Exception e) {
		}
	}
}
