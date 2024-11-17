CREATE EXTENSION IF NOT EXISTS pgcrypto;

CREATE TABLE users (
                 id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
                 name VARCHAR(150) NOT NULL,
                 lastName VARCHAR(100) NOT NULL,
                 userParticipation DOUBLE PRECISION NOT NULL
                 );