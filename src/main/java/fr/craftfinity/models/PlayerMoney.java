package fr.craftfinity.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "playermoney")
public final class PlayerMoney {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "infinitymoney.id")
    private int moneyid;
    @JoinColumn(name = "infinityplayer.id")
    private int infinityplayer;
    private float amount;

}
