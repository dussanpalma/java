package enumeracion;

public enum Continentes {

    AFRICA(53, "Paises"), //enumeraciones con atributos
    EUROPA(46, "Paises"),
    ASIA(44, "Paises"),
    AMERICA(34, "Paises"),
    OCEANIA(14, "Paises");

    private final int paises;
    private final String numeroPaises;

    Continentes(int paises, String numeroPaises) {
        this.paises = paises;
        this.numeroPaises = numeroPaises;
    }

    public int getPaises() {
        return this.paises;
    }

    public String getNumeroPaises() {
        return this.numeroPaises;
    }

}
