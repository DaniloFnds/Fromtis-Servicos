package br.com.fromtis.cadastros.fundo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cadastros/fundo")
public class FundoController {

    private final FundoRepository fundoRepository;

    @Autowired
    public FundoController(FundoRepository fundoRepository) {
        this.fundoRepository = fundoRepository;
    }

    @GetMapping
    public List<Fundo> fundos() {
        fundoRepository.saveAndFlush((new Fundo("danilo")));
        fundoRepository.saveAndFlush((new Fundo("danilo2")));
        fundoRepository.saveAndFlush((new Fundo("danilo3")));
        fundoRepository.saveAndFlush((new Fundo("danilo5")));
        fundoRepository.saveAndFlush((new Fundo("danilo6")));

        return fundoRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Fundo> fundoById(@PathVariable("id") Integer id) {
        fundoRepository.saveAndFlush((new Fundo("danilo")));
        return fundoRepository.findById(id);
    }


}
