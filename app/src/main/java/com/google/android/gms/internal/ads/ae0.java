package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class ae0 {
    public static final String OooO00o(byte[] bArr, byte[] bArr2, String str, f20 f20Var) throws GeneralSecurityException {
        bi0 bi0VarOooO0oo;
        if (str != null) {
            try {
                try {
                    bi0VarOooO0oo = xh0.OooO0oo(new pd0(new ByteArrayInputStream(Base64.decode(str, 11)), 5));
                } catch (IOException unused) {
                    throw new GeneralSecurityException("Parse keyset failed");
                }
            } catch (GeneralSecurityException e) {
                zze.zza("Failed to get keysethandle".concat(e.toString()));
                zzv.zzp().OooO0oo("CryptoUtils.getHandle", e);
                bi0VarOooO0oo = null;
            }
            if (bi0VarOooO0oo != null) {
                try {
                    byte[] bArrOooO00o = ((pq0) bi0VarOooO0oo.OooOOO()).OooO00o(bArr, bArr2);
                    f20Var.f18766OooO00o.put("ds", "1");
                    return new String(bArrOooO00o, "UTF-8");
                } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e2) {
                    zze.zza("Failed to decrypt ".concat(e2.toString()));
                    zzv.zzp().OooO0oo("CryptoUtils.decrypt", e2);
                    f20Var.f18766OooO00o.put("dsf", e2.toString());
                }
            }
        }
        return null;
    }
}
