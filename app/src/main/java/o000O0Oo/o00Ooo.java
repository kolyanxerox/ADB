package o000o0oo;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import o000OOO.OooOO0O;

/* loaded from: classes2.dex */
public final class o00Ooo extends OooOO0O {
    @Override // o000OOO.OooOO0O
    public final AlgorithmParameterSpec OooO(byte[] bArr) {
        return new GCMParameterSpec(128, bArr);
    }

    @Override // o000OOO.OooOO0O
    public final String OooO0Oo() {
        return "VGhpcyBpcyB0aGUga2V5IGZvcihBIHNlY3XyZZBzdG9yYWdlIEFFUyBLZXkK";
    }

    @Override // o000OOO.OooOO0O
    public final Cipher OooO0o() {
        return Cipher.getInstance("AES/GCM/NoPadding");
    }

    @Override // o000OOO.OooOO0O
    public final int OooO0oO() {
        return 12;
    }
}
