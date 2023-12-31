package web.app.moviehouse.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String movieName;
}
