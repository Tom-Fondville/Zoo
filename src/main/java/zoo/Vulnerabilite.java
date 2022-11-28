package zoo;

public enum Vulnerabilite {

        DISPARU("Noir"),
        MENACEES("Rouge"),
        PROTEGE("Jaune"),
        NORMAL("Vert"),
        INVASIVE("Marron");

        final String couleur ;

        Vulnerabilite(String couleur) {
            this.couleur = couleur ;
        }
}
