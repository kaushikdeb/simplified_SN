package org.debinc.simplified_sn.incidentService.incCrud.model;

public record Incident(
    Long id,
    String shortDescription,
    String description,
    String status,
    String priority,
    String assignmentGroup,
    String assignedTo,
    String createdBy,
    String createdAt,
    String updatedBy,
    String updatedAt
) {
}
