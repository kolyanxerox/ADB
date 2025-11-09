package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.k20;
import com.google.android.gms.internal.ads.vp0;
import com.ironsource.mediationsdk.metadata.C3401a;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
final class zzat implements vp0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ zzau f16496OooOo0O;

    public zzat(zzau zzauVar) {
        this.f16496OooOo0O = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("SignalGeneratorImpl.initializeWebViewForSignalCollection", th);
        zzau zzauVar = this.f16496OooOo0O;
        k20 k20Var = zzauVar.f16513Oooo000;
        Pair pair = new Pair("sgf_reason", th.getMessage());
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", C3401a.f9920g);
        AtomicInteger atomicInteger = zzauVar.f16528OoooOOo;
        zzaa.zzd(k20Var, null, "sgf", pair, pair2, pair3, pair4, pair5, new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to initialize webview for loading SDKCore. ", th);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OOo0o)).booleanValue() || zzauVar.f16527OoooOOO.get()) {
            return;
        }
        if (atomicInteger.getAndIncrement() < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OOo0oO)).intValue()) {
            zzauVar.o000O0oO();
        }
    }

    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    public final /* bridge */ /* synthetic */ void mo13705zzb(@Nullable Object obj) {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Initialized webview successfully for SDKCore.");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OOo0o)).booleanValue()) {
            zzau zzauVar = this.f16496OooOo0O;
            zzaa.zzd(zzauVar.f16513Oooo000, null, "sgs", new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", C3401a.f9920g), new Pair("sgi_rn", Integer.toString(zzauVar.f16528OoooOOo.get())));
            zzauVar.f16527OoooOOO.set(true);
        }
    }
}
