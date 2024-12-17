package it.epicode.esercizi_U2.W1.D1.BE.configurations;

import it.epicode.esercizi_U2.W1.D1.BE.entities.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class PizzaConfiguration {

    @Bean
    Pizza newPizzaMargherita() {
        Pizza pizza = new Pizza();
        pizza.setNome("Margherita");
        pizza.setCalorie(1104);
        pizza.setPrezzo(5.0);
        return pizza;
    }

    @Bean
    Pizza newPizzaHawaaiiana() {
        Pizza pizza = new Pizza();
        pizza.setNome("Hawaaiiana");
        pizza.setCalorie(1024);
        pizza.setPrezzo(6.50);
        return pizza;
    }

    @Bean
    Pizza newPizzaSalame() {
        Pizza pizza = new Pizza();
        pizza.setNome("Salame");
        pizza.setCalorie(1160);
        pizza.setPrezzo(6.0);
        return pizza;
    }


}
