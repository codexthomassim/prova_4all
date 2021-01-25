import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesafioDois {
	
	@Test
	public void exibirCategorias() {
		WebDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://shopcart-challenge.4all.com/");
		driverChrome.findElement(By.id("open-categories-btn")).click();
		driverChrome.quit();
	}
	
	@Test
	public void selecionarCategoriasBebidas() {
		WebDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://shopcart-challenge.4all.com/");
		driverChrome.findElement(By.id("open-categories-btn")).click();
		driverChrome.findElement(By.id("category-0")).click();
		driverChrome.quit();
	}
	
	@Test
	public void adicionarBebidasCarrinho() {
		WebDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://shopcart-challenge.4all.com/");
		driverChrome.findElement(By.id("open-categories-btn")).click();
		driverChrome.findElement(By.id("category-0")).click();
		driverChrome.findElement(By.id("add-product-0-btn")).click();
		driverChrome.findElement(By.id("add-product-1-btn")).click();
		driverChrome.findElement(By.id("add-product-2-btn")).click();
		driverChrome.quit();
	}
	
	@Test
	public void acessarCategoriaTodos() {
		WebDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://shopcart-challenge.4all.com/");
		driverChrome.findElement(By.id("open-categories-btn")).click();
		driverChrome.findElement(By.id("category-0")).click();
		driverChrome.findElement(By.id("add-product-0-btn")).click();
		driverChrome.findElement(By.id("add-product-1-btn")).click();
		driverChrome.findElement(By.id("add-product-2-btn")).click();
		driverChrome.findElement(By.id("open-categories-btn")).click();
		driverChrome.findElement(By.id("category-all")).click();
		driverChrome.quit();
	}
	
	@Test
	public void adicionarRissole() {
		WebDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://shopcart-challenge.4all.com/");
		driverChrome.findElement(By.id("open-categories-btn")).click();
		driverChrome.findElement(By.id("category-0")).click();
		driverChrome.findElement(By.id("add-product-0-btn")).click();
		driverChrome.findElement(By.id("add-product-1-btn")).click();
		driverChrome.findElement(By.id("add-product-2-btn")).click();
		driverChrome.findElement(By.id("open-categories-btn")).click();
		driverChrome.findElement(By.id("category-all")).click();
		driverChrome.findElement(By.id("add-product-3-btn")).click();
		driverChrome.quit();
	}
	
	@Test
	public void acessarCarrinho() {
		WebDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://shopcart-challenge.4all.com/");
		driverChrome.findElement(By.id("open-categories-btn")).click();
		driverChrome.findElement(By.id("category-0")).click();
		driverChrome.findElement(By.id("add-product-0-btn")).click();
		driverChrome.findElement(By.id("add-product-1-btn")).click();
		driverChrome.findElement(By.id("add-product-2-btn")).click();
		driverChrome.findElement(By.id("open-categories-btn")).click();
		driverChrome.findElement(By.id("category-all")).click();
		driverChrome.findElement(By.id("add-product-3-btn")).click();
		driverChrome.findElement(By.id("cart-btn")).click();
		driverChrome.quit();
	}
	
	@Test
	public void aumentarQntRissoles() {
		int count = 0;
		WebDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://shopcart-challenge.4all.com/");
		driverChrome.findElement(By.id("open-categories-btn")).click();
		driverChrome.findElement(By.id("category-0")).click();
		driverChrome.findElement(By.id("add-product-0-btn")).click();
		driverChrome.findElement(By.id("add-product-1-btn")).click();
		driverChrome.findElement(By.id("add-product-2-btn")).click();
		driverChrome.findElement(By.id("open-categories-btn")).click();
		driverChrome.findElement(By.id("category-all")).click();
		driverChrome.findElement(By.id("add-product-3-btn")).click();
		driverChrome.findElement(By.id("cart-btn")).click();
			do {
				driverChrome.findElement(By.id("add-product-3-qtd")).click();
				count++;
			}while(count<10);
		driverChrome.quit();
	}
	
	@Test
	public void diminuirQntRissoles() {
		int count = 0;
		WebDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://shopcart-challenge.4all.com/");
		driverChrome.findElement(By.id("open-categories-btn")).click();
		driverChrome.findElement(By.id("category-0")).click();
		driverChrome.findElement(By.id("add-product-0-btn")).click();
		driverChrome.findElement(By.id("add-product-1-btn")).click();
		driverChrome.findElement(By.id("add-product-2-btn")).click();
		driverChrome.findElement(By.id("open-categories-btn")).click();
		driverChrome.findElement(By.id("category-all")).click();
		driverChrome.findElement(By.id("add-product-3-btn")).click();
		driverChrome.findElement(By.id("cart-btn")).click();
			do {
				driverChrome.findElement(By.id("add-product-3-qtd")).click();
				count++;
			}while(count<10);
			
			do {
				driverChrome.findElement(By.id("remove-product-3-qtd")).click();
				count++;
			}while(count<6);
		driverChrome.quit();
	}
	
	@Test
	public void finalizarCompra() {
		int count = 0;
		WebDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://shopcart-challenge.4all.com/");
		driverChrome.findElement(By.id("open-categories-btn")).click();
		driverChrome.findElement(By.id("category-0")).click();
		driverChrome.findElement(By.id("add-product-0-btn")).click();
		driverChrome.findElement(By.id("add-product-1-btn")).click();
		driverChrome.findElement(By.id("add-product-2-btn")).click();
		driverChrome.findElement(By.id("open-categories-btn")).click();
		driverChrome.findElement(By.id("category-all")).click();
		driverChrome.findElement(By.id("add-product-3-btn")).click();
		driverChrome.findElement(By.id("cart-btn")).click();
			do {
				driverChrome.findElement(By.id("add-product-3-qtd")).click();
				count++;
			}while(count<10);
			
			do {
				driverChrome.findElement(By.id("remove-product-3-qtd")).click();
				count++;
			}while(count<6);
			driverChrome.findElement(By.id("finish-checkout-button")).click();
		driverChrome.quit();
	}
	
	@Test
	public void fecharModal() {
		int count = 0;
		WebDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://shopcart-challenge.4all.com/");
		driverChrome.findElement(By.id("open-categories-btn")).click();
		driverChrome.findElement(By.id("category-0")).click();
		driverChrome.findElement(By.id("add-product-0-btn")).click();
		driverChrome.findElement(By.id("add-product-1-btn")).click();
		driverChrome.findElement(By.id("add-product-2-btn")).click();
		driverChrome.findElement(By.id("open-categories-btn")).click();
		driverChrome.findElement(By.id("category-all")).click();
		driverChrome.findElement(By.id("add-product-3-btn")).click();
		driverChrome.findElement(By.id("cart-btn")).click();
			do {
				driverChrome.findElement(By.id("add-product-3-qtd")).click();
				count++;
			}while(count<10);
			
			do {
				driverChrome.findElement(By.id("remove-product-3-qtd")).click();
				count++;
			}while(count<6);
			driverChrome.findElement(By.id("finish-checkout-button")).click();
		driverChrome.quit();
	}
	
}
