# TesteMaxi

## Distância entre duas cidades

### Objetivo
Fornecer webservice que retorna lista de combinação de pares de cidades e distância entre eles. 

### Requisitos
* webservice RESTful; 
* Java 7 ou superior; 
* Tomcat 7 ou superior; 
* Permitir parâmetro obrigatório para definir a unidade de medida (km / mi); 
* Permitir parâmetro obrigatório para definir o formato de resposta (xml / json); 
* Banco de dados do MySQL com apenas uma tabela (CITY [id, name, latitude, longitude]) e com um mínimo de 3 registros; 
* Use apenas acesso via JDBC - Não use framework de persistência, pool de conexões ou similares. 
