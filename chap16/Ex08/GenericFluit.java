package chap16.Ex08;




public class GenericFluit <T extends Fluit>{
	
		private T Fluit;

		public T getFluit() {
			return Fluit;
		}

		public void setFluit(T fluit) {
			Fluit = fluit;
		}
		@Override
		public String toString() {
			return Fluit.toString();
		}	
	}

