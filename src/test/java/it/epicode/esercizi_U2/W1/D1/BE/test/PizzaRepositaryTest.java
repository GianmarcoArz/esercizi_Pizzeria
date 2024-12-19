package it.epicode.esercizi_U2.W1.D1.BE.test;

import it.epicode.esercizi_U2.W1.D1.BE.entities.Pizza;
import it.epicode.esercizi_U2.W1.D1.BE.repository.PizzaRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PizzaRepositaryTest
{
    @Autowired
    private PizzaRepository pizzaRepository;

    @Test
    @DisplayName("Test per il salvataggio di una Pizza")
    void testSavePizza() {
        Pizza pizza = new Pizza();
        pizza.setNome("Test Pizza");
        pizza.setCalorie(1000);
        pizza.setPrezzo(10.0);

        Pizza savedPizza = pizzaRepository.save(pizza);
        assertNotNull(savedPizza.getId(), "L'ID della pizza salvata non dovrebbe essere nullo");
    }
}
