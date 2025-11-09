package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.zd */
/* loaded from: classes2.dex */
public final class C2303zd implements InterfaceC1711jd, InterfaceC2266yd {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final C1822md f26147OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final HashSet f26148OooOo0o = new HashSet();

    public C2303zd(C1822md c1822md) {
        this.f26147OooOo0O = c1822md;
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
        this.f26147OooOo0O.OooO0oo(str, interfaceC2042sb);
        this.f26148OooOo0o.add(new AbstractMap.SimpleEntry(str, interfaceC2042sb));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2266yd
    public final void OooOO0(String str, InterfaceC2042sb interfaceC2042sb) {
        this.f26147OooOo0O.OooOO0(str, interfaceC2042sb);
        this.f26148OooOo0o.remove(new AbstractMap.SimpleEntry(str, interfaceC2042sb));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1859nd
    public final void OooOOO(String str, JSONObject jSONObject) {
        OooO00o(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1711jd, com.google.android.gms.internal.ads.InterfaceC1859nd
    public final void zza(String str) {
        this.f26147OooOo0O.zza(str);
    }
}
