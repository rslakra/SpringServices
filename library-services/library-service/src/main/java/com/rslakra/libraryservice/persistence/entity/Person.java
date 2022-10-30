package com.rslakra.libraryservice.persistence.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @author Rohtash Lakra (rlakra)
 * @created 10/9/21 3:56 PM
 */
@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity<String> {

    @Column(name = "email", length = 64, unique = true, nullable = false)
    private String email;

    @Column(name = "first_name", length = 64, nullable = false)
    private String firstName;

    @Column(name = "middle_name", length = 64)
    private String middleName;

    @Column(name = "last_name", length = 64, nullable = false)
    private String lastName;

    /**
     * Returns the string representation of this object.
     *
     * @return
     */
    @Override
    public String toString() {
        return toString(Person.class)
                .add("email=" + getEmail())
                .add("firstName=" + getFirstName())
                .add("middleName=" + getMiddleName())
                .add("lastName=" + getLastName())
                .toString();
    }

}
