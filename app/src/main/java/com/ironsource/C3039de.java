package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* renamed from: com.ironsource.de */
/* loaded from: classes2.dex */
public final class C3039de implements InterfaceC3219ie {

    /* renamed from: a */
    private final C3004ce f8272a;

    /* renamed from: b */
    private final C3555qd f8273b;

    /* renamed from: c */
    private final boolean f8274c;

    public C3039de(C3004ce strategy, C3555qd c3555qd, boolean z) {
        kotlin.jvm.internal.OooOo.OooO0o0(strategy, "strategy");
        this.f8272a = strategy;
        this.f8273b = c3555qd;
        this.f8274c = z;
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: a */
    public void mo8296a() {
        this.f8272a.m8118a(this.f8274c ? "ad expired on expired ad" : "ad expired before load called");
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: b */
    public void mo8300b() {
        this.f8272a.m8118a(this.f8274c ? "show success on expired ad" : "show success before load called");
    }

    @Override // com.ironsource.InterfaceC3219ie
    public void loadAd() {
        C3555qd c3555qdMo9215a = this.f8272a.m8119b().mo9215a(true, this.f8272a.m8123c());
        C3004ce c3004ce = this.f8272a;
        c3004ce.m8114a(new C3184he(c3004ce, c3555qdMo9215a));
        c3555qdMo9215a.m11543a(this.f8272a);
    }

    public /* synthetic */ C3039de(C3004ce c3004ce, C3555qd c3555qd, boolean z, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(c3004ce, c3555qd, (i & 4) != 0 ? false : z);
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: a */
    public void mo8297a(Activity activity) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        this.f8272a.m8124d().mo8473b(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, this.f8274c ? "Show called on expired ad" : "Show called before load success"));
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: b */
    public void mo8301b(IronSourceError ironSourceError) {
        this.f8272a.m8118a(this.f8274c ? "show failed on expired ad" : "show failed before load called");
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: a */
    public void mo8298a(IronSourceError ironSourceError) {
        this.f8272a.m8118a(this.f8274c ? "load failed on expired ad" : "load failed before load called");
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: b */
    public void mo8302b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f8272a.m8118a(this.f8274c ? "load success on expired ad" : "load success before load called");
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: a */
    public void mo8299a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f8272a.m8118a(this.f8274c ? "load with better ad on expired ad" : "load success with better ad before load success");
    }
}
