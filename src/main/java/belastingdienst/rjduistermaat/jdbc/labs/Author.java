package belastingdienst.rjduistermaat.jdbc.labs;

import belastingdienst.rjduistermaat.jdbc.labs.author.Name;

public class Author {
    private String address;
    private Name name;

    public Author(String address, Name name) {
        this.address = address;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public Name getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "address='" + address + '\'' +
                ", name=" + name +
                '}';
    }
}
