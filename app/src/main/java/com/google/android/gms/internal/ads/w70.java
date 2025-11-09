package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;

/* loaded from: classes2.dex */
public final class w70 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f25242OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f25243OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f25244OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public long f25245OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final Integer f25246OooO0o0;

    public w70(String str, String str2, int i, long j, Integer num) {
        this.f25242OooO00o = str;
        this.f25243OooO0O0 = str2;
        this.f25244OooO0OO = i;
        this.f25245OooO0Oo = j;
        this.f25246OooO0o0 = num;
    }

    public final String toString() {
        Integer num;
        String strOooOoo = this.f25242OooO00o + "." + this.f25244OooO0OO + "." + this.f25245OooO0Oo;
        String str = this.f25243OooO0O0;
        if (!TextUtils.isEmpty(str)) {
            strOooOoo = OooO0oO.OooOo.OooOoo(strOooOoo, ".", str);
        }
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17823o000OOoO)).booleanValue() || (num = this.f25246OooO0o0) == null || TextUtils.isEmpty(str)) {
            return strOooOoo;
        }
        return strOooOoo + "." + num;
    }
}
