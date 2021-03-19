Feature: Login
  As a Satrack user
  I want to authenticate in the application
  to check my credentials

  @errorLogin
  Scenario: Wrong login in Satrack App
    When Susan login with wrong username testuser and password pass123
    Then she should see the error message El usuario y/o contraseña son incorrectos

