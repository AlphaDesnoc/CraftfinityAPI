package fr.craftfinity.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "playergroups")
public final class PlayerGroups {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "infinitygroup.id")
    private int groupid;
    @JoinColumn(name = "infinityplayer.id")
    private int infinityplayer;

}
