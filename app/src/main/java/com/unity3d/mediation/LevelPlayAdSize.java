package com.unity3d.mediation;

import android.content.Context;
import com.ironsource.C3028d3;
import com.ironsource.C3240j1;
import com.ironsource.mediationsdk.C3395l;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class LevelPlayAdSize {

    /* renamed from: f */
    private static final int f13128f = 320;

    /* renamed from: g */
    private static final int f13129g = 50;

    /* renamed from: h */
    private static final int f13130h = 320;

    /* renamed from: i */
    private static final int f13131i = 90;

    /* renamed from: k */
    private static final int f13133k = 250;

    /* renamed from: m */
    private static final int f13135m = 90;

    /* renamed from: a */
    private int f13136a;

    /* renamed from: b */
    private int f13137b;

    /* renamed from: c */
    private final String f13138c;

    /* renamed from: d */
    private final boolean f13139d;

    /* renamed from: e */
    private final LevelPlayAdSize f13140e;
    public static final Companion Companion = new Companion(null);
    public static final LevelPlayAdSize BANNER = new LevelPlayAdSize(320, 50, C3395l.f9866a, false, null, 16, null);

    /* renamed from: j */
    private static final int f13132j = 300;
    public static final LevelPlayAdSize MEDIUM_RECTANGLE = new LevelPlayAdSize(f13132j, 250, C3395l.f9872g, false, null, 16, null);

    /* renamed from: l */
    private static final int f13134l = 728;
    public static final LevelPlayAdSize LEADERBOARD = new LevelPlayAdSize(f13134l, 90, C3395l.f9869d, false, null, 16, null);
    public static final LevelPlayAdSize LARGE = new LevelPlayAdSize(320, 90, C3395l.f9867b, false, null, 16, null);

    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ LevelPlayAdSize createAdaptiveAdSize$default(Companion companion, Context context, Integer num, int i, Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            return companion.createAdaptiveAdSize(context, num);
        }

        public final LevelPlayAdSize createAdSize$mediationsdk_release(String adSize) {
            OooOo.OooO0o0(adSize, "adSize");
            int iHashCode = adSize.hashCode();
            if (iHashCode != -96588539) {
                if (iHashCode != 72205083) {
                    if (iHashCode != 446888797) {
                        if (iHashCode == 1951953708 && adSize.equals(C3395l.f9866a)) {
                            return LevelPlayAdSize.BANNER;
                        }
                    } else if (adSize.equals(C3395l.f9869d)) {
                        return LevelPlayAdSize.LEADERBOARD;
                    }
                } else if (adSize.equals(C3395l.f9867b)) {
                    return LevelPlayAdSize.LARGE;
                }
            } else if (adSize.equals(C3395l.f9872g)) {
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            }
            throw new IllegalArgumentException("Wrong Ad Size");
        }

        public final LevelPlayAdSize createAdaptiveAdSize(Context context) {
            OooOo.OooO0o0(context, "context");
            return createAdaptiveAdSize$default(this, context, null, 2, null);
        }

        public final LevelPlayAdSize createCustomBanner(int i, int i2) {
            return createCustomSize(i, i2);
        }

        public final LevelPlayAdSize createCustomSize(int i, int i2) {
            return new LevelPlayAdSize(i, i2, C3395l.f9871f, false, null, 16, null);
        }

        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        public final LevelPlayAdSize createAdaptiveAdSize(Context context, Integer num) {
            OooOo.OooO0o0(context, "context");
            return new C3028d3(new C3240j1()).m8263a(context, num);
        }
    }

    public LevelPlayAdSize(int i, int i2, String str, boolean z, LevelPlayAdSize levelPlayAdSize) {
        this.f13136a = i;
        this.f13137b = i2;
        this.f13138c = str;
        this.f13139d = z;
        this.f13140e = levelPlayAdSize;
    }

    public static final LevelPlayAdSize createAdaptiveAdSize(Context context) {
        return Companion.createAdaptiveAdSize(context);
    }

    public static final LevelPlayAdSize createCustomBanner(int i, int i2) {
        return Companion.createCustomBanner(i, i2);
    }

    public static final LevelPlayAdSize createCustomSize(int i, int i2) {
        return Companion.createCustomSize(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!LevelPlayAdSize.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        OooOo.OooO0OO(obj, "null cannot be cast to non-null type com.unity3d.mediation.LevelPlayAdSize");
        LevelPlayAdSize levelPlayAdSize = (LevelPlayAdSize) obj;
        return this.f13136a == levelPlayAdSize.f13136a && this.f13137b == levelPlayAdSize.f13137b && OooOo.OooO00o(this.f13138c, levelPlayAdSize.f13138c);
    }

    public final String getDescription() {
        return String.valueOf(this.f13138c);
    }

    public final LevelPlayAdSize getFallbackAdSize$mediationsdk_release() {
        return this.f13140e;
    }

    public final int getHeight() {
        return this.f13137b;
    }

    public final int getWidth() {
        return this.f13136a;
    }

    public int hashCode() {
        int i = ((this.f13136a * 31) + this.f13137b) * 31;
        String str = this.f13138c;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final boolean isAdaptive() {
        return this.f13139d;
    }

    public String toString() {
        return this.f13138c + ' ' + this.f13136a + 'x' + this.f13137b;
    }

    public /* synthetic */ LevelPlayAdSize(int i, int i2, String str, boolean z, LevelPlayAdSize levelPlayAdSize, int i3, OooOO0O oooOO0O) {
        this(i, i2, (i3 & 4) != 0 ? null : str, z, (i3 & 16) != 0 ? null : levelPlayAdSize);
    }

    public static final LevelPlayAdSize createAdaptiveAdSize(Context context, Integer num) {
        return Companion.createAdaptiveAdSize(context, num);
    }
}
