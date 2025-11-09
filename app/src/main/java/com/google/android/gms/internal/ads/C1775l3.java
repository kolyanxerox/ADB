package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;

/* renamed from: com.google.android.gms.internal.ads.l3 */
/* loaded from: classes2.dex */
public final class C1775l3 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Object f20780OooO00o = new Object();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public C1701j3 f20781OooO0O0 = null;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public boolean f20782OooO0OO = false;

    public final Activity OooO00o() {
        synchronized (this.f20780OooO00o) {
            try {
                C1701j3 c1701j3 = this.f20781OooO0O0;
                if (c1701j3 == null) {
                    return null;
                }
                return c1701j3.f20162OooOo0O;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0O0(InterfaceC1738k3 interfaceC1738k3) {
        synchronized (this.f20780OooO00o) {
            try {
                if (this.f20781OooO0O0 == null) {
                    this.f20781OooO0O0 = new C1701j3();
                }
                C1701j3 c1701j3 = this.f20781OooO0O0;
                synchronized (c1701j3.f20161OooOo) {
                    c1701j3.f20166OooOoOO.add(interfaceC1738k3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0OO(Context context) {
        synchronized (this.f20780OooO00o) {
            try {
                if (!this.f20782OooO0OO) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        zzo.zzj("Can not cast Context to Application");
                        return;
                    }
                    if (this.f20781OooO0O0 == null) {
                        this.f20781OooO0O0 = new C1701j3();
                    }
                    C1701j3 c1701j3 = this.f20781OooO0O0;
                    if (!c1701j3.f20169OooOooO) {
                        application.registerActivityLifecycleCallbacks(c1701j3);
                        if (context instanceof Activity) {
                            c1701j3.OooO00o((Activity) context);
                        }
                        c1701j3.f20163OooOo0o = application;
                        c1701j3.f20170OooOooo = ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.f17791o0000Oo0)).longValue();
                        c1701j3.f20169OooOooO = true;
                    }
                    this.f20782OooO0OO = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
