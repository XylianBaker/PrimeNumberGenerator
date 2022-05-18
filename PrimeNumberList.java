package jkammellander;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class PrimeNumberList {
	private BlockingQueue<Integer> primes;
	
	public PrimeNumberList() {
		this.primes = new LinkedBlockingQueue<>(15);
	}
	
	public void savePrime(int prime) {
		while (true) {
			try {
				primes.put(prime);
				break;
			} catch (InterruptedException e) {}
		}
	}
	
	public int getPrime() {
		while (true) {
			try {
				return primes.take();
			} catch (InterruptedException e) {}
	}
}
}
