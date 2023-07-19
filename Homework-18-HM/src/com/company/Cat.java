package com.company;

public record Cat(int x,int y,int z) {
    @Override
    public int x() {
        return x;
    }

    @Override
    public int y() {
        return y;
    }

    @Override
    public int z() {
        return z;
    }
}
