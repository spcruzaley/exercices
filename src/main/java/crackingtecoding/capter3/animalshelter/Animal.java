package crackingtecoding.capter3.animalshelter;

abstract class Animal {
    private String name;
    protected int old;

    public Animal(String name) {
        this.name = name;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public int getOld() {
        return old;
    }

    public String getName() {
        return name;
    }
}
