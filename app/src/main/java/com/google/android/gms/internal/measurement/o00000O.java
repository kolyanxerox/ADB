package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class o00000O extends o0Oo0oo implements o0000oo {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final AtomicReference f26477OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public boolean f26478OooOo0o;

    public o00000O() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.f26477OooOo0O = new AtomicReference();
    }

    public static final Object o000O0O0(Class cls, Bundle bundle) {
        Object obj;
        if (bundle == null || (obj = bundle.get(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ)) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", androidx.datastore.preferences.protobuf.OooO00o.OooOO0o("Unexpected object type. Expected, Received: ", cls.getCanonicalName(), ", ", obj.getClass().getCanonicalName()), e);
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.measurement.o0Oo0oo
    public final boolean OooO(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) o0OO00O.OooO00o(parcel, Bundle.CREATOR);
        o0OO00O.OooO0Oo(parcel);
        o0000oO0(bundle);
        parcel2.writeNoException();
        return true;
    }

    public final String OooOOO(long j) {
        return (String) o000O0O0(String.class, o000OO0O(j));
    }

    @Override // com.google.android.gms.internal.measurement.o0000oo
    public final void o0000oO0(Bundle bundle) {
        AtomicReference atomicReference = this.f26477OooOo0O;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f26478OooOo0o = true;
                } finally {
                    this.f26477OooOo0O.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bundle o000OO0O(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.f26477OooOo0O;
        synchronized (atomicReference) {
            if (!this.f26478OooOo0o) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f26477OooOo0O.get();
        }
        return bundle;
    }
}
