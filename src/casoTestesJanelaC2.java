import static org.junit.Assert.*;

import org.junit.Test;

public class casoTestesJanelaC2 {

	
	public void test() {
	
	}

	@Test
	public void b0b0b0(){
		assertEquals(400*100, JanelaC2.calculaJanela(0, 0, 0));
	}
	@Test
	public void b0b0b1(){
		assertEquals(300*100, JanelaC2.calculaJanela(0, 0, 100));
	}
	@Test
	public void b0b0b2(){
		assertEquals(200*100, JanelaC2.calculaJanela(0, 0, 200));
	}
	@Test
	public void b0b0b3(){
		assertEquals(200*100, JanelaC2.calculaJanela(0, 0, 400));
	}
	@Test
	public void b0b1b0(){
		assertEquals(300*100, JanelaC2.calculaJanela(0, 100, 0));
	}
	@Test
	public void b0b1b1(){
		assertEquals(300*100, JanelaC2.calculaJanela(0, 100, 100));
	}
	@Test
	public void b0b1b2(){
		assertEquals(200*100, JanelaC2.calculaJanela(0, 100, 200));
	}
	@Test
	public void b0b1b3(){
		assertEquals(200*100, JanelaC2.calculaJanela(0, 100, 400));
	}
	@Test
	public void b0b2b0(){
		assertEquals(200*100, JanelaC2.calculaJanela(0, 200, 0));
	}
	@Test
	public void b0b2b1(){
		assertEquals(200*100, JanelaC2.calculaJanela(0, 200, 100));
	}
	@Test
	public void b0b2b2(){
		assertEquals(200*100, JanelaC2.calculaJanela(0, 200, 200));
	}
	@Test
	public void b0b2b3(){
		assertEquals(0, JanelaC2.calculaJanela(0, 200, 400));
	}
	@Test
	public void b0b3b0(){
		assertEquals(200*100, JanelaC2.calculaJanela(0, 400, 0));
	}
	@Test
	public void b0b3b1(){
		assertEquals(100*100, JanelaC2.calculaJanela(0, 400, 100));
	}
	@Test
	public void b0b3b2(){
		assertEquals(0, JanelaC2.calculaJanela(0, 400, 200));
	}
	@Test
	public void b0b3b3(){
		assertEquals(200*100, JanelaC2.calculaJanela(0, 400, 400));
	}
	@Test
	public void b1b0b0(){
		assertEquals(300*100, JanelaC2.calculaJanela(100, 0, 0));
	}
	@Test
	public void b1b0b1(){
		assertEquals(300*100, JanelaC2.calculaJanela(100, 0, 100));
	}
	@Test
	public void b1b0b2(){
		assertEquals(200*100, JanelaC2.calculaJanela(100, 0, 200));
	}
	@Test
	public void b1b0b3(){
		assertEquals(100*100, JanelaC2.calculaJanela(100, 0, 400));
	}
	@Test
	public void b1b1b0(){
		assertEquals(300*100, JanelaC2.calculaJanela(100, 100, 0));
	}
	@Test
	public void b1b1b1(){
		assertEquals(400*100, JanelaC2.calculaJanela(100, 100, 100));
	}
	@Test
	public void b1b1b2(){
		assertEquals(300*100, JanelaC2.calculaJanela(100, 100, 200));
	}
	@Test
	public void b1b1b3(){
		assertEquals(200*100, JanelaC2.calculaJanela(100, 100, 400));
	}
	@Test
	public void b1b2b0(){
		assertEquals(200*100, JanelaC2.calculaJanela(100, 200, 0));
	}
	@Test
	public void b1b2b1(){
		assertEquals(300*100, JanelaC2.calculaJanela(100, 200, 100));
	}
	@Test
	public void b1b2b2(){
		assertEquals(300*100, JanelaC2.calculaJanela(100, 200, 200));
	}
	@Test
	public void b1b2b3(){
		assertEquals(100*100, JanelaC2.calculaJanela(100, 200, 400));
	}
	@Test
	public void b1b3b0(){
		assertEquals(100*100, JanelaC2.calculaJanela(100, 400, 0));
	}
	@Test
	public void b1b3b1(){
		assertEquals(200*100, JanelaC2.calculaJanela(100, 400, 100));
	}
	@Test
	public void b1b3b2(){
		assertEquals(100*100, JanelaC2.calculaJanela(100, 400, 200));
	}
	@Test
	public void b1b3b3(){
		assertEquals(200*100, JanelaC2.calculaJanela(100, 400, 400));
	}
	@Test
	public void b2b0b0(){
		assertEquals(200*100, JanelaC2.calculaJanela(200, 0, 0));
	}
	@Test
	public void b2b0b1(){
		assertEquals(200*100, JanelaC2.calculaJanela(200, 0, 100));
	}
	@Test
	public void b2b0b2(){
		assertEquals(200*100, JanelaC2.calculaJanela(200, 0, 200));
	}
	@Test
	public void b2b0b3(){
		assertEquals(0, JanelaC2.calculaJanela(200, 0, 400));
	}
	@Test
	public void b2b1b0(){
		assertEquals(200*100, JanelaC2.calculaJanela(200, 100, 0));
	}
	@Test
	public void b2b1b1(){
		assertEquals(300*100, JanelaC2.calculaJanela(200, 100, 100));
	}
	@Test
	public void b2b1b2(){
		assertEquals(300*100, JanelaC2.calculaJanela(200, 100, 200));
	}
	@Test
	public void b2b1b3(){
		assertEquals(100*100, JanelaC2.calculaJanela(200, 100, 400));
	}
	@Test
	public void b2b2b0(){
		assertEquals(200*100, JanelaC2.calculaJanela(200, 200, 0));
	}
	@Test
	public void b2b2b1(){
		assertEquals(300*100, JanelaC2.calculaJanela(200, 200, 100));
	}
	@Test
	public void b2b2b2(){
		assertEquals(400*100, JanelaC2.calculaJanela(200, 200, 200));
	}
	@Test
	public void b2b2b3(){
		assertEquals(200*100, JanelaC2.calculaJanela(200, 200, 400));
	}
	@Test
	public void b2b3b0(){
		assertEquals(0, JanelaC2.calculaJanela(200, 400, 0));
	}
	@Test
	public void b2b3b1(){
		assertEquals(100*100, JanelaC2.calculaJanela(200, 400, 100));
	}
	@Test
	public void b2b3b2(){
		assertEquals(200*100, JanelaC2.calculaJanela(200, 400, 200));
	}
	@Test
	public void b2b3b3(){
		assertEquals(200*100, JanelaC2.calculaJanela(200, 400, 400));
	}
	@Test
	public void b3b0b0(){
		assertEquals(200*100, JanelaC2.calculaJanela(400, 0, 0));
	}
	@Test
	public void b3b0b1(){
		assertEquals(100*100, JanelaC2.calculaJanela(400, 0, 100));
	}
	@Test
	public void b3b0b2(){
		assertEquals(0, JanelaC2.calculaJanela(400, 0, 200));
	}
	@Test
	public void b3b0b3(){
		assertEquals(200*100, JanelaC2.calculaJanela(400, 0, 400));
	}
	@Test
	public void b3b1b0(){
		assertEquals(100*100, JanelaC2.calculaJanela(400, 100, 0));
	}
	@Test
	public void b3b1b1(){
		assertEquals(200*100, JanelaC2.calculaJanela(400, 100, 100));
	}
	@Test
	public void b3b1b2(){
		assertEquals(100*100, JanelaC2.calculaJanela(400, 100, 200));
	}
	@Test
	public void b3b1b3(){
		assertEquals(200*100, JanelaC2.calculaJanela(400, 100, 400));
	}
	@Test
	public void b3b2b0(){
		assertEquals(0, JanelaC2.calculaJanela(400, 200, 0));
	}
	@Test
	public void b3b2b1(){
		assertEquals(100*100, JanelaC2.calculaJanela(400, 200, 100));
	}
	@Test
	public void b3b2b2(){
		assertEquals(200*100, JanelaC2.calculaJanela(400, 200, 200));
	}
	@Test
	public void b3b2b3(){
		assertEquals(200*100, JanelaC2.calculaJanela(400, 200, 400));
	}
	@Test
	public void b3b3b0(){
		assertEquals(200*100, JanelaC2.calculaJanela(400, 400, 0));
	}
	@Test
	public void b3b3b1(){
		assertEquals(200*100, JanelaC2.calculaJanela(400, 400, 100));
	}
	@Test
	public void b3b3b2(){
		assertEquals(200*100, JanelaC2.calculaJanela(400, 400, 200));
	}
	@Test
	public void b3b3b3(){
		assertEquals(400*100, JanelaC2.calculaJanela(400, 400, 400));
	}

}
