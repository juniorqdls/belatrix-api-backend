package pe.com.moneyexchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration;

@SpringBootApplication(exclude = MongoRepositoriesAutoConfiguration.class)
public class AppMoneyExchangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppMoneyExchangeApplication.class, args);
	}
}