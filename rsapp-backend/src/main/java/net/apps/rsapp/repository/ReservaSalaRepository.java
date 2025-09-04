package net.apps.rsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.apps.rsapp.entity.Reserva.ReservaSala;
import net.apps.rsapp.entity.Reserva.ReservaSalaPK;

public interface ReservaSalaRepository extends JpaRepository<ReservaSala, ReservaSalaPK>{

}
