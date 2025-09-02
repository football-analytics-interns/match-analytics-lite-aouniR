INSERT INTO matches (id, date, homeTeam, awayTeam, homeScore, awayScore)
VALUES (
    1,
    '2025-09-01T18:30:00Z',
    'Blue FC',
    'Red United',
    2,
    1
);

INSERT INTO players (id, name, team, position)
VALUES
 (1, 'Ali', 'Blue FC', 'FWD'),
 (2, 'Sami', 'Blue FC', 'MID'),
 (3, 'Yassine', 'Blue FC', 'DEF'),
 (11, 'Khaled', 'Red United', 'FWD'),
 (12, 'Omar', 'Red United', 'GK');

INSERT INTO events (id, match_id, player_id, minute, type, meta)
VALUES      
 (1, 1, 1, 12, 'GOAL', '{"assistId": 2}'),
 (2, 1, 1, 43, 'SHOT', '{"onTarget": true}'),
 (3, 1, 11, 67, 'GOAL', '{}'),
 (4, 1, 3, 75, 'TACKLE', '{}'); 