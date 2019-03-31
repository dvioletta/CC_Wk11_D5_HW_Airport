public enum PlaneType {
    BOEING737(20),
    BOEING787(40),
    BOEING757(10),
    AIRBUSA320(100),
    AIRBUSA380(150);

    private final int value;

    PlaneType(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

}
