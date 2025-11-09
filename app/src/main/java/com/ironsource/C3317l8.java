package com.ironsource;

import android.content.Context;
import com.ironsource.InterfaceC3452nf;
import com.ironsource.InterfaceC3621s9;
import com.ironsource.environment.ContextProvider;

/* renamed from: com.ironsource.l8 */
/* loaded from: classes2.dex */
public final class C3317l8 implements InterfaceC3452nf, InterfaceC3452nf.a {

    /* renamed from: a */
    private final C2981bq f9305a;

    /* renamed from: b */
    private final C3572qu f9306b;

    /* renamed from: com.ironsource.l8$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9307a;

        static {
            int[] iArr = new int[EnumC3515p8.values().length];
            try {
                iArr[EnumC3515p8.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3515p8.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3515p8.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9307a = iArr;
        }
    }

    public C3317l8() {
        this(null, null, null, 7, null);
    }

    @Override // com.ironsource.InterfaceC3452nf
    /* renamed from: a */
    public synchronized C3445n8 mo7975a(String identifier) {
        kotlin.jvm.internal.OooOo.OooO0o0(identifier, "identifier");
        C3445n8 c3445n8Mo7975a = this.f9305a.mo7975a(identifier);
        if (c3445n8Mo7975a.m10966d()) {
            return c3445n8Mo7975a;
        }
        return this.f9306b.mo7975a(identifier);
    }

    @Override // com.ironsource.InterfaceC3452nf.a
    /* renamed from: b */
    public synchronized void mo7978b(String identifier) {
        kotlin.jvm.internal.OooOo.OooO0o0(identifier, "identifier");
        this.f9305a.mo7978b(identifier);
        this.f9306b.mo7978b(identifier);
    }

    public C3317l8(InterfaceC3621s9 currentTimeProvider, InterfaceC3151gg pacingDataRepository, InterfaceC3420mi showCountDataRepository) {
        kotlin.jvm.internal.OooOo.OooO0o0(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.OooOo.OooO0o0(pacingDataRepository, "pacingDataRepository");
        kotlin.jvm.internal.OooOo.OooO0o0(showCountDataRepository, "showCountDataRepository");
        this.f9305a = new C2981bq(currentTimeProvider, pacingDataRepository);
        this.f9306b = new C3572qu(currentTimeProvider, showCountDataRepository);
    }

    @Override // com.ironsource.InterfaceC3452nf.a
    /* renamed from: a */
    public synchronized Object mo7976a(String identifier, EnumC3515p8 cappingType, InterfaceC3324lf cappingConfig) {
        Object objMo7976a;
        try {
            kotlin.jvm.internal.OooOo.OooO0o0(identifier, "identifier");
            kotlin.jvm.internal.OooOo.OooO0o0(cappingType, "cappingType");
            kotlin.jvm.internal.OooOo.OooO0o0(cappingConfig, "cappingConfig");
            int i = a.f9307a[cappingType.ordinal()];
            if (i == 1) {
                objMo7976a = this.f9305a.mo7976a(identifier, cappingType, cappingConfig);
            } else if (i == 2) {
                objMo7976a = this.f9306b.mo7976a(identifier, cappingType, cappingConfig);
            } else {
                if (i != 3) {
                    throw new OooOOO0.OooO00o();
                }
                objMo7976a = oo00o.OooOo.f33195OooO00o;
            }
        } catch (Throwable th) {
            throw th;
        }
        return objMo7976a;
    }

    public /* synthetic */ C3317l8(InterfaceC3621s9 interfaceC3621s9, InterfaceC3151gg interfaceC3151gg, InterfaceC3420mi interfaceC3420mi, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        interfaceC3621s9 = (i & 1) != 0 ? new InterfaceC3621s9.a() : interfaceC3621s9;
        if ((i & 2) != 0) {
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            kotlin.jvm.internal.OooOo.OooO0Oo(applicationContext, "getInstance().applicationContext");
            interfaceC3151gg = new C3016cq(new C3343lu(applicationContext, "pacing_service", null, 4, null));
        }
        if ((i & 4) != 0) {
            Context applicationContext2 = ContextProvider.getInstance().getApplicationContext();
            kotlin.jvm.internal.OooOo.OooO0Oo(applicationContext2, "getInstance().applicationContext");
            interfaceC3420mi = new C3502ou(new C3343lu(applicationContext2, "capping_service", null, 4, null));
        }
        this(interfaceC3621s9, interfaceC3151gg, interfaceC3420mi);
    }
}
