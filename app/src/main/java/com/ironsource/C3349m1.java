package com.ironsource;

import com.ironsource.AbstractC3212i7;
import com.ironsource.C2951av;
import com.ironsource.C2992c2;
import com.ironsource.InterfaceC3765vd;
import com.ironsource.lifecycle.C3331b;
import com.ironsource.mediationsdk.C3395l;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.m1 */
/* loaded from: classes2.dex */
public class C3349m1 extends C3842xm {

    /* renamed from: b */
    private final IronSource.AD_UNIT f9445b;

    /* renamed from: c */
    private final C2951av.b f9446c;

    /* renamed from: d */
    private final C2967bc f9447d;

    /* renamed from: e */
    private final InterfaceC3078ei f9448e;

    /* renamed from: f */
    private final long f9449f;

    /* renamed from: com.ironsource.m1$a */
    public static final class a {

        /* renamed from: a */
        public static final a f9450a = new a();

        private a() {
        }

        /* renamed from: a */
        public static final C3349m1 m9973a(IronSource.AD_UNIT adFormat, C2992c2.b level) {
            kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
            kotlin.jvm.internal.OooOo.OooO0o0(level, "level");
            return new C3349m1(adFormat, level);
        }
    }

    public C3349m1(C3349m1 adTools, C2992c2.b level) {
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(level, "level");
        this.f9448e = C3495on.f10667s.m11213d().mo8694t();
        this.f9449f = TimeUnit.HOURS.toMillis(1L);
        IronSource.AD_UNIT ad_unit = adTools.f9445b;
        this.f9445b = ad_unit;
        this.f9446c = adTools.f9446c;
        this.f9447d = new C2967bc(ad_unit, level, adTools.f9447d.m7906c(), null, 8, null);
    }

    /* renamed from: a */
    public final ISBannerSize m9957a(LevelPlayAdSize adSize) {
        kotlin.jvm.internal.OooOo.OooO0o0(adSize, "adSize");
        return new C3240j1().m9411b(adSize);
    }

    /* renamed from: b */
    public final long m9962b(LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        C3122fm c3122fmMo8493a = this.f9448e.mo8493a();
        return c3122fmMo8493a != null ? c3122fmMo8493a.m8720b(adFormat) : this.f9449f;
    }

    /* renamed from: c */
    public final String m9966c() {
        return m9956a(this, (String) null, (String) null, 3, (Object) null);
    }

    /* renamed from: d */
    public final IronSource.AD_UNIT m9968d() {
        return this.f9445b;
    }

    /* renamed from: e */
    public final C2967bc m9970e() {
        return this.f9447d;
    }

    /* renamed from: f */
    public final int m9971f() {
        return C3495on.f10667s.m11213d().mo8689k().mo9344a(this.f9445b);
    }

    /* renamed from: g */
    public final boolean m9972g() {
        return C3495on.f10667s.m11213d().mo8694t().mo8495c();
    }

    public C3349m1(IronSource.AD_UNIT adFormat, C2992c2.b level) {
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        kotlin.jvm.internal.OooOo.OooO0o0(level, "level");
        this.f9448e = C3495on.f10667s.m11213d().mo8694t();
        this.f9449f = TimeUnit.HOURS.toMillis(1L);
        this.f9445b = adFormat;
        this.f9447d = new C2967bc(adFormat, level, null, null, 12, null);
        C2951av.b bVarM7837a = C2951av.m7837a(adFormat);
        kotlin.jvm.internal.OooOo.OooO0Oo(bVarM7837a, "createLogFactory(adFormat)");
        this.f9446c = bVarM7837a;
    }

    /* renamed from: a */
    public final Placement m9958a(LevelPlay.AdFormat adFormat, String str) {
        C3122fm c3122fmMo8493a;
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        if (str == null || (c3122fmMo8493a = this.f9448e.mo8493a()) == null) {
            return null;
        }
        return c3122fmMo8493a.m8724c(adFormat, str);
    }

    /* renamed from: b */
    public final AbstractC3212i7.b m9963b(String adUnitId) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitId, "adUnitId");
        C3122fm c3122fmMo8493a = this.f9448e.mo8493a();
        if (c3122fmMo8493a != null) {
            return c3122fmMo8493a.m8716a(adUnitId);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    /* renamed from: c */
    public final String m9967c(String str) {
        return m9956a(this, str, (String) null, 2, (Object) null);
    }

    /* renamed from: d */
    public final Placement m9969d(String placementName) {
        kotlin.jvm.internal.OooOo.OooO0o0(placementName, "placementName");
        C3122fm c3122fmMo8493a = this.f9448e.mo8493a();
        if (c3122fmMo8493a == null) {
            throw new IllegalStateException("Error getting sdk configurations");
        }
        Placement placementM8724c = c3122fmMo8493a.m8724c(LevelPlay.AdFormat.NATIVE_AD, placementName);
        if (placementM8724c != null) {
            return placementM8724c;
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    /* renamed from: a */
    public final Placement m9959a(String placementName) {
        kotlin.jvm.internal.OooOo.OooO0o0(placementName, "placementName");
        C3122fm c3122fmMo8493a = this.f9448e.mo8493a();
        if (c3122fmMo8493a == null) {
            throw new IllegalStateException("Error getting sdk configurations");
        }
        Placement placementM8724c = c3122fmMo8493a.m8724c(LevelPlay.AdFormat.BANNER, placementName);
        if (placementM8724c != null) {
            return placementM8724c;
        }
        throw new IllegalStateException("Error getting placement");
    }

    /* renamed from: b */
    public final C3331b m9964b() {
        C3331b c3331bM9799d = C3331b.m9799d();
        kotlin.jvm.internal.OooOo.OooO0Oo(c3331bM9799d, "getInstance()");
        return c3331bM9799d;
    }

    /* renamed from: a */
    public static /* synthetic */ String m9956a(C3349m1 c3349m1, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c3349m1.m9960a(str, str2);
    }

    /* renamed from: b */
    public final InterfaceC3765vd.a m9965b(LevelPlay.AdFormat adFormat, String adUnitId) {
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitId, "adUnitId");
        C3122fm c3122fmMo8493a = this.f9448e.mo8493a();
        if (c3122fmMo8493a != null) {
            return c3122fmMo8493a.m8722b(adFormat, adUnitId);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    /* renamed from: a */
    public final String m9960a(String str, String str2) {
        String strM7850a = this.f9446c.m7850a(str, str2);
        kotlin.jvm.internal.OooOo.OooO0Oo(strM7850a, "logFactory.createLogMessage(message, suffix)");
        return strM7850a;
    }

    /* renamed from: a */
    public final void m9961a(Map<String, Object> data, ISBannerSize size) {
        kotlin.jvm.internal.OooOo.OooO0o0(data, "data");
        kotlin.jvm.internal.OooOo.OooO0o0(size, "size");
        C3395l.m10365a(data, size);
    }
}
