package net.enver.customerdemo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Simple JavaBean domain object that represent Customer
 *
 * @author Enver on 08.12.2019 21:02.
 * @project CustomerDemo
 */

@Entity
@Table(name = "customers")
@Getter
@Setter
@ToString
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Customer extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "address")
    private String address;

    @Column(name = "budget")
    private BigDecimal budget;
}
