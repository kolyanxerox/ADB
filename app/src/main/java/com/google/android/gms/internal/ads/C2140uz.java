package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.ads.internal.util.zze;

/* renamed from: com.google.android.gms.internal.ads.uz */
/* loaded from: classes2.dex */
public final class C2140uz {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final zzbo f24791OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Oooo0OO.o00Ooo f24792OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final cq0 f24793OooO0OO;

    public C2140uz(zzbo zzboVar, Oooo0OO.o00Ooo o00ooo2, cq0 cq0Var) {
        this.f24791OooO00o = zzboVar;
        this.f24792OooO0O0 = o00ooo2;
        this.f24793OooO0OO = cq0Var;
    }

    public final Bitmap OooO00o(byte[] bArr, BitmapFactory.Options options) {
        Oooo0OO.oo000o oo000oVar = (Oooo0OO.oo000o) this.f24792OooO0O0;
        oo000oVar.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        oo000oVar.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        if (bitmapDecodeByteArray != null) {
            long j = jElapsedRealtime2 - jElapsedRealtime;
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            int allocationByteCount = bitmapDecodeByteArray.getAllocationByteCount();
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sbOooOo0o = OooO0oO.OooOo.OooOo0o("Decoded image w: ", width, " h:", height, " bytes: ");
            sbOooOo0o.append(allocationByteCount);
            sbOooOo0o.append(" time: ");
            sbOooOo0o.append(j);
            sbOooOo0o.append(" on ui thread: ");
            sbOooOo0o.append(z);
            zze.zza(sbOooOo0o.toString());
        }
        return bitmapDecodeByteArray;
    }
}
