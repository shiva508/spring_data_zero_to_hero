package com.pool.repository.locking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pool.model.locking.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
