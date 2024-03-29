package br.ufpb.dcx.abstractMethod;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TelaProjetoTeste {

	@Test
	void test() {
		TelaProjeto t = new TelaProjeto();
		t.setFabrica( new FabricaWindows());
		t.montar();
		t.desenhar();
		assertEquals("Janela Windows{menuWindows, botaoWindows}", t.desenhar());
		}
	
	@Test
	void test1() {
		TelaProjeto t = new TelaProjeto();
		t.setFabrica( new FabricaAndroid());
		t.montar();
		t.desenhar();
		assertEquals("Janela Android{menuAndroid, botaoAndroid}", t.desenhar());
		}

}
