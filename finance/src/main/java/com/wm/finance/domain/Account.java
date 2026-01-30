package com.wm.finance.domain;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "accounts") // Define o nome exato da tabela
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Mapeia o AUTO_INCREMENT
    private Long id;

    @Column(nullable = false, length = 100) // Mapeia o NOT NULL e VARCHAR(100)
    private String name;

    @Column(length = 255)
    private String description;

    @CreationTimestamp // O Hibernate preenche isso automaticamente ao salvar
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp // O Hibernate atualiza isso automaticamente ao alterar
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}