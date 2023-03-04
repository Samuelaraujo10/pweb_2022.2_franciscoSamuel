package br.com.samuel.cadpessoas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.samuel.cadpessoas.model.Pessoa;
import br.com.samuel.cadpessoas.repositories.PessoaRepository;

@Controller
@RequestMapping("/")
public class PessoaController {
  @Autowired
  PessoaRepository pessoaRepo;

  public PessoaController(PessoaRepository pessoaRepo) {
    this.pessoaRepo = pessoaRepo;
  }

  // raiz do site localhost:8080/
  @GetMapping
  public String index() {
    return "index.html";
  }

  @GetMapping("/listarPessoas")
  public ModelAndView listarPessas() {
    List<Pessoa> todasAsPessoas = pessoaRepo.findAll();
    ModelAndView modelAndView = new ModelAndView("ListarPessoas");
    modelAndView.addObject("todasAsPessoas", todasAsPessoas);
    return modelAndView;
  }

}
