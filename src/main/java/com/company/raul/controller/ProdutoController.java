package com.company.raul.controller;

import com.company.raul.model.Produto;
import com.company.raul.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/apiProduto")
public class ProdutoController {
    @Autowired
    ProdutoRepository prRepo;


    @GetMapping(value = "/todos")
    public List<Produto> buscarTodos()
    {
        return prRepo.findAll();
    }


    @GetMapping("/buscarPorCodigo/{codigoProd}")
    public Optional<Produto> buscarPorCodigo
            (@PathVariable(value="codigoProd") int codigoProd)
    {
        return prRepo.findById(codigoProd);
    }
    @GetMapping("/buscarPorInfo/{info}")
    public Optional<Produto> buscarPorInfo
            (@PathVariable(value="info") String info)
    {
        return prRepo.findById(info);
    }
    @GetMapping("/buscarPorMarca/{marca}")
    public Optional<Produto> buscarPorMarca
            (@PathVariable(value="info") String marca)
    {
        return prRepo.findById(marca);
    }
    @GetMapping("/buscarPorPreco/{preco}")
    public Optional<Produto> buscarPorPreco
            (@PathVariable(value="preco") int preco)
    {
        return prRepo.findById(preco);
    }

    @PostMapping("/inserir")
    public void inserir(@RequestBody Produto cl)
    {
        prRepo.save(cl);
    }
    @DeleteMapping("/remover")
    public void removerCliente(@RequestBody Produto cl)
    {
        prRepo.delete();
    }

    @DeleteMapping("/removerPorCodigo/{codigo}")
    public void removerPorCodigo(@PathVariable(value="codigo") int codigo)
    {
        prRepo.deleteById(codigo);
    }


    @PutMapping("/atualizar")
    public void atualizarAluno(@RequestBody Produto cl)
    {
        prRepo.save(cl);
    }
}

}
