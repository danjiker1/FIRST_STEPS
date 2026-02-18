package JavaCoreExam;

// Класс Book
class Book {
   String name;
   int count;
   private int tirazh;
   public String author;

   public String printAutor(){
   return  author;
   }

   public int getTirazh(){
       return tirazh;
   }

   public void setTirazh(int tirazh){
       if (tirazh < 100) {
           System.out.println("Тираж - " + tirazh);
       }
        else {
       System.out.println("Ошибка");
        }
   }
    public void printInfo(){
       System.out.println("Эта книга " + name + " автора " + author + " с кол-вом страниц - " + count);
    }
}




