/*INSERT INTO tb_cliente (name, cpf, income, birth_Date, childrem) VALUES
('João Silva', '123.456.789-01', 2500.00, '1985-05-15 00:00:00', 2),
('Maria Oliveira', '987.654.321-09', 3200.50, '1990-08-22 00:00:00', 1),
('Carlos Souza', '456.789.123-45', 1800.75, '1995-11-30 00:00:00', 0),
('Ana Pereira', '789.123.456-78', 4200.00, '1982-03-10 00:00:00', 3),
('Pedro Costa', '321.654.987-32', 2900.25, '1988-07-18 00:00:00', 1),
('Lucia Santos', '654.321.987-65', 3800.00, '1992-09-25 00:00:00', 2),
('Marcos Rocha', '147.258.369-14', 5100.50, '1980-12-05 00:00:00', 4),
('Fernanda Lima', '258.369.147-25', 2700.75, '1993-04-20 00:00:00', 0),
('Ricardo Alves', '369.147.258-36', 3500.00, '1987-06-12 00:00:00', 1),
('Juliana Castro', '951.753.852-96', 4300.25, '1991-02-28 00:00:00', 2);
*/
/*INSERT INTO tb_cliente (name, cpf, income, birth_Date, childrem) VALUES
('João Silva', '123.456.789-0', 2500.00, '1985-05-15 00:00:00', 2),
('Juliana Castro', '951.753.852-9', 4300.25, '1991-02-28 00:00:00', 2);
*/

INSERT INTO tb_matricula (inicio_matricula, fim_matricula, status) VALUES ('2024-01-10 04:30:00', '2024-11-15 04:30:00','Inativo');
INSERT INTO tb_matricula (inicio_matricula, fim_matricula, status) VALUES ('2024-02-05 04:30:00', '2024-12-10 04:30:00','Inativo');
INSERT INTO tb_matricula (inicio_matricula, fim_matricula, status) VALUES ('2024-03-01 04:30:00', '2025-01-10 04:30:00','Inativo');
-- E assim por diante...

INSERT INTO tb_matricula (inicio_matricula, fim_matricula, status) VALUES
('2024-01-10 04:30:00', '2024-11-15 04:30:00', 'Inativo'),
('2024-02-05 04:30:00', '2024-12-10 04:30:00', 'Ativo'),
('2024-03-01 04:30:00', '2025-01-10 04:30:00', 'Ativo'),
('2024-01-20 04:30:00', '2024-10-25 04:30:00', 'Ativo'),
('2024-04-10 04:30:00', '2025-02-15 04:30:00', 'Inativo'),
('2024-05-15 04:30:00', '2025-03-20 04:30:00', 'Ativo'),
('2024-03-25 04:30:00', '2025-01-30 04:30:00', 'Inativo'),
('2024-02-28 04:30:00', '2024-12-05 04:30:00', 'Ativo'),
('2024-06-05 04:30:00', '2025-04-01 04:30:00', 'Inativo'),
('2024-07-10 04:30:00', '2025-05-10 04:30:00', 'Inativo');
INSERT INTO tb_matricula (inicio_matricula, fim_matricula, status) VALUES
('2024-01-10 04:30:00', '2024-11-15 04:30:00', 'Inativo'),
('2024-02-05 04:30:00', '2024-12-10 04:30:00', 'Ativo'),
('2024-03-01 04:30:00', '2025-01-10 04:30:00', 'Inativo'),
('2024-01-20 04:30:00', '2024-10-25 04:30:00', 'Ativo'),
('2024-04-10 04:30:00', '2025-02-15 04:30:00', 'Ativo'),
('2024-05-15 04:30:00', '2025-03-20 04:30:00', 'Inativo'),
('2024-03-25 04:30:00', '2025-01-30 04:30:00', 'Inativo'),
('2024-02-28 04:30:00', '2024-12-05 04:30:00', 'Inativo'),
('2024-04-10 04:30:00', '2025-02-15 04:30:00', 'Ativo'),
('2024-06-05 04:30:00', '2025-04-01 04:30:00', 'Inativo'),
('2024-07-10 04:30:00', '2025-05-10 04:30:00', 'Ativo');

INSERT INTO tb_address (rua, cidade, estado, cep) VALUES
('Avenida Paulista', 'Sao Paulo', 'SP', 01311000),
('Rua XV de Novembro', 'Curitiba', 'PR', 80020010),
('Rua da Aurora', 'Recife', 'PE', 50050000),
('Avenida Afonso Pena', 'Belo Horizonte', 'MG', 30130160),
('Rua das Acacias', 'Porto Alegre', 'RS', 90480120),
('Rua Barao do Rio Branco', 'Natal', 'RN', 59025100),
('Rua Sete de Setembro', 'Salvador', 'BA', 40060120),
('Avenida Getulio Vargas', 'Manaus', 'AM', 69020010),
('Rua das Palmeiras', 'Florianopolis', 'SC', 88010000);

INSERT INTO tb_address (rua, cidade, estado, cep) VALUES
('Rua São Bento', 'Sao Paulo', 'SP', 01010000),
('Avenida Brasil', 'Rio de Janeiro', 'RJ', 22290060),
('Rua das Flores', 'Curitiba', 'PR', 80020030),
('Rua do Sol', 'Recife', 'PE', 50030040),
('Avenida Amazonas', 'Belo Horizonte', 'MG', 30180000),
('Rua Dona Laura', 'Porto Alegre', 'RS', 90430090),
('Rua João Pessoa', 'Natal', 'RN', 59010000),
('Rua Chile', 'Salvador', 'BA', 40020030),
('Avenida Djalma Batista', 'Manaus', 'AM', 69050001),
('Rua Felipe Schmidt', 'Florianopolis', 'SC', 88010030),
('Rua Augusta', 'Sao Paulo', 'SP', 01305000),
('Rua Visconde de Pirajá', 'Rio de Janeiro', 'RJ', 22410001),
('Rua Marechal Deodoro', 'Curitiba', 'PR', 80010010),
('Avenida Conde da Boa Vista', 'Recife', 'PE', 50060000),
('Rua da Bahia', 'Belo Horizonte', 'MG', 30160010),
('Rua Padre Chagas', 'Porto Alegre', 'RS', 90430020),
('Rua Seridó', 'Natal', 'RN', 59022000),
('Rua Carlos Gomes', 'Salvador', 'BA', 40060020),
('Rua Ramos Ferreira', 'Manaus', 'AM', 69010000),
('Rua Almirante Alvim', 'Florianopolis', 'SC', 88015000);
/*INSERT INTO tb_cliente (name, cpf, income, birth_date, childrem) VALUES
('João Silva', '123.456.789-02', 2500.00, '1985-05-15 00:00:00', 2),
('Juliana Castro', '951.753.852-91', 4300.25, '1991-02-28 00:00:00', 2);
*/
INSERT INTO tb_cliente (name, cpf, income, birth_date, childrem, address_fk) VALUES
('João Silva', '123.456.789-01', 2500.00, '1985-05-15 00:00:00', 2, 1),
('Maria Oliveira', '987.654.321-09', 3200.50, '1990-08-22 00:00:00', 1, 2),
('Carlos Souza', '456.789.123-45', 1800.75, '1995-11-30 00:00:00', 0, 3),
('Ana Pereira', '789.123.456-78', 4200.00, '1982-03-10 00:00:00', 3, 4),
('Pedro Costa', '321.654.987-32', 2900.25, '1988-07-18 00:00:00', 1, 5),
('Lucia Santos', '654.321.987-65', 3800.00, '1992-09-25 00:00:00', 2, 6),
('Marcos Rocha', '147.258.369-14', 5100.50, '1980-12-05 00:00:00', 4, 7),
('Fernanda Lima', '258.369.147-25', 2700.75, '1993-04-20 00:00:00', 0, 8),
('Ricardo Alves', '369.147.258-36', 3500.00, '1987-06-12 00:00:00', 1, 9),
('Juliana Castro', '951.753.852-96', 4300.25, '1991-02-28 00:00:00', 2, 10);

INSERT INTO tb_curso (Curso, cargahoraria) VALUES
('Informática Básica', 40),
('Administração', 60),
('Enfermagem', 80),
('Logística', 50),
('Programação Java', 90);

INSERT INTO tb_categoria (escolaridade, curso) VALUES 
('Ensino Médio Completo', 'Administração'),
('Ensino Superior Incompleto', 'Engenharia'),
('Pós-Graduação', 'Direito');

-- João Silva -> Ensino Médio (categoria_id = 1)
UPDATE tb_cliente SET categoria_id = 1 WHERE cpf = '123.456.789-01';

-- Maria Oliveira -> Ensino Superior (categoria_id = 2)
UPDATE tb_cliente SET categoria_id = 2 WHERE cpf = '987.654.321-09';

-- Carlos Souza -> Ensino Médio
UPDATE tb_cliente SET categoria_id = 1 WHERE cpf = '456.789.123-45';

-- Ana Pereira -> Pós-graduação
UPDATE tb_cliente SET categoria_id = 3 WHERE cpf = '789.123.456-78';

-- Pedro Costa -> Ensino Superior
UPDATE tb_cliente SET categoria_id = 2 WHERE cpf = '321.654.987-32';

-- Lucia Santos -> Ensino Médio
UPDATE tb_cliente SET categoria_id = 1 WHERE cpf = '654.321.987-65';

-- Marcos Rocha -> Pós-graduação
UPDATE tb_cliente SET categoria_id = 3 WHERE cpf = '147.258.369-14';

-- Fernanda Lima -> Ensino Superior
UPDATE tb_cliente SET categoria_id = 2 WHERE cpf = '258.369.147-25';

-- Ricardo Alves -> Ensino Médio
UPDATE tb_cliente SET categoria_id = 1 WHERE cpf = '369.147.258-36';

-- Juliana Castro -> Pós-graduação
UPDATE tb_cliente SET categoria_id = 3 WHERE cpf = '951.753.852-96';

/*INSERT INTO tb_matricula (inicio_matricula, fim_matricula, status) VALUES
('2024-01-10T04:30:00Z', '2024-11-15T04:30:00Z', 'Inativo'),
('2024-02-05T04:30:00Z', '2024-12-10T04:30:00Z', 'Inativo'),
('2024-03-01T04:30:00Z', '2025-01-10T04:30:00Z', 'Ativo'),
('2024-01-20T04:30:00Z', '2024-10-25T04:30:00Z', 'Inativo'),
('2024-04-10T04:30:00Z', '2025-02-15T04:30:00Z', 'Ativo'),
('2024-05-15T04:30:00Z', '2025-03-20T04:30:00Z', 'Ativo'),
('2024-03-25T04:30:00Z', '2025-01-30T04:30:00Z', 'Ativo'),
('2024-02-28T04:30:00Z', '2024-12-05T04:30:00Z', 'Inativo'),
('2024-06-05T04:30:00Z', '2025-04-01T04:30:00Z', 'Ativo'),
('2024-07-10T04:30:00Z', '2025-05-10T04:30:00Z', 'Ativo');

INSERT INTO tb_matricula (inicio_matricula, fim_matricula, status) VALUES
('2025-01-05T04:30:00Z', '2025-09-10T04:30:00Z', 'Ativo'),
('2025-02-12T04:30:00Z', '2025-10-15T04:30:00Z', 'Inativo'),
('2025-03-18T04:30:00Z', '2025-11-20T04:30:00Z', 'Ativo'),
('2025-04-01T04:30:00Z', '2025-12-01T04:30:00Z', 'Inativo'),
('2025-05-10T04:30:00Z', '2026-01-05T04:30:00Z', 'Ativo'),
('2025-06-15T04:30:00Z', '2026-02-10T04:30:00Z', 'Inativo'),
('2025-07-22T04:30:00Z', '2026-03-15T04:30:00Z', 'Ativo'),
('2025-08-30T04:30:00Z', '2026-04-20T04:30:00Z', 'Inativo'),
('2025-09-12T04:30:00Z', '2026-05-25T04:30:00Z', 'Ativo'),
('2025-10-28T04:30:00Z', '2026-06-30T04:30:00Z', 'Inativo');

-- Lote 2: Ano base 2026
INSERT INTO tb_matricula (inicio_matricula, fim_matricula, status) VALUES
('2026-01-03T04:30:00Z', '2026-09-07T04:30:00Z', 'Ativo'),
('2026-02-14T04:30:00Z', '2026-10-12T04:30:00Z', 'Inativo'),
('2026-03-25T04:30:00Z', '2026-11-17T04:30:00Z', 'Ativo'),
('2026-04-06T04:30:00Z', '2026-12-22T04:30:00Z', 'Inativo'),
('2026-05-17T04:30:00Z', '2027-01-27T04:30:00Z', 'Ativo'),
('2026-06-28T04:30:00Z', '2027-02-28T04:30:00Z', 'Inativo'),
('2026-07-09T04:30:00Z', '2027-03-15T04:30:00Z', 'Ativo'),
('2026-08-20T04:30:00Z', '2027-04-19T04:30:00Z', 'Inativo'),
('2026-09-30T04:30:00Z', '2027-05-24T04:30:00Z', 'Ativo'),
('2026-10-15T04:30:00Z', '2027-06-29T04:30:00Z', 'Inativo');

-- Lote 3: Ano base 2027
INSERT INTO tb_matricula (inicio_matricula, fim_matricula, status) VALUES
('2027-01-10T04:30:00Z', '2027-09-13T04:30:00Z', 'Ativo'),
('2027-02-21T04:30:00Z', '2027-10-18T04:30:00Z', 'Inativo'),
('2027-03-11T04:30:00Z', '2027-11-23T04:30:00Z', 'Ativo'),
('2027-04-22T04:30:00Z', '2027-12-28T04:30:00Z', 'Inativo'),
('2027-05-03T04:30:00Z', '2028-01-02T04:30:00Z', 'Ativo'),
('2027-06-14T04:30:00Z', '2028-02-06T04:30:00Z', 'Inativo'),
('2027-07-25T04:30:00Z', '2028-03-12T04:30:00Z', 'Ativo'),
('2027-08-05T04:30:00Z', '2028-04-16T04:30:00Z', 'Inativo'),
('2027-09-16T04:30:00Z', '2028-05-21T04:30:00Z', 'Ativo'),
('2027-10-27T04:30:00Z', '2028-06-25T04:30:00Z', 'Inativo');
*/
