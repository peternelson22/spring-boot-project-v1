package com.nelson.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String otherName;
    private String title;
    private String initials;
    private String ninNumber;
    private String gender;
    private String maritalStatus;

    @ManyToOne
    @JoinColumn(name = "countryid", updatable = false, insertable = false)
    private Country country;
    private Long countryid;

    @ManyToOne
    @JoinColumn(name = "stateid", updatable = false, insertable = false)
    private State state;
    private Long stateid;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;
    private String city;
    private String address;
    private String phone;
    private String mobile;
    private String email;
    private String photo;

}
