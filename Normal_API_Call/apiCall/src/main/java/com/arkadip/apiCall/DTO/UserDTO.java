package com.arkadip.apiCall.DTO;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserDTO {

    @NotBlank(message = "User Name Cannot Be Blank")
    String name;

    @Min(value = 10, message = "User Should not be less than 10 and access the API")
    @Max(value = 90, message = "User Should not be great than 90 and access the API")
    Integer age;

    @NotBlank(message = "Sex Cannot Be Blank")
    String sex;
}
