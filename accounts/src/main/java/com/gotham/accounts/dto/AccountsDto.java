package com.gotham.accounts.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {

    @NotNull(message = "Account Number cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})",message = "Account number must be 10 digits")
    private Long accountNumber;
    @NotNull(message = "AccountType cannot be null or empty")
    private String accountType;
    @NotNull(message = "BranchAddress cannot be null or empty")
    private String branchAddress;
}
