public class Cat extends Animal implements Pet {

    @Override
    public void setName(String name) {
        System.out.println("Cat's name is : "+name);
    }
    @Override
    public void play() {
        System.out.println("Bermain bola kecil");
    }

    @Override
    public void eat() {
        System.out.println("Makan ikan");
    }
}