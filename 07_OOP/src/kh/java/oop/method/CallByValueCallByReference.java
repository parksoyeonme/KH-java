package kh.java.oop.method;

import java.util.Arrays;

/**
 * call by value
 * - 메소드 호출시 인자로 값을 넘기는 경우(기본형)
 * 
 * call by reference
 * - 메소드 호출시 인자로 주소값을 넘기는 경우(참조형)
 *
 */
public class CallByValueCallByReference {

	public static void main(String[] args) {
		int a = 9;
		int b[] = {1, 2, 3};
		
		CallByValueCallByReference c = new CallByValueCallByReference();
		
		//1.call by value : 값(리터럴)이 복사되는 경우
		c.test(a);
//		a = c.test(a);
		System.out.println(a);
		
		//2.call by reference : 
		c.test(b);;
		System.out.println(Arrays.toString(b));
		
		
	}
	// int, char, boolean, float, double, long, short
	public void test(int x) { //실제 원본값에 아무영향도 미치지않는다.)
		x *=100;
	}
//	public int test(int x) { //실제 원본값에 아무영향도 미치지않는다.)
//		x *=100;
//		return x;
//	}
	
	public void test(int[] arr) {
		arr[0] *= 100;
	}

}
