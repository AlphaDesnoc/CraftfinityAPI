package fr.craftfinity.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "playerpermission")
public final class PlayerPermission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "infinityplayer.id")
    private int infinityplayer;
    @JoinColumn(name = "infinitypermission.id")
    private int permissionid;

}
