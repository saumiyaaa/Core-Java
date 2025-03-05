package com.clonedemo;

	public class CloneDemo implements Cloneable {
		int m,n;
		
		public CloneDemo() {
			m = 10;
			n = 12;
		}
		
		public CloneDemo(int m, int n) {
			this.m = m;
			this.n = n;
		}
		
		public String toString() {
			return m +" "+n;
		}
		
		@Override
		protected Object clone() throws CloneNotSupportedException {
			CloneDemo d = new CloneDemo(this.m,this.n);
			return d;
		}

	}


