package com.iab.omid.library.unity3d.devicevolume;

/* renamed from: com.iab.omid.library.unity3d.devicevolume.a */
/* loaded from: classes2.dex */
public class C2583a {
    /* renamed from: a */
    public float m4520a(int i, int i2) {
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
