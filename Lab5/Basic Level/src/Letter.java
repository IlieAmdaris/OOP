public abstract class Letter {
    String value;
    public Letter(){
        this("");
    }
    public Letter(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
