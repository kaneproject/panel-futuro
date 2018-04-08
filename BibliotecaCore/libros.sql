CREATE TABLE public.libros
(
    isbn text NOT NULL,
    titulo text,
    autor text,
    PRIMARY KEY (isbn)
)
WITH (
    OIDS = FALSE
);

ALTER TABLE public.libros
    OWNER to postgres;