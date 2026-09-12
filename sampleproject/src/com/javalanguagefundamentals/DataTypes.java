package com.javalanguagefundamentals;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * byte is a data type which is used to store integer numerical values.
		 * 1 byte = 8 bits.
		 * The range of byte is from -2^7 to 2^7 - 1,
		 * which is -128 to 127.
		 *
		 * If we try to store a value which is outside the range of byte
		 * without explicit casting, it will show a compile-time error:
		 *
		 * CE: Type mismatch: cannot convert from int to byte
		 *
		 * If we want to explicitly convert an int value to byte,
		 * we can use explicit type casting.
		 */

		byte a = 10;
		byte b = (byte) 128;
		// 128 is outside the byte range. After explicit casting, the value is converted to byte and the result is -128.
		
		/*
		 * short is a data type which is used to store integer numerical values.
		 * 2 bytes = 16 bits.
		 * The range of short is from -2^15 to 2^15 - 1,
		 * which is -32768 to 32767.
		 *
		 * If we try to store a value which is outside the range of short
		 * without explicit casting, it will show a compile-time error:
		 *
		 * CE: Type mismatch: cannot convert from int to short
		 *
		 * If we want to explicitly convert an int value to short,
		 * we can use explicit type casting.
		 */
		
		short c = 100;
		short d = (short) 32768;
		// 32768 is outside the short range. After explicit casting, the value is converted to short and the result is -32768.
		/*
		 * int is a data type which is used to store integer numerical values.
		 * 4 bytes = 32 bits.
		 * The range of int is from -2^31 to 2^31 - 1,
		 * which is -2147483648 to 2147483647.
		 *
		 * If we try to store an integer literal which is outside
		 * the range of int, it will show a compile-time error:
		 *
		 * CE: The literal 2147483648 of type int is out of range
		 */
		int e = 2000;
		/*
		 * If we want to store integer values which are outside the range
		 * of int but within the range of long, we can use long.
		 *
		 * long = 8 bytes = 64 bits.
		 * The range of long is from -2^63 to 2^63 - 1,
		 * which is -9223372036854775808 to 9223372036854775807.
		 *
		 * The L or l suffix is required when an integer literal is too
		 * large to fit in int but can be stored in long.
		 *
		 * If we try to store a value which is outside the range of long,
		 * it will show a compile-time error:
		 *
		 * CE: The literal 20000000000000000000L of type long is out of range
		 */
		long f = 20000000000L;
		/*
		 * float is a data type which is used to store floating-point values.
		 *
		 * float = 4 bytes = 32 bits.
		 *
		 * Unlike integer data types, float does not use the range
		 * -2^31 to 2^31 - 1.
		 *
		 * The approximate range of float is from
		 * -3.4028235 × 10^38 to 3.4028235 × 10^38.
		 *
		 * The F or f suffix is required when assigning a decimal
		 * floating-point literal to a float variable.
		 *
		 * Example:
		 * float x = 50.0f;
		 *
		 * If we try to assign a decimal literal without the F suffix,
		 * the literal is treated as double and cannot be directly
		 * assigned to float.
		 */
		float g = 50f;
		/*
		 * double is a data type which is used to store floating-point values.
		 * It can store both whole-number values and fractional values.
		 *
		 * double = 8 bytes = 64 bits.
		 *
		 * Unlike long, double does not have the integer range
		 * -2^63 to 2^63 - 1.
		 *
		 * The approximate range of double is from
		 * -1.7976931348623157 × 10^308 to
		 * 1.7976931348623157 × 10^308.
		 *
		 * The D or d suffix can be used for a double literal,
		 * but it is optional because decimal floating-point literals
		 * are treated as double by default.
		 */
		double h = 20000;
		/*
		 * char is a data type which is used to store a single UTF-16
		 * code unit.
		 *
		 * char = 2 bytes = 16 bits.
		 *
		 * char is an unsigned data type, so its range is:
		 * 0 to 2^16 - 1,
		 * which is 0 to 65535.
		 *
		 * A character literal is written using single quotes.
		 *
		 * A char can also be assigned an integer value from 0 to 65535.
		 * The integer value represents the corresponding UTF-16 code unit.
		 */
		char i = 65;
		char j = 'A';
		/*
		 * boolean is a data type which is used to store true or false values.
		 *
		 * It has only two possible values:
		 * true
		 * false
		 *
		 * Java does not define a numeric range or fixed size in bytes
		 * for boolean.
		 *
		 * We cannot store 0 or 1 directly in a boolean variable.
		 */
		boolean k = true;
		
		System.out.println("Byte value : "+a);
		System.out.println("Byte value with explicit casting: "+b);
		System.out.println("Short value : "+c);
		System.out.println("Short value with explict casting : "+d);
		System.out.println("int value : "+e);
		System.out.println("Long value : "+f);
		System.out.println("Float value : "+g);
		System.out.println("Double value : "+h);
		System.out.println("Char value : "+i);
		System.out.println("Char value : "+j);
		System.out.println("Boolean value : "+k);


		
	}

}
