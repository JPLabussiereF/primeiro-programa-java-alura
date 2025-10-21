public class Main { // PascalCase -> MainMenu

    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int yearOfRelease = 2022; // camelCase
        System.out.println("Ano de Lançamento: " + yearOfRelease);

        boolean includePlan = true;
        double filmNote = 8.1;
        System.out.println("Nota do filme: " + filmNote);

        double average = (9.8 + 6.3 + filmNote) / 3;
        System.out.printf("Média do Filme: %.1f\n", average);

        String sinopse;
        sinopse = "Filme de Aventura com galã dos anos 80";
        System.out.println("Sinopse: " + sinopse);

        System.out.println("""
                A partir do JAVA 15 é possível fazer isso das 3 aspas -> Se chama text blocks
                """);

        int classification = (int) average / 2; // Casting Explicito
        System.out.println("Estrelas: " + "⭐".repeat(classification));

    }
}