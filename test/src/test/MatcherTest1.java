package test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.Test;

class MatcherTest1 {

	@Test
	void test() {
		assertThat("hoge", is("hoge"));
	}

//	ここから↓
////	public class HamcrestTest{
////		@Test
////		public void 値を否定する() {
////			assertThat("hoge",is(not("HOGE")));
////		}
////		@Test
////		public void Matcherを否定する() {
////			assertThat("hoge",is(not(constainsString("xx"))));
////		}
////	}
////ここまでが否定する　not() 否定する。




}
