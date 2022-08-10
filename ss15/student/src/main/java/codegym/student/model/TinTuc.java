package codegym.student.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class TinTuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tieuDe;
    private String noiDung;
    private String phongVien;
    private String dateCreate;

    @ManyToOne
    @JoinColumn(name = "danh_muc_id", referencedColumnName = "id")
    private DanhMuc danhMuc;

    public TinTuc() {
    }

    public TinTuc(int id, String tieuDe, String noiDung, String phongVien, String dateCreate, DanhMuc danhMuc) {
        this.id = id;
        this.tieuDe = tieuDe;
        this.noiDung = noiDung;
        this.phongVien = phongVien;
        this.dateCreate = dateCreate;
        this.danhMuc = danhMuc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getPhongVien() {
        return phongVien;
    }

    public void setPhongVien(String phongVien) {
        this.phongVien = phongVien;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public DanhMuc getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(DanhMuc danhMuc) {
        this.danhMuc = danhMuc;
    }
}
