/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.KhachHang;
import repository.KhachHangRepository;

/**
 *
 * @author manhnt
 */
public class KhachHangService {
    private final KhachHangRepository khachHangRepository = new KhachHangRepository();
    
    public List<KhachHang> getAll (){
        return khachHangRepository.getAll();
    }
}
