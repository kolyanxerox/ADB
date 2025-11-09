package com.google.android.gms.ads.internal.util;

import OoooOOO.o0O0oo00;
import com.google.android.gms.internal.ads.C2274yl;
import com.google.android.gms.internal.ads.O0OO00;
import com.google.android.gms.internal.ads.oOOO00;
import com.google.android.gms.internal.ads.oOOO00o0;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbm extends oOOO00o0 {

    /* renamed from: Oooo0 */
    public final com.google.android.gms.ads.internal.util.client.zzl f16238Oooo0;

    /* renamed from: Oooo00o */
    public final C2274yl f16239Oooo00o;

    public zzbm(String str, Map map, C2274yl c2274yl) throws IOException {
        super(0, str, new zzbl(c2274yl));
        this.f16239Oooo00o = c2274yl;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        this.f16238Oooo0 = zzlVar;
        zzlVar.zzd(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.oOOO00o0
    public final o0O0oo00 OooO00o(oOOO00 oooo00) {
        return new o0O0oo00(oooo00, O0OO00.OooO0O0(oooo00));
    }

    @Override // com.google.android.gms.internal.ads.oOOO00o0
    public final /* bridge */ /* synthetic */ void OooO0O0(Object obj) throws IOException {
        byte[] bArr;
        oOOO00 oooo00 = (oOOO00) obj;
        Map map = oooo00.f22823OooO0OO;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = this.f16238Oooo0;
        zzlVar.zzf(map, oooo00.f22821OooO00o);
        if (com.google.android.gms.ads.internal.util.client.zzl.zzk() && (bArr = oooo00.f22822OooO0O0) != null) {
            zzlVar.zzh(bArr);
        }
        this.f16239Oooo00o.zzc(oooo00);
    }
}
