package basic_subclasses_adam_and_eve;

class Kata {
    public static Human[] create(){
        return new Human[]{new Man(), new Woman()};
    }
}
class Human {}
class Man extends Human {}
class Woman extends Human {}