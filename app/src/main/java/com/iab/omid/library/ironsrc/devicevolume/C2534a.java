package com.iab.omid.library.ironsrc.devicevolume;

/* renamed from: com.iab.omid.library.ironsrc.devicevolume.a */
/* loaded from: classes2.dex */
public class C2534a {
    /* renamed from: a */
    public float m4264a(int i, int i2) {
        if (i2 <= 0 || i <= 0) {
            return 0.0f;
        }
        float f = i / i2;
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }
}
