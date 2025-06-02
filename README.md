# Projeto Java Maven - Estudo de Tecnologias com Spring Boot (Java 21)

Este projeto tem como objetivo servir de base para estudo de tecnologias modernas com **Java 21** e **Spring Boot**. Cada branch contém uma tecnologia ou conceito específico, sendo a `main` a branch que consolida todas as funcionalidades estudadas.

---

## ✅ Requisitos

- Java 21 (JDK)
- Maven 3.8+
- Git
- IDE recomendada: IntelliJ IDEA ou VS Code com extensão Java

---

## 🚀 Como rodar o projeto

1. **Clone o repositório**

```bash
git clone https://github.com/Girdacio/spring_sample_mvn_java24.git
cd seu-repositorio
```

2. **Escolha a branch que deseja testar**

```bash
git checkout nome-da-branch
```

> Por exemplo:
> `git checkout log4j2`

3. **Compile e rode o projeto**

```bash
./mvnw spring-boot:run
```

> Se não estiver usando o wrapper (`mvnw`), use:

```bash
mvn spring-boot:run
```

---

## 🧪 Como instalar as dependências

O Maven resolve automaticamente as dependências declaradas no `pom.xml`. Basta rodar qualquer comando Maven (`mvn compile`, `mvn clean`, `mvn spring-boot:run`) que ele fará o download de tudo necessário.

Caso queira forçar a atualização das dependências:

```bash
mvn clean install -U
```

---

## 🌿 Estrutura de Branches

Cada branch neste repositório representa o estudo ou implementação de uma tecnologia específica:

| Branch        | Tecnologia Estudada       | Descrição                                                   |
|---------------|---------------------------|-------------------------------------------------------------|
| `main`        | Todas                     | Consolida todas as funcionalidades em um único projeto      |
| `jwt`         | JWT (JSON Web Token)      | Implementação de autenticação via token                     |
| `log4j2`      | Log4j2                    | Sistema de logging com níveis e configuração avançada       |
| `sagemaker`   | AWS SageMaker             | Integração com IA para análise de dados                     |
| `splunk`      | Splunk + Log4j2           | Envio de logs para um servidor Splunk via HTTP Appender     |
| `security`    | Spring Security           | Regras básicas de segurança e autenticação com configuração |
| `openapi`     | OpenAPI / Swagger         | Documentação automática dos endpoints REST                  |

> Para estudar cada tecnologia isoladamente, basta trocar para a branch correspondente.

---

## 🛠 Tecnologias Utilizadas

- Java 21
- Spring Boot
- Maven
- Log4j2
- JWT
- Spring Security
- Swagger (OpenAPI)
- AWS SDK (SageMaker / Bedrock em branches específicas)

---

## 📦 Estrutura Básica do Projeto

```
src/
 └── main/
     ├── java/
     │   └── com.seuprojeto/
     │       ├── controller/
     │       ├── service/
     │       └── config/
     └── resources/
         ├── application.properties
         └── log4j2.xml (se aplicável)
```

---

## 📢 Contribuindo

Esse projeto é voltado para fins de estudo. Sinta-se livre para abrir *pull requests* com melhorias, correções ou novas tecnologias!

---

## 👤 Autor

**Girdácio Pereira**  
🔗 [GitHub](https://github.com/Girdacio)  
🔗 [LinkedIn](https://www.linkedin.com/in/girdacio/)

---

## 📚 Referências úteis

- [Documentação Spring Boot](https://spring.io/projects/spring-boot)
- [Guia Maven](https://maven.apache.org/guides/)
- [JWT.io](https://jwt.io/)
- [Log4j2](https://logging.apache.org/log4j/2.x/)
- [AWS SageMaker](https://aws.amazon.com/sagemaker/)
- [Swagger OpenAPI](https://swagger.io/tools/swagger-ui/)

---

> Projeto mantido para fins educacionais. Ideal para profissionais que desejam consolidar conhecimentos em desenvolvimento backend moderno com Java e Spring.