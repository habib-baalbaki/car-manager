package tech.getarrays.carmanager.model;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Car implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String name;
    private String vin;
    private String description;
    private int year;
    private String imageUrl;

    public Car() {
    }

    public Car(String name, String vin, String description, int year, String imageUrl) {
        this.name = name;
        this.vin = vin;
        this.description = description;
        this.year = year;
        this.imageUrl = imageUrl;
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

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vin='" + vin + '\'' +
                ", description='" + description + '\'' +
                ", year=" + year +
                ", imageUrl='" + imageUrl + '\'' +

                '}';
    }


}
