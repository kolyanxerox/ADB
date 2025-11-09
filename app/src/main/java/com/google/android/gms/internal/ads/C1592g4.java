package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.ScheduledFuture;

/* renamed from: com.google.android.gms.internal.ads.g4 */
/* loaded from: classes2.dex */
public final class C1592g4 {

    /* renamed from: OooO00o */
    public ScheduledFuture f19217OooO00o = null;

    /* renamed from: OooO0O0 */
    public final RunnableC1442c1 f19218OooO0O0 = new RunnableC1442c1(this, 6);

    /* renamed from: OooO0OO */
    public final Object f19219OooO0OO = new Object();

    /* renamed from: OooO0Oo */
    public C1666i4 f19220OooO0Oo;

    /* renamed from: OooO0o */
    public C1739k4 f19221OooO0o;

    /* renamed from: OooO0o0 */
    public Context f19222OooO0o0;

    public static /* bridge */ /* synthetic */ void OooO0O0(C1592g4 c1592g4) {
        synchronized (c1592g4.f19219OooO0OO) {
            try {
                C1666i4 c1666i4 = c1592g4.f19220OooO0Oo;
                if (c1666i4 == null) {
                    return;
                }
                if (c1666i4.isConnected() || c1592g4.f19220OooO0Oo.isConnecting()) {
                    c1592g4.f19220OooO0Oo.disconnect();
                }
                c1592g4.f19220OooO0Oo = null;
                c1592g4.f19221OooO0o = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C1629h4 OooO00o(C1702j4 c1702j4) {
        synchronized (this.f19219OooO0OO) {
            if (this.f19221OooO0o == null) {
                return new C1629h4();
            }
            try {
                if (this.f19220OooO0Oo.OooOO0O()) {
                    C1739k4 c1739k4 = this.f19221OooO0o;
                    Parcel parcelOooO = c1739k4.OooO();
                    AbstractC2218x2.OooO0OO(parcelOooO, c1702j4);
                    Parcel parcelOooOOO = c1739k4.OooOOO(parcelOooO, 2);
                    C1629h4 c1629h4 = (C1629h4) AbstractC2218x2.OooO00o(parcelOooOOO, C1629h4.CREATOR);
                    parcelOooOOO.recycle();
                    return c1629h4;
                }
                C1739k4 c1739k42 = this.f19221OooO0o;
                Parcel parcelOooO2 = c1739k42.OooO();
                AbstractC2218x2.OooO0OO(parcelOooO2, c1702j4);
                Parcel parcelOooOOO2 = c1739k42.OooOOO(parcelOooO2, 1);
                C1629h4 c1629h42 = (C1629h4) AbstractC2218x2.OooO00o(parcelOooOOO2, C1629h4.CREATOR);
                parcelOooOOO2.recycle();
                return c1629h42;
            } catch (RemoteException e) {
                zzo.zzh("Unable to call into cache service.", e);
                return new C1629h4();
            }
        }
    }

    public final void OooO0OO(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f19219OooO0OO) {
            try {
                if (this.f19222OooO0o0 != null) {
                    return;
                }
                this.f19222OooO0o0 = context.getApplicationContext();
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00Ooo0)).booleanValue()) {
                    OooO0Oo();
                } else {
                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00Ooo00)).booleanValue()) {
                        zzv.zzb().OooO0O0(new C1555f4(this, 0));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0Oo() {
        C1666i4 c1666i4;
        synchronized (this.f19219OooO0OO) {
            if (this.f19222OooO0o0 != null && this.f19220OooO0Oo == null) {
                wj0 wj0Var = new wj0(this, 5);
                C1847n1 c1847n1 = new C1847n1(this, 4);
                synchronized (this) {
                    c1666i4 = new C1666i4(this.f19222OooO0o0, zzv.zzu().zzb(), wj0Var, c1847n1);
                }
                this.f19220OooO0Oo = c1666i4;
                c1666i4.checkAvailabilityAndConnect();
            }
        }
    }
}
