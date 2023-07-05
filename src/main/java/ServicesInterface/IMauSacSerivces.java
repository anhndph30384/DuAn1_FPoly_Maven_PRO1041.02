/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ServicesInterface;

import java.util.List;
import viewmodel.MauSacView;

/**
 *
 * @author ADMIN
 */
public interface IMauSacSerivces {
    List<MauSacView> getList();
    Integer them(MauSacView mauSac);
    Integer sua(MauSacView mauSac);
    Integer xoa(String ma);
}
