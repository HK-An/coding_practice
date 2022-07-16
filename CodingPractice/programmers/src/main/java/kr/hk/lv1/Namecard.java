package kr.hk.lv1;


public class Namecard {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        organizeSizes(sizes);

        for(int[] size : sizes) {
            int width = size[0];
            int height = size[1];

            maxWidth = Math.max(maxWidth, width);
            maxHeight = Math.max(maxHeight, height);
        }

        return maxHeight * maxWidth;
    }

    private void organizeSizes(int[][] sizes) {
        for(int[] size : sizes) {
            int height = Math.min(size[0], size[1]);
            int width = Math.max(size[0], size[1]);

            size[0] = width;
            size[1] = height;
        }
    }

}
