package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.u1 */
/* loaded from: classes2.dex */
public final class RunnableC2106u1 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f24548OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C2143v1 f24549OooOo0o;

    public /* synthetic */ RunnableC2106u1(C2143v1 c2143v1, int i) {
        this.f24548OooOo0O = i;
        this.f24549OooOo0o = c2143v1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24548OooOo0O) {
            case 0:
                C2143v1 c2143v1 = this.f24549OooOo0o;
                c2143v1.getClass();
                try {
                    if (c2143v1.f24818OooO0o == null && c2143v1.f24813OooO) {
                        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(c2143v1.f24814OooO00o);
                        advertisingIdClient.start();
                        c2143v1.f24818OooO0o = advertisingIdClient;
                        break;
                    }
                } catch (OooOooo.o000O0O0 | OooOooo.o000OO0O | IOException unused) {
                    c2143v1.f24818OooO0o = null;
                    return;
                }
                break;
            default:
                AbstractC1448c7.OooO00o(this.f24549OooOo0o.f24814OooO00o);
                break;
        }
    }
}
