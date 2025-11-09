package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes2.dex */
public final class ij0 {

    /* renamed from: OooO00o */
    public final kj0 f20049OooO00o;

    /* renamed from: OooO0O0 */
    public final boolean f20050OooO0O0 = true;

    public ij0(kj0 kj0Var) {
        this.f20049OooO00o = kj0Var;
    }

    public static ij0 OooO00o(Context context, String str) throws wi0 {
        kj0 jj0Var;
        try {
            try {
                try {
                    IBinder iBinderOooO0O0 = Oooo0oO.o000000.OooO0OO(context, Oooo0oO.o000000.f13867OooO0O0, ModuleDescriptor.MODULE_ID).OooO0O0("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderOooO0O0 == null) {
                        jj0Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderOooO0O0.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        jj0Var = iInterfaceQueryLocalInterface instanceof kj0 ? (kj0) iInterfaceQueryLocalInterface : new jj0(iBinderOooO0O0, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                    }
                    jj0Var.Oooooo0(new Oooo0o.OooO0OO(context), str);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new ij0(jj0Var);
                } catch (Exception e) {
                    throw new wi0(e);
                }
            } catch (RemoteException | wi0 | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new ij0(new lj0());
            }
        } catch (Exception e2) {
            throw new wi0(e2);
        }
    }
}
