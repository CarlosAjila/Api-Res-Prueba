-- SEQUENCE: public.tbl_cliente_cli_id_seq

-- DROP SEQUENCE IF EXISTS public.tbl_cliente_cli_id_seq;

CREATE SEQUENCE IF NOT EXISTS public.tbl_cliente_cli_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 2147483647
    CACHE 1;

ALTER SEQUENCE public.tbl_cliente_cli_id_seq
    OWNER TO postgres;
	
-- SEQUENCE: public.tbl_cuenta_cuet_id_seq

-- DROP SEQUENCE IF EXISTS public.tbl_cuenta_cuet_id_seq;

CREATE SEQUENCE IF NOT EXISTS public.tbl_cuenta_cuet_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 2147483647
    CACHE 1;

ALTER SEQUENCE public.tbl_cuenta_cuet_id_seq
    OWNER TO postgres;
	
-- SEQUENCE: public.tbl_movimiento_mov_id_seq

-- DROP SEQUENCE IF EXISTS public.tbl_movimiento_mov_id_seq;

CREATE SEQUENCE IF NOT EXISTS public.tbl_movimiento_mov_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE public.tbl_movimiento_mov_id_seq
    OWNER TO postgres;
	
	
-- SEQUENCE: public.tbl_persona_per_id_seq

-- DROP SEQUENCE IF EXISTS public.tbl_persona_per_id_seq;

CREATE SEQUENCE IF NOT EXISTS public.tbl_persona_per_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 2147483647
    CACHE 1;

ALTER SEQUENCE public.tbl_persona_per_id_seq
    OWNER TO postgres;
	
	
-- Table: public.tbl_persona

-- DROP TABLE IF EXISTS public.tbl_persona;

CREATE TABLE IF NOT EXISTS public.tbl_persona
(
    per_id integer NOT NULL DEFAULT nextval('tbl_persona_per_id_seq'::regclass),
    per_direccion character varying(255) COLLATE pg_catalog."default",
    per_edad integer,
    per_genero character varying(255) COLLATE pg_catalog."default",
    per_identificacion character varying(255) COLLATE pg_catalog."default",
    per_nombre character varying(255) COLLATE pg_catalog."default",
    per_telefono character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT tbl_persona_pkey PRIMARY KEY (per_id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.tbl_persona
    OWNER to postgres;
	
	
-- Table: public.tbl_cliente

-- DROP TABLE IF EXISTS public.tbl_cliente;

CREATE TABLE IF NOT EXISTS public.tbl_cliente
(
    cli_id integer NOT NULL DEFAULT nextval('tbl_cliente_cli_id_seq'::regclass),
    cli_contrasenia character varying(255) COLLATE pg_catalog."default",
    cli_estado boolean,
    per_id integer,
    CONSTRAINT tbl_cliente_pkey PRIMARY KEY (cli_id),
    CONSTRAINT fkkls4psuxi4evhdmam2jwaxj2y FOREIGN KEY (per_id)
        REFERENCES public.tbl_persona (per_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.tbl_cliente
    OWNER to postgres;
	
	
-- Table: public.tbl_cuenta

-- DROP TABLE IF EXISTS public.tbl_cuenta;

CREATE TABLE IF NOT EXISTS public.tbl_cuenta
(
    cuet_id integer NOT NULL DEFAULT nextval('tbl_cuenta_cuet_id_seq'::regclass),
    cuet_estado boolean,
    cuet_numero integer,
    cuet_saldo_inicial double precision,
    cuet_tipo_cuenta character varying(255) COLLATE pg_catalog."default",
    cli_id integer NOT NULL,
    CONSTRAINT tbl_cuenta_pkey PRIMARY KEY (cuet_id),
    CONSTRAINT fk35kt44y2dqqgt7j9mk9t0yt6c FOREIGN KEY (cli_id)
        REFERENCES public.tbl_cliente (cli_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.tbl_cuenta
    OWNER to postgres;
	
-- Table: public.tbl_movimiento

-- DROP TABLE IF EXISTS public.tbl_movimiento;

CREATE TABLE IF NOT EXISTS public.tbl_movimiento
(
    mov_id bigint NOT NULL DEFAULT nextval('tbl_movimiento_mov_id_seq'::regclass),
    mov_fecha timestamp without time zone,
    mov_saldo double precision,
    mov_tipo character varying(255) COLLATE pg_catalog."default",
    mov_valor double precision,
    cuet_id integer,
    CONSTRAINT tbl_movimiento_pkey PRIMARY KEY (mov_id),
    CONSTRAINT fkn03sqw4bhkgpt67ftfch32cg9 FOREIGN KEY (cuet_id)
        REFERENCES public.tbl_cuenta (cuet_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.tbl_movimiento
    OWNER to postgres;