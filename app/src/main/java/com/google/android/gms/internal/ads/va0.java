package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;

/* loaded from: classes2.dex */
public final class va0 implements jb0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f24933OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f24934OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f24935OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f24936OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f24937OooO0o0;

    public va0(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f24933OooO00o = str;
        this.f24934OooO0O0 = z;
        this.f24935OooO0OO = z2;
        this.f24936OooO0Oo = z3;
        this.f24937OooO0o0 = z4;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((C1581fu) obj).f19126OooO0O0;
        String str = this.f24933OooO00o;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z = this.f24934OooO0O0;
        bundle.putInt("test_mode", z ? 1 : 0);
        boolean z2 = this.f24935OooO0OO;
        bundle.putInt("linked_device", z2 ? 1 : 0);
        if (z || z2) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOo0O)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f24937OooO0o0);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((C1581fu) obj).f19125OooO00o;
        String str = this.f24933OooO00o;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z = this.f24934OooO0O0;
        bundle.putInt("test_mode", z ? 1 : 0);
        boolean z2 = this.f24935OooO0OO;
        bundle.putInt("linked_device", z2 ? 1 : 0);
        if (z || z2) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOOo)).booleanValue()) {
                bundle.putInt("risd", !this.f24936OooO0Oo ? 1 : 0);
            }
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOo0O)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f24937OooO0o0);
            }
        }
    }
}
