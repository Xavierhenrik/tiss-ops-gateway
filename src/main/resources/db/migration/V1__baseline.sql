CREATE TABLE lote_tiss (
  id BIGSERIAL PRIMARY KEY,
  filename VARCHAR(255) NOT NULL,
  version VARCHAR(20),
  received_at TIMESTAMP DEFAULT now(),
  status VARCHAR(20) NOT NULL
);

CREATE TABLE prestador (
  id BIGSERIAL PRIMARY KEY,
  cnpj VARCHAR(14) NOT NULL UNIQUE,
  nome VARCHAR(200) NOT NULL
);

CREATE TABLE beneficiario (
  id BIGSERIAL PRIMARY KEY,
  codigo VARCHAR(50) NOT NULL UNIQUE,
  nome VARCHAR(200) NOT NULL,
  data_nascimento DATE
);

CREATE TABLE guia (
  id BIGSERIAL PRIMARY KEY,
  lote_id BIGINT REFERENCES lote_tiss(id),
  tipo VARCHAR(30),
  numero VARCHAR(60),
  beneficiario_id BIGINT REFERENCES beneficiario(id),
  prestador_id BIGINT REFERENCES prestador(id),
  data_atendimento DATE,
  valor_total NUMERIC(14,2) DEFAULT 0,
  status VARCHAR(20)
);

CREATE TABLE item_guia (
  id BIGSERIAL PRIMARY KEY,
  guia_id BIGINT REFERENCES guia(id),
  codigo_procedimento VARCHAR(50),
  descricao VARCHAR(200),
  quantidade INT,
  valor_unit NUMERIC(14,2),
  valor_total NUMERIC(14,2)
);
