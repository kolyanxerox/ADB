package com.unity3d.mediation;

import OooOOO0.OooO00o;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import kotlin.jvm.internal.OooOo;

/* renamed from: com.unity3d.mediation.a */
/* loaded from: classes3.dex */
public final class C4201a {

    /* renamed from: a */
    public static final C4201a f13150a = new C4201a();

    /* renamed from: com.unity3d.mediation.a$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13151a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f13151a = iArr;
        }
    }

    private C4201a() {
    }

    /* renamed from: a */
    public static final IronSource.AD_UNIT m13452a(LevelPlay.AdFormat adFormat) {
        OooOo.OooO0o0(adFormat, "<this>");
        int i = a.f13151a[adFormat.ordinal()];
        if (i == 1) {
            return IronSource.AD_UNIT.BANNER;
        }
        if (i == 2) {
            return IronSource.AD_UNIT.INTERSTITIAL;
        }
        if (i == 3) {
            return IronSource.AD_UNIT.REWARDED_VIDEO;
        }
        if (i == 4) {
            return IronSource.AD_UNIT.NATIVE_AD;
        }
        throw new OooO00o();
    }
}
