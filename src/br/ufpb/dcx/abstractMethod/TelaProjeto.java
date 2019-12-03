package br.ufpb.dcx.abstractMethod;

public class TelaProjeto {

	private FabricaAbstrata fabricaAbstrata;
	private Janela janela;
	private Menu menu;
	private Botao botao;

	public void setFabrica(FabricaAbstrata fabricaAbstrata) {
		this.fabricaAbstrata = fabricaAbstrata;

	}

	public void montar() {
		janela = this.fabricaAbstrata.criarJanela();
		menu = this.fabricaAbstrata.criarMenu();
		botao = this.fabricaAbstrata.criarBotao();

	}

	public String desenhar() {
		return janela.desenhar() + "{" + menu.desenhar() + ", " + botao.desenhar() + "}";
	}
}
