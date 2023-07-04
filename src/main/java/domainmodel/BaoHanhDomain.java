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
public class BaoHanhDomain {

    private String id;
    private String idIMEI;
    private String ma;
    private int thangBH;
    private Date NgayKT;
    private Date NgayTao;
    private Date NgaySua;
    private int TrangThai;

    public BaoHanhDomain() {
    }

    public BaoHanhDomain(String id, String idIMEI, String ma, int thangBH, Date NgayKT, Date NgayTao, Date NgaySua, int TrangThai) {
        this.id = id;
        this.idIMEI = idIMEI;
        this.ma = ma;
        this.thangBH = thangBH;
        this.NgayKT = NgayKT;
        this.NgayTao = NgayTao;
        this.NgaySua = NgaySua;
        this.TrangThai = TrangThai;
    }

    public BaoHanhDomain(String idIMEI, String ma, int thangBH, Date NgayKT, Date NgayTao, Date NgaySua, int TrangThai) {
        this.idIMEI = idIMEI;
        this.ma = ma;
        this.thangBH = thangBH;
        this.NgayKT = NgayKT;
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

    public String getIdIMEI() {
        return idIMEI;
    }

    public void setIdIMEI(String idIMEI) {
        this.idIMEI = idIMEI;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public int getThangBH() {
        return thangBH;
    }

    public void setThangBH(int thangBH) {
        this.thangBH = thangBH;
    }

    public Date getNgayKT() {
        return NgayKT;
    }

    public void setNgayKT(Date NgayKT) {
        this.NgayKT = NgayKT;
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
        return "BaoHanhDomain{" + "id=" + id + ", idIMEI=" + idIMEI + ", ma=" + ma + ", thangBH=" + thangBH + ", NgayKT=" + NgayKT + ", NgayTao=" + NgayTao + ", NgaySua=" + NgaySua + ", TrangThai=" + TrangThai + '}';
    }

    

}
