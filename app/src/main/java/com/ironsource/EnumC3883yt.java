package com.ironsource;

/* renamed from: com.ironsource.yt */
/* loaded from: classes2.dex */
public enum EnumC3883yt {
    Off(0),
    CurrentlyLoadedAds(1),
    CurrentlyLoadedAdsAndFullHistory(2);


    /* renamed from: b */
    public static final a f12774b = new a(null);

    /* renamed from: a */
    private final int f12779a;

    /* renamed from: com.ironsource.yt$a */
    public static final class a {
        private a() {
        }

        /* renamed from: a */
        public final EnumC3883yt m13223a(int i) {
            EnumC3883yt enumC3883yt;
            EnumC3883yt[] enumC3883ytArrValues = EnumC3883yt.values();
            int length = enumC3883ytArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC3883yt = null;
                    break;
                }
                enumC3883yt = enumC3883ytArrValues[i2];
                if (enumC3883yt.f12779a == i) {
                    break;
                }
                i2++;
            }
            return enumC3883yt == null ? EnumC3883yt.CurrentlyLoadedAds : enumC3883yt;
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    EnumC3883yt(int i) {
        this.f12779a = i;
    }

    /* renamed from: b */
    public final int m13222b() {
        return this.f12779a;
    }
}
