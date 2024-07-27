## Challenge - Components and Injection

Desenvolvido um programa utilizando Componentes e Injeção de Dependência, onde é realizado a leitura de dados via input do usuário e retornar o Valor Total da Order informada.

O valor total é retornado considerando o % de desconto informado pelo usuário, que será aplicado sobre o valor básico informado para a respectiva order. Ainda será retornado somado ao valor total, o valor do frete considerando as regras aplicadas conforme levantamento.

  -> Regra de Frete:
  
      - Order < 100.00 = 20.00
      - Order >= 100.00 e Order <= 200.00 = 12.00
      - Order > 200.00 = 0.00 (Grátis)
