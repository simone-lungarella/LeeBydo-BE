package me.asah.leebydo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Model di un impiegato generico dell'azienda. Definisce tutte le
 * caratteristiche dello stesso.
 * 
 * @author Simone Lungarella
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Employee implements Serializable {

    /**
     * Identificativo dell'entità Employee.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    @Getter
    @Setter
    private Long id;

    /**
     * Nome dell'impiegato.
     */
    @Getter
    @Setter
    private String name;

    /**
     * E-mail dell'impiegato.
     */
    @Getter
    @Setter
    private String email;

    /**
     * Impiego lavorativo.
     */
    @Getter
    @Setter
    private String jobTitle;

    /**
     * Numero telefonico dell'impiegato.
     */
    @Getter
    @Setter
    private String phone;

    /**
     * Url della foto profilo dell'impiegato.
     */
    @Getter
    @Setter
    private String imageUrl;

    /**
     * Codice impiegato.
     */
    @Column(nullable = false, updatable = false)
    @Getter
    @Setter
    private String employeeCode;

    /**
     * To string dell'impiegato.
     */
    @Override
    public String toString() {
        return new StringBuilder("Employee{").append("id=").append(id).append(", ").append("name='").append(name)
                .append("', ").append("email=").append(email).append("', ").append("jobTitle='").append(jobTitle)
                .append("', ").append("phone='").append(phone).append("', ").append("imageUrl='").append(imageUrl)
                .append("'}").toString();
    }

}
