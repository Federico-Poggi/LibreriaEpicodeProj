package federicoPoggi.Enteties;

public enum Frequenza {
    SETTIMANALE("Settimanale"),
    MENSILE("Mensile"),
    SEMESTRALE("Semestrale");

    private final String cadenza;
    Frequenza(String cadenza){
        this.cadenza=cadenza;
    }

    public String getCadenza() {
        return cadenza;
    }
}
