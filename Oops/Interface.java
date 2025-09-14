package Oops;
interface Remote {
    void pressPower();
}

class TV implements Remote {
    public void pressPower() {
        System.out.println("TV turned ON");
    }
}

class Interface {
    public static void main(String[] args) {
        Remote r = new TV();
        r.pressPower();
    }
}
