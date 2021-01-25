import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DesafioUm {
		
	@Test
	public void exibirCategorias() {
		WebDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://shopcart-challenge.4all.com/");
		driverChrome.findElement(By.id("open-categories-btn")).click();
		driverChrome.quit();
	}
	
	@Test
	public void selecionarCategoriaDoces() {
		WebDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://shopcart-challenge.4all.com/");
		driverChrome.findElement(By.id("open-categories-btn")).click();
		driverChrome.findElement(By.id("category-1")).click();
		driverChrome.quit();
	}
	
	@Test
	public void adicionarDocesCarrinho() {
		WebDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://shopcart-challenge.4all.com/");
		driverChrome.findElement(By.id("open-categories-btn")).click();
		driverChrome.findElement(By.id("category-1")).click();
		driverChrome.findElement(By.id("add-product-4-btn")).click();
		driverChrome.findElement(By.id("add-product-5-btn")).click();
		driverChrome.quit();
	}
	
	@Test
	public void acessarCategoriaTodos() {
		WebDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://shopcart-challenge.4all.com/");
		driverChrome.findElement(By.id("open-categories-btn")).click();
		driverChrome.findElement(By.id("category-1")).click();
		driverChrome.findElement(By.id("add-product-4-btn")).click();
		driverChrome.findElement(By.id("add-product-5-btn")).click();
		driverChrome.findElement(By.id("open-categories-btn")).click();
		driverChrome.findElement(By.id("category-all")).click();
		driverChrome.quit();
	}
	
	@Test
	public void acessarCarrinho() {
		WebDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://shopcart-challenge.4all.com/");
		driverChrome.findElement(By.id("open-categories-btn")).click();
		driverChrome.findElement(By.id("category-1")).click();
		driverChrome.findElement(By.id("add-product-4-btn")).click();
		driverChrome.findElement(By.id("add-product-5-btn")).click();
		driverChrome.findElement(By.id("open-categories-btn")).click();
		driverChrome.findElement(By.id("category-all")).click();
		driverChrome.findElement(By.id("cart-btn")).click();
		driverChrome.quit();
	}
	
	@Test
	public void adicionarBrigadeiro() {
		int count = 0;
		WebDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://shopcart-challenge.4all.com/");
		driverChrome.findElement(By.id("open-categories-btn")).click();
		driverChrome.findElement(By.id("category-1")).click();
		driverChrome.findElement(By.id("add-product-4-btn")).click();
		driverChrome.findElement(By.id("add-product-5-btn")).click();
		driverChrome.findElement(By.id("open-categories-btn")).click();
		driverChrome.findElement(By.id("category-all")).click();
		driverChrome.findElement(By.id("cart-btn")).click();
			do {
				driverChrome.findElement(By.id("add-product-4-qtd")).click();
				count++;
			}while(count<5);
		driverChrome.quit();
	}
	
	@Test
	public void finalizarCompra() {
		int count = 0;
		WebDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://shopcart-challenge.4all.com/");
		driverChrome.findElement(By.id("open-categories-btn")).click();
		driverChrome.findElement(By.id("category-1")).click();
		driverChrome.findElement(By.id("add-product-4-btn")).click();
		driverChrome.findElement(By.id("add-product-5-btn")).click();
		driverChrome.findElement(By.id("open-categories-btn")).click();
		driverChrome.findElement(By.id("category-all")).click();
		driverChrome.findElement(By.id("cart-btn")).click();
			do {
				driverChrome.findElement(By.id("add-product-4-qtd")).click();
				count++;
			}while(count<5);
		driverChrome.findElement(By.id("finish-checkout-button")).click();
		driverChrome.quit();
	}
	
}



