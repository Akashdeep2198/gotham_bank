package com.gotham.accounts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDto {

    @NotNull(message = "Name cannot be null or empty")
    @Size(min = 5, max = 30, message = "The length of the customer name should be between 5 to 30")
    private String name;
    @NotNull(message = "Email cannot be null or empty")
    @Email(message = "Email address should be a valid value")
    private String email;
    @NotNull(message = "Mobile Number cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})",message = "Mobile number must be 10 digits")
    private String mobileNumber;
    private AccountsDto accountsDto;
}