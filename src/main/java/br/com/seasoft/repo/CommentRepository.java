package br.com.seasoft.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.seasoft.dto.Comment;

//teste
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
	
	List<Comment> findByEmployeeId(Long employeeId);
	
}