package learn.programming_methods.glava2.maps;

public enum GASStation {
    DT(50), A80(30), A92(30), A95(50), GAS(40);
    private Integer maxVolume;

    GASStation(Integer maxVolume) {
        this.maxVolume = maxVolume;
    }

    public Integer getMaxVolume() {
        return maxVolume;
    }
}
