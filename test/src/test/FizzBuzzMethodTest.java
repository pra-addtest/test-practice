package test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import practice.FizzBuzzMethod;

class FizzBuzzMethodTest {

//	@BeforeEach
//	void setUp() throws Exception {
//	}

	@Test
	public void Test1() {
		//			↓クラス	　↓クラスの中のメソッド
		//	メソッド引数に１５の値を入れ、判別の結果が"FizzBuzz"であれば異常なし
		assertThat(FizzBuzzMethod.replyBasedOn(15), is("FizzBuzz"));
	}
	 @Test
	    public void test2() {
		 //								３で割って余りがない（0）の場合
	        assertThat(FizzBuzzMethod.replyBasedOn(6), is("Fizz"));
	    }
	    @Test
	    public void test3() {
//	    	５で割って余りが０のもの
	        assertThat(FizzBuzzMethod.replyBasedOn(10), is("Buzz"));
	    }
	    @Test
	    public void test4() {
//	    	２の時は２であると表示される。
	        assertThat(FizzBuzzMethod.replyBasedOn(2), is("2"));
	    }
}
