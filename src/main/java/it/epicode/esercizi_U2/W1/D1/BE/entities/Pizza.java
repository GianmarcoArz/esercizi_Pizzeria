package it.epicode.esercizi_U2.W1.D1.BE.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="pizze")
public class Pizza extends Menu {

}
