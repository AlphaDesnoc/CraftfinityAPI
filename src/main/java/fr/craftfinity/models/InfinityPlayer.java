package fr.craftfinity.models;

import lombok.Data;
import jakarta.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "infinityplayer")
public class InfinityPlayer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String playername;
    private String surname;

    @Column(columnDefinition = "UUID")
    private String uuid;

    @JoinColumn(name = "infinityrank.id")
    private int playerrank;
}
