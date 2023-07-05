/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package RepositoryInterface;

import domainmodel.MauSacDomain;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IMauSacReposytory {
    List<MauSacDomain> getList();
    Integer them(MauSacDomain mauSac);
    Integer sua(MauSacDomain mauSac);
    Integer xoa(String ma);
}
