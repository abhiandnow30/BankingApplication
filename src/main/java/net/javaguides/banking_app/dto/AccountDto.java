package net.javaguides.banking_app.dto;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor

public class AccountDto {
    private long id;
    private String accountHolderName;
    private double balance;

    // 🔧 Add this custom constructor
    public AccountDto(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;

    }


}
