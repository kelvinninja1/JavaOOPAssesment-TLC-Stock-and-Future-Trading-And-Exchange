package io.turntabl;

public class ProductAlreadyRegisteredException extends RuntimeException {

//    public ProductAlreadyRegisteredException(){
//        super();
//    }

    public ProductAlreadyRegisteredException(final String ExpMsg){
        super(ExpMsg);
    }

}
