package in.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.application.modal.College;

public interface CollegeRepository  extends JpaRepository<College, Integer>{

}
