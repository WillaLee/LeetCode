public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0) {return true;}
        if(flowerbed.length == 1) {return flowerbed[0] == 0;}
        if(flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            n--;
        }
        if(flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
            flowerbed[flowerbed.length - 1] = 1;
            n--;
        }
        int index = 1;
        while (index < flowerbed.length - 2){
            if(flowerbed[index] == 0 && flowerbed[index - 1] == 0 && flowerbed[index + 1] == 0){
                flowerbed[index] = 1;
                n--;
            }
            index++;
        }
        return n <= 0;
    }
}
