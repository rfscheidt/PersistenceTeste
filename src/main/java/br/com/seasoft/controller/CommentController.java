package br.com.seasoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.seasoft.dto.Comment;
import br.com.seasoft.dto.Employee;
import br.com.seasoft.repo.CommentRepository;
import br.com.seasoft.repo.EmployeeRepository;

@RestController
public class CommentController {
	
	@Autowired
	private CommentRepository commentRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/comments")
    List<Comment> list() {
        return commentRepository.findAll();
    }
	
	@GetMapping("/comments/save")
    void save() {
		Employee employee = employeeRepository.findById(1l);
		Comment comment = new Comment();
		comment.setText("foka comentario");
		comment.setEmployee(employee);
		
        commentRepository.save(comment);
    }

}
