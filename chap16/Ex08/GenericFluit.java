package chap16.Ex08;



											//DTO, VO
public class GenericFluit <T extends Fluit>{  //DTO(Data Tranfer Object) - getter, setter,
												//Vo(Value Object) - getter
		private T Fluit;						//�����͸� �޾Ƽ� �����ϴ� �߰��� ������ ��.
												//�������� ���� �޾Ƽ� ����, �߰��� ����
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

