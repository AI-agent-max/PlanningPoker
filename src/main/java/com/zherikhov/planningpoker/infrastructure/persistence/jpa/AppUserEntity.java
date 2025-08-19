package com.zherikhov.planningpoker.infrastructure.persistence.jpa;

import jakarta.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "app_user")
public class AppUserEntity {
    @Id
    private String id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    @Column(name = "display_name", nullable = false)
    private String displayName;

    @Column(nullable = false)
    private String role;

    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private OffsetDateTime updatedAt;

    public AppUserEntity() {
    }

    public AppUserEntity(String id, String email, String passwordHash, String displayName, String role, OffsetDateTime createdAt, OffsetDateTime updatedAt) {
        this.id = id;
        this.email = email;
        this.passwordHash = passwordHash;
        this.displayName = displayName;
        this.role = role;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getRole() {
        return role;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }
}
