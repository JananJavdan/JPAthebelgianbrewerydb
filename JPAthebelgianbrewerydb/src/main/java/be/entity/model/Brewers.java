package be.entity.model;

import javax.persistence.*;

@Entity
@Table(name = "brewers")
@NamedQuery(name = "find brewers by id", query = "select br from Brewers br where br.id = id")
public class Brewers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(unique = true, nullable = false, length = 150)
    private String name;
    @Column(unique = true, nullable = false, length = 150)
    private String address;
    @Column(unique = true, nullable = false, length = 150)
    private String zipCode;
    @Column(unique = true, nullable = false, length = 150)
    private String city;
    @Column(unique = true, nullable = false, length = 150)
    private int turnover;

    public Brewers() {

    }

    public Brewers(int id, String name, String address, String zipCode, String city, int turnover) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.turnover = turnover;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getTurnover() {
        return turnover;
    }

    public void setTurnover(int turnover) {
        this.turnover = turnover;
    }
}
