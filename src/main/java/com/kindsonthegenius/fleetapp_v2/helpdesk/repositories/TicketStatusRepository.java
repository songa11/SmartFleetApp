package com.kindsonthegenius.fleetapp_v2.helpdesk.repositories;

import com.kindsonthegenius.fleetapp_v2.accounts.models.InvoiceStatus;
import com.kindsonthegenius.fleetapp_v2.helpdesk.models.TicketStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketStatusRepository extends JpaRepository<TicketStatus, Integer> {

}
