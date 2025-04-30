package org.debinc.simplified_sn.incidentService.incCrud;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.debinc.simplified_sn.incidentService.incCrud.model.Incident;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class IncidentController{

    @GetMapping("/api/incidents")
    public List<Incident> getMethodName() {
        List<Incident> incidents = new ArrayList<>();
        // create a few dummy incidents
        incidents.add(new Incident(1L, "Short description 1", "Description 1", "New", "High", "Group A", "User A", "Creator A", "2023-10-01T10:00:00Z", "Updater A", "2023-10-01T12:00:00Z")); 
        incidents.add(new Incident(2L, "Short description 2", "Description 2", "In Progress", "Medium", "Group B", "User B", "Creator B", "2023-10-02T11:00:00Z", "Updater B", "2023-10-02T13:00:00Z"));
        incidents.add(new Incident(3L, "Short description 3", "Description 3", "Resolved", "Low", "Group C", "User C", "Creator C", "2023-10-03T12:00:00Z", "Updater C", "2023-10-03T14:00:00Z"));
        return incidents;
    }
    
    // ("/incidents")
    // public List<Incident> getAllIncidents() {
    //     // Logic to retrieve all incidents
    //     return incidentService.getAllIncidents();
    // }
}