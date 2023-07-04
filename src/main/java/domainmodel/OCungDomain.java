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
public class OCungDomain {

    private String id;
    private String idBH;
    private String ma;
    private String ten;
    private int gb;
    private String loai;
    private Date NgayTao;
    private Date NgaySua;
    private int TrangThai;

    public OCungDomain() {
    }

    public OCungDomain(String id, String idBH, String ma, String ten, int gb, String loai, Date NgayTao, Date NgaySua, int TrangThai) {
        this.id = id;
        this.idBH = idBH;
        this.ma = ma;
        this.ten = ten;
        this.gb = gb;
        this.loai = loai;
        this.NgayTao = NgayTao;
        this.NgaySua = NgaySua;
        this.TrangThai = TrangThai;
    }

    public OCungDomain(String idBH, String ma, String ten, int gb, String loai, Date NgayTao, Date NgaySua, int TrangThai) {
        this.idBH = idBH;
        this.ma = ma;
        this.ten = ten;
        this.gb = gb;
        this.loai = loai;
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

    public String getIdBH() {
        return idBH;
    }

    public void setIdBH(String idBH) {
        this.idBH = idBH;
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

    public int getGb() {
        return gb;
    }

    public void setGb(int gb) {
        this.gb = gb;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
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
        return "OCungDomain{" + "id=" + id + ", idBH=" + idBH + ", ma=" + ma + ", ten=" + ten + ", gb=" + gb + ", loai=" + loai + ", NgayTao=" + NgayTao + ", NgaySua=" + NgaySua + ", TrangThai=" + TrangThai + '}';
    }

    
}
