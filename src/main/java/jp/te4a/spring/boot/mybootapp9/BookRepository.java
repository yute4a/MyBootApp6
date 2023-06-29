package jp.te4a.spring.boot.mybootapp9;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<BookBean,Integer>{
	
	@Query("SELECT X FROM BookBean X ORDER BY X.title")
	List<BookBean> findAllOrderByTitle();
}