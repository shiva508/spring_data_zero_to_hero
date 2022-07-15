package com.pool.service.locking;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.pool.model.exception.ExceededCapacityException;
import com.pool.model.locking.Flight;
import com.pool.model.locking.Ticket;
import com.pool.repository.locking.FlightRepository;
import com.pool.repository.locking.TicketRepository;

@Service
public class FlightServiceImpl implements FlightService {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void changeFlight1() throws Exception {
        var flight = flightRepository.findById(1L).get();
        saveNewTicket("Robert", "Smith", flight);
        Thread.sleep(1_000);

    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void changeFlight2() throws Exception {
        var flight = flightRepository.findById(1L).get();
        saveNewTicket("Kate", "Brown", flight);
        Thread.sleep(1_000);

    }

    private void saveNewTicket(String firstName, String lastName, Flight flight) throws Exception {
        if (flight.getCapacity() <= flight.getTickets().size()) {
            throw new ExceededCapacityException();
        }

        var ticket = new Ticket();
        ticket.setFirstName(firstName);
        ticket.setLastName(lastName);
        flight.addTicket(ticket);
        ticketRepository.saveAndFlush(ticket);
    }

}
