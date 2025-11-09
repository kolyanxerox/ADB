package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.AbstractC1404b;
import com.google.android.gms.internal.ads.oOO0O0O0;
import com.google.android.gms.internal.ads.oOOO0OO0;
import com.google.android.gms.internal.ads.oOOO0OOO;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzbj extends AbstractC1404b {

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public final /* synthetic */ byte[] f16234Oooo0O0;

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public final /* synthetic */ Map f16235Oooo0OO;

    /* renamed from: Oooo0o0, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzl f16236Oooo0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbj(int i, String str, oOOO0OOO oooo0ooo, oOOO0OO0 oooo0oo0, byte[] bArr, Map map, com.google.android.gms.ads.internal.util.client.zzl zzlVar) {
        super(i, str, oooo0ooo, oooo0oo0);
        this.f16234Oooo0O0 = bArr;
        this.f16235Oooo0OO = map;
        this.f16236Oooo0o0 = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.oOOO00o0
    public final void OooO0O0(Object obj) throws IOException {
        oOOO0OOO oooo0ooo;
        String str = (String) obj;
        this.f16236Oooo0o0.zzg(str);
        synchronized (this.f17142Oooo00o) {
            oooo0ooo = this.f17141Oooo0;
        }
        oooo0ooo.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.oOOO00o0
    public final Map zzl() throws oOO0O0O0 {
        Map map = this.f16235Oooo0OO;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    @Override // com.google.android.gms.internal.ads.oOOO00o0
    public final byte[] zzx() throws oOO0O0O0 {
        byte[] bArr = this.f16234Oooo0O0;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }
}
