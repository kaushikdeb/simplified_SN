CREATE TABLE IF NOT EXISTS incidents (
    id BIGSERIAL PRIMARY KEY,
    short_description VARCHAR(255),
    description TEXT,
    status VARCHAR(50),
    priority VARCHAR(50),
    assignment_group VARCHAR(100),
    assigned_to VARCHAR(100),
    created_by VARCHAR(100),
    created_at TIMESTAMP WITHOUT TIME ZONE,
    updated_by VARCHAR(100),
    updated_at TIMESTAMP WITHOUT TIME ZONE
);
