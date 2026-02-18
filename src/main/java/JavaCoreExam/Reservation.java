package JavaCoreExam;
import java.time.LocalDate;

public class Reservation {

    class ReservationException extends Exception {
        public ReservationException(String message) {
            super(message);
        }

        public ReservationException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    class InvalidDateException extends ReservationException{
        public InvalidDateException(String message){
            super(message);
        }
    }

    class NoSeatsAvailableException extends ReservationException{
        public NoSeatsAvailableException(String message){
            super(message);
        }
    }

    class InvalidUserException extends ReservationException{
        public InvalidUserException(String message){
            super(message);
        }
    }

    class Event {
        String name;
        LocalDate date;
        int totalSeats;
        int reservedSeats;


        Event(String name, LocalDate date, int totalSeats, int reservedSeats) throws ReservationException {
            if (name == null || name.trim().isEmpty()) {
                // Бросаем стандартное исключение, т.к. это не наше бизнес-правило
                throw new IllegalArgumentException("Имя не заполнено");
            }

        }


    }
}