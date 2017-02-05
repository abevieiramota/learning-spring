package br.com.abevieiramota.awvinhosabe;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.abevieiramota.awvinhosabe.model.Vinho;

public interface Vinhos extends JpaRepository<Vinho, Long> {
}
