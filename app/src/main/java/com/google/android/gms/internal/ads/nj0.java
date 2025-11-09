package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.ironsource.InterfaceC3771vj;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class nj0 extends rj0 {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final AssetManager f21494OooOoO;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public Uri f21495OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public long f21496OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public InputStream f21497OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public boolean f21498OooOooO;

    public nj0(Context context) {
        super(false);
        this.f21494OooOoO = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final long OooO0Oo(iq0 iq0Var) throws IOException {
        try {
            Uri uri = iq0Var.f20087OooO00o;
            long j = iq0Var.f20089OooO0OO;
            this.f21495OooOoOO = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            OooO0oO(iq0Var);
            InputStream inputStreamOpen = this.f21494OooOoO.open(path, 1);
            this.f21497OooOoo0 = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new dj0(null, 2008);
            }
            long j2 = iq0Var.f20090OooO0Oo;
            if (j2 != -1) {
                this.f21496OooOoo = j2;
            } else {
                long jAvailable = this.f21497OooOoo0.available();
                this.f21496OooOoo = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f21496OooOoo = -1L;
                }
            }
            this.f21498OooOooO = true;
            OooO(iq0Var);
            return this.f21496OooOoo;
        } catch (dj0 e) {
            throw e;
        } catch (IOException e2) {
            throw new dj0(e2, true != (e2 instanceof FileNotFoundException) ? IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL : InterfaceC3771vj.a.f12372d);
        }
    }

    @Override // com.google.android.gms.internal.ads.q51
    public final int OooOO0(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f21496OooOoo;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new dj0(e, IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL);
                }
            }
            InputStream inputStream = this.f21497OooOoo0;
            int i3 = i80.f19994OooO00o;
            int i4 = inputStream.read(bArr, i, i2);
            if (i4 != -1) {
                long j2 = this.f21496OooOoo;
                if (j2 != -1) {
                    this.f21496OooOoo = j2 - i4;
                }
                OooO00o(i4);
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final Uri zzc() {
        return this.f21495OooOoOO;
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final void zzd() {
        this.f21495OooOoOO = null;
        try {
            try {
                InputStream inputStream = this.f21497OooOoo0;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f21497OooOoo0 = null;
                if (this.f21498OooOooO) {
                    this.f21498OooOooO = false;
                    OooO0OO();
                }
            } catch (IOException e) {
                throw new dj0(e, IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL);
            }
        } catch (Throwable th) {
            this.f21497OooOoo0 = null;
            if (this.f21498OooOooO) {
                this.f21498OooOooO = false;
                OooO0OO();
            }
            throw th;
        }
    }
}
