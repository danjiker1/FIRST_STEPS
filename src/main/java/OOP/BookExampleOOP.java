package OOP;

public class BookExampleOOP {
    public static void main(String[] args){


        Book colobok = new Book();
        Book teremok = new Book();

        colobok.name = "Колобок";
        colobok.countStr = 40;
        colobok.genre = "Сказка";
        colobok.author = "Пушкин";
        teremok.name = "Теремок";
        teremok.countStr = 50;
        teremok.genre = "Повесть";

        System.out.println("Книга " + colobok.name + " имеет " + colobok.countStr + " страниц и жанр определяется как " + colobok.genre);
        colobok.getInfo();
        colobok.author = "Достоевский";
        colobok.getInfo();
        colobok.setTittleCount(400);


    }

    static class Book {
        String name;
        Integer countStr;
        String genre;
        String author;

        void getInfo() {


            System.out.println("Книга была написана: " + author);
        }

        private int tittleCount;

        public int getTittleCount() {
            return this.tittleCount;
        }

        public void setTittleCount(int tittleCount) {

            if (tittleCount > 0 && tittleCount < 500)
                System.out.println(tittleCount);
            else {
                System.out.println("Ошибка ввода страниц");
            }

        }

    }

}
