package com.ironsource;

import android.content.Context;
import com.ironsource.C2951av;
import com.ironsource.C2992c2;
import com.ironsource.mediationsdk.C3395l;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.ISContainerParams;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.List;

/* renamed from: com.ironsource.j1 */
/* loaded from: classes2.dex */
public final class C3240j1 extends C3842xm {

    /* renamed from: b */
    private final C2967bc f9054b;

    /* renamed from: c */
    private final C2951av.b f9055c;

    /* renamed from: d */
    private final InterfaceC3078ei f9056d;

    public C3240j1() {
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        this.f9054b = new C2967bc(ad_unit, C2992c2.b.MEDIATION, null, null, 12, null);
        C2951av.b bVarM7837a = C2951av.m7837a(ad_unit);
        kotlin.jvm.internal.OooOo.OooO0Oo(bVarM7837a, "createLogFactory(IronSource.AD_UNIT.BANNER)");
        this.f9055c = bVarM7837a;
        this.f9056d = C3495on.f10667s.m11213d().mo8694t();
    }

    /* renamed from: c */
    private final Float m9408c() {
        C3122fm c3122fmMo8493a = this.f9056d.mo8493a();
        Float fValueOf = c3122fmMo8493a != null ? Float.valueOf(c3122fmMo8493a.m8728i()) : null;
        if (fValueOf != null) {
            return fValueOf;
        }
        this.f9054b.m7911h().m9917f("MaxScreenSizePercentageForBannerHeight is null: Error getting sdk configurations");
        return null;
    }

    /* renamed from: a */
    public final int m9409a(int i) {
        return C3395l.m10348a(i);
    }

    /* renamed from: b */
    public final Integer m9412b(Context context) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        Float fM9408c = m9408c();
        if (fM9408c != null) {
            return Integer.valueOf(o00O0.o000OOo.OooO(fM9408c.floatValue() * C2966bb.f7584a.m7900a(context)));
        }
        return null;
    }

    /* renamed from: d */
    public final boolean m9414d() {
        return C3495on.f10667s.m11213d().mo8694t().mo8495c();
    }

    /* renamed from: a */
    private final ISBannerSize m9405a(LevelPlayAdSize levelPlayAdSize) {
        LevelPlayAdSize fallbackAdSize$mediationsdk_release = levelPlayAdSize.getFallbackAdSize$mediationsdk_release();
        if (fallbackAdSize$mediationsdk_release == null) {
            fallbackAdSize$mediationsdk_release = LevelPlayAdSize.BANNER;
        }
        ISBannerSize iSBannerSizeM9411b = m9411b(fallbackAdSize$mediationsdk_release);
        iSBannerSizeM9411b.setAdaptive(true);
        iSBannerSizeM9411b.containerParams = new ISContainerParams(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
        return iSBannerSizeM9411b;
    }

    /* renamed from: c */
    private final ISBannerSize m9407c(LevelPlayAdSize levelPlayAdSize) {
        return kotlin.jvm.internal.OooOo.OooO00o(levelPlayAdSize, LevelPlayAdSize.LARGE) ? new ISBannerSize(C3395l.f9867b, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : kotlin.jvm.internal.OooOo.OooO00o(levelPlayAdSize, LevelPlayAdSize.MEDIUM_RECTANGLE) ? new ISBannerSize(C3395l.f9868c, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : kotlin.jvm.internal.OooOo.OooO00o(levelPlayAdSize, LevelPlayAdSize.LEADERBOARD) ? new ISBannerSize(C3395l.f9870e, 0, 0) : levelPlayAdSize.equals(LevelPlayAdSize.Companion.createCustomSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight())) ? new ISBannerSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : new ISBannerSize(C3395l.f9866a, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
    }

    /* renamed from: b */
    public final List<LevelPlayAdSize> m9413b() {
        C3122fm c3122fmMo8493a = this.f9056d.mo8493a();
        if (c3122fmMo8493a != null) {
            return c3122fmMo8493a.m8727h();
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    /* renamed from: a */
    public static /* synthetic */ String m9406a(C3240j1 c3240j1, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c3240j1.m9410a(str, str2);
    }

    /* renamed from: b */
    public final ISBannerSize m9411b(LevelPlayAdSize size) {
        kotlin.jvm.internal.OooOo.OooO0o0(size, "size");
        boolean zIsAdaptive = size.isAdaptive();
        if (zIsAdaptive) {
            return m9405a(size);
        }
        if (zIsAdaptive) {
            throw new OooOOO0.OooO00o();
        }
        return m9407c(size);
    }

    /* renamed from: a */
    public final String m9410a(String str, String str2) {
        String strM7850a = this.f9055c.m7850a(str, str2);
        kotlin.jvm.internal.OooOo.OooO0Oo(strM7850a, "logFactory.createLogMessage(message, suffix)");
        return strM7850a;
    }
}
