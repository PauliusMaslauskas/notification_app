CREATE TABLE IF NOT EXISTS msgThread (
    id INT AUTO_INCREMENT PRIMARY KEY,
    timecreated VARCHAR(255) NOT NULL,
    summary VARCHAR(255) NOT NULL,
    seen INT
    );

CREATE TABLE IF NOT EXISTS msgMessage (
    id INT AUTO_INCREMENT PRIMARY KEY,
    content VARCHAR(255) NOT NULL,

    );