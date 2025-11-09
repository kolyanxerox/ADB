package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;

/* renamed from: com.ironsource.jv */
/* loaded from: classes2.dex */
public final class C3270jv {

    /* renamed from: a */
    private final String f9180a;

    /* renamed from: b */
    private final String f9181b;

    /* renamed from: c */
    private final boolean f9182c;

    /* renamed from: d */
    private final Boolean f9183d;

    public C3270jv(String str, boolean z, Boolean bool, String str2) {
        this.f9180a = str2;
        this.f9181b = str;
        this.f9182c = z;
        this.f9183d = bool;
    }

    /* renamed from: a */
    public final String m9543a() {
        return this.f9180a;
    }

    /* renamed from: b */
    public final boolean m9545b() {
        return kotlin.jvm.internal.OooOo.OooO00o(this.f9183d, Boolean.TRUE);
    }

    public /* synthetic */ C3270jv(String str, boolean z, Boolean bool, String str2, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(str, z, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? null : str2);
    }

    /* renamed from: a */
    public final boolean m9544a(NetworkSettings networkSettings, IronSource.AD_UNIT adUnit) {
        kotlin.jvm.internal.OooOo.OooO0o0(networkSettings, "networkSettings");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        String str = this.f9181b;
        if (str == null || str.length() == 0) {
            return true;
        }
        C3573qv c3573qv = C3573qv.f11160a;
        return kotlin.jvm.internal.OooOo.OooO00o(c3573qv.m11665a(networkSettings), this.f9181b) && c3573qv.m11676a(networkSettings, adUnit) == this.f9182c;
    }
}
