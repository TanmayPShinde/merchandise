package com.merchandise.backend.domain.customer;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "customer")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String firstName;

    String lastName;

    String gender;

    String email;

    String phoneNumber;

    String address;

    String city;

    String pinCode;

    String state;

    String country;
}
