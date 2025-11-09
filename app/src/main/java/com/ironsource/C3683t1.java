package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;

/* renamed from: com.ironsource.t1 */
/* loaded from: classes2.dex */
public final class C3683t1 {

    /* renamed from: a */
    private final String f11991a;

    /* renamed from: b */
    private final List<NetworkSettings> f11992b;

    /* renamed from: c */
    private final C3840xk f11993c;

    /* JADX WARN: Multi-variable type inference failed */
    public C3683t1(String str, List<? extends NetworkSettings> providerList, C3840xk publisherDataHolder) {
        kotlin.jvm.internal.OooOo.OooO0o0(providerList, "providerList");
        kotlin.jvm.internal.OooOo.OooO0o0(publisherDataHolder, "publisherDataHolder");
        this.f11991a = str;
        this.f11992b = providerList;
        this.f11993c = publisherDataHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ C3683t1 m12349a(C3683t1 c3683t1, String str, List list, C3840xk c3840xk, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3683t1.f11991a;
        }
        if ((i & 2) != 0) {
            list = c3683t1.f11992b;
        }
        if ((i & 4) != 0) {
            c3840xk = c3683t1.f11993c;
        }
        return c3683t1.m12350a(str, list, c3840xk);
    }

    /* renamed from: b */
    public final List<NetworkSettings> m12352b() {
        return this.f11992b;
    }

    /* renamed from: c */
    public final C3840xk m12353c() {
        return this.f11993c;
    }

    /* renamed from: d */
    public final List<NetworkSettings> m12354d() {
        return this.f11992b;
    }

    /* renamed from: e */
    public final C3840xk m12355e() {
        return this.f11993c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3683t1)) {
            return false;
        }
        C3683t1 c3683t1 = (C3683t1) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f11991a, c3683t1.f11991a) && kotlin.jvm.internal.OooOo.OooO00o(this.f11992b, c3683t1.f11992b) && kotlin.jvm.internal.OooOo.OooO00o(this.f11993c, c3683t1.f11993c);
    }

    /* renamed from: f */
    public final String m12356f() {
        return this.f11991a;
    }

    public int hashCode() {
        String str = this.f11991a;
        return this.f11993c.hashCode() + ((this.f11992b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    public String toString() {
        return "AdUnitCommonData(userId=" + this.f11991a + ", providerList=" + this.f11992b + ", publisherDataHolder=" + this.f11993c + ')';
    }

    /* renamed from: a */
    public final C3683t1 m12350a(String str, List<? extends NetworkSettings> providerList, C3840xk publisherDataHolder) {
        kotlin.jvm.internal.OooOo.OooO0o0(providerList, "providerList");
        kotlin.jvm.internal.OooOo.OooO0o0(publisherDataHolder, "publisherDataHolder");
        return new C3683t1(str, providerList, publisherDataHolder);
    }

    /* renamed from: a */
    public final String m12351a() {
        return this.f11991a;
    }
}
