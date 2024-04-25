package utils;

	public enum Suit {
		DIAMOND ("D"),
		HEART ("H"),
		CLUB ("C"),
		SPADE ("S");

		private String symbol;

		Suit (String symbol) {
			this.symbol = symbol;
		}


		public String toString () {
			return symbol;
		}
	}
