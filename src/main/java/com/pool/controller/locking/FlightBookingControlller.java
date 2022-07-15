package com.pool.controller.locking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pool.model.locking.Flight;
import com.pool.model.locking.Ticket;
import com.pool.repository.locking.FlightRepository;
import com.pool.repository.locking.TicketRepository;
import com.pool.service.locking.FlightService;
import org.apache.commons.lang3.function.FailableRunnable;

@RestController
@RequestMapping("/api/v1/flight")
public class FlightBookingControlller {

    @Autowired
    private FlightService flightService;

    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private TicketRepository ticketRepository;

    @GetMapping("/executedata")
    public void data() {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(safeRunnable(flightService::changeFlight1));
        executor.execute(safeRunnable(flightService::changeFlight2));
        executor.shutdown();
    }

    private Runnable safeRunnable(FailableRunnable<Exception> runnable) {
        return () -> {
            try {
                runnable.run();
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
    }

    @PostMapping("/saveflight")
    public Flight saveFlight(@RequestBody Flight flight) {

        return flightRepository.save(flight);
    }

    @PostMapping("/saveticket")
    public Ticket saveTicket(@RequestBody Ticket ticket) {
        return ticketRepository.save(ticket);
    }
}
