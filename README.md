
![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/SpringBoot-Backend-green)
![H2](https://img.shields.io/badge/Database-H2-blue)

# 🥷 Cadastro de Ninjas API

API REST desenvolvida com **Spring Boot** para gerenciamento de **Ninjas e Missões**, inspirada no universo de **Naruto**.

O sistema permite criar, atualizar, listar e deletar ninjas e missões, além de associar ninjas a missões específicas.

Este projeto foi desenvolvido com foco em **boas práticas de arquitetura backend**, utilizando camadas separadas, DTOs e mappers para evitar problemas comuns como **loops de serialização em relações JPA**.

---

# 🚀 Tecnologias Utilizadas

### Backend
- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate

### Banco de dados
- H2 Database

### Ferramentas
- Postman (testes da API)
- Maven
- Lombok

---

# 🏗 Arquitetura do Projeto

O projeto segue uma arquitetura em camadas comum em aplicações backend Java:

Controller

↓

Service

↓

Repository



Além disso, utiliza **DTO e Mapper** para controlar os dados expostos na API.

---

# 📂 Estrutura do Projeto

↓

Database

CadastroNinjas

┣ Ninjas

┃ ┣ Controller

┃ ┣ DTO

┃ ┣ Model

┃ ┣ Repository

┃ ┗ Service

┣ missoes

┃ ┣ Controller

┃ ┣ DTO

┃ ┣ Model

┃ ┣ Repository

┃ ┗ Service

┗ CadastroNinjasApplication


---

# 📦 Modelos do Sistema

## 🥷 Ninja

Representa um ninja cadastrado no sistema.

Campos principais:

- id
- nome
- rankingNinja
- email
- idade
- missoes

Um ninja pode estar associado a **uma missão**.

---

## 📜 Missão

Representa uma missão disponível para ninjas.

Campos principais:

- id
- nome
- dificuldade
- lista de ninjas

Uma missão pode ter **vários ninjas associados**.

---

## 🔄 DTOs

DTOs foram utilizados para:

- evitar **loop infinito de serialização**
- controlar dados retornados pela API
- desacoplar entidades do banco das respostas HTTP

### NinjaDTO

```json
{
  "id": 1,
  "nome": "Naruto",
  "rankingNinja": "GENIN",
  "email": "naruto@konoha.com",
  "idade": 16,
  "idMissao": 2,
  "nomeMissao": "Salvar cachorro"
}
```

### MissaoDTO

```json
{
  "id": 1,
  "nome": "Salvar cachorro",
  "dificuldade": "D",
  "ninjas": [
    {
      "nome": "Naruto",
      "rankingNinja": "GENIN"
    }
  ]
}

```
---
# ⚙️ Endpoints da API

## 🥷 Ninjas

Listar ninjas

`GET http://localhost:8080/ninjas/listar`

Buscar ninja por ID

`GET /ninjas/listarID/{id}`

Criar ninja

`POST /ninjas/criar`

```Exemplo de JSON
{
  "nome": "Naruto",
  "rankingNinja": "GENIN",
  "email": "naruto@konoha.com",
  "idade": 16,
  "idMissao": 1
}
```

Deletar ninja

`
DELETE /ninjas/deletar/{id}
`

Atualizar ninja

`PUT /ninjas/alterar/{id}`

```
{
  "nome": "Naruto",
  "rankingNinja": "GENIN",
  "email": "naruto@konoha.com",
  "idade": 16,
  "idMissao": 1
}
```

## 📜 Missões

Listar missões

`GET http://localhost:8080/missoes/listar`

Buscar ninja por ID

`GET /missoes/listarID/{id}`

Criar missões

`POST /missoes/criar`

```Exemplo de JSON
{
  "nome": "Salvar cachorro",
  "dificuldade": "D"
}
```

Deletar missões

`
DELETE /missoes/deletar/{id}
`

Atualizar missões

`PUT /missoes/alterar/{id}`

```
{
  "nome": "Salvar cachorro",
  "dificuldade": "D"
}
```

---

# 🧪 Testes da API

A API foi testada utilizando Postman.

Workspace utilizado:

`21567dd1-82e0-44f6-8c91-2095f300f68b`

Com o Postman é possível testar todas as operações da API, como:

-Criar ninjas

-Criar missões

-Associar ninjas a missões

-Atualizar informações

-Deletar registros

-Verificar as respostas JSON da API

---

# 🗄 Banco de Dados

O projeto utiliza H2 Database, um banco em memória ideal para desenvolvimento e testes.

Console do H2:

`http://localhost:8080/h2-console`


---

# ▶ Como Executar o Projeto

1️⃣ Clonar o repositório
`git clone https://github.com/seuusuario/cadastro-ninjas.git`

2️⃣ Entrar na pasta do projeto
`cd cadastro-ninjas`

3️⃣ Rodar o projeto
`mvn spring-boot:run`

Ou executar a classe principal:

CadastroNinjasApplication

4️⃣ Acessar a API
`http://localhost:8080`

---

# 👨‍💻 Autor

### Vinicius Alves Santana

Estudante de Engenharia da computação
Desenvolvedor Back-End
