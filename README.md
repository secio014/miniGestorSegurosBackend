# Mini Gestor de Seguros - Backend ⚙️

API robusta desenvolvida em Java para suporte ao sistema de gerenciamento de seguros. O foco do projeto é a implementação de uma arquitetura escalável utilizando banco de dados NoSQL.

## 🚀 Stack Tecnológica

* **Java 17**: Versão LTS para máxima performance e estabilidade.
* **Spring Boot 4.0.3**: Framework para construção da API REST e injeção de dependências.
* **MongoDB**: Banco de dados NoSQL para armazenamento flexível de documentos.
* **Spring Data MongoDB**: Abstração da camada de repositório para operações fluídas com o banco.

## 📋 Endpoints da API

A API expõe os seguintes recursos:

### Clientes
* `GET /clientes`: Retorna a lista de todos os clientes.
* `POST /clientes`: Salva um novo registro de cliente.

### Seguros
* `GET /seguros`: Retorna a lista de todos os seguros cadastrados.
* `POST /seguros`: Salva um novo seguro.

## ⚙️ Configurações Aplicadas
* **CORS**: Habilitado para permitir a comunicação com o frontend Angular.
* **Porta**: O servidor executa por padrão na porta `8081`.

## 🏁 Como Executar

1.  Certifique-se de ter o **MongoDB** ativo.
2.  Execute via Maven: `./mvnw spring-boot:run`

---
Desenvolvido por **Pedro Schmitz Sécio** – [LinkedIn](https://www.linkedin.com/in/pedro-schmitz014)