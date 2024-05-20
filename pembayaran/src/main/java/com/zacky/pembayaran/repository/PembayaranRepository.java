/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.zacky.pembayaran.repository;

import com.zacky.pembayaran.entity.Pembayaran;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author TUF GAMING
 */
@Repository
public interface PembayaranRepository extends JpaRepository<Pembayaran, Long> {
    @Override
    public List<Pembayaran> findAll();
}
