package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.internal.ads.BinderC2082te;

/* loaded from: classes2.dex */
public final class zzb {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static volatile zzci f16674OooO00o;

    public static zzci zza(Context context) {
        if (f16674OooO00o == null) {
            synchronized (zzb.class) {
                try {
                    if (f16674OooO00o == null) {
                        f16674OooO00o = zzbc.zza().zzg(context.getApplicationContext(), new BinderC2082te());
                    }
                } finally {
                }
            }
        }
        return f16674OooO00o;
    }
}
