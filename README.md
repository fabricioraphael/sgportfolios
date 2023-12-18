<h4> sgportfolios </h4>

<hr>

<h3 align="center">
    Portfolios Manager
    <br>
    Project to manager portfolios
    <br><br>
</h3>

<hr>

## 🔖 About

A system to manage a company's project portfolio data. Understand the project portfolio as the collection of projects within the company, including both ongoing projects and those under feasibility analysis


---

## 👨‍💻 Author

* [Fabrício Raphael](https://www.linkedin.com/in/fabricioraphael/)

---

## 🚀 Tecnologies

- Backend:
    - [Java 17](https://openjdk.org/projects/jdk/17/)
    - [Spring MVC](https://spring.io/guides/gs/serving-web-content/)
    - [Apache Maven](https://maven.apache.org/)
- Design
  - [DDD - Domain Driven Design](https://en.wikipedia.org/wiki/Domain-driven_design)
  - [Clean Architecture](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html)
- Database:
    - [PostgreSQL](https://www.postgresql.org/)
- Tools
    - [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/)
    - [Postman](http://www.postman.com/downloads/)
    - [Git](https://git-scm.com/downloads)
    - [Docker](https://docs.docker.com/desktop/install/mac-install/)

---

---
## Requirements:

- Regras de negócio:
  - [ ] O sistema deve permitir o cadastro (inserção, exclusão, alteração e consulta) de projetos. Para cada projeto devem ser informados: nome, data de início, gerente responsável, previsão de término, data real de término, orçamento total, descrição e status.
  - [ ] Os projetos devem ser classificados em: baixo risco, médio risco e alto risco. A classificação de risco não é cadastrada no sistema.
  - [ ] A cada instante, o projeto deve estar em um status específico e único. Os status possíveis não são cadastrados no sistema e são: em análise, análise realizada, análise aprovada, iniciado, planejado, em andamento, encerrado, cancelado.
  - [ ] Se um projeto foi mudado o status para iniciado, em andamento ou encerrado não pode mais ser excluído
  - [ ] O sistema não deve permitir o cadastro de um novo membro diretamente. Deve ser provida funcionalidade via web service, contendo nome e atribuição (cargo).
  - [ ] O sistema deve permitir associar membros aos projetos que tem atribuição funcionário .


- Regras de implementação:
  - [ ] • Persistir as informações no BD enviado, utilizando os frameworks solicitados [ ] • Utilizar MVC
  - [ ] • Utilizar testes unitários para avaliar as regras;
  - [ ] • Utilizar testes unitários para avaliar as regras;
  - [ ] • Utilizar JSP com padrão Bootstrap para o front-end
---

## 📝 License

[MIT License](https://opensource.org/license/mit/) 

---