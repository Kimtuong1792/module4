package codegym.casestudym4.model.facility;

import javax.persistence.*;
import java.util.Set;

@Entity
public class FacilityType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "facilityType")
    private Set<Facility> facility;

    public Set<Facility> getFacility() {
        return facility;
    }

    public void setFacility(Set<Facility> facility) {
        this.facility = facility;
    }

    public FacilityType() {
    }

    public FacilityType(int id, String name, Set<Facility> facility) {
        this.id = id;
        this.name = name;
        this.facility = facility;
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

    @Override
    public String toString() {
        return "FacilityType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
