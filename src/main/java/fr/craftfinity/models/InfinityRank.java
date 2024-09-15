package fr.craftfinity.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "infinityrank")
public class InfinityRank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rankname;
    private String prefix;
    private String description;
}