package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class ry0 {

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final Oooo0oO.o00000O f23952OooO0Oo = new Oooo0oO.o00000O(6);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final SecretKeySpec f23953OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f23954OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f23955OooO0OO;

    public ry0(byte[] bArr, int i) throws GeneralSecurityException {
        if (!xh0.OooOo0O(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        ii0.OooOO0(bArr.length);
        this.f23953OooO00o = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f23952OooO0Oo.get()).getBlockSize();
        this.f23955OooO0OO = blockSize;
        if (i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f23954OooO0O0 = i;
    }
}
