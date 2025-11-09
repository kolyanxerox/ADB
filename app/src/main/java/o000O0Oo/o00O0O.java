package o000o0oo;

import OooO0oO.OooOo;
import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.security.auth.x500.X500Principal;
import o000Oo0O.OooOo00;

/* loaded from: classes2.dex */
public final class o00O0O extends OooOo00 {
    @Override // o000Oo0O.OooOo00
    public final String OooO0Oo() {
        return ((Context) this.f30370OooOo).getPackageName() + ".FlutterSecureStoragePluginKeyOAEP";
    }

    @Override // o000Oo0O.OooOo00
    public final AlgorithmParameterSpec OooO0o() {
        return new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT);
    }

    @Override // o000Oo0O.OooOo00
    public final Cipher OooO0oo() {
        return Cipher.getInstance("RSA/ECB/OAEPPadding", "AndroidKeyStoreBCWorkaround");
    }

    @Override // o000Oo0O.OooOo00
    public final KeyGenParameterSpec OooOO0O(Calendar calendar, Calendar calendar2) {
        String str = (String) this.f30372OooOo0o;
        return new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal(OooOo.OooOO0("CN=", str))).setDigests("SHA-256").setBlockModes("ECB").setEncryptionPaddings("OAEPPadding").setCertificateSerialNumber(BigInteger.valueOf(1L)).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
    }
}
