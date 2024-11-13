-- Drop database if exists to start fresh
DROP DATABASE IF EXISTS library_management;
CREATE DATABASE library_management;
USE library_management;

-- Authors table
CREATE TABLE authors (
    author_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    birth_year INT
);

-- Publishers table
CREATE TABLE publishers (
    publisher_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    country VARCHAR(50)
);

-- Books table
CREATE TABLE books (
    isbn VARCHAR(13) PRIMARY KEY,
    title VARCHAR(200) NOT NULL,
    author_id INT,
    publisher_id INT,
    publication_year INT,
    total_copies INT DEFAULT 1,
    available_copies INT DEFAULT 1,
    FOREIGN KEY (author_id) REFERENCES authors(author_id),
    FOREIGN KEY (publisher_id) REFERENCES publishers(publisher_id)
);

-- Users table
CREATE TABLE users (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(100) UNIQUE,
    registration_date DATE
);

-- Loans table
CREATE TABLE loans (
    loan_id INT PRIMARY KEY AUTO_INCREMENT,
    isbn VARCHAR(13),
    user_id INT,
    loan_date DATE,
    due_date DATE,
    return_date DATE,
    FOREIGN KEY (isbn) REFERENCES books(isbn),
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

-- Insert sample data
INSERT INTO authors (first_name, last_name, birth_year) VALUES
('Leo', 'Tolstoy', 1828),
('Eça', 'de Queirós', 1845),
('Virginia', 'Woolf', 1882);

INSERT INTO publishers (name, country) VALUES
('Livraria Internacional', 'Portugal'),
('Penguin Classics', 'UK'),
('Oxford University Press', 'UK');

INSERT INTO books (isbn, title, author_id, publisher_id, publication_year, total_copies, available_copies) VALUES
('9780140447934', 'War and Peace', 1, 2, 1969, 3, 2),
('9780199537563', 'Anna Karenina', 1, 3, 1973, 2, 1),
('9789722501590', 'O Primo Basílio', 2, 1, 1978, 2, 2),
('9780156628709', 'Mrs Dalloway', 3, 2, 1925, 1, 0);

INSERT INTO users (first_name, last_name, email, registration_date) VALUES
('John', 'Smith', 'john.smith@email.com', '2023-01-15'),
('Maria', 'Santos', 'maria.santos@email.com', '2023-02-20'),
('David', 'Brown', 'david.brown@email.com', '2023-03-10');

INSERT INTO loans (isbn, user_id, loan_date, due_date, return_date) VALUES
('9780140447934', 1, '2024-03-01', '2024-03-15', NULL),
('9780199537563', 2, '2024-03-05', '2024-03-19', NULL),
('9780156628709', 3, '2024-03-10', '2024-03-24', NULL);