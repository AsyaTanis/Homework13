
public class Main {
    public static void main(String[] args) {
        Author authorTolstoy = new Author("Л. Н. ", "Толстой");
        Author authorLermontov = new Author("М. Ю. ", "Лермонтов");
        //Author authorLermontov2 = new Author("М. Ю. ", "Лермонтов");
        Book warAndPeace = new Book(authorTolstoy, "Война и Мир",1867);
        Book warAndPeace2 = new Book(authorTolstoy, "Война и Мир",1867);
        Book masquerade = new Book(authorLermontov, "Маскарад",1835);

        System.out.println(warAndPeace);
        System.out.println(masquerade);

        System.out.println(warAndPeace.equals(warAndPeace2));
        System.out.println(warAndPeace.equals(masquerade));
       // System.out.println(authorLermontov.equals(authorLermontov2));

    }
}
