package br.com.abevieiramota.awvinhosabe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.abevieiramota.awvinhosabe.model.Vinho;

public interface Vinhos extends JpaRepository<Vinho, Long> {

	List<Vinho> findByNomeContainingIgnoreCase(String nome);
}
