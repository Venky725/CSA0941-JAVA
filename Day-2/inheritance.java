class venky{
    void dis(int i){
        System.out.println(i);
    }
}
class derived extends venky{
    void dis(double i){
        System.out.println(i);
    }
}
class base {
    public static void main(String[] args) {
        derived d = new derived();
        d.dis(9);
    }
}
