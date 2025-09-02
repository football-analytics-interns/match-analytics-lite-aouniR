DO $$
BEGIN
    IF NOT EXISTS (SELECT 1 FROM pg_type WHERE typname = 'position_type') THEN
        CREATE TYPE position_type AS ENUM (
            'GK','RB','LB','CB','RWB','LWB','CDM','CM','CAM','RM','LM','RW',        
            'LW','RF','LF','CF','ST','DEF','MID','FWD'        
        );
    END IF;
END $$;
