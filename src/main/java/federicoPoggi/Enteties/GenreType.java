package federicoPoggi.Enteties;

public enum GenreType {
    ROMANZO("Romanzo"),
    FANTASCIENZA("Fantascienza"),
    SAGGIO("Saggio"),
    GIALLO("Giallo"),
    FANTASY("Fantasy"),
    STORICO("Storico"),
    POESIA("Poesia"),
    THRILLER("Thriller"),
    AVVENTURA("Avventura"),
    HORROR("Horror");

    private final String descrizione;

    GenreType(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
