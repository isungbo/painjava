package objectJava;

public enum  Builder {

    FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;

    public String toString() {
        switch(this) {
            case FENDER:   return "날개사";
            case MARTIN:   return "마틴사";
            case GIBSON:   return "기브슨";
            case COLLINGS: return "콜린";
            case OLSON:    return "올래슨";
            case RYAN:     return "얀슨";
            case PRS :     return "PRS";
            default:       return "미정의된 생산자";
        }
    }


}
