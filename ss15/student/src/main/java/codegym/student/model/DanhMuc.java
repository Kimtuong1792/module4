package codegym.student.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class DanhMuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
@OneToMany(mappedBy = "danhMuc")
    Set<TinTuc>question;
    public DanhMuc() {
    }

    public DanhMuc(int id, String name) {
        this.id = id;
        this.name = name;
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
}
