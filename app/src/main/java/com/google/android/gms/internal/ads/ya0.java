package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class ya0 implements jb0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f25880OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Integer f25881OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f25882OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final String f25883OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final String f25884OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final String f25885OooO0o0;

    public ya0(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.f25880OooO00o = str;
        this.f25881OooO0O0 = num;
        this.f25882OooO0OO = str2;
        this.f25883OooO0Oo = str3;
        this.f25885OooO0o0 = str4;
        this.f25884OooO0o = str5;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((C1581fu) obj).f19126OooO0O0;
        af0.OooOooo("pn", bundle, this.f25880OooO00o);
        af0.OooOooo("dl", bundle, this.f25883OooO0Oo);
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((C1581fu) obj).f19125OooO00o;
        af0.OooOooo("pn", bundle, this.f25880OooO00o);
        Integer num = this.f25881OooO0O0;
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        af0.OooOooo("vnm", bundle, this.f25882OooO0OO);
        af0.OooOooo("dl", bundle, this.f25883OooO0Oo);
        af0.OooOooo("ins_pn", bundle, this.f25885OooO0o0);
        af0.OooOooo("ini_pn", bundle, this.f25884OooO0o);
    }
}
