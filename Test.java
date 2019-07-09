public class Test {
	public static void main(String[] args) {
		System.out.println("Hello kiscica!");
							// Primitiv tipusok
		boolean igazE = true;
		byte bajtocska = 50;			//8 bit -128/127
		short szam = -1000;			//16 bit -32768/32767
		int szam2 = 70000;			//32 bit
		long szam3 = 40000000l;			//64 bit

		float szam4 = 2.5f;			//32 bit lebegőpontos
		double szam5 = 121.3;			//64 bit lebegőpontos

		char ch = 'a';

		int[] tomb = new int[10]; 		// 1D tömb def.
		int[][] tomb2 = new int [10][5];	// 2D tömb def.


							// Referencia tipusok
		String szo = "Macska";

		byte c = 0b1011;
		byte d = 0b0101;
		System.out.println(c & d);		// Bitenkénti ÉS
		System.out.println(c | d); 		// Bitenkénti VAGY
		System.out.println(~c);			// Bitenkénti NEG
		System.out.println(c ^ d);		// Bitenkénti XOR

		System.out.println(true && false);	// ÉS művelet
		System.out.println(true || false);	// VAGY művelet
		System.out.println(!true);		// NEG
		System.out.println(true == false);	// megegyezés
		int a = 1;
		int b = 3;
		if(a == 10) {
			System.out.println("10");
		} else if(b == 20) {
			b += 200;
		} else {
			b++;
		}


		switch(a) {
			case 1:
				System.out.println("egy");
				break;
			default:
				System.out.println("nem egy");
				break;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		int i = 0;
		while(i < 10) {
			System.out.println("while" + i);
			i++;
		}

		do {
			System.out.println("Do" + i);
			i--;
		} while(i >= 0);

		int q = addTwoNumbers(10, a);
		System.out.println(q);
		printNumber(q);
	}


	public static int addTwoNumbers(int a, int b) {
		int result = a + b;
		return result;
	}

	public static void printNumber(int a) {
		System.out.println("A kapott szám: " + a);
 	}

}
