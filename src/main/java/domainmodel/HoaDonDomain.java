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
public class HoaDonDomain {

    private String id;
    private String idNV;
    private String idKH;
    private String ma;
    private Date NgayTT;
    private Date NgayTao;
    private Date NgaySua;
    private int TrangThai;

    public HoaDonDomain() {
    }

    public HoaDonDomain(String id, String idNV, String idKH, String ma, Date NgayTT, Date NgayTao, Date NgaySua, int TrangThai) {
        this.id = id;
        this.idNV = idNV;
        this.idKH = idKH;
        this.ma = ma;
        this.NgayTT = NgayTT;
        this.NgayTao = NgayTao;
        this.NgaySua = NgaySua;
        this.TrangThai = TrangThai;
    }

    public HoaDonDomain(String idNV, String idKH, String ma, Date NgayTT, Date NgayTao, Date NgaySua, int TrangThai) {
        this.idNV = idNV;
        this.idKH = idKH;
        this.ma = ma;
        this.NgayTT = NgayTT;
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

    public String getIdNV() {
        return idNV;
    }

    public void setIdNV(String idNV) {
        this.idNV = idNV;
    }

    public String getIdKH() {
        return idKH;
    }

    public void setIdKH(String idKH) {
        this.idKH = idKH;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Date getNgayTT() {
        return NgayTT;
    }

    public void setNgayTT(Date NgayTT) {
        this.NgayTT = NgayTT;
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
        return "HoaDonDomain{" + "id=" + id + ", idNV=" + idNV + ", idKH=" + idKH + ", ma=" + ma + ", NgayTT=" + NgayTT + ", NgayTao=" + NgayTao + ", NgaySua=" + NgaySua + ", TrangThai=" + TrangThai + '}';
    }

}
