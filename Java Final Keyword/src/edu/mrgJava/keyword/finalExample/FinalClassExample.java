package edu.mrgJava.keyword.finalExample;

public class FinalClassExample {
	
	public final class A{
		private int q;
		private int n;
		
		public A(int q, int n) {
			this.q = q;
			this.n = n;
		}

		public int getQ() {
			return q;
		}

		public void setQ(int q) {
			this.q = q;
		}

		public int getN() {
			return n;
		}

		public void setN(int n) {
			this.n = n;
		}
		
	}
	
	public class B extends A{
		// Error Message: The type B cannot subclass the final class FinalClassExample.A
	}

}
