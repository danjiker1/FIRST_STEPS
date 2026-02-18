package OOP;

public class InterfaceOOP {

    public static void main(String[] args){

        Guitar guitar = new Guitar();
        guitar.play();
        Piano piano = new Piano();
        piano.play();


    }
    interface Playable{
        void play ();
    }

     static class Guitar implements Playable {
        public void play(){
            System.out.println("Играть на гитаре");
        }
    }

    static class Piano implements Playable {
        public void play(){
            System.out.println("Играть на пианино");
        }
    }

}
