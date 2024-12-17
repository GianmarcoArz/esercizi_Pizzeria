package it.epicode.esercizi_U2.W1.D1.BE.configurations;

import it.epicode.esercizi_U2.W1.D1.BE.entities.Pizza;
import it.epicode.esercizi_U2.W1.D1.BE.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToppingConfiguration {

    @Bean
    Topping newToppingCheese() {
        Topping topping= new Topping();
        topping.setNome("Cheese");
        topping.setCalorie(92);
        topping.setPrezzo(0.70);
      return topping;
    }

    @Bean
    Topping newToppingHam() {
        Topping topping= new Topping();
        topping.setNome("Ham");
        topping.setCalorie(35);
        topping.setPrezzo(1.0);
      return topping;
    }

    @Bean
    Topping newToppingOnions() {
        Topping topping= new Topping();
        topping.setNome("Onions");
        topping.setCalorie(22);
        topping.setPrezzo(0.70);
      return topping;
    }

    @Bean
    Topping newToppingPinapple() {
        Topping topping= new Topping();
        topping.setNome("Pineapple");
        topping.setCalorie(24);
        topping.setPrezzo(0.80);
      return topping;
    }

    @Bean
    Topping newToppingSalami() {
        Topping topping= new Topping();
        topping.setNome("Salame Topping");
        topping.setCalorie(86);
        topping.setPrezzo(1.0);
      return topping;
    }
}
