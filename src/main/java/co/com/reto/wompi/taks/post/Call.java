package co.com.reto.wompi.taks.post;

public class Call {

    private Call(){}

    public static ConsumeServicePost service(){
        return new ConsumeServicePost();
    }
}
