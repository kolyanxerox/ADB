package com.ironsource;

import com.ironsource.C3277k3;
import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;

/* renamed from: com.ironsource.i3 */
/* loaded from: classes2.dex */
public final class C3208i3 implements InterfaceC3242j3 {

    /* renamed from: a */
    private final String f8962a;

    /* renamed from: b */
    private final String f8963b;

    /* renamed from: c */
    private final IronSource.AD_UNIT f8964c;

    /* renamed from: d */
    private final boolean f8965d;

    /* renamed from: e */
    private final boolean f8966e;

    /* renamed from: f */
    private final boolean f8967f;

    /* renamed from: com.ironsource.i3$a */
    public static final class a {

        /* renamed from: a */
        public static final a f8968a = new a();

        /* renamed from: b */
        public static final int f8969b = 1;

        /* renamed from: c */
        public static final int f8970c = 1;

        /* renamed from: d */
        public static final int f8971d = 1;

        private a() {
        }
    }

    public C3208i3(String version, String instanceId, IronSource.AD_UNIT adFormat, boolean z, boolean z2, boolean z3) {
        kotlin.jvm.internal.OooOo.OooO0o0(version, "version");
        kotlin.jvm.internal.OooOo.OooO0o0(instanceId, "instanceId");
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        this.f8962a = version;
        this.f8963b = instanceId;
        this.f8964c = adFormat;
        this.f8965d = z;
        this.f8966e = z2;
        this.f8967f = z3;
    }

    @Override // com.ironsource.InterfaceC3242j3
    /* renamed from: a */
    public ArrayList<InterfaceC3312l3> mo9251a() {
        ArrayList<InterfaceC3312l3> arrayList = new ArrayList<>();
        arrayList.add(new C3277k3.v(this.f8962a));
        arrayList.add(new C3277k3.x(this.f8963b));
        arrayList.add(new C3277k3.a(this.f8964c));
        if (this.f8965d) {
            arrayList.add(new C3277k3.p(1));
        }
        if (this.f8966e) {
            arrayList.add(new C3277k3.e(1));
        }
        if (this.f8967f) {
            arrayList.add(new C3277k3.o(1));
        }
        return arrayList;
    }

    public /* synthetic */ C3208i3(String str, String str2, IronSource.AD_UNIT ad_unit, boolean z, boolean z2, boolean z3, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(str, str2, ad_unit, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? true : z3);
    }
}
