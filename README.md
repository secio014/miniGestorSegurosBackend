# Mini Gestor de Seguros - Backend ⚙️

Backend robusto desenvolvido em Java para suportar as operações do sistema de seguros. O projeto foi estruturado para simular um ambiente real de produção, focando em escalabilidade e boas práticas.

## 🚀 Tecnologias e Conceitos Estudados

* **Spring Boot 4**: Utilização do framework mais popular do ecossistema Java para criação de microserviços e APIs REST.
* **Java 17**: Uso da versão de suporte de longo prazo (LTS) do Java para aproveitar as melhorias de performance e sintaxe.
* **MongoDB**: Implementação de banco de dados NoSQL para armazenamento flexível de documentos de clientes e apólices.
* **Arquitetura REST**: Exposição de endpoints para operações de CRUD (Create, Read, Update, Delete).
* **CORS Configuration**: Configuração de segurança para permitir a comunicação controlada entre o frontend (Angular) e o backend.

## 🛠️ Como Executar o Projeto

1.  Certifique-se de ter o **Java 17** e o **Maven** instalados.
2.  Verifique se o seu serviço **MongoDB** está ativo na máquina ou via container.
3.  Execute a aplicação através da sua IDE (IntelliJ/Eclipse) ou via linha de comando:
    ```bash
    ./mvnw spring-boot:run
    ```
4.  A API estará disponível por padrão na porta `8081`.

## 📋 Endpoints Principais
* `GET /clientes`: Lista todos os clientes cadastrados.
* `POST /clientes`: Registra um novo cliente.