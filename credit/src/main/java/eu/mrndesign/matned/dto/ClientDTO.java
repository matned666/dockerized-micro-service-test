package eu.mrndesign.matned.dto;


public class ClientDTO{

    private Long id;
    private String firstName;
    private String lastName;
    private String pesel;
    private Long creditId;

    public ClientDTO() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public Long getCreditId() {
        return creditId;
    }

}
