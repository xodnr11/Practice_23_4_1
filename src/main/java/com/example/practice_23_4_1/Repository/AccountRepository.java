package com.example.practice_23_4_1.Repository;

import com.example.practice_23_4_1.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {

}
