package androidx.collection;

import io.flutter.embedding.android.KeyboardMap;

/* loaded from: classes.dex */
public final class PackingUtilsKt {
    public static final long packFloats(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & KeyboardMap.kValueMask) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final long packInts(int i, int i2) {
        return (i2 & KeyboardMap.kValueMask) | (i << 32);
    }
}
