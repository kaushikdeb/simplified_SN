# simplified_SN

Simplified ServiceNow like hobby app.

Goal is to code features available in ServiceNow to try and build a complex fullstack software using modern tech.
This way anybody can learn to use latest tech stack for a not so easy app.

Planned Features
----
* Create/Read/Update/Delete incidents.
* User, Group, Role management.
* Emails to be sent to users when incident is created, edited, state is changed.
* Reports for Incidents

Design
----
+-----------------+       +---------------------+       +-----------------+
| Frontend (UI)   | <---> | Backend (API)       | <---> | Database        |
+-----------------+       +---------------------+       +-----------------+
| React/Angular   |       | Java Spring Boot    |       |  PostgreSQL     |
|                 |       | Email Service       |       |                 |
+-----------------+       +---------------------+       +-----------------+

Step 1
----
Design DB tables
Implement following Incident Management API:
POST /api/incidents: Create a new incident.
GET /api/incidents: Retrieve a list of incidents (with optional filtering, sorting, pagination).
GET /api/incidents/{id}: Retrieve a specific incident by ID.
PUT /api/incidents/{id}: Update an existing incident.
DELETE /api/incidents/{id}: Delete an incident.