package be.entity.model;

import javax.persistence.*;

@Entity
@Table(name = "beers")
@NamedQuery(name = "find beer by id", query = "select b from Beers b where b.id = id")
public class Beers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 50, nullable = false, unique = true)
    private String name;
    @Column(length = 50, nullable = false, unique = true)
    private int brewerId;
    @Column(length = 50, nullable = false, unique = true)
    private int categoryId;
    @Column(length = 50, nullable = false)
    private float price;
    @Column(length = 50, nullable = false)
    private int stock;
    @Column(length = 50, nullable = false)
    private float alcohol;
    @Column(length = 50, nullable = false)
    private int version;

    public Beers() {

    }

    public Beers(Long id, String name, int brewerId, int categoryId, float price, int stock, float alcohol, int version) {
        this.id = id;
        this.name = name;
        this.brewerId = brewerId;
        this.categoryId = categoryId;
        this.price = price;
        this.stock = stock;
        this.alcohol = alcohol;
        this.version = version;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBrewerId() {
        return brewerId;
    }

    public void setBrewerId(int brewerId) {
        this.brewerId = brewerId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(float alcohol) {
        this.alcohol = alcohol;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
