package federicoPoggi.Enteties;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@NamedQuery(name = "deleteByName", query = "delete from Catalogo p where p.article_title = :titolo")


@Entity()
@Table(name = "catalogo")

public class Catalogo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "article_title", nullable = false)
    private String article_title;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Newspapers newspapers;

    @OneToOne(cascade = CascadeType.REMOVE, orphanRemoval = true)
    private Books book;



    public Catalogo(){};

    public Catalogo(Newspapers ne){
        this.newspapers=ne;
        this.article_title= ne.title;
    }
    public Catalogo(Books bo){
        this.book=bo;
        this.article_title=bo.title;
    }





}
