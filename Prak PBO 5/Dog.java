public class Dog extends Animal implements Pet {

    @Override
    public void setName(String name) {
        System.out.println("Dog name is : "+name);
    }
    @Override
    public void play() {
        System.out.println("Bermain tangkap stik kayu");
    }

    @Override
    public void eat() {
        System.out.println("Makan daging");
    }

    @Override
    public void walk() {
        System.out.println("Jalan bersama tuannya");
    }
}