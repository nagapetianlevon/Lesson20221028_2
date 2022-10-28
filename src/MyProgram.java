public class MyProgram {

    public static void main(String[] args) {

       /* Book book1 = new Book();
        book1.name = "Капитанская дочка";
        book1.pages = 100;
        book1.Author = new String[20];
        book1.Author[0] = "Пушкин А. С.";
        book1.Author[1] = "Гончарова Н.";
        book1.price = 1199.99;

        Book book2 = new Book();

        System.out.println(book1.name +" "+ book1.Author[0]+"  "+ book1.price+" � "+book1.pages + " ��� ");
        System.out.println(book1);

        Book book3 = new Book("МУ-МУ", 10, new String[]{"Тургенев И. С."}, 1000.0);

        System.out.println(book3);*/

        Rect rect = new Rect();
        rect.width = 5;
        rect.height = 2;
        rect.printArea();
        System.out.println(rect.getPerimeter());
        Rect rect2 = new Rect();
        rect2.width = 10;
        rect2.height = 20;
        rect2.printArea();
        System.out.println(rect2.getPerimeter());
        System.out.println(rect);
        System.out.println(rect2);
        Rect rect4 = new Rect(8, 8);

        System.out.println(rect4.getDifArea(4, 4));
    }

}
