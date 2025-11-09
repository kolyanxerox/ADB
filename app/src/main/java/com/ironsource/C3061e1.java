package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlay;
import java.util.UUID;

/* renamed from: com.ironsource.e1 */
/* loaded from: classes2.dex */
public class C3061e1 {

    /* renamed from: a */
    private final IronSource.AD_UNIT f8352a;

    /* renamed from: b */
    private final UUID f8353b;

    /* renamed from: c */
    private final String f8354c;

    /* renamed from: d */
    private Placement f8355d;

    /* renamed from: e */
    private final C3270jv f8356e;

    /* renamed from: f */
    private final Double f8357f;

    /* renamed from: com.ironsource.e1$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8358a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f8358a = iArr;
        }
    }

    public C3061e1(IronSource.AD_UNIT adFormat, UUID adId, String adUnitId, Placement placement, C3270jv c3270jv, Double d) {
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        kotlin.jvm.internal.OooOo.OooO0o0(adId, "adId");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitId, "adUnitId");
        this.f8352a = adFormat;
        this.f8353b = adId;
        this.f8354c = adUnitId;
        this.f8355d = placement;
        this.f8356e = c3270jv;
        this.f8357f = d;
    }

    /* renamed from: a */
    public final IronSource.AD_UNIT m8434a() {
        return this.f8352a;
    }

    /* renamed from: b */
    public final UUID m8436b() {
        return this.f8353b;
    }

    /* renamed from: c */
    public final String m8437c() {
        return this.f8354c;
    }

    /* renamed from: d */
    public final Double m8438d() {
        return this.f8357f;
    }

    /* renamed from: e */
    public final LevelPlay.AdFormat m8439e() {
        int i = a.f8358a[this.f8352a.ordinal()];
        if (i == 1) {
            return LevelPlay.AdFormat.REWARDED;
        }
        if (i == 2) {
            return LevelPlay.AdFormat.INTERSTITIAL;
        }
        if (i == 3) {
            return LevelPlay.AdFormat.BANNER;
        }
        if (i == 4) {
            return LevelPlay.AdFormat.NATIVE_AD;
        }
        throw new OooOOO0.OooO00o();
    }

    /* renamed from: f */
    public final Placement m8440f() {
        return this.f8355d;
    }

    /* renamed from: g */
    public final C3270jv m8441g() {
        return this.f8356e;
    }

    public /* synthetic */ C3061e1(IronSource.AD_UNIT ad_unit, UUID uuid, String str, Placement placement, C3270jv c3270jv, Double d, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(ad_unit, uuid, str, (i & 8) != 0 ? null : placement, (i & 16) != 0 ? null : c3270jv, (i & 32) != 0 ? null : d);
    }

    /* renamed from: a */
    public final void m8435a(Placement placement) {
        this.f8355d = placement;
    }
}
