package hello.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer1814 {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;

    protected Customer1814() {}

    public Customer1814(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer1814[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

}

