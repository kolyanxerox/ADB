package com.ironsource;

import com.ironsource.C3350m2;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;

/* renamed from: com.ironsource.do */
/* loaded from: classes2.dex */
public final class C3049do extends C3682t0 {

    /* renamed from: s */
    private final String f8320s;

    /* renamed from: t */
    private final List<NetworkSettings> f8321t;

    /* renamed from: u */
    private final C3705tn f8322u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3049do(String str, List<? extends NetworkSettings> list, C3705tn configs) {
        super(IronSource.AD_UNIT.NATIVE_AD, str, list, configs.m12474d(), configs.m12468b(), (int) (configs.m12472c() / 1000), configs.m12467a(), configs.m12476f(), -1, new C3350m2(C3350m2.a.MANUAL, configs.m12474d().m11097j(), configs.m12474d().m11089b(), -1L), new C3137g2(-1L), configs.m12478h(), configs.m12479i(), configs.m12481k(), configs.m12480j(), false, 32768, null);
        kotlin.jvm.internal.OooOo.OooO0o0(configs, "configs");
        this.f8320s = str;
        this.f8321t = list;
        this.f8322u = configs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ C3049do m8377a(C3049do c3049do, String str, List list, C3705tn c3705tn, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3049do.f8320s;
        }
        if ((i & 2) != 0) {
            list = c3049do.f8321t;
        }
        if ((i & 4) != 0) {
            c3705tn = c3049do.f8322u;
        }
        return c3049do.m8378a(str, list, c3705tn);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3049do)) {
            return false;
        }
        C3049do c3049do = (C3049do) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f8320s, c3049do.f8320s) && kotlin.jvm.internal.OooOo.OooO00o(this.f8321t, c3049do.f8321t) && kotlin.jvm.internal.OooOo.OooO00o(this.f8322u, c3049do.f8322u);
    }

    public int hashCode() {
        String str = this.f8320s;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f8321t;
        return this.f8322u.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
    }

    @Override // com.ironsource.C3682t0
    /* renamed from: j */
    public List<NetworkSettings> mo8379j() {
        return this.f8321t;
    }

    @Override // com.ironsource.C3682t0
    /* renamed from: o */
    public String mo8380o() {
        return this.f8320s;
    }

    /* renamed from: s */
    public final String m8381s() {
        return this.f8320s;
    }

    /* renamed from: t */
    public final List<NetworkSettings> m8382t() {
        return this.f8321t;
    }

    public String toString() {
        return "NativeAdManagerData(userId=" + this.f8320s + ", providerList=" + this.f8321t + ", configs=" + this.f8322u + ')';
    }

    /* renamed from: u */
    public final C3705tn m8383u() {
        return this.f8322u;
    }

    /* renamed from: v */
    public final C3705tn m8384v() {
        return this.f8322u;
    }

    /* renamed from: a */
    public final C3049do m8378a(String str, List<? extends NetworkSettings> list, C3705tn configs) {
        kotlin.jvm.internal.OooOo.OooO0o0(configs, "configs");
        return new C3049do(str, list, configs);
    }
}
