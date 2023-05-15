package com.emailmicroservice.emailmicroservice.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Data
@Entity
@Table(name = "TB_EMAIL")
public class EmailModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emailId;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    @Column(columnDefinition = "TEXT");
    private String text;
    private LocalDateTime sendDateEmail;
    private statusEmail statusEmail;

}
