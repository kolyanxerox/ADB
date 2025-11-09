package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zze;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class ge0 implements InterfaceC2135uu {

    /* renamed from: OooOo, reason: collision with root package name */
    public final C2052sl f19328OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final HashSet f19329OooOo0O = new HashSet();

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Context f19330OooOo0o;

    public ge0(Context context, C2052sl c2052sl) {
        this.f19330OooOo0o = context;
        this.f19328OooOo = c2052sl;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle OooO00o() {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ge0.OooO00o():android.os.Bundle");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2135uu
    public final synchronized void o0OOO0o(zze zzeVar) {
        if (zzeVar.zza != 3) {
            C2052sl c2052sl = this.f19328OooOo;
            HashSet hashSet = this.f19329OooOo0O;
            synchronized (c2052sl.f24102OooO00o) {
                c2052sl.f24107OooO0o0.addAll(hashSet);
            }
        }
    }
}
