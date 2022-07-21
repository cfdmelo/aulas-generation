package Objeto_ListaInscritos;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import SubClasse_Exatas.Exatas;
import SubClasse_Humanas.Humanas;
import SubClasse_Saude.Saude;
import SuperClasse_FichaInscricao.fichainscricao;

public class listainscritos{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random random = new Random();

		Set<fichainscricao> lista = new HashSet<fichainscricao>();
		Saude inscrito1 = new Saude("Camila Freire de Melo", "123.123.123-12");
		Exatas inscrito2 = new Exatas("Joana Maria Barbosa", "123.321.213-11");
		Humanas inscrito3 = new Humanas("José Gabirel Alencar", "123.321.122-33");

		lista.add(inscrito1);
		lista.add(inscrito2);
		lista.add(inscrito3);

		System.out.println("--------------------------------------------------------------------------");
		System.out.println("-\t\t" + "        " + "BEM-VINDO - FACULDADE GEN" + "\t\t\t -");
		System.out.println("--------------------------------------------------------------------------");
		boolean x = true;
		while (x == true) {
			System.out.print(
					"Escolha uma opção: \n[1] Realizar inscrição \t[2] Área do inscrito \t[3] Lista de inscritos \n[4] Entrar em contato \t[5] Sair\n");
			int op = ler.nextInt();
			switch (op) {
			case 1:
				System.out.println("CPF: ");
				String CPF = ler.next();
				inscrito1.setCPF(CPF);
				System.out.println("ID:");
				String ID = ler.next();
				inscrito1.setID(ID);
				System.out.println("Órgão Expedidor:");
				String orgao = ler.next();
				inscrito1.setOrgaoexp(orgao);
				System.out.println("UF ID:");
				String UFID = ler.next();
				inscrito1.setUF(UFID);
				System.out.println("Nome da mãe: \n");
				inscrito1.setMae("Ivoneide Freire de Melo");
				inscrito1.getMae();
				System.out.println("Sexo: ");
				String sexo = ler.next();
				inscrito1.setSexo(sexo);
				System.out.println("Data nascimento: ");
				String data = ler.next();
				inscrito1.setDataNasc(data);
				System.out.println("Cor:");
				String cor = ler.next();
				inscrito1.setCor(cor);
				System.out.println("Estado Civil: ");
				String estadoCivil = ler.next();
				inscrito1.setEstadoCivil(estadoCivil);
				System.out.println("Nacionalidade: ");
				String nacionalidade = ler.next();
				inscrito1.setNacionalidade(nacionalidade);
				System.out.println("Município de nascimento:");
				String municipioNasc = ler.next();
				inscrito1.setMunicipioNascimento(municipioNasc);
				System.out.println("Nome Completo: ");
				inscrito1.setNomeCompleto("Camila Freire de Melo");
				inscrito1.getNomeCompleto();
				System.out.print(inscrito1.getCurso());
				System.out.println("\nCEP: ");
				String cep = ler.next();
				inscrito1.setCEP(cep);
				System.out.println("Endereço: ");
				inscrito1.setEndereco("Avenida Beberibe");
				inscrito1.getEndereco();
				System.out.println("Número do Endereço: ");
				String numEnd = ler.next();
				inscrito1.setNumEnd(numEnd);
				System.out.println("DDD do telefone: ");
				int ddd = ler.nextInt();
				inscrito1.setDDD(ddd);
				System.out.println("Telefone fixo: ");
				String telefixo = ler.next();
				inscrito1.setTelefone(telefixo);
				System.out.println("Celular: ");
				String cel = ler.next();
				inscrito1.setCelular(cel);
				System.out.println("Email: ");
				String email = ler.next();
				inscrito1.setEmail(email);
				System.out.println("Confirme seu email: ");
				String confiremail = ler.next();
				inscrito1.setEmail(confiremail);
				System.out.println("Você guarda os sábados por motios religiosos? \n[1] Sim   \t [2] Não");
				int religioso = ler.nextInt();
				if (religioso == 1) {
					inscrito1.setReligioso(true);
				} else
					inscrito1.setReligioso(false);
				inscrito1.getReligioso(" Não");
				System.out.println("Possui necessidade de outro atendimento específico \n[1] Sim \t[2] Não");
				int necessidade = ler.nextInt();
				if (necessidade == 1) {
					inscrito1.setNecessidade(true);
				} else
					inscrito1.setNecessidade(false);
				System.out.println("lingua estrangeira escolhida para realização da prova é: ");
				String lingua = ler.next();
				inscrito1.setLinguaEstrangeira(lingua);
				System.out.println("A cidade da prova é: ");
				String cidade = ler.next();
				inscrito1.setCidadeProva(cidade);
				inscrito1.formulario();
				break;
			case 2:
				System.out.println("Digite seu nome completo: ");
				String nome = ler.next();
				lista.contains(nome);
				if (lista.contains(nome) == true) {
					System.out.println("Olá  sua inscrição foi confirmada!");
					System.out.println("Número de inscrição: " + random.nextInt(10000));
				} else
					System.out.println("Você não está inscrito.");
				System.out.println("Entre no noso site e se inscreva!.");
				break;
			case 3:
				System.out.println("======================= LISTA DE INSCRITOS ============================");
				for (fichainscricao nome1 : lista) {
					System.out.println("Nome Completo: " + nome1);
				}
				System.out.println();
				System.out.println("Caso não esteja na lista, entre na nossa página e realize a inscrição!");
				break;
			case 4:
				System.out.println("Obrigada por entrar em contato!");
				System.out.println("Por favor, digite seu nome:");
				String novousuario = ler.next();
				System.out.println("Por favor, digite seu CPF:");
				String CPFnovousuario = ler.next();
				Humanas inscrito4 = new Humanas(novousuario, CPFnovousuario);
				lista.add(inscrito4);
				System.out.println("Parabéns, " + novousuario + " você está inscrito no nosso Vestibular!");
				System.out.println();
				System.out.println("Boa sorte!");
				System.out.println();
				break;
			case 5:
				x = false;
				System.out.println("Saindo...");
				break;
				default:
					System.out.println("Programa finalizado.");
			}
		}

	}
}