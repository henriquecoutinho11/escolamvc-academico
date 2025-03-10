package br.senai.sp.escolamvc.repository;

import br.senai.sp.escolamvc.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
