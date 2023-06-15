package builiding_blocks;

class Block {
    private int width;
    private int length;
    private int height;

    Block(int [] dimensions) {
        this.width = dimensions[0];
        this.length = dimensions[1];
        this.height = dimensions[2];
    }

    int getWidth() {
        return width;
    }

    int getLength() {
        return length;
    }

    int getHeight() {
        return height;
    }

    int getVolume() {
        return width * length * height;
    }

    int getSurfaceArea() {
        return width * length * 2 + width * height * 2 + length * height * 2;
    }
}
