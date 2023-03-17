/*Escreva uma consulta que retorne o nome do cliente, a soma do valor total das compras
 e o número total de pedidos feitos por cada cliente, apenas para aqueles que fizeram 
 pelo menos três pedidos. Use um inner join entre as tabelas "clientes" e "pedidos" 
 e agrupe os resultados pelo nome do cliente*/
SELECT c.nome, SUM(p.total) as total_compras, COUNT(p.id) as total_pedidos
FROM clientes c
INNER JOIN pedidos p ON c.id = p.id_cliente
GROUP BY c.nome
HAVING COUNT(p.id) >= 3;

/*Escreva uma consulta que retorne o nome do produto, a média do preço de venda e a 
soma total de unidades vendidas por categoria de produto. Use um left join entre as 
tabelas "produtos" e "vendas" e agrupe os resultados pela categoria do produto.
*/
SELECT p.nome AS nome_produto, AVG(vp.preco) AS media_preco_venda, SUM(vp.quantidadel) AS total_unidades_vendidas, c.nome AS categoria
FROM produtos p
	LEFT JOIN vendas_produtos vp ON p.id = vp.id_produto
	LEFT JOIN produtos_categorias pc ON p.id_categoria = pc.id
	LEFT JOIN categorias c ON pc.id_categoria = c.id
GROUP BY p.nome, C.nome

/*Escreva uma consulta que retorne o nome do fornecedor, o nome do produto e o número 
total de unidades compradas por fornecedor e por produto, apenas para aqueles com mais
 de 100 unidades compradas. Use um inner join entre as tabelas "fornecedores", 
 "produtos" e "compras" e agrupe os resultados pelo nome do fornecedor e pelo nome 
 do produto.
*/
SELECT f.nome AS nome_fornecedor, p.nome AS nome_produto,  SUM (cp.unidades) AS unidades_compradas
FROM fornecedores f
	INNER JOIN compras c  ON f.id = c.id_fornecedores
	INNER JOIN compras_produtos cp ON cp.id_compra = p.id
	INNER JOIN produtos p ON p.id = cp.id
GROUP BY f.nome, p.nome
HAVING SUM  (cp.unidades) > 100;

/*Escreva uma consulta que retorne o nome do departamento, o nome do funcionário e a 
média do salário dos funcionários em cada departamento, apenas para aqueles com uma 
média de salário superior a R$ 5000. Use um left join entre as tabelas "funcionarios" 
e "departamentos" e agrupe os resultados pelo nome do departamento e pelo nome do 
funcionário.
*/
SELECT d.nome AS nome_departamento, f.nome AS nome_funcionario, AVG(f.salario) AS Media_salarios_funcionarios
FROM funcionarios f
	LEFT JOIN departamentos d ON f.id_departamento = d.id
GROUP BY d.nome, f.nome
HAVING AVG (f.salario)> 5000;

/*Escreva uma consulta que retorne o nome do cliente, o nome do produto e a soma do 
valor total das compras feitas por cada cliente para cada produto. Use um right join 
entre as tabelas "clientes" e "compras" e um inner join entre as tabelas "produtos" 
e "compras" e agrupe os resultados pelo nome do cliente e pelo nome do produto.
*/
SELECT cl.nome AS nome_cliente, p.nome AS nome_produto, SUM (c.total) AS total_compras_clientes
FROM compras c
	INNER JOIN produtos p ON c.id_produto = p.id
	RIGHT JOIN clientes cl ON c.id_cliente = cl.id
GROUP BY cl.nome, p.nome

