package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import driver.Driver;

public class Metodos extends Driver {

	String TituloEsperado = "Products";
	String msgErroSenha = "Epic sadface: Password is required";
	String msgUserNameErro = "Epic sadface: Username is required";
	

	public void escrever(By elemento, String texto) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void clicar(By elemento, String passo) {

		driver.findElement(elemento).click();

	}

	public void validarTituloProd(By elemento, String tituloEsperado) {
		assertEquals(tituloEsperado, driver.findElement(elemento).getText());

	}

	public void validarMsgSenha(By elemento, String msgErroSenha) {
		assertEquals(msgErroSenha, driver.findElement(elemento).getText());

	}

	public void validaMsgUserNameErro(By elemento, String msgUserNameErro) {
		assertEquals(msgUserNameErro, driver.findElement(elemento).getText());
	}
    
	public void validaMsg(String msgEsperada) {
		
		if(msgEsperada.equals(TituloEsperado)) {
			
		}else if(msgEsperada.equals(msgErroSenha)) {
			
		}else{
			assertEquals(msgEsperada, msgUserNameErro);
			
		}
		
		
		
		
		
		
		
	}
		
		
	
    

}
