class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int canBePlanted = 0;
        
        for (int i = 0; i < flowerbed.length; i++) {
            if ((i == 0 || flowerbed[i - 1] == 0) && flowerbed[i] == 0 && (i + 1 == flowerbed.length || flowerbed[i + 1] == 0)) {
                canBePlanted += 1;
                flowerbed[i] = 1;
            }
        }

        return n <= canBePlanted;
    }
}