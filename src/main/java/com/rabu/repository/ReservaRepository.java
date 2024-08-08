package com.rabu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rabu.entities.Reserva;

public interface ReservaRepository extends JpaRepository <Reserva,Long> {

}
