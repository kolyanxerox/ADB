package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class ua0 implements jb0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f24614OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Boolean f24615OooO0O0;

    public /* synthetic */ ua0(int i, Boolean bool) {
        this.f24614OooO00o = i;
        this.f24615OooO0O0 = bool;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* synthetic */ void zza(Object obj) {
        int i = this.f24614OooO00o;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        switch (this.f24614OooO00o) {
            case 0:
                C1581fu c1581fu = (C1581fu) obj;
                Boolean bool = this.f24615OooO0O0;
                if (bool != null) {
                    c1581fu.f19125OooO00o.putBoolean("hw_accel", bool.booleanValue());
                    break;
                }
                break;
            default:
                Bundle bundle = ((C1581fu) obj).f19125OooO00o;
                Boolean bool2 = this.f24615OooO0O0;
                if (bool2 != null) {
                    if (!bool2.booleanValue()) {
                        bundle.putInt("lft", 0);
                        break;
                    } else {
                        bundle.putInt("lft", 1);
                        break;
                    }
                } else {
                    bundle.putInt("lft", -1);
                    break;
                }
        }
    }

    private final /* synthetic */ void OooO00o(Object obj) {
    }

    private final /* synthetic */ void OooO0O0(Object obj) {
    }
}
