insert into incidents (short_description, description, status, priority, assignment_group, assigned_to, created_by, created_at, updated_by, updated_at)
VALUES
('Incident 1', 'Description of incident 1', 'New', 'High', 'Network Team', 'John Doe', 'Jane Smith', NOW(), 'Jane Smith', NOW()),
('Incident 2', 'Description of incident 2', 'In Progress', 'Medium', 'Server Team', 'Alice Johnson', 'Bob Brown', NOW(), 'Bob Brown', NOW()),
('Incident 3', 'Description of incident 3', 'Resolved', 'Low', 'Application Team', 'Charlie White', 'Diana Green', NOW(), 'Diana Green', NOW());