package learn.Tsymbaliuk.Enum;

public enum Direction {
    UP {
        @Override
        public int changeCoordinate() {
            return 1;
        }
    },
    DOWN {
        @Override
        public int changeCoordinate() {
            return -1;
        }
    };

    public abstract int changeCoordinate();
}


