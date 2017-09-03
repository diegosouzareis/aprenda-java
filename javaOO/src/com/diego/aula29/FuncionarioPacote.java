package com.diego.aula29;

public class FuncionarioPacote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario c = new Funcionario();
		//c.nome não recupera variavel
		c.getNome(); //recupera a variavel
		String nome = (String) c.setNome("diego");//Setamos um valor para a variavel
		System.out.println(nome);

	}

}
