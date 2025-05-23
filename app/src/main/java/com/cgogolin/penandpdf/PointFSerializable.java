package com.cgogolin.penandpdf;

import android.graphics.PointF;

import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;

class PointFSerializable extends PointF implements Serializable {
    public PointFSerializable(PointF pointF) {
        super(pointF.x, pointF.y);
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.writeFloat(x);
        out.writeFloat(y);
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        float x = in.readFloat();
        float y = in.readFloat();
        set(x, y);
    }

    private void readObjectNoData() throws ObjectStreamException {
        set(0f, 0f);
    }
}
