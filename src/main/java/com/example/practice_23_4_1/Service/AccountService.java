package com.example.practice_23_4_1.Service;

import com.example.practice_23_4_1.DTO.ReqSignUpDTO;
import com.example.practice_23_4_1.Entity.Account;
import com.example.practice_23_4_1.Repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    public Long saveAccount(ReqSignUpDTO reqSignUpDTO) {


        Account account = Account.builder()
                .name(reqSignUpDTO.getName())
                .password(reqSignUpDTO.getPassword())
                .build();
        accountRepository.save(account);
        return account.getId();
    }
}