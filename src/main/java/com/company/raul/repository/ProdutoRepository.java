package com.company.raul.repository;
import com.company.raul.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProdutoRepository extends JpaRepository <Produto,Integer> {
    public List<Produto> findByInfo (String info);
    public List<Produto> findByMarca(String marca);
    public List<Produto> findAll();
}
