package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class n90 implements jb0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f21444OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Object f21445OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Object f21446OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f21447OooO0Oo;

    public /* synthetic */ n90(Object obj, Object obj2, Object obj3, int i) {
        this.f21444OooO00o = i;
        this.f21445OooO0O0 = obj;
        this.f21446OooO0OO = obj2;
        this.f21447OooO0Oo = obj3;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final void zza(Object obj) {
        switch (this.f21444OooO00o) {
            case 0:
            case 1:
                break;
            default:
                vd0 vd0Var = (vd0) this.f21445OooO0O0;
                ArrayList arrayList = vd0Var.f24957OooO0oO;
                C1581fu c1581fu = (C1581fu) obj;
                if (arrayList != null && !arrayList.isEmpty()) {
                    Bundle bundle = c1581fu.f19126OooO0O0;
                    C1414b9 c1414b9 = vd0Var.f24950OooO;
                    if (c1414b9 != null && c1414b9.zzi != 0) {
                        bundle.putBoolean("sccg_tap", c1414b9.zzj);
                        bundle.putInt("sccg_dir", c1414b9.zzi);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0102  */
    @Override // com.google.android.gms.internal.ads.jb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzb(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n90.zzb(java.lang.Object):void");
    }

    private final /* synthetic */ void OooO00o(Object obj) {
    }

    private final /* synthetic */ void OooO0O0(Object obj) {
    }
}
