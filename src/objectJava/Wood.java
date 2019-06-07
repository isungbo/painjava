package objectJava;

public enum Wood {

    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE,
    COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;

    public String toString() {
        switch(this) {
            case INDIAN_ROSEWOOD:    return "인디안 나무";
            case BRAZILIAN_ROSEWOOD: return "브라질리안 나무";
            case MAHOGANY:           return "마호가니";
            case MAPLE:              return "메이플";
            case COCOBOLO:           return "코코브로";
            case CEDAR:              return "케델";
            case ADIRONDACK:         return "아디로다크";
            case ALDER:              return "알델";
            case SITKA:              return "시트카";
            default:  return "미정의된 나무";
        }
    }


}
