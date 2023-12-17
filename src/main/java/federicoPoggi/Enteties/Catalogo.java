package federicoPoggi.Enteties;

import javax.persistence.*;


@NamedQuery (name = "deleteByName", query = "delete from Catalogo p where p.article_title = :titolo")


@Entity ()
@Table (name = "catalogo")

public class Catalogo {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    @Column (name = "id", nullable = false)
    private Long id;

    @Column (name = "article_title", nullable = false)
    private String article_title;

    @OneToOne (cascade = CascadeType.ALL, orphanRemoval = true)
    private Newspapers newspapers;

    @OneToOne (cascade = CascadeType.REMOVE, orphanRemoval = true)
    private Books book;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArticle_title() {
        return article_title;
    }

    public void setArticle_title(String article_title) {
        this.article_title = article_title;
    }

    public Newspapers getNewspapers() {
        return newspapers;
    }

    public void setNewspapers(Newspapers newspapers) {
        this.newspapers = newspapers;
    }

    public Books getBook() {
        return book;
    }

    public void setBook(Books book) {
        this.book = book;
    }

    public Catalogo() {
    }

    ;

    public Catalogo(Newspapers ne) {
        this.newspapers = ne;
        this.article_title = ne.title;
    }

    public Catalogo(Books bo) {
        this.book = bo;
        this.article_title = bo.title;
    }

    @Override
    public String toString() {
        return "Catalogo{" + "id=" + getId() + ", title= " + getArticle_title() + "}";

    }
}
