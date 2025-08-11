
# Livraria-API

Uma API de CRUD sobre uma Livraria. Nela você pode criar, deletar, buscar e atualizar um Livro e um Autor. Também será possivel cadastrar um livro sem conhecer o autor.


## Instalação

Certifique-se que você possui instalado o:
```
- Java e JDK
- Intellij, Eclipse ou VScode
- Postman ou Insomnia
```
    
## Diagrama do Projeto

<p align="center">
    <img width="791" height="184" alt="leandro-project-img" src="https://github.com/user-attachments/assets/3ca800e6-0acb-4c4c-8a45-928f6369060f" />
</p>

## Algumas Funcionalidades da API

#### Retorna todos os Livros

```http
  GET /livros
```

| Descrição                           |
| :---------------------------------- |
 **Retorna todos os livros do sistema** |

#### Retorna um Livro por ID

```http
  GET /livros/{id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `long` | **Retorna o Livro do ID que foi passado**. |

#### Adiciona um Livro

```http
  POST /livros
```
| Descrição                           |
| :---------------------------------- |
 **Os dados do Livro devem ser feitos em JSON** |

```json
{
    "nome": "Nome do Livro"
}
```

#### Deleta um Livro

```http
  DELETE /livros/{id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `long` | **Deleta o Livro do ID que foi passado**. |

#### Atualiza um Livro

```http
  PUT /livros/{id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `long` | **Atualiza o nome do Livro cujo ID foi passado**. |

```json
{
    "nome": "Novo Nome"
}
```



## Tecnologias

Esse projeto utiliza as seguintes tecnologias:

- Java
- Spring Web
- Spring Data JPA
- Lombok
- Banco de Dados H2


## Run

Para rodar o projeto utilize o comando:

```bash
  mvn spring-boot:run
```

