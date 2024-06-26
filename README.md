# dio-java-basico
Repositório para armazenar conteúdo da DIO Java Básico.


# API rest - NUVEM 2024
Java RESTful API criada para praticar, com uso de Spring Web, Spring JPA, Banco de Dados H2, PostgreSQL e Railway.
Diagrama feito com mermaid.

## Diagrama de Classes

```mermaid

classDiagram
    class User {
        +String name
        +Account account
        +List~Feature~ features
        +Card card
        +List~News~ news
    }

    class Account {
        +String number
        +String agency
        +float balance
        +float limit
    }

    class Feature {
        +String icon
        +String description
    }

    class Card {
        +String number
        +float limit
    }

    class News {
        +String icon
        +String description
    }

    User *-- Account
    User *-- Feature
    User *-- Card
    User *-- News

