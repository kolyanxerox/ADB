package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.i2 */
/* loaded from: classes2.dex */
public final class C1664i2 extends AbstractCallableC1959q2 {
    @Override // com.google.android.gms.internal.ads.AbstractCallableC1959q2
    public final void OooO00o() throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f23489OooOo0O.f24824OooOOO) {
            OooO0OO();
            return;
        }
        synchronized (this.f23492OooOoO0) {
            C2104u c2104u = this.f23492OooOoO0;
            String str = (String) this.f23491OooOoO.invoke(null, this.f23489OooOo0O.f24814OooO00o);
            c2104u.OooO0Oo();
            C1514e0.OooOo0o((C1514e0) c2104u.f25822OooOo0o, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1959q2
    public final void OooO0O0() throws ExecutionException, InterruptedException, TimeoutException {
        C2143v1 c2143v1 = this.f23489OooOo0O;
        if (c2143v1.f24829OooOOo0) {
            super.OooO0O0();
        } else if (c2143v1.f24824OooOOO) {
            OooO0OO();
        }
    }

    public final void OooO0OO() throws ExecutionException, InterruptedException, TimeoutException {
        Future future;
        C2143v1 c2143v1 = this.f23489OooOo0O;
        AdvertisingIdClient advertisingIdClient = null;
        if (c2143v1.f24820OooO0oO) {
            if (c2143v1.f24818OooO0o == null && (future = c2143v1.f24821OooO0oo) != null) {
                try {
                    future.get(2000L, TimeUnit.MILLISECONDS);
                    c2143v1.f24821OooO0oo = null;
                } catch (InterruptedException | ExecutionException unused) {
                } catch (TimeoutException unused2) {
                    c2143v1.f24821OooO0oo.cancel(true);
                }
            }
            advertisingIdClient = c2143v1.f24818OooO0o;
        }
        if (advertisingIdClient == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = advertisingIdClient.getInfo();
            String id = info.getId();
            char[] cArr = AbstractC2217x1.f25494OooO00o;
            if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                UUID uuidFromString = UUID.fromString(id);
                byte[] bArr = new byte[16];
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
                byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
                id = Base64.encodeToString(bArr, 11);
            }
            if (id != null) {
                synchronized (this.f23492OooOoO0) {
                    C2104u c2104u = this.f23492OooOoO0;
                    c2104u.OooO0Oo();
                    C1514e0.OooOo0o((C1514e0) c2104u.f25822OooOo0o, id);
                    C2104u c2104u2 = this.f23492OooOoO0;
                    boolean zIsLimitAdTrackingEnabled = info.isLimitAdTrackingEnabled();
                    c2104u2.OooO0Oo();
                    C1514e0.o0000Ooo((C1514e0) c2104u2.f25822OooOo0o, zIsLimitAdTrackingEnabled);
                    C2104u c2104u3 = this.f23492OooOoO0;
                    c2104u3.OooO0Oo();
                    C1514e0.o0OoOo0((C1514e0) c2104u3.f25822OooOo0o);
                }
            }
        } catch (IOException unused3) {
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1959q2, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws ExecutionException, InterruptedException, TimeoutException {
        OooO0O0();
        return null;
    }
}
