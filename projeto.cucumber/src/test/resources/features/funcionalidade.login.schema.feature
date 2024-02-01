#Author: samuelalmeida.4@hotmail.com


Feature: Realizar Login
 Como usuario do site sauce demo
 Quero informar os dados de acesso
 Para acessar a area logada
 
Background: Acessar tela login
  Given que esteja na tela de login

  Scenario Outline: Login utilizando Schema
    When informar o usuario <usuario>
    And informar a senha <senha>
    Then validar mensagem <mensagem>

    Examples: 
      |      usuario      |       senha        |                mensagem                 |
      |  "standard_user"  |   "secret_sauce"   |               "Products"                |
      |  "standard_user"  |        ""          |    "Epic sadface: Password is required" |
      |        ""         |   "secret_sauce"   |     "Epic sadface: Username is required"|