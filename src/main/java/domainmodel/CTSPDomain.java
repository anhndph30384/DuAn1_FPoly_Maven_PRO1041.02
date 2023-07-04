/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodel;

import java.math.BigDecimal;
import java.sql.Date;

/**
 *
 * @author portg
 */
public class CTSPDomain {

    private String id;
    private String idSP;
    private String idNSX;
    private String idIMEI;
    private String idDong;
    private String idMau;
    private String idGPU;
    private String idCPU;
    private String idChip;
    private String idOC;
    private int RAM;
    private String HDH;
    private String DPG;
    private String thang;
    private String mota;
    private BigDecimal GN;
    private BigDecimal GB;
    private Date NgayTao;
    private Date NgaySua;
    private int TrangThai;

    public CTSPDomain(String id, String idSP, String idNSX, String idIMEI, String idDong, String idMau, String idGPU, String idCPU, String idChip, String idOC, int RAM, String HDH, String DPG, String thang, String mota, BigDecimal GN, BigDecimal GB, Date NgayTao, Date NgaySua, int TrangThai) {
        this.id = id;
        this.idSP = idSP;
        this.idNSX = idNSX;
        this.idIMEI = idIMEI;
        this.idDong = idDong;
        this.idMau = idMau;
        this.idGPU = idGPU;
        this.idCPU = idCPU;
        this.idChip = idChip;
        this.idOC = idOC;
        this.RAM = RAM;
        this.HDH = HDH;
        this.DPG = DPG;
        this.thang = thang;
        this.mota = mota;
        this.GN = GN;
        this.GB = GB;
        this.NgayTao = NgayTao;
        this.NgaySua = NgaySua;
        this.TrangThai = TrangThai;
    }

    public CTSPDomain(String idSP, String idNSX, String idIMEI, String idDong, String idMau, String idGPU, String idCPU, String idChip, String idOC, int RAM, String HDH, String DPG, String thang, String mota, BigDecimal GN, BigDecimal GB, Date NgayTao, Date NgaySua, int TrangThai) {
        this.idSP = idSP;
        this.idNSX = idNSX;
        this.idIMEI = idIMEI;
        this.idDong = idDong;
        this.idMau = idMau;
        this.idGPU = idGPU;
        this.idCPU = idCPU;
        this.idChip = idChip;
        this.idOC = idOC;
        this.RAM = RAM;
        this.HDH = HDH;
        this.DPG = DPG;
        this.thang = thang;
        this.mota = mota;
        this.GN = GN;
        this.GB = GB;
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

    public String getIdSP() {
        return idSP;
    }

    public void setIdSP(String idSP) {
        this.idSP = idSP;
    }

    public String getIdNSX() {
        return idNSX;
    }

    public void setIdNSX(String idNSX) {
        this.idNSX = idNSX;
    }

    public String getIdIMEI() {
        return idIMEI;
    }

    public void setIdIMEI(String idIMEI) {
        this.idIMEI = idIMEI;
    }

    public String getIdDong() {
        return idDong;
    }

    public void setIdDong(String idDong) {
        this.idDong = idDong;
    }

    public String getIdMau() {
        return idMau;
    }

    public void setIdMau(String idMau) {
        this.idMau = idMau;
    }

    public String getIdGPU() {
        return idGPU;
    }

    public void setIdGPU(String idGPU) {
        this.idGPU = idGPU;
    }

    public String getIdCPU() {
        return idCPU;
    }

    public void setIdCPU(String idCPU) {
        this.idCPU = idCPU;
    }

    public String getIdChip() {
        return idChip;
    }

    public void setIdChip(String idChip) {
        this.idChip = idChip;
    }

    public String getIdOC() {
        return idOC;
    }

    public void setIdOC(String idOC) {
        this.idOC = idOC;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getHDH() {
        return HDH;
    }

    public void setHDH(String HDH) {
        this.HDH = HDH;
    }

    public String getDPG() {
        return DPG;
    }

    public void setDPG(String DPG) {
        this.DPG = DPG;
    }

    public String getThang() {
        return thang;
    }

    public void setThang(String thang) {
        this.thang = thang;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public BigDecimal getGN() {
        return GN;
    }

    public void setGN(BigDecimal GN) {
        this.GN = GN;
    }

    public BigDecimal getGB() {
        return GB;
    }

    public void setGB(BigDecimal GB) {
        this.GB = GB;
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
        return "CTSPDomain{" + "id=" + id + ", idSP=" + idSP + ", idNSX=" + idNSX + ", idIMEI=" + idIMEI + ", idDong=" + idDong + ", idMau=" + idMau + ", idGPU=" + idGPU + ", idCPU=" + idCPU + ", idChip=" + idChip + ", idOC=" + idOC + ", RAM=" + RAM + ", HDH=" + HDH + ", DPG=" + DPG + ", thang=" + thang + ", mota=" + mota + ", GN=" + GN + ", GB=" + GB + ", NgayTao=" + NgayTao + ", NgaySua=" + NgaySua + ", TrangThai=" + TrangThai + '}';
    }

}
