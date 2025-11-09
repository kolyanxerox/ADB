package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.C3404p;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ironsource.ct */
/* loaded from: classes2.dex */
public final class C3019ct implements InterfaceC3160gp {

    /* renamed from: a */
    public static final C3019ct f7838a = new C3019ct();

    /* renamed from: b */
    private static final C3129ft f7839b = new C3129ft();

    /* renamed from: com.ironsource.ct$a */
    public static final class a implements InterfaceC3710ts {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3710ts f7840a;

        public a(InterfaceC3710ts interfaceC3710ts) {
            this.f7840a = interfaceC3710ts;
        }

        @Override // com.ironsource.InterfaceC3710ts
        /* renamed from: a */
        public void mo8029a(C3465ns sdkConfig) {
            kotlin.jvm.internal.OooOo.OooO0o0(sdkConfig, "sdkConfig");
            C3019ct.f7839b.m8805a(new OooO0O0(sdkConfig, this.f7840a));
        }

        /* renamed from: a */
        public static final void m8228a(C3465ns sdkConfig, InterfaceC3710ts listener) {
            kotlin.jvm.internal.OooOo.OooO0o0(sdkConfig, "$sdkConfig");
            kotlin.jvm.internal.OooOo.OooO0o0(listener, "$listener");
            C3019ct.f7838a.m8218a(sdkConfig, listener);
        }

        @Override // com.ironsource.InterfaceC3710ts
        /* renamed from: a */
        public void mo8030a(C3535ps error) {
            kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
            C3019ct.f7839b.m8816d(new OooO0OO(this.f7840a, error, 1));
        }

        /* renamed from: a */
        public static final void m8229a(InterfaceC3710ts listener, C3535ps error) {
            kotlin.jvm.internal.OooOo.OooO0o0(listener, "$listener");
            kotlin.jvm.internal.OooOo.OooO0o0(error, "$error");
            listener.mo8030a(error);
        }
    }

    private C3019ct() {
    }

    /* renamed from: b */
    public static final void m8222b(Context context, C3780vs initRequest, InterfaceC3710ts listener) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "$context");
        kotlin.jvm.internal.OooOo.OooO0o0(initRequest, "$initRequest");
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "$listener");
        new C3190hk().m9135a(EnumC3745us.LEVEL_PLAY_INIT);
        f7838a.m8215a(context, initRequest, listener, false);
    }

    /* renamed from: d */
    public static final void m8224d(Context context, C3780vs initRequest, InterfaceC3710ts listener) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "$context");
        kotlin.jvm.internal.OooOo.OooO0o0(initRequest, "$initRequest");
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "$listener");
        C3404p c3404pM10470j = C3404p.m10470j();
        String strM12817d = initRequest.m12817d();
        IronSource.AD_UNIT[] ad_unitArr = (IronSource.AD_UNIT[]) initRequest.m12818e().toArray(new IronSource.AD_UNIT[0]);
        List<IronSource.AD_UNIT> validAdUnitsList = c3404pM10470j.m10499a(context, strM12817d, false, (IronSource.AD_UNIT[]) Arrays.copyOf(ad_unitArr, ad_unitArr.length));
        kotlin.jvm.internal.OooOo.OooO0Oo(validAdUnitsList, "validAdUnitsList");
        initRequest.m12814a(validAdUnitsList);
        new C3190hk().m9135a(EnumC3745us.EXTERNAL_MEDIATION_INIT);
        f7838a.m8215a(context, initRequest, listener, true);
    }

    /* renamed from: c */
    public final void m8227c(Context context, C3780vs initRequest, InterfaceC3710ts listener) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(initRequest, "initRequest");
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
        f7839b.m8813c(new OooOOO0(context, initRequest, listener, 0));
    }

    @Override // com.ironsource.InterfaceC3160gp
    public void onInitFailed(IronSourceError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        f7839b.m8805a(new OooO0o(error, 2));
    }

    /* renamed from: b */
    public static final void m8223b(C3571qt serverResponse) {
        kotlin.jvm.internal.OooOo.OooO0o0(serverResponse, "$serverResponse");
        C2984bt.f7641a.m8023a(new C3814ws(serverResponse));
    }

    /* renamed from: a */
    public final void m8225a(Context context, C3780vs initRequest, InterfaceC3710ts listener) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(initRequest, "initRequest");
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
        f7839b.m8813c(new OooOOO0(context, initRequest, listener, 1));
    }

    /* renamed from: a */
    private final void m8215a(Context context, C3780vs c3780vs, InterfaceC3710ts interfaceC3710ts, boolean z) {
        String strM12819f = c3780vs.m12819f();
        if (strM12819f == null || strM12819f.length() <= 0) {
            c3780vs = new C3780vs(c3780vs.m12817d(), C3404p.m10470j().m10555l(), o00O0.OooOo00.Oooo0o(c3780vs.m12818e()));
        } else {
            C3404p.m10470j().m10562p(c3780vs.m12819f());
        }
        C3404p c3404pM10470j = C3404p.m10470j();
        String strM12817d = c3780vs.m12817d();
        IronSource.AD_UNIT[] ad_unitArr = (IronSource.AD_UNIT[]) c3780vs.m12818e().toArray(new IronSource.AD_UNIT[0]);
        IronSourceError ironSourceErrorM10492a = c3404pM10470j.m10492a(context, strM12817d, z, null, this, (IronSource.AD_UNIT[]) Arrays.copyOf(ad_unitArr, ad_unitArr.length));
        if (ironSourceErrorM10492a == null || ironSourceErrorM10492a.getErrorCode() == 2020) {
            C2984bt.f7641a.m8022a(context, c3780vs, new a(interfaceC3710ts));
            return;
        }
        if (ironSourceErrorM10492a.getErrorCode() == 2040) {
            C3571qt c3571qtM10548e = C3404p.m10470j().m10548e();
            if (c3571qtM10548e != null) {
                m8218a(new C3465ns(new C3814ws(c3571qtM10548e)), interfaceC3710ts);
                return;
            }
        } else if (ironSourceErrorM10492a.getErrorCode() == 2030) {
            C2984bt.f7641a.m8025e();
            return;
        }
        f7839b.m8816d(new o00000O0(7, interfaceC3710ts, ironSourceErrorM10492a));
    }

    /* renamed from: a */
    public static final void m8217a(IronSourceError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "$error");
        C2984bt.f7641a.m8024b(new C3535ps(error));
    }

    /* renamed from: a */
    public final void m8218a(C3465ns c3465ns, InterfaceC3710ts interfaceC3710ts) {
        if (C3404p.m10470j().m10528a(false, c3465ns.m11051d())) {
            f7839b.m8816d(new OooO0O0(interfaceC3710ts, c3465ns, 1));
        } else {
            f7839b.m8816d(new OooO0o(interfaceC3710ts, 4));
        }
    }

    @Override // com.ironsource.InterfaceC3160gp
    /* renamed from: a */
    public void mo8226a(C3571qt serverResponse) {
        kotlin.jvm.internal.OooOo.OooO0o0(serverResponse, "serverResponse");
        f7839b.m8805a(new OooO0o(serverResponse, 3));
    }

    /* renamed from: a */
    public static final void m8219a(InterfaceC3710ts listener) {
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "$listener");
        listener.mo8030a(new C3535ps(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "An unknown error has occurred"));
    }

    /* renamed from: a */
    public static final void m8220a(InterfaceC3710ts listener, IronSourceError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "$listener");
        kotlin.jvm.internal.OooOo.OooO0Oo(error, "error");
        listener.mo8030a(new C3535ps(error));
    }

    /* renamed from: a */
    public static final void m8221a(InterfaceC3710ts listener, C3465ns sdkInitResponse) {
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "$listener");
        kotlin.jvm.internal.OooOo.OooO0o0(sdkInitResponse, "$sdkInitResponse");
        listener.mo8029a(sdkInitResponse);
    }
}
