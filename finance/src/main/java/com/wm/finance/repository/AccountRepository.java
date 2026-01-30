package com.wm.finance.repository;

import com.wm.finance.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    // O Spring Data JPA já cria os métodos save, findAll, delete, etc.

    // Como você criou um índice por nome (idx_name), é provável que queira buscar por nome:
    boolean existsByName(String name);
}