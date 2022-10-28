public class MyProgram {

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.name = "Капитанская дочка";
        book1.pages = 100;
        book1.Author = new String[20];
        book1.Author[0] = "Пушкин А. С.";
        book1.Author[1] = "Гончарова Н.";
        book1.price = 1199.99;

        System.out.println(book1.name +" "+ book1.Author[0]+"  "+ book1.price+" р "+book1.pages + " стр ");

    }

}
