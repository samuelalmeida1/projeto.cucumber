package elemento;

import org.openqa.selenium.By;

public class Elementos {
	private By userName = By.xpath("//input[@name='username']]");
	private By password = By.xpath("//input[@type='password']");
	private By login = By.xpath("//button[@type='submit']");
	private By tituloProd = By.xpath("//div[@class='product_label']");
	private By msgSenha = By.xpath("(//h3[@data-test='error']) [1]");
	private By msgUserName = By.xpath("//h3[@data-test='error']");
	private By clicarProduto = By.xpath("(//div[@class='inventory_item_name']) [3]");
	private By incluirNoCarrinho = By.xpath("//button[@class='btn_primary btn_inventory']");
	private By visualizarCarrinho = By.xpath("//div[@id='shopping_cart_container']");
	
	
	
	

	public By getPassword() {
		return password;
	}

	public By getLogin() {
		return login;
	}

	public By getTituloProd() {
		return tituloProd;
	}

	public By getMsgUserName() {
		return msgUserName;
	}

	public By getMsgSenha() {
		return msgSenha;
	}

	public By getIncluirNoCarrinho() {
		return incluirNoCarrinho;
	}

	public By getClicarProduto() {
		return clicarProduto;
	}

	public By getVisualizarCarrinho() {
		return visualizarCarrinho;
	}

	public By getUserName() {
		return userName;
	}

	


	
	
}
