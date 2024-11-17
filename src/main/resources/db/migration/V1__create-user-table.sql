CREATE EXTENSION IF NOT EXISTS pgcrypto;

CREATE TABLE users (
                 id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
                 name VARCHAR(150) NOT NULL,
                 last_name VARCHAR(100) NOT NULL,
                 user_participation DOUBLE PRECISION NOT NULL
                 );