package codegym.student.Dto;

import codegym.student.model.DanhMuc;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class TinTucDto {
    private int id;

    @NotBlank(message = "không được bỏ trống")
    @Size(max = 50)
    private String tieuDe;


    @NotBlank(message = "không được bỏ trống")
    @Size(max = 500)
    private String noiDung;

    @NotBlank(message = "không được bỏ trống")
    private String phongVien;

    @NotBlank(message = "không được bỏ trống")
    private String dateCreate;


    private DanhMuc danhMuc;
    public TinTucDto() {
    }

    public TinTucDto(int id, String tieuDe, String noiDung, String phongVien, String dateCreate, DanhMuc danhMuc) {
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
