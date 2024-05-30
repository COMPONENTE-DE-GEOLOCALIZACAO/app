package enums;

public enum LocationEnum {
	EXIBIR_LOCALIZAÇÃO_COMPLETA(1,"Exibir localização completa"),
	EXBIR_CIDADE(2,"Exibir cidade"),
	EXIBIR_ESTADO(3,"Exibir estado"),
	EXIBIR_PAÍS(4, "Exibir País"),
	EXIBIR_COORDENADAS_APROXIMADAS(5,"Exibir coordenadas aproximadas"),
	SAIR(6, "Sair");
	
	
	private int codigo;
	private String descricao;
	
	
	private LocationEnum(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String obterDescricaoCompleta() {
		return codigo +"-"+descricao;
	}


	public static LocationEnum valueOfCodigo(int codigo) {
		for(LocationEnum opcao : LocationEnum.values()) {
			if(opcao.codigo==codigo) {
				return opcao;
			}
		}
		throw new IllegalArgumentException(LocationEnum.class.getClass().getName() + "-" + codigo + " nao encontrado"
				);
	}
}
