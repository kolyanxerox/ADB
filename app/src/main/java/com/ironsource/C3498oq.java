package com.ironsource;

import com.ironsource.InterfaceC3186hg;
import com.unity3d.mediation.LevelPlay;

/* renamed from: com.ironsource.oq */
/* loaded from: classes2.dex */
public final class C3498oq implements InterfaceC3186hg, InterfaceC3186hg.a {

    /* renamed from: a */
    private final C3317l8 f10706a;

    /* renamed from: b */
    private final C3587ra f10707b;

    /* renamed from: com.ironsource.oq$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10708a;

        static {
            int[] iArr = new int[EnumC3515p8.values().length];
            try {
                iArr[EnumC3515p8.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3515p8.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3515p8.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10708a = iArr;
        }
    }

    public C3498oq() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.InterfaceC3186hg
    /* renamed from: a */
    public synchronized C3445n8 mo9120a(String placementName, LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.OooOo.OooO0o0(placementName, "placementName");
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        String strM12482a = new C3708tq(placementName, adFormat).m12482a();
        C3445n8 c3445n8Mo7975a = this.f10707b.mo7975a(strM12482a);
        if (c3445n8Mo7975a.m10966d()) {
            return c3445n8Mo7975a;
        }
        return this.f10706a.mo7975a(strM12482a);
    }

    @Override // com.ironsource.InterfaceC3186hg.a
    /* renamed from: b */
    public synchronized void mo9122b(String placementName, LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.OooOo.OooO0o0(placementName, "placementName");
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        String strM12482a = new C3708tq(placementName, adFormat).m12482a();
        if (!this.f10707b.mo7975a(strM12482a).m10966d()) {
            this.f10706a.mo7978b(strM12482a);
        }
    }

    public C3498oq(C3317l8 cappingService, C3587ra deliveryHandler) {
        kotlin.jvm.internal.OooOo.OooO0o0(cappingService, "cappingService");
        kotlin.jvm.internal.OooOo.OooO0o0(deliveryHandler, "deliveryHandler");
        this.f10706a = cappingService;
        this.f10707b = deliveryHandler;
    }

    @Override // com.ironsource.InterfaceC3186hg.a
    /* renamed from: a */
    public synchronized Object mo9121a(String placementName, LevelPlay.AdFormat adFormat, EnumC3515p8 cappingType, InterfaceC3324lf cappingConfig) {
        Object objMo7976a;
        try {
            kotlin.jvm.internal.OooOo.OooO0o0(placementName, "placementName");
            kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
            kotlin.jvm.internal.OooOo.OooO0o0(cappingType, "cappingType");
            kotlin.jvm.internal.OooOo.OooO0o0(cappingConfig, "cappingConfig");
            String strM12482a = new C3708tq(placementName, adFormat).m12482a();
            int i = a.f10708a[cappingType.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new OooOOO0.OooO00o();
                }
                objMo7976a = this.f10706a.mo7976a(strM12482a, cappingType, cappingConfig);
            } else {
                objMo7976a = this.f10707b.mo7976a(strM12482a, cappingType, cappingConfig);
            }
        } catch (Throwable th) {
            throw th;
        }
        return objMo7976a;
    }

    public /* synthetic */ C3498oq(C3317l8 c3317l8, C3587ra c3587ra, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this((i & 1) != 0 ? new C3317l8(null, null, null, 7, null) : c3317l8, (i & 2) != 0 ? new C3587ra() : c3587ra);
    }
}
