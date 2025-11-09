package o0000O;

import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.google.android.gms.internal.ads.C2051sk;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.crypto.tink.shaded.protobuf.o000OOo;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import o0000OOo.o00000;
import o0000OOo.o000O000;
import o0000OOo.o000OOo0;
import o0000OOo.o00OO0OO;
import o0000OoO.o00OOO0O;
import o0000oo0.o000000O;
import o0000oo0.o00000OO;
import o0000oo0.o00oO0o;
import o0000ooO.o0O0OOO0;
import o000O00.o0oOO;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooOo00 implements o000OO.Oooo000, o000OO.OooO0O0, o00oO0o, o000Oo00.OooOOO0, OooOOO.OooO0o, SuccessContinuation {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f29343OooOo0O;

    public /* synthetic */ OooOo00(int i) {
        this.f29343OooOo0O = i;
    }

    @Override // o000Oo00.OooOOO0
    public void OooO00o(o000Oo00.OooOOO oooOOO) {
    }

    @Override // o000OO.Oooo000
    public Object OooO0O0(o00000oo.OooOo00 oooOo00) throws GeneralSecurityException {
        o0000OO0.OooO00o oooO00o = new o0000OO0.OooO00o();
        if (AbstractC2183w4.OooO0O0(2)) {
            return oooO00o;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // o0000oo0.o00oO0o
    public Object OooO0OO(o000O0Oo.OooO0o oooO0o) {
        switch (this.f29343OooOo0O) {
            case 9:
                return AbtRegistrar.lambda$getComponents$0(oooO0o);
            case 10:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 24:
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(oooO0o);
            case 11:
                return (ScheduledExecutorService) ExecutorsRegistrar.f28139OooO00o.get();
            case 12:
                return (ScheduledExecutorService) ExecutorsRegistrar.f28141OooO0OO.get();
            case 13:
                return (ScheduledExecutorService) ExecutorsRegistrar.f28140OooO0O0.get();
            case 14:
                o000000O o000000o2 = ExecutorsRegistrar.f28139OooO00o;
                return o0O0OOO0.f29724OooOo0O;
            case 21:
                return TransportRegistrar.lambda$getComponents$0(oooO0o);
            case 22:
                return TransportRegistrar.lambda$getComponents$1(oooO0o);
            case 23:
                return TransportRegistrar.lambda$getComponents$2(oooO0o);
            case 25:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(oooO0o);
            case 26:
                Set setOooO00o = oooO0o.OooO00o(o00000OO.OooO00o(o000Ooo0.OooO0o.class));
                o000Ooo0.OooOO0 oooOO0 = o000Ooo0.OooOO0.f30536OooOo;
                if (oooOO0 == null) {
                    synchronized (o000Ooo0.OooOO0.class) {
                        try {
                            oooOO0 = o000Ooo0.OooOO0.f30536OooOo;
                            if (oooOO0 == null) {
                                oooOO0 = new o000Ooo0.OooOO0(0);
                                o000Ooo0.OooOO0.f30536OooOo = oooOO0;
                            }
                        } finally {
                        }
                    }
                }
                return new o000Ooo0.OooO(setOooO00o, oooOO0);
        }
    }

    @Override // o000OO.OooO0O0
    public o00000oo.OooOo00 OooO0Oo(o000OO.o0OoOo0 o0oooo0) throws GeneralSecurityException {
        switch (this.f29343OooOo0O) {
            case 1:
                if (!((String) o0oooo0.f30186OooOo0o).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    o000OOo0 o000ooo0OooOooO = o000OOo0.OooOooO((com.google.crypto.tink.shaded.protobuf.OooOOO0) o0oooo0.f30187OooOoO, com.google.crypto.tink.shaded.protobuf.Oooo0.OooO00o());
                    if (o000ooo0OooOooO.OooOoo0() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C2051sk c2051sk = new C2051sk(20, false);
                    c2051sk.f24098OooOo0o = null;
                    c2051sk.f24096OooOo = null;
                    c2051sk.f24100OooOoO0 = null;
                    c2051sk.f24099OooOoO = OooO0o.f29329OooOOOO;
                    c2051sk.f24098OooOo0o = Integer.valueOf(o000ooo0OooOooO.OooOoO().size());
                    c2051sk.f24096OooOo = Integer.valueOf(o000ooo0OooOooO.OooOoOO().OooOoO());
                    c2051sk.f24100OooOoO0 = Oooo000.OooO00o(o000ooo0OooOooO.OooOoOO().OooOoO0());
                    c2051sk.f24099OooOoO = Oooo000.OooO0O0((o00OO0OO) o0oooo0.f30190OooOoo0);
                    OooOo oooOoOooO0O0 = c2051sk.OooO0O0();
                    Oooo.OooOo00 oooOo00 = new Oooo.OooOo00(26);
                    oooOo00.f13710OooOo = null;
                    oooOo00.f13713OooOoO0 = null;
                    oooOo00.f13712OooOo0o = oooOoOooO0O0;
                    oooOo00.f13710OooOo = new o000Ooo0.OooOO0(o00OOO0O.OooO00o(o000ooo0OooOooO.OooOoO().OooOO0()), 21);
                    oooOo00.f13713OooOoO0 = (Integer) o0oooo0.f30184OooOo;
                    return oooOo00.OooO0oo();
                } catch (o000OOo | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
            case 2:
                if (!((String) o0oooo0.f30186OooOo0o).equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
                }
                try {
                    o000O000 o000o000OooOoOO = o000O000.OooOoOO((com.google.crypto.tink.shaded.protobuf.OooOOO0) o0oooo0.f30187OooOoO, com.google.crypto.tink.shaded.protobuf.Oooo0.OooO00o());
                    if (o000o000OooOoOO.OooOoO0() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    int size = o000o000OooOoOO.OooOo().size();
                    if (size != 32 && size != 48 && size != 64) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(size)));
                    }
                    o00OO0OO o00oo0oo = (o00OO0OO) o0oooo0.f30190OooOoo0;
                    Map map = o0000O0.OooO0o.f29364OooO0o0;
                    if (!map.containsKey(o00oo0oo)) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o00oo0oo.getNumber());
                    }
                    o0000O0.OooO0O0 oooO0O0 = (o0000O0.OooO0O0) map.get(o00oo0oo);
                    if (oooO0O0 == null) {
                        throw new GeneralSecurityException("Variant is not set");
                    }
                    o0000O0.OooO0OO oooO0OO = new o0000O0.OooO0OO(size, oooO0O0);
                    Oooo.OooOo00 oooOo002 = new Oooo.OooOo00(27);
                    oooOo002.f13710OooOo = null;
                    oooOo002.f13713OooOoO0 = null;
                    oooOo002.f13712OooOo0o = oooO0OO;
                    oooOo002.f13710OooOo = new o000Ooo0.OooOO0(o00OOO0O.OooO00o(o000o000OooOoOO.OooOo().OooOO0()), 21);
                    oooOo002.f13713OooOoO0 = (Integer) o0oooo0.f30184OooOo;
                    return oooOo002.OooO();
                } catch (o000OOo unused2) {
                    throw new GeneralSecurityException("Parsing AesSivKey failed");
                }
            case 3:
                if (!((String) o0oooo0.f30186OooOo0o).equals("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacStreamingParameters.parseParameters");
                }
                try {
                    o0000OOo.Oooo000 oooo000OooOoo = o0000OOo.Oooo000.OooOoo((com.google.crypto.tink.shaded.protobuf.OooOOO0) o0oooo0.f30187OooOoO, com.google.crypto.tink.shaded.protobuf.Oooo0.OooO00o());
                    if (oooo000OooOoo.OooOoOO() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (o0000Oo0.OooO.OooO0O0(oooo000OooOoo.OooOoO(), oooo000OooOoo.OooOoO0().size()).f29500OooO0O0.intValue() == ((o00OOO0O) new o000Ooo0.OooOO0(o00OOO0O.OooO00o(oooo000OooOoo.OooOoO0().OooOO0()), 21).f30538OooOo0o).f29522OooO00o.length) {
                        return new o0000Oo0.OooO0O0();
                    }
                    throw new GeneralSecurityException("Key size mismatch");
                } catch (o000OOo unused3) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacStreamingKey failed");
                }
            default:
                if (!((String) o0oooo0.f30186OooOo0o).equals("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmHkdfStreamingParameters.parseParameters");
                }
                try {
                    o00000 o00000VarOooOoo = o00000.OooOoo((com.google.crypto.tink.shaded.protobuf.OooOOO0) o0oooo0.f30187OooOoO, com.google.crypto.tink.shaded.protobuf.Oooo0.OooO00o());
                    if (o00000VarOooOoo.OooOoOO() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (o0000Oo0.OooOOO0.OooO00o(o00000VarOooOoo.OooOoO(), o00000VarOooOoo.OooOoO0().size()).f29506OooO0O0.intValue() == ((o00OOO0O) new o000Ooo0.OooOO0(o00OOO0O.OooO00o(o00000VarOooOoo.OooOoO0().OooOO0()), 21).f30538OooOo0o).f29522OooO00o.length) {
                        return new o0000Oo0.OooOO0();
                    }
                    throw new GeneralSecurityException("Key size mismatch");
                } catch (o000OOo unused4) {
                    throw new GeneralSecurityException("Parsing AesGcmHkdfStreamingKey failed");
                }
        }
    }

    @Override // OooOOO.OooO0o
    public Object apply(Object obj) {
        o000OO0O.OooO00o.f30197OooO0O0.getClass();
        return o000O00O.OooO00o.f30097OooO00o.OooO00o((o0oOO) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        switch (this.f29343OooOo0O) {
            case 27:
                break;
            default:
                break;
        }
        return Tasks.forResult(null);
    }
}
