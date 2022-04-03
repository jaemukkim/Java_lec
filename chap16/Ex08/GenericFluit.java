package chap16.Ex08;



											//DTO, VO
public class GenericFluit <T extends Fluit>{  //DTO(Data Tranfer Object) - getter, setter,
												//Vo(Value Object) - getter
		private T Fluit;						//데이터를 받아서 전송하는 중간자 역할을 함.
												//계층간에 값을 받아서 전송, 중간자 역할
		public T getFluit() {	
			return Fluit;
		}

		public void setFluit(T fluit) {
			this.Fluit = fluit;
		}
		@Override
		public String toString() {
			return Fluit.toString();
		}	
	}

