 projeto-MODULO_32
 Projeto de API com Spring Boot e JPA

Este projeto foi desenvolvido como parte de uma avaliação de backend, demonstrando a criação de uma API RESTful em Java com Spring Boot, utilizando o mapeamento Objeto-Relacional (ORM) com Spring Data JPA para persistência de dados.

 Objetivo do Projeto

O objetivo principal é atender aos seguintes requisitos:
1.  Criação de um projeto Spring Boot estruturado e funcional.
2.  Definição de uma entidade de domínio(`Produto`) com suas propriedades.
3.  Mapeamento da entidade para o banco de dados utilizando anotações da Jakarta Persistence API (JPA).
4.  Configuração da aplicação para que o schema do banco de dados seja criado ou atualizado automaticamente na inicialização, comprovando o funcionamento do mapeamento ORM.



 Tecnologias Utilizadas

   Java 17: Linguagem de programação principal.
   Spring Boot: Framework para criação de aplicações stand-alone e APIs REST.
   Spring Data JPA: Facilita a criação de repositórios e a persistência de dados.

   Hibernate: Implementação do JPA utilizada pelo Spring para o mapeamento objeto-relacional.
  PostgreSQL: Banco de dados relacional utilizado para a persistência dos dados.
  Maven:Ferramenta para gerenciamento de dependências e build do projeto.
  Lombok: Biblioteca para reduzir código boilerplate (getters, setters, construtores).



 Requisitos Cumpridos

O projeto atende a todas as exigências da avaliação:

Classe `Produto` Criada:** A entidade `Produto.java` foi criada no pacote `com.example.produtos` e contém 3 propriedades principais (`nome`, `preco`, `quantidade`), além de um `id` autogerado.

  Mapeamento JPA Realizado:** A classe `Produto` está anotada com `@Entity`, `@Id` e `@GeneratedValue`, garantindo que o Hibernate a reconheça como uma tabela a ser gerenciada no banco de dados.

  Criação Automática da Tabela: O arquivo `application.properties` foi configurado com a propriedade `spring.jpa.hibernate.ddl-auto=update`. Esta instrução garante que, ao iniciar a aplicação, o Spring Data JPA verifique a existência da tabela `produto` no banco de dados PostgreSQL e a crie ou atualize conforme a definição da entidade `Produto.java`. A inicialização bem-sucedida da aplicação comprova que este processo ocorreu como esperado.


 Como Executar o Projeto

Pré-requisitos:
   Java JDK 17 (ou superior).
  Maven 3.x.
   Uma instância do PostgreSQL rodando e acessível.

