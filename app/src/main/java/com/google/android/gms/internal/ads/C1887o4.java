package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzv;

/* renamed from: com.google.android.gms.internal.ads.o4 */
/* loaded from: classes2.dex */
public final class C1887o4 {
    public static final C1776l4 OooO00o(Context context, C1702j4 c1702j4) {
        com.google.android.gms.internal.measurement.o0OOO00 o0ooo00 = new com.google.android.gms.internal.measurement.o0OOO00(context, 2);
        C1776l4 c1776l4 = new C1776l4(o0ooo00);
        de0 de0Var = new de0(o0ooo00, c1702j4, c1776l4, 7);
        C2249xx c2249xx = new C2249xx(o0ooo00, false, c1776l4, 12);
        synchronized (o0ooo00.f26562OooOo) {
            C1666i4 c1666i4 = new C1666i4(context, zzv.zzu().zzb(), de0Var, c2249xx);
            o0ooo00.f26564OooOo0o = c1666i4;
            c1666i4.checkAvailabilityAndConnect();
        }
        return c1776l4;
    }
}
