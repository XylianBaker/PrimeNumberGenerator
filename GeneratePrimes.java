package jkammellander;

public class GeneratePrimes implements Runnable{
	private boolean running = true;
	private PrimeNumberList primes;
	
	public GeneratePrimes(PrimeNumberList primes) {
		this.primes = primes;
	}

	@Override
	public void run() {
		while(running) {
			try {
				int prime = getRandomPrime();
				primes.savePrime(prime);
			} catch (Exception e) {}
		}
	}
	
	public int getRandomPrime() {
		return (int)(Math.random()*(100-1+1)+1);
	}
	
	public void shutdown() {
		this.running = false;
	}
	
}
