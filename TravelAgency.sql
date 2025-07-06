CREATE DATABASE IF NOT EXISTS agence_voyage;
USE agence_voyage;
-- HOTEL TABLE
CREATE TABLE Hotel (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    address VARCHAR(255),
    rating INT
);

-- CLIENT TABLE
CREATE TABLE Client (
    id INT AUTO_INCREMENT PRIMARY KEY,
    firstName VARCHAR(100),
    lastName VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    phone VARCHAR(20),
    isArchived BOOLEAN DEFAULT FALSE
);

-- PRESTATION TABLE
CREATE TABLE Prestation (
    id INT AUTO_INCREMENT PRIMARY KEY,
    designation VARCHAR(255),
    type VARCHAR(100),
    hotel_id INT,
    startDate DATE,
    endDate DATE,
    price DOUBLE,
    maxCapacity INT,
    FOREIGN KEY (hotel_id) REFERENCES Hotel(id)
);

-- RESERVATION TABLE
CREATE TABLE Reservation (
    id INT AUTO_INCREMENT PRIMARY KEY,
    confirmationDate DATE,
    status ENUM('PENDING', 'CONFIRMED', 'CANCELLED'),
    client_id INT,
    prestation_id INT,
    FOREIGN KEY (client_id) REFERENCES Client(id),
    FOREIGN KEY (prestation_id) REFERENCES Prestation(id)
);
