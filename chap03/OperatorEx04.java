package chap03;
public class OperatorEx04 {
	public static void main(String[] args) {
		
		/*
		 * ���� ������ ( =, +=, -=, *=/, /=, >>=, <<=, >>>= ), ���Ŀ��� �켱������ ���� ����.
		 * a = b;  <== b������ ���� a�� �Ҵ��϶�� �ǹ�, == (����)
		 * a += b   <== a = a + b
		 * a -= b   <== a = a - b
		 * a *= b   <== a = a * b
		 * a /= b   <== a = a / b
		 * a &= b   <== a = a & b
		 * a |= b   <== a = a | b
		 * a <<= b  <== a = a << b
		 */
		int value1 = 3;
		value1 = value1 + 3;
		System.out.println(value1);
		System.out.println();
		
		//��� ǥ��
		int value2;			//�⺻�� �ڷ����� ��� ������ ���� ���� ���� ��� �⺻������ 0�� �Ҵ�.
		value2 =5;			//�����ڷ����� ��� ������ ���� �Ҵ� ���� ���� ��� �⺻������ NULL
		
		System.out.println(value2 += 2 );  //value2 = value2 + 2
		System.out.println(value2 -= 2 );  //value2 = value2 - 2
		System.out.println(value2 /= 2 );  //value2 = value2 / 2
		value2 = 5; System.out.println(value2 %= 2); //1
		value2 = 5; System.out.println(value2 |= 2); //value2 = value2 | 2
		value2 = 5; System.out.println(value2 &= 2); //value2 = value2 & 2
		
		value2 = 5; System.out.println(value2 <<= 2 ); //value2 = value << 2
		value2 = 5; System.out.println(value2 >>= 2 ); //value2 = value2 >> 2
		
		value2 = 5; System.out.println(value2 >>>= 2 ); //value2 = value2 >>>2
		byte value3;
		value3 = -128; System.out.println(value3 >>>= 2);
		
		
		
		
		
		
		

	}

}
