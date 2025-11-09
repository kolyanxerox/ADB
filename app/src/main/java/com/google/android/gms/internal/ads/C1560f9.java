package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.f9 */
/* loaded from: classes2.dex */
public final class C1560f9 extends NativeAd.AdChoicesInfo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC1523e9 f18888OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f18889OooO0O0 = new ArrayList();

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f18890OooO0OO;

    public C1560f9(InterfaceC1523e9 interfaceC1523e9) {
        IBinder iBinder;
        this.f18888OooO00o = interfaceC1523e9;
        try {
            this.f18890OooO0OO = interfaceC1523e9.zzg();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            this.f18890OooO0OO = "";
        }
        try {
            ArrayList arrayListZzh = interfaceC1523e9.zzh();
            int size = arrayListZzh.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListZzh.get(i);
                i++;
                InterfaceC1707j9 c1671i9 = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    c1671i9 = iInterfaceQueryLocalInterface instanceof InterfaceC1707j9 ? (InterfaceC1707j9) iInterfaceQueryLocalInterface : new C1671i9(iBinder);
                }
                if (c1671i9 != null) {
                    this.f18889OooO0O0.add(new C1744k9(c1671i9));
                }
            }
        } catch (RemoteException e2) {
            zzo.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List getImages() {
        return this.f18889OooO0O0;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.f18890OooO0OO;
    }
}
