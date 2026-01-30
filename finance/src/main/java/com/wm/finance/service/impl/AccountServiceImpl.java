package com.wm.finance.service.impl;

import com.wm.finance.domain.Account;
import com.wm.finance.repository.AccountRepository;
import com.wm.finance.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository repository;

    @Override
    public Account save(Account account) {
        // Regra de exemplo: Não permitir contas com o mesmo nome
        if (repository.existsByName(account.getName())) {
            throw new RuntimeException("Já existe uma conta com este nome.");
        }
        return repository.save(account);
    }

    @Override
    public List<Account> findAll() {
        return repository.findAll();
    }

    @Override
    public Account findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Conta não encontrada"));
    }
}