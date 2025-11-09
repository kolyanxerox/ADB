package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.C1718jk;
import com.google.android.gms.internal.ads.C1790li;
import com.google.android.gms.internal.ads.InterfaceC1792lk;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzb {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f16321OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public boolean f16322OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC1792lk f16323OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final C1790li f16324OooO0Oo = new C1790li(Collections.EMPTY_LIST, false);

    public zzb(Context context, @Nullable InterfaceC1792lk interfaceC1792lk, @Nullable C1790li c1790li) {
        this.f16321OooO00o = context;
        this.f16323OooO0OO = interfaceC1792lk;
    }

    public final void zza() {
        this.f16322OooO0O0 = true;
    }

    public final void zzb(@Nullable String str) {
        List<String> list;
        C1790li c1790li = this.f16324OooO0Oo;
        InterfaceC1792lk interfaceC1792lk = this.f16323OooO0OO;
        if ((interfaceC1792lk == null || !((C1718jk) interfaceC1792lk).f20324OooO0oO.zzf) && !c1790li.zza) {
            return;
        }
        if (str == null) {
            str = "";
        }
        if (interfaceC1792lk != null) {
            ((C1718jk) interfaceC1792lk).OooO00o(str, 3, null);
            return;
        }
        if (!c1790li.zza || (list = c1790li.zzb) == null) {
            return;
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                zzv.zzq();
                com.google.android.gms.ads.internal.util.zzs.zzM(this.f16321OooO00o, "", strReplace);
            }
        }
    }

    public final boolean zzc() {
        InterfaceC1792lk interfaceC1792lk = this.f16323OooO0OO;
        return ((interfaceC1792lk == null || !((C1718jk) interfaceC1792lk).f20324OooO0oO.zzf) && !this.f16324OooO0Oo.zza) || this.f16322OooO0O0;
    }
}
