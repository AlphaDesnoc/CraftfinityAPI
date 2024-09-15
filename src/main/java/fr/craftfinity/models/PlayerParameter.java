package fr.craftfinity.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "playerparameter")
public final class PlayerParameter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "infinityplayer.id")
    private int infinityplayer;
    private String parametername;
    private boolean status;

}
