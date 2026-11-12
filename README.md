# PWCommerce

Backend acadêmico de comércio eletrônico desenvolvido na UTFPR com Java e Spring Boot.

## Recursos

- Categorias e produtos.
- Cadastro de usuários.
- Componentes de autenticação e autorização com JWT.
- Validação de nomes de usuário e tratamento de erros.
- Persistência com Spring Data JPA.

## Executar localmente

Instale o JDK definido em pom.xml e execute na raiz:

```bash
sh mvnw spring-boot:run
```

A configuração em src/main/resources/application.yml utiliza a porta 8025 e habilita o console H2 em /h2-console. Confira os parâmetros do banco e a configuração de segurança antes de testar as rotas.

## Organização

Controllers recebem as requisições; services implementam as operações; repositories acessam os modelos persistidos. Os componentes de segurança estão em security/.

## Testes

```bash
sh mvnw test
```

## Contexto

Projeto de aprendizado de APIs REST, validação, autenticação e persistência. Não representa uma operação comercial.
