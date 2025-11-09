package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ug */
/* loaded from: classes2.dex */
public final class C2121ug extends NativeAd.AdChoicesInfo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f24645OooO00o = new ArrayList();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f24646OooO0O0;

    public C2121ug(InterfaceC1523e9 interfaceC1523e9) {
        try {
            this.f24646OooO0O0 = interfaceC1523e9.zzg();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            this.f24646OooO0O0 = "";
        }
        try {
            ArrayList arrayListZzh = interfaceC1523e9.zzh();
            int size = arrayListZzh.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListZzh.get(i);
                i++;
                InterfaceC1707j9 interfaceC1707j9O000O0O0 = obj instanceof IBinder ? BinderC2298z8.o000O0O0((IBinder) obj) : null;
                if (interfaceC1707j9O000O0O0 != null) {
                    this.f24645OooO00o.add(new C2195wg(interfaceC1707j9O000O0O0));
                }
            }
        } catch (RemoteException e2) {
            zzo.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List getImages() {
        return this.f24645OooO00o;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.f24646OooO0O0;
    }
}
