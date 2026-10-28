# 📜 Gerador de Frases

Uma API REST desenvolvida em Java com Spring Boot que consome uma API externa para obter frases estoicas e disponibilizá-las por meio de um endpoint próprio.

O projeto tem como objetivo praticar o desenvolvimento de APIs REST, o consumo de serviços externos, a manipulação de dados JSON e o tratamento de respostas HTTP.

## 🚀 Tecnologias utilizadas

- **Java 25** — linguagem de programação.
- **Spring Boot 4.1.1** — framework para desenvolvimento da aplicação.
- **Maven** — gerenciamento de dependências e build.
- **HttpClient** — realização de requisições HTTP para a API externa.
- **Jackson** — conversão e manipulação de dados JSON.

## ⚙️ Funcionalidades

- Consultar uma frase estoica por meio de um endpoint REST.
- Consumir dados de uma API externa.
- Processar a resposta JSON recebida.
- Retornar os dados obtidos por meio da própria aplicação.

## 🔗 Endpoint

| Método | Endpoint | Descrição |
|---|---|---|
| GET | `/frasedodia` | Consulta e retorna uma frase estoica. |

## 📦 Como executar o projeto

### Pré-requisitos

- Java 25 ou versão compatível com a configuração do projeto.
- Maven instalado ou Maven Wrapper disponível no repositório.
- Git.

### 1. Clone o repositório

```bash
git clone https://github.com/LiuzziRD/gerador-de-frases.git
```

### 2. Entre na pasta do projeto

```bash
cd gerador-de-frases
```

### 3. Execute a aplicação

Se o projeto tiver Maven Wrapper no Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

Ou, caso tenha o Maven instalado:

```bash
mvn spring-boot:run
```

### 4. Acesse o endpoint

Com a aplicação em execução, acesse:

```text
http://localhost:8080/frasedodia
```

A resposta depende dos dados retornados pela API externa.

## 🧠 Aprendizados

Durante o desenvolvimento deste projeto, estou praticando:

- Criação de endpoints REST com Spring Boot.
- Consumo de APIs externas utilizando requisições HTTP.
- Desserialização de JSON com Jackson.
- Organização de componentes e configuração da aplicação.
- Tratamento de respostas HTTP e evolução do tratamento de exceções.

## 📌 Próximos passos

- Implementar um tratamento personalizado de exceções.
- Padronizar as respostas de erro em JSON.
- Melhorar a validação e o tratamento de falhas na comunicação com a API externa.
- Adicionar testes automatizados.

## 👨‍💻 Autor

**Rogério Liuzzi**

Estudante de Ciência da Computação, com interesse em desenvolvimento back-end. 

- GitHub: [@LiuzziRD](https://github.com/LiuzziRD)
