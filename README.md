# Documentação do Uso do Singleton Lazy
O Singleton Lazy é um padrão de projeto que garante que apenas uma instância de uma classe seja criada e compartilhada em toda a aplicação. 
Nesta documentação, explicaremos como o Singleton Lazy foi aplicado no contexto do nosso projeto e por que o escolhemos.

## Testes Realizados
Para verificar o funcionamento do Singleton Lazy, foram realizados os seguintes testes:

Foram criadas múltiplas instâncias de `SingletonLazy` e verificamos se todas se referem à mesma instância de `AppConfig`. 
Os resultados demonstraram que as instâncias compartilham a mesma instância de `AppConfig`.
## Benefícios do Singleton Lazy
O uso do Singleton Lazy oferece benefícios significativos ao nosso projeto, incluindo:

Economia de recursos, uma vez que apenas uma instância de `AppConfig` é criada e compartilhada,
Garantia de consistência, pois todas as partes da aplicação usam a mesma configuração,
Facilidade de acesso às configurações do aplicativo a partir de qualquer parte do código.
## Conclusão
O uso do Singleton Lazy é uma escolha acertada para garantir a criação de uma única instância de `AppConfig` em minha aplicação. 
Oferece eficiência e consistência, tornando o acesso e a modificação das configurações do aplicativo uma tarefa fácil e segura.


