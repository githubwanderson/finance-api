package com.wm.finance.service;

import com.wm.finance.domain.Account;
import java.util.List;

public interface AccountService {
    Account save(Account account);
    List<Account> findAll();
    Account findById(Long id);
}