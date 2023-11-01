package dados;

public enum Categoria {

	ACT("Acao"),

	STR("Estrategia"),

	SIM("Simulacao");

	private String nome;

	public static Categoria testaCategoria(String nome){
		if (nome.equalsIgnoreCase("Acao")){
			return ACT;

		} else if (nome.equalsIgnoreCase("Estrategia")){
			return STR;

		} else if (nome.equalsIgnoreCase("Simulacao")){
			return SIM;

		} else {
			return null;
		}
	}

	private Categoria(String nome) {
     this.nome=nome;
	}

	public String getNome() {
		return nome;
	}


}
