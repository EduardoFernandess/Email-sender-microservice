package com.emailmicroservice.emailmicroservice.dtos;
import lombok.Data;
import javax.persistence.Column;

@Data
public class EmailDto {
    @NotBlank
    private String ownerRef;
    @NotBlank
    @Email
    private String emailFrom;
    @NotBlank
    @Email
    private String emailTo;
    @NotBlank
    private String subject;
    @NotBlank
    private String text;
}
