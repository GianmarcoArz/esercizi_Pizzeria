package it.epicode.esercizi_U2.W1.D1.BE.repository;

import it.epicode.esercizi_U2.W1.D1.BE.entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu,Long> {
}
