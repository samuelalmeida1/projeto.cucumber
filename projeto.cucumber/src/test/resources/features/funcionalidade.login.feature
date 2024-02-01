#Author: samuelalmeida.4@hotmail.com

@regressivo
Feature: Realizar Login
 Como usuario do site sauce demo
 Quero informar os dados de acesso
 Para acessar a area logada

Background: Acessar tela login
Given que esteja na tela de login


@positivo
Scenario: Login Valido
When coloco os dados de login
Then o login sera realizado com sucesso 
 
 @negativo
 Scenario: Login Invalido Senha não preenchida
 When preencho o user name
 And não preencho a senha
 And clico no botão de login
 Then login não sera realisado com sucesso
 
 @negativo
 Scenario: Login Invalido Usuario não preenchido
 When não preencho o usuario
 And preencho a senha
 And clico no botão de login
 Then login não sera realizado com sucesso
 
 @negativo
 Scenario: Adicionar Produto no Carrinho
 When coloco os dados de login
 And seleciono o produto 
 And clico em adicionar ao carrinho
 And clico em vizualizar no carrinho 
 Then o produto foi adicionado com sucesso
 
 
 
 
 
 