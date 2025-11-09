package com.ironsource;

import com.ironsource.AbstractC3718u1;
import com.ironsource.C3350m2;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ironsource.io */
/* loaded from: classes2.dex */
public final class C3229io extends AbstractC3718u1 {

    /* renamed from: y */
    public static final a f9038y = new a(null);

    /* renamed from: t */
    private final C3061e1 f9039t;

    /* renamed from: u */
    private final C3683t1 f9040u;

    /* renamed from: v */
    private final C3705tn f9041v;

    /* renamed from: w */
    private final String f9042w;

    /* renamed from: x */
    private final String f9043x;

    /* renamed from: com.ironsource.io$a */
    public static final class a {
        private a() {
        }

        /* renamed from: a */
        public final C3229io m9372a(C3061e1 adProperties, C3122fm c3122fm) {
            List<C2980bp> listM8726d;
            C3571qt c3571qtM11051d;
            kotlin.jvm.internal.OooOo.OooO0o0(adProperties, "adProperties");
            AbstractC3718u1.a aVar = AbstractC3718u1.f12122r;
            C3725u8 c3725u8M11635c = (c3122fm == null || (c3571qtM11051d = c3122fm.m11051d()) == null) ? null : c3571qtM11051d.m11635c();
            C3705tn c3705tnM12636e = c3725u8M11635c != null ? c3725u8M11635c.m12636e() : null;
            if (c3705tnM12636e == null) {
                throw new IllegalStateException("Error getting " + adProperties.m8434a() + " configurations");
            }
            if (c3122fm == null || (listM8726d = c3122fm.m8726d(adProperties.m8439e(), adProperties.m8437c())) == null) {
                listM8726d = o00O0.oo000o.f31251OooOo0O;
            }
            String userIdForNetworks = IronSourceUtils.getUserIdForNetworks();
            ArrayList arrayList = new ArrayList(o00O0.Oooo000.OooOo0(listM8726d, 10));
            Iterator<T> it = listM8726d.iterator();
            while (it.hasNext()) {
                arrayList.add(((C2980bp) it.next()).m7963f());
            }
            C3840xk c3840xkM13069b = C3840xk.m13069b();
            kotlin.jvm.internal.OooOo.OooO0Oo(c3840xkM13069b, "getInstance()");
            return new C3229io(adProperties, new C3683t1(userIdForNetworks, arrayList, c3840xkM13069b), c3705tnM12636e);
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3229io(C3061e1 adProperties, C3683t1 adUnitCommonData, C3705tn configs) {
        super(adProperties, true, adUnitCommonData.m12356f(), adUnitCommonData.m12354d(), adUnitCommonData.m12355e(), configs.m12474d(), configs.m12468b(), (int) (configs.m12472c() / 1000), configs.m12467a(), configs.m12476f(), -1, new C3350m2(C3350m2.a.MANUAL, configs.m12474d().m11097j(), configs.m12474d().m11089b(), -1L), configs.m12478h(), configs.m12479i(), configs.m12481k(), configs.m12480j(), false, 65536, null);
        kotlin.jvm.internal.OooOo.OooO0o0(adProperties, "adProperties");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.OooOo.OooO0o0(configs, "configs");
        this.f9039t = adProperties;
        this.f9040u = adUnitCommonData;
        this.f9041v = configs;
        this.f9042w = "NA";
        this.f9043x = C3157gm.f8744e;
    }

    /* renamed from: A */
    public final C3705tn m9362A() {
        return this.f9041v;
    }

    /* renamed from: a */
    public final C3229io m9363a(C3061e1 adProperties, C3683t1 adUnitCommonData, C3705tn configs) {
        kotlin.jvm.internal.OooOo.OooO0o0(adProperties, "adProperties");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.OooOo.OooO0o0(configs, "configs");
        return new C3229io(adProperties, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC3718u1
    /* renamed from: b */
    public C3061e1 mo9364b() {
        return this.f9039t;
    }

    @Override // com.ironsource.AbstractC3718u1
    /* renamed from: c */
    public String mo9366c() {
        return this.f9042w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3229io)) {
            return false;
        }
        C3229io c3229io = (C3229io) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f9039t, c3229io.f9039t) && kotlin.jvm.internal.OooOo.OooO00o(this.f9040u, c3229io.f9040u) && kotlin.jvm.internal.OooOo.OooO00o(this.f9041v, c3229io.f9041v);
    }

    public int hashCode() {
        return this.f9041v.hashCode() + ((this.f9040u.hashCode() + (this.f9039t.hashCode() * 31)) * 31);
    }

    @Override // com.ironsource.AbstractC3718u1
    /* renamed from: j */
    public String mo9367j() {
        return this.f9043x;
    }

    public String toString() {
        return "NativeAdUnitData(adProperties=" + this.f9039t + ", adUnitCommonData=" + this.f9040u + ", configs=" + this.f9041v + ')';
    }

    /* renamed from: w */
    public final C3061e1 m9368w() {
        return this.f9039t;
    }

    /* renamed from: x */
    public final C3683t1 m9369x() {
        return this.f9040u;
    }

    /* renamed from: y */
    public final C3705tn m9370y() {
        return this.f9041v;
    }

    /* renamed from: z */
    public final C3683t1 m9371z() {
        return this.f9040u;
    }

    /* renamed from: a */
    public static /* synthetic */ C3229io m9361a(C3229io c3229io, C3061e1 c3061e1, C3683t1 c3683t1, C3705tn c3705tn, int i, Object obj) {
        if ((i & 1) != 0) {
            c3061e1 = c3229io.f9039t;
        }
        if ((i & 2) != 0) {
            c3683t1 = c3229io.f9040u;
        }
        if ((i & 4) != 0) {
            c3705tn = c3229io.f9041v;
        }
        return c3229io.m9363a(c3061e1, c3683t1, c3705tn);
    }

    @Override // com.ironsource.AbstractC3718u1
    /* renamed from: b */
    public JSONObject mo9365b(NetworkSettings providerSettings) {
        kotlin.jvm.internal.OooOo.OooO0o0(providerSettings, "providerSettings");
        JSONObject nativeAdSettings = providerSettings.getNativeAdSettings();
        kotlin.jvm.internal.OooOo.OooO0Oo(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }
}
