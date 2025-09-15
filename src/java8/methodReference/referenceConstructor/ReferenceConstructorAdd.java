package java8.methodReference.referenceConstructor;

/*
3) Reference to a Constructor
You can refer a constructor by using the new keyword.
Here, we are referring constructor with the help of functional interface.

Syntax

ClassName::new
* */
interface Messageable{
    Message getMessage(String msg);
}
class Message{
    Message(String msg){
        System.out.print(msg);
    }
}
public class ReferenceConstructorAdd {
    public static void main(String[] args) {
        Messageable messageable = Message::new;
        messageable.getMessage("Manoj");

    }
}
