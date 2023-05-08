package company.hellopet.entity;

public class Pet {
    // 사진
    String img;
    // 성별
    Gender gender;
    // 품종
    String kind;

    private enum Gender {
        M,F
    }
}
