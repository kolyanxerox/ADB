package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.ironsource.InterfaceC3771vj;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes2.dex */
public final class ou0 extends rj0 {

    /* renamed from: OooOoO, reason: collision with root package name */
    public RandomAccessFile f23126OooOoO;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public Uri f23127OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public boolean f23128OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public long f23129OooOoo0;

    @Override // com.google.android.gms.internal.ads.zm0
    public final long OooO0Oo(iq0 iq0Var) throws IOException {
        Uri uri = iq0Var.f20087OooO00o;
        long j = iq0Var.f20089OooO0OO;
        this.f23127OooOoOO = uri;
        OooO0oO(iq0Var);
        int i = InterfaceC3771vj.a.f12374f;
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            this.f23126OooOoO = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = iq0Var.f20090OooO0Oo;
                if (length == -1) {
                    length = this.f23126OooOoO.length() - j;
                }
                this.f23129OooOoo0 = length;
                if (length < 0) {
                    throw new yt0(2008, null, null);
                }
                this.f23128OooOoo = true;
                OooO(iq0Var);
                return this.f23129OooOoo0;
            } catch (IOException e) {
                throw new yt0(e, IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (!(e2.getCause() instanceof ErrnoException) || ((ErrnoException) e2.getCause()).errno != OsConstants.EACCES) {
                    i = 2005;
                }
                throw new yt0(e2, i);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbOooOOo0 = androidx.datastore.preferences.protobuf.OooO00o.OooOOo0("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbOooOOo0.append(fragment);
            throw new yt0(1004, sbOooOOo0.toString(), e2);
        } catch (SecurityException e3) {
            throw new yt0(e3, InterfaceC3771vj.a.f12374f);
        } catch (RuntimeException e4) {
            throw new yt0(e4, IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL);
        }
    }

    @Override // com.google.android.gms.internal.ads.q51
    public final int OooOO0(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f23129OooOoo0;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f23126OooOoO;
            int i3 = i80.f19994OooO00o;
            int i4 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i4 > 0) {
                this.f23129OooOoo0 -= i4;
                OooO00o(i4);
            }
            return i4;
        } catch (IOException e) {
            throw new yt0(e, IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL);
        }
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final Uri zzc() {
        return this.f23127OooOoOO;
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final void zzd() {
        this.f23127OooOoOO = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f23126OooOoO;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f23126OooOoO = null;
                if (this.f23128OooOoo) {
                    this.f23128OooOoo = false;
                    OooO0OO();
                }
            } catch (IOException e) {
                throw new yt0(e, IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL);
            }
        } catch (Throwable th) {
            this.f23126OooOoO = null;
            if (this.f23128OooOoo) {
                this.f23128OooOoo = false;
                OooO0OO();
            }
            throw th;
        }
    }
}
