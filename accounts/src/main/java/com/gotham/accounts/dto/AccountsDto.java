package com.gotham.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @NotNull(message = "Account Number cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})",message = "Account number must be 10 digits")
    private Long accountNumber;
    @NotNull(message = "AccountType cannot be null or empty")
    private String accountType;
    @NotNull(message = "BranchAddress cannot be null or empty")
    private String branchAddress;
}
