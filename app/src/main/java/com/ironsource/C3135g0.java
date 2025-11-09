package com.ironsource;

import com.google.android.gms.internal.measurement.o0OOO0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.UUID;

/* renamed from: com.ironsource.g0 */
/* loaded from: classes2.dex */
public final class C3135g0 {

    /* renamed from: a */
    private final AbstractC3718u1 f8671a;

    /* renamed from: b */
    private final NetworkSettings f8672b;

    /* renamed from: c */
    private final oo00o.OooO0OO f8673c;

    /* renamed from: com.ironsource.g0$a */
    public static final class a extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.OooO0O0 {

        /* renamed from: a */
        final /* synthetic */ C3719u2 f8674a;

        /* renamed from: b */
        final /* synthetic */ C3135g0 f8675b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3719u2 c3719u2, C3135g0 c3135g0) {
            super(0);
            this.f8674a = c3719u2;
            this.f8675b = c3135g0;
        }

        @Override // o00O0Oo.OooO0O0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseAdAdapter<?, ?> invoke() {
            return this.f8674a.m12528a(this.f8675b.m8851e(), this.f8675b.m8847a(), this.f8675b.m8850d());
        }
    }

    public C3135g0(C3719u2 adTools, AbstractC3718u1 adUnitData, NetworkSettings providerSettings) {
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitData, "adUnitData");
        kotlin.jvm.internal.OooOo.OooO0o0(providerSettings, "providerSettings");
        this.f8671a = adUnitData;
        this.f8672b = providerSettings;
        this.f8673c = o0OOO0.OooO0oo(new a(adTools, this));
    }

    /* renamed from: a */
    public final IronSource.AD_UNIT m8847a() {
        return this.f8671a.mo9364b().m8434a();
    }

    /* renamed from: b */
    public final BaseAdAdapter<?, ?> m8848b() {
        return (BaseAdAdapter) this.f8673c.getValue();
    }

    /* renamed from: c */
    public final String m8849c() {
        String providerName = this.f8672b.getProviderName();
        kotlin.jvm.internal.OooOo.OooO0Oo(providerName, "providerSettings.providerName");
        return providerName;
    }

    /* renamed from: d */
    public final UUID m8850d() {
        return this.f8671a.mo9364b().m8436b();
    }

    /* renamed from: e */
    public final NetworkSettings m8851e() {
        return this.f8672b;
    }
}
