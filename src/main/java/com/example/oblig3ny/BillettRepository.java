package com.example.oblig3ny;


public class BillettRepository {
    List<Billett> Billett = new ArrayList<>();

    public void kjopBillett(Billett innBillett) {
        String sql = "INSERT INTO Billett (film, antall, fornavn, etternavn, telefonnr, epost) VALUES(?,?,?,?,?,?)";
        db.update(sql, innBillett.getFilm(), innBillett.getAntall(),innBillett.getFornavn(),innBillett.getEtternavn(),
                innBillett.getTelefonnr(),innBillett.getEpost());
    }

    public List<Billett> kjopBillett() {
        String sql = "SELECT * FROM Billett";
        List<Billett> alleBillett = db.query(sql, new BeanPropertyRowMapper(billett.class));
        return alleBillett;
    }

    public void slettAlle() {
        String sql = "DELETE FROM Billett";
        db.update(sql);
    }

    public List<Billett> sorter() {
        Billett = kjopBillett();
        Collections.sort(billett);
        return billett;
    }
}








}
