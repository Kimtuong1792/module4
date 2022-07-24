package codegym.product3.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ProductDto {
    private int id;

    @NotBlank(message = "Name product is not empty!")
    @Size(min = 5, max = 45)
    private String name;

    @NotNull
    @Min(1)
    private double price;

    @NotBlank(message = "Produce is not empty!")
    @Size(min = 5, max = 45)
    private String producer;

    public ProductDto() {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
