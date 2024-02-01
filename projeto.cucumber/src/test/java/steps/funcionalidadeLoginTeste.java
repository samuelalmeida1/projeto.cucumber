package steps;


import elemento.Elementos;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class funcionalidadeLoginTeste {
		
	
	Metodos metodos = new Metodos();
	Elementos element = new Elementos();
	
	
	
	//FECHAR NAVEGADOR
	@After  
	public void finalizarTeste() {
		Executa.fecharNavegador();
		
	}
	
	//*******************************************************************
	
	//LOGIN VALIDO
	
	@Given("que esteja na tela de login")
	public void que_esteja_na_tela_de_login() {
	    Executa.abrirNavegador();
	}

	@When("coloco os dados de login")
	public void coloco_os_dados_de_login() {
	   metodos.escrever(element.getUserName(), "Admin");
	   metodos.escrever(element.getPassword(), "admin123");
	   metodos.clicar(element.getLogin(), null);
	
	}

	@Then("o login sera realizado com sucesso")
	public void o_login_sera_realizado_com_sucesso() {
	    metodos.validarTituloProd(element.getTituloProd(), "Products");
	}

		
    //SENHA NÃO PREENCHIDA
	@When("preencho o user name")
	public void preencho_o_user_name() {
	    metodos.escrever(element.getUserName(), "standard_user");
	}

	@When("não preencho a senha")
	public void não_preencho_a_senha() {
	    metodos.escrever(element.getPassword(), "");
	}

	@When("clico no botão de login")
	public void clico_no_botão_de_login() {
	    metodos.clicar(element.getLogin(), null);
	}

	@Then("login não sera realisado com sucesso")
	public void login_não_sera_realisado_com_sucesso() {
	    metodos.validarMsgSenha(element.getMsgSenha(), "Epic sadface: Password is required");
	}
	
	
	//USUARIO NÃO PREENCHIDO
	@When("não preencho o usuario")
	public void não_preencho_o_usuario() {
	   metodos.escrever(element.getUserName(), "");
	}

	@When("preencho a senha")
	public void preencho_a_senha() {
	    metodos.escrever(element.getPassword(), "secret_sauc");
	}

	@Then("login não sera realizado com sucesso")
	public void login_não_sera_realizado_com_sucesso() {
	    metodos.validaMsgUserNameErro(element.getMsgUserName(), "Epic sadface: Username is required");
	}
		
	
	
	//ADICIONAR PRODUTO NO CARRINHO
	@When("seleciono o produto")
	public void seleciono_o_produto() {
	    metodos.clicar(element.getClicarProduto(), null);
	}

	@When("clico em adicionar ao carrinho")
	public void clico_em_adicionar_ao_carrinho() {
	    metodos.clicar(element.getIncluirNoCarrinho(), null);
	}

	@When("clico em vizualizar no carrinho")
	public void clico_em_vizualizar_no_carrinho() {
	    metodos.clicar(element.getVisualizarCarrinho(), null);
	}

	@Then("o produto foi adicionado com sucesso")
	public void o_produto_foi_adicionado_com_sucesso() {
	    
	}
		
	
	
	//SCHEMA
	@When("informar o usuario {string}")
	public void informar_o_usuario(String usuario) {
		metodos.escrever(element.getUserName(), usuario);
	}

	@When("informar a senha {string}")
	public void informar_a_senha(String senha) {
		 metodos.escrever(element.getPassword(), senha);
		 metodos.clicar(element.getLogin(), null);
	}

	@Then("validar mensagem {string}")
	public void validar_mensagem(String mensagem) {
	    metodos.validaMsg(mensagem);
	}
	

	
	
	
	
	
	
		
}		
		
		
		
		
		
		