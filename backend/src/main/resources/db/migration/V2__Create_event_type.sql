DO $$
BEGIN
    IF NOT EXISTS (SELECT 1 FROM pg_type WHERE typname = 'event_type') THEN
        CREATE TYPE event_type AS ENUM (
            'GOAL',
            'SHOT',
            'TACKLE',
            'CARD',
            'SUBSTITUTION',
            'CORNER',
            'FREEKICK',
            'PENALTY',
            'OFFSIDE',
            'FOUL'
        );
    END IF;
END $$;
