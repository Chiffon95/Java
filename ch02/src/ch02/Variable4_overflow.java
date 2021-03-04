package ch02;

public class Variable4_overflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short sMin = -32768, sMax = 32767;
		char cMin = 0, cMax = 65535;
		//operation base 'int' -> 'short' (O)
		System.out.println("sMin = " + sMin);
		System.out.println("sMin - 1 = " + (short)(sMin - 1));
		System.out.println("sMax = " + sMax);
		System.out.println("sMax + 1 = " + (short)(sMax + 1));
		System.out.println();
		//char -> int (O)
		System.out.println("cMin = " + (int)cMin);
		System.out.println("cMin - 1 = " + (int)(cMin - 1));
		System.out.println("cMax = " + (int)cMax);
		System.out.println("cMax + 1 = " + (int)(cMax + 1));
		System.out.println();
		//char -> int (x)
		System.out.println("cMin = " + cMin);
		System.out.println("cMin - 1 = " + (cMin - 1));
		System.out.println("cMax = " + cMax);
		System.out.println("cMax + 1 = " + (cMax + 1));
	}

}
