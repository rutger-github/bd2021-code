package belastingdienst.rjduistermaat.jpa;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name = "Laptop.findAll", query = "SELECT l FROM Laptop l"),
        @NamedQuery(name = "Laptop.find", query = "SELECT l FROM Laptop l WHERE l.id=:id"),
        @NamedQuery(name = "Laptop.findByBrand", query = "SELECT l FROM Laptop l WHERE l.brand=:brand")
})
public class Laptop {
    @Id
    @GeneratedValue
    private int id;
    private String brand;

    public Laptop() {
    }

    public Laptop(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }

}
