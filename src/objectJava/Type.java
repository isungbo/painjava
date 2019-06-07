package objectJava;

public enum Type {

    ACOUSTIC, ELECTRIC;

    public String toString(){
        switch (this){
            case ACOUSTIC: return "어쿠스틱 타입";
            case ELECTRIC: return "전자 타입";
            default:       return "미정의된 타입";
        }
    }

}
