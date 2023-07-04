/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodel;

import java.sql.Date;

/**
 *
 * @author portg
 */
public class GPUDomain {

    private String id;
    private String idNSX;
    private String ma;
    private String ten;
    private String loai;
    private String pk;
    private Date NgayTao;
    private Date NgaySua;
    private int TrangThai;

    public GPUDomain() {
    }

    public GPUDomain(String id, String idNSX, String ma, String ten, String loai, String pk, Date NgayTao, Date NgaySua, int TrangThai) {
        this.id = id;
        this.idNSX = idNSX;
        this.ma = ma;
        this.ten = ten;
        this.loai = loai;
        this.pk = pk;
        this.NgayTao = NgayTao;
        this.NgaySua = NgaySua;
        this.TrangThai = TrangThai;
    }

    public GPUDomain(String idNSX, String ma, String ten, String loai, String pk, Date NgayTao, Date NgaySua, int TrangThai) {
        this.idNSX = idNSX;
        this.ma = ma;
        this.ten = ten;
        this.loai = loai;
        this.pk = pk;
        this.NgayTao = NgayTao;
        this.NgaySua = NgaySua;
        this.TrangThai = TrangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdNSX() {
        return idNSX;
    }

    public void setIdNSX(String idNSX) {
        this.idNSX = idNSX;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public Date getNgaySua() {
        return NgaySua;
    }

    public void setNgaySua(Date NgaySua) {
        this.NgaySua = NgaySua;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "CPUDomain{" + "id=" + id + ", idNSX=" + idNSX + ", ma=" + ma + ", ten=" + ten + ", loai=" + loai + ", pk=" + pk + ", NgayTao=" + NgayTao + ", NgaySua=" + NgaySua + ", TrangThai=" + TrangThai + '}';
    }

}
