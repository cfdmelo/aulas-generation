package SuperClasse_FichaInscricao;

public class fichainscricao {
//[ATRIBUTOS:]
	private String nomeCompleto;
	private String CPF;
	private String ID;
	private String UF;
	private String mae;
	private String orgaoexp;
	private String dataNasc;
	private String endereco;
	private String curso;
	private String sexo;
	private String cor;
	private String nacionalidade;
	private String municipioNascimento;
	private String CEP;
	private String numEnd;
	private String telefone;
	private String celular;
	private String email;
	private String linguaEstrangeira;
	private String cidadeProva;
	private String estadoCivil;
	private int DDD;
	private boolean religioso;
	private boolean necessidade;

// MÉTODO CONSTRUTOR:
	public fichainscricao(String nomeCompleto, String CPF) {
		this.nomeCompleto = nomeCompleto;
		this.CPF = CPF;
	}

// MÉTODOS [SOBRECARGA]
	public void formulario() {
		System.out.println("\t--------------------------------------------------------------------------");
		System.out.println("\t-\t\t" + "    " + "FICHA DE INSCRIÇÃO - FACULDADE GEN" + "\t\t\t -");
		System.out.println("\t--------------------------------------------------------------------------");
		System.out.println("\t__________________________________________________________________________");
		System.out.println("\t[DADOS PESSOAIS] =========================================================");
		System.out.println("\tNúmero do CPF: " + this.CPF);
		System.out.println("\tNº da Identidade: " + this.ID + " \t\tÓrgão expedidor: " + this.orgaoexp + " \t\tUF: " + this.UF);
		System.out.println("\tNome da mãe: " + this.mae);
		System.out.println("\tSexo: " + this.sexo + "\t\t\tData de nascimento: " + this.dataNasc);
		System.out.println("\tCor/ Raça: " + this.cor + "\t\tEstado civil: " + this.estadoCivil);
		System.out.println("\tNacionalidade: " + this.nacionalidade);
		System.out.println("\tMunicípio de nascimento: " + this.municipioNascimento);
		System.out.println("\tNome completo: " + this.nomeCompleto);
		System.out.println("\tCurso: " + this.curso);
		System.out.println("\t__________________________________________________________________________");
		System.out.println("\t[ENDEREÇO] ===============================================================");
		System.out.println("\tCEP: " + this.CEP);
		System.out.println("\tEndereço: " + this.endereco + "\tNúmero: " + this.numEnd);
		System.out.println("\t__________________________________________________________________________");
		System.out.println("\t[CONTATO] ================================================================");
		System.out.println("\tDDD: " + this.DDD + "\t\t\t\tTelfone fixo: " + this.telefone);
		System.out.println("\tDDD: " + this.DDD + "\t\t\t\tCelular: " + this.celular);
		System.out.println("\tConfirme o DDD: " + this.DDD + "\t\tConfirme o Celular: " + this.celular);
		System.out.println("\tEmail: " + this.email);
		System.out.println("\tConfirme o email: " + this.email);
		System.out.println("\t__________________________________________________________________________");
		System.out.println("\t[ATENDIMENTO ESPECÍFICO] =================================================");
		System.out.println("\tVocê guarda os sábados por motios religiosos? " + this.religioso);
		System.out.println("\tPossui necessidade de outro atendimento específico? " + this.necessidade);
		System.out.println("\t__________________________________________________________________________");
		System.out.println("\t[INFORMAÇÕES DE PROVA] ===================================================");
		System.out.println("\tA lingua estrangeira escolhida para realização da prova é: " + this.linguaEstrangeira);
		System.out.println("\tA cidade da prova é: " + this.cidadeProva);
		System.out.println("\t__________________________________________________________________________");
		System.out.println("\t--------------------------------------------------------------------------");
		System.out.println("\t-\t\t" + "                                   " + "" + "\t\t\t -");
		System.out.println("\t--------------------------------------------------------------------------");
	}

//MÉTODOS

	public String toString() {
		return nomeCompleto;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public String getOrgaoexp() {
		return orgaoexp;
	}

	public void setOrgaoexp(String orgaoexp) {
		this.orgaoexp = orgaoexp;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getNumEnd() {
		return numEnd;
	}

	public void setNumEnd(String numEnd) {
		this.numEnd = numEnd;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLinguaEstrangeira() {
		return linguaEstrangeira;
	}

	public void setLinguaEstrangeira(String linguaEstrangeira) {
		this.linguaEstrangeira = linguaEstrangeira;
	}

	public String getCidadeProva() {
		return cidadeProva;
	}

	public void setCidadeProva(String cidadeProva) {
		this.cidadeProva = cidadeProva;
	}

	public int getDDD() {
		return DDD;
	}

	public void setDDD(int dDD) {
		DDD = dDD;
	}

	public boolean getReligioso(String string) {
		return religioso;
	}

	public void setReligioso(boolean religioso) {
		this.religioso = religioso;
	}

	public boolean getNecessidade(String string) {
		return necessidade;
	}

	public void setNecessidade(boolean necessidade) {
		this.necessidade = necessidade;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getMunicipioNascimento() {
		return municipioNascimento;
	}

	public void setMunicipioNascimento(String municipioNascimento) {
		this.municipioNascimento = municipioNascimento;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

}
