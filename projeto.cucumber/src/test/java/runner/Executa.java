package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import driver.Driver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "steps",
		dryRun = false,
		tags = "@positivo",
		monochrome = false,
		plugin = {"pretty", "html:target/cucumber-report.html"}
		)




public class Executa extends Driver{

	
	
	//Método responsável por abrir o Navegador Chrome ou Edge de acordo com o valor da variável navegador.  	
    public static void abrirNavegador() {
    	String site = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    	String navegador = "Chrome";
    	
    	
    	if(navegador.equalsIgnoreCase("Chrome")) {
    		WebDriverManager.chromedriver().setup();
    		driver = new ChromeDriver();
    				
    	}else {
    		WebDriverManager.edgedriver().setup();
    		driver = new EdgeDriver();
      	}
    	driver.get(site);
    	driver.manage().window().maximize();
    	
    	}
        
	   public static void fecharNavegador () {
		   //driver.quit();
		   
	   }
	
	
	
	
}

