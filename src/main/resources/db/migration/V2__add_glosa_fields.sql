-- Campos para registrar glosa por item e justificativas
ALTER TABLE item_guia ADD COLUMN IF NOT EXISTS glosa BOOLEAN DEFAULT FALSE;
ALTER TABLE item_guia ADD COLUMN IF NOT EXISTS glosa_motivo VARCHAR(255);
ALTER TABLE guia ADD COLUMN IF NOT EXISTS status VARCHAR(32);

