package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* renamed from: com.google.android.gms.internal.ads.te */
/* loaded from: classes2.dex */
public final class BinderC2082te extends AbstractBinderC2181w2 implements InterfaceC2156ve {
    public BinderC2082te() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static InterfaceC2156ve o000O0O0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2156ve ? (InterfaceC2156ve) iInterfaceQueryLocalInterface : new C2119ue(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2156ve
    public final boolean OooO0o(String str) {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, BinderC2082te.class.getClassLoader()));
        } catch (Throwable unused) {
            zzo.zzj("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2156ve
    public final InterfaceC1530eg OooO0o0(String str) {
        return new BinderC1751kg((RtbAdapter) Class.forName(str, false, AbstractC1641hg.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            String string = parcel.readString();
            AbstractC2218x2.OooO0O0(parcel);
            InterfaceC2230xe interfaceC2230xeZzb = zzb(string);
            parcel2.writeNoException();
            AbstractC2218x2.OooO0o0(parcel2, interfaceC2230xeZzb);
            return true;
        }
        if (i == 2) {
            String string2 = parcel.readString();
            AbstractC2218x2.OooO0O0(parcel);
            boolean zZze = zze(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZze ? 1 : 0);
            return true;
        }
        if (i == 3) {
            String string3 = parcel.readString();
            AbstractC2218x2.OooO0O0(parcel);
            InterfaceC1530eg interfaceC1530egOooO0o0 = OooO0o0(string3);
            parcel2.writeNoException();
            AbstractC2218x2.OooO0o0(parcel2, interfaceC1530egOooO0o0);
            return true;
        }
        if (i != 4) {
            return false;
        }
        String string4 = parcel.readString();
        AbstractC2218x2.OooO0O0(parcel);
        boolean zOooO0o = OooO0o(string4);
        parcel2.writeNoException();
        parcel2.writeInt(zOooO0o ? 1 : 0);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2156ve
    public final InterfaceC2230xe zzb(String str) throws RemoteException {
        try {
            try {
                Class<?> cls = Class.forName(str, false, BinderC2082te.class.getClassLoader());
                if (MediationAdapter.class.isAssignableFrom(cls)) {
                    return new BinderC1824mf((MediationAdapter) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (Adapter.class.isAssignableFrom(cls)) {
                    return new BinderC1824mf((Adapter) cls.getDeclaredConstructor(null).newInstance(null));
                }
                zzo.zzj("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable unused) {
                zzo.zze("Reflection failed, retrying using direct instantiation");
                if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    return new BinderC1824mf(new AdMobAdapter());
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    return new BinderC1824mf(new CustomEventAdapter());
                }
                throw new RemoteException();
            }
        } catch (Throwable th) {
            zzo.zzk("Could not instantiate mediation adapter: " + str + ". ", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2156ve
    public final boolean zze(String str) {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, BinderC2082te.class.getClassLoader()));
        } catch (Throwable unused) {
            zzo.zzj("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }
}
