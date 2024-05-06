package in.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.application.modal.Mobile;

public interface MobileRepository extends JpaRepository<Mobile, Integer> {

}
