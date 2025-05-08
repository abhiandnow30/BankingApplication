package net.javaguides.banking_app.service.impl;

import net.javaguides.banking_app.dto.AccountDto;
import net.javaguides.banking_app.entity.Account;
import net.javaguides.banking_app.mapper.AccountMapper;
import net.javaguides.banking_app.repository.AccountRepository;
import net.javaguides.banking_app.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class AccountServiceImpl implements AccountService {


        private AccountRepository accountRepository;
            @Autowired
        public AccountServiceImpl(AccountRepository accountRepository) {
            this.accountRepository = accountRepository;
        }

        @Override
        public AccountDto createAccount(AccountDto accountDto) {
            Account account= AccountMapper.mapToAccount(accountDto);
            Account savedAccount=accountRepository.save(account);
            return AccountMapper.mapToAccountDto(savedAccount);
        }

        @Override
        public AccountDto getAccountById(Long id) {Account account= accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account does not exists"));
            return AccountMapper.mapToAccountDto(account);
        }
    }

