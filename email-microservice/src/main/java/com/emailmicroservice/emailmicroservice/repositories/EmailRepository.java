package com.emailmicroservice.emailmicroservice.repositories;

import com.emailmicroservice.emailmicroservice.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository  extends JpaRepository<EmailModel, Long> {

}
