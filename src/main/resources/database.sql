CREATE TABLE role (
    role_id BIGSERIAL PRIMARY KEY,
    role_name VARCHAR(50) NOT NULL,
    role_description VARCHAR(150)
);

CREATE TABLE users (
    user_id BIGSERIAL PRIMARY KEY,
    area_id BIGINT NOT NULL,
    role_id BIGINT NOT NULL,
    position VARCHAR(50) NOT NULL,
    document_number VARCHAR(20) NOT NULL UNIQUE,
    first_name VARCHAR(50) NOT NULL,
    second_name VARCHAR(50),
    paternal_last_name VARCHAR(50) NOT NULL,
    maternal_last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(200) NOT NULL,
    phone VARCHAR(20),
    status BOOLEAN NOT NULL,
    CONSTRAINT fk_users_role FOREIGN KEY (role_id) REFERENCES role(role_id)
);

CREATE TABLE climate_record (
    climate_id BIGSERIAL PRIMARY KEY,
    site_id BIGINT NOT NULL,
    climate_date_time TIMESTAMP NOT NULL,
    temperature DECIMAL(10,2) NOT NULL,
    humidity DECIMAL(10,2) NOT NULL,
    climate_condition VARCHAR(100) NOT NULL,
    wind_speed DECIMAL(10,2),
    thermal_sensation DECIMAL(10,2)
);
