package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class jr0 implements zm0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final nt0 f20364OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Context f20365OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final ArrayList f20366OooOo0o = new ArrayList();

    /* renamed from: OooOoO, reason: collision with root package name */
    public nj0 f20367OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public ou0 f20368OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public fl0 f20369OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public j11 f20370OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public zm0 f20371OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public ul0 f20372OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public fl0 f20373OooOooo;

    /* renamed from: Oooo000, reason: collision with root package name */
    public zm0 f20374Oooo000;

    public jr0(Context context, nt0 nt0Var) {
        this.f20365OooOo0O = context.getApplicationContext();
        this.f20364OooOo = nt0Var;
    }

    public static final void OooO0oO(zm0 zm0Var, e01 e01Var) {
        if (zm0Var != null) {
            zm0Var.OooO0oo(e01Var);
        }
    }

    public final void OooO0OO(zm0 zm0Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f20366OooOo0o;
            if (i >= arrayList.size()) {
                return;
            }
            zm0Var.OooO0oo((e01) arrayList.get(i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final long OooO0Oo(iq0 iq0Var) {
        af0.OooooO0(this.f20374Oooo000 == null);
        String scheme = iq0Var.f20087OooO00o.getScheme();
        int i = i80.f19994OooO00o;
        Uri uri = iq0Var.f20087OooO00o;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f20365OooOo0O;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f20368OooOoO0 == null) {
                    ou0 ou0Var = new ou0(false);
                    this.f20368OooOoO0 = ou0Var;
                    OooO0OO(ou0Var);
                }
                this.f20374Oooo000 = this.f20368OooOoO0;
            } else {
                if (this.f20367OooOoO == null) {
                    nj0 nj0Var = new nj0(context);
                    this.f20367OooOoO = nj0Var;
                    OooO0OO(nj0Var);
                }
                this.f20374Oooo000 = this.f20367OooOoO;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f20367OooOoO == null) {
                nj0 nj0Var2 = new nj0(context);
                this.f20367OooOoO = nj0Var2;
                OooO0OO(nj0Var2);
            }
            this.f20374Oooo000 = this.f20367OooOoO;
        } else if ("content".equals(scheme)) {
            if (this.f20369OooOoOO == null) {
                fl0 fl0Var = new fl0(context, 0);
                this.f20369OooOoOO = fl0Var;
                OooO0OO(fl0Var);
            }
            this.f20374Oooo000 = this.f20369OooOoOO;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            nt0 nt0Var = this.f20364OooOo;
            if (zEquals) {
                if (this.f20371OooOoo0 == null) {
                    try {
                        zm0 zm0Var = (zm0) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f20371OooOoo0 = zm0Var;
                        OooO0OO(zm0Var);
                    } catch (ClassNotFoundException unused) {
                        AbstractC1641hg.OooOOo0("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.f20371OooOoo0 == null) {
                        this.f20371OooOoo0 = nt0Var;
                    }
                }
                this.f20374Oooo000 = this.f20371OooOoo0;
            } else if ("udp".equals(scheme)) {
                if (this.f20370OooOoo == null) {
                    j11 j11Var = new j11();
                    this.f20370OooOoo = j11Var;
                    OooO0OO(j11Var);
                }
                this.f20374Oooo000 = this.f20370OooOoo;
            } else if ("data".equals(scheme)) {
                if (this.f20372OooOooO == null) {
                    ul0 ul0Var = new ul0(false);
                    this.f20372OooOooO = ul0Var;
                    OooO0OO(ul0Var);
                }
                this.f20374Oooo000 = this.f20372OooOooO;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f20373OooOooo == null) {
                    fl0 fl0Var2 = new fl0(context, 1);
                    this.f20373OooOooo = fl0Var2;
                    OooO0OO(fl0Var2);
                }
                this.f20374Oooo000 = this.f20373OooOooo;
            } else {
                this.f20374Oooo000 = nt0Var;
            }
        }
        return this.f20374Oooo000.OooO0Oo(iq0Var);
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final void OooO0oo(e01 e01Var) {
        e01Var.getClass();
        this.f20364OooOo.OooO0oo(e01Var);
        this.f20366OooOo0o.add(e01Var);
        OooO0oO(this.f20368OooOoO0, e01Var);
        OooO0oO(this.f20367OooOoO, e01Var);
        OooO0oO(this.f20369OooOoOO, e01Var);
        OooO0oO(this.f20371OooOoo0, e01Var);
        OooO0oO(this.f20370OooOoo, e01Var);
        OooO0oO(this.f20372OooOooO, e01Var);
        OooO0oO(this.f20373OooOooo, e01Var);
    }

    @Override // com.google.android.gms.internal.ads.q51
    public final int OooOO0(byte[] bArr, int i, int i2) {
        zm0 zm0Var = this.f20374Oooo000;
        zm0Var.getClass();
        return zm0Var.OooOO0(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final Uri zzc() {
        zm0 zm0Var = this.f20374Oooo000;
        if (zm0Var == null) {
            return null;
        }
        return zm0Var.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final void zzd() {
        zm0 zm0Var = this.f20374Oooo000;
        if (zm0Var != null) {
            try {
                zm0Var.zzd();
            } finally {
                this.f20374Oooo000 = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final Map zze() {
        zm0 zm0Var = this.f20374Oooo000;
        return zm0Var == null ? Collections.EMPTY_MAP : zm0Var.zze();
    }
}
