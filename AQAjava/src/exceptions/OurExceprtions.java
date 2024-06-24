package exceptions;

import java.util.Date;

public class OurExceprtions extends Exception {

    Date date = new Date();

    public OurExceprtions(String errorMessage){
        super(errorMessage);
    }


    @Override
    public String toString(){
        return date + "message = " + getMessage();
    }
}
