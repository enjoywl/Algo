package com.paypal.wl.algo.algo;


public class BagProblem {
	

	protected static void fx(OB[] ob, int cap) {
		
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
	
	public static class OB {
		private final String id;
		private final int weight;
		private final int value;

		public OB(String id, int weight, int value) {
			this.id = id;
			this.weight = weight;
			this.value = value;
		}

		public int getWeight() {
			return weight;
		}

		public int getValue() {
			return value;
		}

		public String getId() {
			return id;
		}

	}
}
