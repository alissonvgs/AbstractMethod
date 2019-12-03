package br.ufpb.dcx.abstractMethod;

public class BotaoWindows implements Botao {
	private String botaoWindows = "botaoWindows";
	
	@Override
	public String desenhar() {
		return botaoWindows;
	}

}
