package br.com.avestruzvoador.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
//http://localhost:8080/ -------
public class MinhaPrimeiraController {
  
  /*
   * GET - Buscar
   * POST - Adicionar
   * PUT - Alterar
   * DELETE - Remover
   * PATCH - Alterar somente uma parte da info/dado
   */

   //Método (funcionalidade) de uma classe
  @GetMapping("/primeiroMetodo")
  public String primeiraMensagem() {
    return "Funcionou";
  }
}
