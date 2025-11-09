package o0000O00;

import Oooo0oO.o00000O;
import android.os.Build;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o0000Oo.o0Oo0oo;
import o000OO.o00oO0o;

/* loaded from: classes2.dex */
public final class OooO0O0 {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final o00000O f29371OooO0OO = new o00000O(10);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final SecretKeySpec f29372OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f29373OooO0O0;

    public OooO0O0(byte[] bArr) throws GeneralSecurityException {
        if (!AbstractC2183w4.OooO0O0(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        o0Oo0oo.OooO00o(bArr.length);
        this.f29372OooO00o = new SecretKeySpec(bArr, "AES");
        this.f29373OooO0O0 = true;
    }

    public static AlgorithmParameterSpec OooO00o(byte[] bArr) {
        int length = bArr.length;
        int i = o00oO0o.f30183OooO00o;
        Integer numValueOf = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT);
        return (numValueOf == null || numValueOf.intValue() > 19) ? new GCMParameterSpec(128, bArr, 0, length) : new IvParameterSpec(bArr, 0, length);
    }
}
