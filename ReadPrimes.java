package jkammellander;

public class ReadPrimes implements Runnable{
	private boolean running = true;
	private String bezeichnungString = "";
	private PrimeNumberList primes;
	

	public ReadPrimes(String bezeichnungString, PrimeNumberList primes) {
		this.bezeichnungString = bezeichnungString;
		this.primes = primes;
	}

	@Override
	public void run() {
		
		while(running) {
			System.out.println(bezeichnungString + ": " + primes.getPrime());
		}
	}
	
	public void shutdown() {
		this.running = false;
	}

}
