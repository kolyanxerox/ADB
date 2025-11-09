package com.ironsource;

import com.ironsource.InterfaceC3223ii;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.C4201a;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.wt */
/* loaded from: classes2.dex */
class C3815wt implements InterfaceC3223ii, InterfaceC3223ii.a {

    /* renamed from: c */
    private static final int f12535c = 1;

    /* renamed from: a */
    private final Map<IronSource.AD_UNIT, Integer> f12536a = new HashMap();

    /* renamed from: b */
    private final C3492ok f12537b = new C3492ok();

    /* renamed from: com.ironsource.wt$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12538a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            f12538a = iArr;
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12538a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12538a[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12538a[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C3815wt() {
        for (IronSource.AD_UNIT ad_unit : IronSource.AD_UNIT.values()) {
            m12969a(ad_unit, 1);
        }
    }

    @Override // com.ironsource.InterfaceC3223ii
    /* renamed from: a */
    public synchronized int mo9344a(IronSource.AD_UNIT ad_unit) {
        int iIntValue = -1;
        if (ad_unit == null) {
            return -1;
        }
        Integer num = this.f12536a.get(ad_unit);
        if (num != null) {
            iIntValue = num.intValue();
        }
        return iIntValue;
    }

    @Override // com.ironsource.InterfaceC3223ii.a
    /* renamed from: b */
    public synchronized void mo9346b(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == null) {
            return;
        }
        m12969a(ad_unit, this.f12536a.get(ad_unit).intValue() + 1);
    }

    @Override // com.ironsource.InterfaceC3223ii
    /* renamed from: a */
    public int mo9345a(LevelPlay.AdFormat adFormat) {
        if (adFormat == null) {
            return -1;
        }
        return mo9344a(C4201a.m13452a(adFormat)) - 1;
    }

    /* renamed from: a */
    private void m12969a(IronSource.AD_UNIT ad_unit, int i) {
        this.f12536a.put(ad_unit, Integer.valueOf(i));
        int i2 = a.f12538a[ad_unit.ordinal()];
        if (i2 == 1) {
            this.f12537b.m11160d(i);
            return;
        }
        if (i2 == 2) {
            this.f12537b.m11158b(i);
        } else if (i2 == 3) {
            this.f12537b.m11157a(i);
        } else {
            if (i2 != 4) {
                return;
            }
            this.f12537b.m11159c(i);
        }
    }
}
