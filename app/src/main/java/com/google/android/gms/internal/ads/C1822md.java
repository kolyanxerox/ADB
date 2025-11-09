package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.md */
/* loaded from: classes2.dex */
public final class C1822md implements InterfaceC1711jd, InterfaceC2266yd {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final InterfaceC1722jo f21202OooOo0O;

    public C1822md(Context context, VersionInfoParcel versionInfoParcel) {
        zzv.zzA();
        InterfaceC1722jo interfaceC1722joOooO00o = C2055so.OooO00o(new Oooo0oO.o0O0O00(0, 0, 0), context, versionInfoParcel, null, null, new C1998r4(), null, null, null, null, null, null, "", false, false);
        this.f21202OooOo0O = interfaceC1722joOooO00o;
        interfaceC1722joOooO00o.OooO0oO().setWillNotDraw(true);
    }

    public static final void Oooo000(Runnable runnable) {
        zzbc.zzb();
        if (zzf.zzu()) {
            zze.zza("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            zze.zza("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (zzs.zza.post(runnable)) {
                return;
            }
            zzo.zzj("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1859nd
    public final void OooO00o(String str, String str2) {
        zza(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1675id
    public final void OooO0o(String str, Map map) {
        try {
            OooO0o0("openIntentAsync", zzbc.zzb().zzj((HashMap) map));
        } catch (JSONException unused) {
            zzo.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1675id
    public final /* synthetic */ void OooO0o0(String str, JSONObject jSONObject) {
        ze0.Oooo000(this, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2266yd
    public final void OooO0oo(String str, InterfaceC2042sb interfaceC2042sb) {
        this.f21202OooOo0O.Oooo0OO(str, new C1785ld(this, interfaceC2042sb));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2266yd
    public final void OooOO0(String str, InterfaceC2042sb interfaceC2042sb) {
        this.f21202OooOo0O.Ooooo0o(str, new C1847n1(interfaceC2042sb, 5));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1859nd
    public final void OooOOO(String str, JSONObject jSONObject) {
        OooO00o(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1711jd, com.google.android.gms.internal.ads.InterfaceC1859nd
    public final void zza(String str) {
        zze.zza("invokeJavascript on adWebView from js");
        Oooo000(new RunnableC1748kd(this, str, 1));
    }
}
