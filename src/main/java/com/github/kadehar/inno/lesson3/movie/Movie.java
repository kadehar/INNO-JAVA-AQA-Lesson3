package com.github.kadehar.inno.lesson3.movie;

public record Movie(MovieMainInfo mainInfo, MovieAdditionalInfo additionalInfo) {
    public String generalInfo() {
        return String.format("%d - %s - %s - %.1f",
                mainInfo.year(), mainInfo.name(), additionalInfo.genre(), mainInfo.rate());
    }
}
