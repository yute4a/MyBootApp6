package jp.te4a.spring.boot.mybootapp10;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
@Table(name = "book")
@Data
@AllArgsConstructor
@NoArgsConstructor


public class BookBean {
@Id
@GeneratedValue
private Integer id ;
@Column(nullable = false)
private String title;
private String writter;
private String publisher;
private Integer price;
}
