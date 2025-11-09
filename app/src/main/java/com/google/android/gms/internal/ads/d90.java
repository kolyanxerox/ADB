package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class d90 implements InterfaceC1988qv {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final AtomicReference f18209OooOo0O = new AtomicReference();

    @Override // com.google.android.gms.internal.ads.InterfaceC1988qv
    public final void OooO00o(zzu zzuVar) {
        Object obj = this.f18209OooOo0O.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzdr) obj).zze(zzuVar);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }
}
