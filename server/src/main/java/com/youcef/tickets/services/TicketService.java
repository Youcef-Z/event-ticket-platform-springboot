package com.youcef.tickets.services;

import com.youcef.tickets.domain.entities.Ticket;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;
import java.util.UUID;

public interface TicketService {

    Page<Ticket> listTicketsForUser(UUID userId, Pageable pageable);

    Optional<Ticket> getTicketForUser(UUID userId, UUID ticketId);
}
