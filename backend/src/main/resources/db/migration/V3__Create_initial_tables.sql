CREATE TABLE IF NOT EXISTS "matches" (
    id SERIAL PRIMARY KEY,
    match_date TIMESTAMP NOT NULL,
    homeTeam VARCHAR(50) NOT NULL,
    awayTeam VARCHAR(50) NOT NULL,
    homeScore INTEGER DEFAULT 0,        
    awayScore INTEGER DEFAULT 0,    
);

CREATE TABLE IF NOT EXISTS "players" (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    team VARCHAR(50) NOT NULL,
    position position_type NOT NULL,
);

CREATE TABLE IF NOT EXISTS "events" (
    id SERIAL PRIMARY KEY,
    match_id INTEGER NOT NULL,
    player_id INTEGER NOT NULL,
    minute INTEGER NOT NULL, 
    type event_type NOT NULL,  
    meta JSONB  DEFAULT '{}',
);
