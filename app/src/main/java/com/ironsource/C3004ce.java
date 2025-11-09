package com.ironsource;

import android.app.Activity;
import com.ironsource.C3555qd;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* renamed from: com.ironsource.ce */
/* loaded from: classes2.dex */
public final class C3004ce implements InterfaceC3765vd, C3555qd.b, C3555qd.a {

    /* renamed from: f */
    public static final a f7733f = new a(null);

    /* renamed from: g */
    public static final String f7734g = "Fullscreen ProgressiveOnShown Strategy";

    /* renamed from: a */
    private final C3349m1 f7735a;

    /* renamed from: b */
    private final InterfaceC3590rd f7736b;

    /* renamed from: c */
    private final InterfaceC3695td f7737c;

    /* renamed from: d */
    private final InterfaceC3730ud f7738d;

    /* renamed from: e */
    private InterfaceC3219ie f7739e;

    /* renamed from: com.ironsource.ce$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    public C3004ce(C3349m1 adTools, InterfaceC3590rd factory, InterfaceC3695td fullscreenAdUnitListener, InterfaceC3730ud listener) {
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(factory, "factory");
        kotlin.jvm.internal.OooOo.OooO0o0(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
        this.f7735a = adTools;
        this.f7736b = factory;
        this.f7737c = fullscreenAdUnitListener;
        this.f7738d = listener;
        this.f7739e = new C3039de(this, null, false, 4, null);
    }

    /* renamed from: a */
    public final C3349m1 m8112a() {
        return this.f7735a;
    }

    /* renamed from: b */
    public final InterfaceC3590rd m8119b() {
        return this.f7736b;
    }

    /* renamed from: c */
    public final InterfaceC3695td m8123c() {
        return this.f7737c;
    }

    /* renamed from: d */
    public final InterfaceC3730ud m8124d() {
        return this.f7738d;
    }

    @Override // com.ironsource.InterfaceC3765vd
    public void loadAd() {
        this.f7739e.loadAd();
    }

    @Override // com.ironsource.InterfaceC3765vd
    /* renamed from: a */
    public void mo8113a(Activity activity) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        this.f7739e.mo8297a(activity);
    }

    @Override // com.ironsource.C3555qd.a
    /* renamed from: b */
    public void mo8120b(C3555qd adUnit) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        this.f7739e.mo8300b();
    }

    /* renamed from: a */
    public final void m8114a(InterfaceC3219ie state) {
        kotlin.jvm.internal.OooOo.OooO0o0(state, "state");
        this.f7739e = state;
    }

    @Override // com.ironsource.C3555qd.b
    /* renamed from: b */
    public void mo8121b(C3555qd adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        this.f7739e.mo8298a(ironSourceError);
    }

    @Override // com.ironsource.C3555qd.b
    /* renamed from: a */
    public void mo8115a(C3555qd adUnit) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        this.f7739e.mo8296a();
    }

    @Override // com.ironsource.C3555qd.b
    /* renamed from: b */
    public void mo8122b(C3555qd adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f7739e.mo8302b(adInfo);
    }

    @Override // com.ironsource.C3555qd.a
    /* renamed from: a */
    public void mo8116a(C3555qd adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        this.f7739e.mo8301b(ironSourceError);
    }

    @Override // com.ironsource.C3555qd.b
    /* renamed from: a */
    public void mo8117a(C3555qd adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f7739e.mo8299a(adInfo);
    }

    /* renamed from: a */
    public final void m8118a(String message) {
        kotlin.jvm.internal.OooOo.OooO0o0(message, "message");
        this.f7735a.m9970e().m7911h().m9917f("Fullscreen ProgressiveOnShown Strategy - ".concat(message));
    }
}
