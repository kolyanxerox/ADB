package com.google.android.gms.ads.internal.util.client;

import Oooo0oO.o000000;
import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes2.dex */
public final class zzs {
    public static Context zza(Context context) throws zzr {
        try {
            return o000000.OooO0OO(context, o000000.f13867OooO0O0, ModuleDescriptor.MODULE_ID).f13879OooO00o;
        } catch (Exception e) {
            throw new zzr(e);
        }
    }

    public static Object zzb(Context context, String str, zzq zzqVar) throws zzr {
        try {
            try {
                return zzqVar.zza(o000000.OooO0OO(context, o000000.f13867OooO0O0, ModuleDescriptor.MODULE_ID).OooO0O0(str));
            } catch (Exception e) {
                throw new zzr(e);
            }
        } catch (Exception e2) {
            throw new zzr(e2);
        }
    }
}
