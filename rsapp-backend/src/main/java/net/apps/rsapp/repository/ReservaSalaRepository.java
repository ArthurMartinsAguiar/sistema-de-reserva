package net.apps.rsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.apps.rsapp.entity.reservaSala.ReservaSala;
import net.apps.rsapp.entity.reservaSala.ReservaSalaPK;

public interface ReservaSalaRepository extends JpaRepository<ReservaSala, ReservaSalaPK>{

}
