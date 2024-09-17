package fr.craftfinity.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "plugins")
public class Plugin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("pluginId")
    @Column(unique = true, nullable = false)
    private String pluginid;

    @JsonProperty("secretKey")
    @Column(nullable = false)
    private String secret_key;
}