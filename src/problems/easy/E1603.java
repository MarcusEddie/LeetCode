package problems.easy;

public class E1603 {

    public static void main(String[] args) {

    }

    private static class ParkingSystem {
        private int big;
        private int medium;
        private int small;

        public ParkingSystem(int big, int medium, int small) {
            this.big = big;
            this.medium = medium;
            this.small = small;
        }

        public boolean addCar(int carType) {
            boolean rs = true;
            switch (carType) {
            case 1:
                if (big > 0) {
                    big--;
                } else {
                    rs = false;
                }
                break;
            case 2:
                if (medium > 0) {
                    medium--;
                } else {
                    rs = false;
                }
                break;
            case 3:
                if (small > 0) {
                    small--;
                } else {
                    rs = false;
                }
                break;

            default:
                break;
            }
            return rs;
        }
    }

}
