package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

/* loaded from: classes2.dex */
public final class s30 extends AdListener {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f23981OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ String f23982OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AdView f23983OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ x30 f23984OooOoO0;

    public s30(x30 x30Var, String str, AdView adView, String str2) {
        this.f23982OooOo0O = str;
        this.f23983OooOo0o = adView;
        this.f23981OooOo = str2;
        this.f23984OooOoO0 = x30Var;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f23984OooOoO0.o000O(x30.o000O0oo(loadAdError), this.f23981OooOo);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f23984OooOoO0.o000O0O0(this.f23982OooOo0O, this.f23983OooOo0o, this.f23981OooOo);
    }
}
