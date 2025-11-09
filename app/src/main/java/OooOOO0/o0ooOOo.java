package OooOOo0;

import OooOoOO.o000;
import android.database.Cursor;
import android.util.Base64;
import android.util.Log;
import androidx.arch.core.util.Function;
import com.applovin.impl.AbstractC1266v2;
import com.applovin.impl.C1026f5;
import com.applovin.impl.C1044h3;
import com.applovin.impl.C1153p3;
import com.applovin.impl.C1178r3;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.google.android.gms.internal.ads.C1386ai;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.crypto.tink.shaded.protobuf.o000OOo;
import com.unity3d.services.ads.token.INativeTokenGeneratorListener;
import com.unity3d.services.ads.token.InMemoryTokenStorage;
import com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker;
import com.unity3d.services.core.webview.bridge.Invocation;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import o0000.oo0o0Oo;
import o0000OO0.OooO00o;
import o0000OOo.o0000O00;
import o0000OOo.o000O00O;
import o0000OOo.o000OO;
import o0000OOo.o00OO0OO;
import o0000OOo.o00OOO00;
import o0000OOo.o0OO00O;
import o0000OoO.o00OOO0O;
import o000OO.OooO0O0;

/* loaded from: classes2.dex */
public final /* synthetic */ class o0ooOOo implements OooOOO.OooOO0, OooOo.OooOOOO, Function, C1153p3.b, INativeTokenGeneratorListener, IInvocationCallbackInvoker, OnFailureListener, OooO0O0, o00000O0.o0Oo0oo, o000OO.Oooo000 {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f13528OooOo0O;

    public /* synthetic */ o0ooOOo(int i) {
        this.f13528OooOo0O = i;
    }

    private final o00000oo.OooOo00 OooO0OO(o000OO.o0OoOo0 o0oooo0) throws GeneralSecurityException {
        o0000.OooOOOO oooOOOO;
        if (!((String) o0oooo0.f30186OooOo0o).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
        }
        try {
            o000O00O o000o00oOooOoOO = o000O00O.OooOoOO((com.google.crypto.tink.shaded.protobuf.OooOOO0) o0oooo0.f30187OooOoO, com.google.crypto.tink.shaded.protobuf.Oooo0.OooO00o());
            if (o000o00oOooOoOO.OooOoO0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            o00OO0OO o00oo0oo = (o00OO0OO) o0oooo0.f30190OooOoo0;
            int iOrdinal = o00oo0oo.ordinal();
            if (iOrdinal == 1) {
                oooOOOO = o0000.OooOOOO.f28920OooOo00;
            } else if (iOrdinal == 2) {
                oooOOOO = o0000.OooOOOO.OooOo0;
            } else if (iOrdinal == 3) {
                oooOOOO = o0000.OooOOOO.f28921OooOo0O;
            } else {
                if (iOrdinal != 4) {
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o00oo0oo.getNumber());
                }
                oooOOOO = o0000.OooOOOO.OooOo0;
            }
            return o0000.o0ooOOo.OooO0O0(oooOOOO, new o000Ooo0.OooOO0(o00OOO0O.OooO00o(o000o00oOooOoOO.OooOo().OooOO0()), 21), (Integer) o0oooo0.f30184OooOo);
        } catch (o000OOo unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    private final o00000oo.OooOo00 OooO0o0(o000OO.o0OoOo0 o0oooo0) throws GeneralSecurityException {
        o0000.OooOOOO oooOOOO;
        if (!((String) o0oooo0.f30186OooOo0o).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
        }
        try {
            o00OOO00 o00ooo00OooOoOO = o00OOO00.OooOoOO((com.google.crypto.tink.shaded.protobuf.OooOOO0) o0oooo0.f30187OooOoO, com.google.crypto.tink.shaded.protobuf.Oooo0.OooO00o());
            if (o00ooo00OooOoOO.OooOoO0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            o00OO0OO o00oo0oo = (o00OO0OO) o0oooo0.f30190OooOoo0;
            int iOrdinal = o00oo0oo.ordinal();
            if (iOrdinal == 1) {
                oooOOOO = o0000.OooOOOO.f28922OooOo0o;
            } else if (iOrdinal == 2) {
                oooOOOO = o0000.OooOOOO.f28919OooOo;
            } else if (iOrdinal == 3) {
                oooOOOO = o0000.OooOOOO.f28923OooOoO0;
            } else {
                if (iOrdinal != 4) {
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o00oo0oo.getNumber());
                }
                oooOOOO = o0000.OooOOOO.f28919OooOo;
            }
            return oo0o0Oo.OooO0O0(oooOOOO, new o000Ooo0.OooOO0(o00OOO0O.OooO00o(o00ooo00OooOoOO.OooOo().OooOO0()), 21), (Integer) o0oooo0.f30184OooOo);
        } catch (o000OOo unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    @Override // OooOOO.OooOO0
    public void OooO00o(Exception exc) {
    }

    @Override // o000OO.Oooo000
    public Object OooO0O0(o00000oo.OooOo00 oooOo00) throws GeneralSecurityException {
        OooO00o oooO00o = new OooO00o();
        if (AbstractC2183w4.OooO00o(1)) {
            return oooO00o;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // o000OO.OooO0O0
    public o00000oo.OooOo00 OooO0Oo(o000OO.o0OoOo0 o0oooo0) throws GeneralSecurityException {
        switch (this.f13528OooOo0O) {
            case 21:
                if (!((String) o0oooo0.f30186OooOo0o).equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                }
                try {
                    o0000OOo.OooOOO OooOoo2 = o0000OOo.OooOOO.OooOoo((com.google.crypto.tink.shaded.protobuf.OooOOO0) o0oooo0.f30187OooOoO, com.google.crypto.tink.shaded.protobuf.Oooo0.OooO00o());
                    if (OooOoo2.OooOoOO() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    o0OOO0o o0ooo0o = new o0OOO0o(15);
                    o0ooo0o.f13518OooOo0o = null;
                    o0ooo0o.f13516OooOo = null;
                    o0ooo0o.f13520OooOoO0 = null;
                    o0ooo0o.f13519OooOoO = null;
                    o0000.OooOOOO oooOOOO = o0000.OooOOOO.f28910OooOO0;
                    o0ooo0o.f13521OooOoOO = oooOOOO;
                    int size = OooOoo2.OooOoO0().OooOoO().size();
                    if (size != 16 && size != 24 && size != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
                    }
                    o0ooo0o.f13518OooOo0o = Integer.valueOf(size);
                    int size2 = OooOoo2.OooOoO().OooOoO().size();
                    if (size2 < 16) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(size2)));
                    }
                    o0ooo0o.f13516OooOo = Integer.valueOf(size2);
                    int iOooOoO = OooOoo2.OooOoO().OooOoOO().OooOoO();
                    if (iOooOoO < 10) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(iOooOoO)));
                    }
                    o0ooo0o.f13520OooOoO0 = Integer.valueOf(iOooOoO);
                    o0ooo0o.f13519OooOoO = o0000.OooOo.OooO00o(OooOoo2.OooOoO().OooOoOO().OooOoO0());
                    o00OO0OO o00oo0oo = (o00OO0OO) o0oooo0.f30190OooOoo0;
                    int iOrdinal = o00oo0oo.ordinal();
                    if (iOrdinal == 1) {
                        oooOOOO = o0000.OooOOOO.f28909OooO0oo;
                    } else if (iOrdinal == 2) {
                        oooOOOO = o0000.OooOOOO.f28903OooO;
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o00oo0oo.getNumber());
                        }
                        oooOOOO = o0000.OooOOOO.f28903OooO;
                    }
                    o0ooo0o.f13521OooOoOO = oooOOOO;
                    o0000.OooOo00 oooOo00OooO0O0 = o0ooo0o.OooO0O0();
                    C1386ai c1386ai = new C1386ai(20, false);
                    c1386ai.f17042OooOo = null;
                    c1386ai.f17046OooOoO0 = null;
                    c1386ai.f17045OooOoO = null;
                    c1386ai.f17044OooOo0o = oooOo00OooO0O0;
                    c1386ai.f17042OooOo = new o000Ooo0.OooOO0(o00OOO0O.OooO00o(OooOoo2.OooOoO0().OooOoO().OooOO0()), 21);
                    c1386ai.f17046OooOoO0 = new o000Ooo0.OooOO0(o00OOO0O.OooO00o(OooOoo2.OooOoO().OooOoO().OooOO0()), 21);
                    c1386ai.f17045OooOoO = (Integer) o0oooo0.f30184OooOo;
                    return c1386ai.OooO0oo();
                } catch (o000OOo unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                }
            case 22:
                if (!((String) o0oooo0.f30186OooOo0o).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
                }
                try {
                    o0OO00O o0oo00oOooOoo = o0OO00O.OooOoo((com.google.crypto.tink.shaded.protobuf.OooOOO0) o0oooo0.f30187OooOoO, com.google.crypto.tink.shaded.protobuf.Oooo0.OooO00o());
                    if (o0oo00oOooOoo.OooOoOO() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    o0000.OooOOOO oooOOOO2 = o0000.OooOOOO.f28913OooOOO0;
                    int size3 = o0oo00oOooOoo.OooOoO0().size();
                    if (size3 != 16 && size3 != 24 && size3 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size3)));
                    }
                    int iOooOo = o0oo00oOooOoo.OooOoO().OooOo();
                    if (iOooOo != 12 && iOooOo != 16) {
                        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(iOooOo)));
                    }
                    o00OO0OO o00oo0oo2 = (o00OO0OO) o0oooo0.f30190OooOoo0;
                    int iOrdinal2 = o00oo0oo2.ordinal();
                    if (iOrdinal2 == 1) {
                        oooOOOO2 = o0000.OooOOOO.f28911OooOO0O;
                    } else if (iOrdinal2 == 2) {
                        oooOOOO2 = o0000.OooOOOO.OooOO0o;
                    } else if (iOrdinal2 != 3) {
                        if (iOrdinal2 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o00oo0oo2.getNumber());
                        }
                        oooOOOO2 = o0000.OooOOOO.OooOO0o;
                    }
                    o0000.Oooo0 oooo0 = new o0000.Oooo0(size3, iOooOo, 16, oooOOOO2);
                    Oooo.OooOo00 oooOo00 = new Oooo.OooOo00(18);
                    oooOo00.f13710OooOo = null;
                    oooOo00.f13713OooOoO0 = null;
                    oooOo00.f13712OooOo0o = oooo0;
                    oooOo00.f13710OooOo = new o000Ooo0.OooOO0(o00OOO0O.OooO00o(o0oo00oOooOoo.OooOoO0().OooOO0()), 21);
                    oooOo00.f13713OooOoO0 = (Integer) o0oooo0.f30184OooOo;
                    return oooOo00.OooO0OO();
                } catch (o000OOo unused2) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            case 23:
                if (!((String) o0oooo0.f30186OooOo0o).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
                }
                try {
                    o0000O00 o0000o00OooOoOO = o0000O00.OooOoOO((com.google.crypto.tink.shaded.protobuf.OooOOO0) o0oooo0.f30187OooOoO, com.google.crypto.tink.shaded.protobuf.Oooo0.OooO00o());
                    if (o0000o00OooOoOO.OooOoO0() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    o0000.OooOOOO oooOOOO3 = o0000.OooOOOO.f28915OooOOOo;
                    int size4 = o0000o00OooOoOO.OooOo().size();
                    if (size4 != 16 && size4 != 24 && size4 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size4)));
                    }
                    o00OO0OO o00oo0oo3 = (o00OO0OO) o0oooo0.f30190OooOoo0;
                    int iOrdinal3 = o00oo0oo3.ordinal();
                    if (iOrdinal3 == 1) {
                        oooOOOO3 = o0000.OooOOOO.f28912OooOOO;
                    } else if (iOrdinal3 == 2) {
                        oooOOOO3 = o0000.OooOOOO.f28914OooOOOO;
                    } else if (iOrdinal3 != 3) {
                        if (iOrdinal3 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o00oo0oo3.getNumber());
                        }
                        oooOOOO3 = o0000.OooOOOO.f28914OooOOOO;
                    }
                    o0000.o00O0O o00o0o = new o0000.o00O0O(size4, 12, 16, oooOOOO3);
                    Oooo.OooOo00 oooOo002 = new Oooo.OooOo00(19);
                    oooOo002.f13710OooOo = null;
                    oooOo002.f13713OooOoO0 = null;
                    oooOo002.f13712OooOo0o = o00o0o;
                    oooOo002.f13710OooOo = new o000Ooo0.OooOO0(o00OOO0O.OooO00o(o0000o00OooOoOO.OooOo().OooOO0()), 21);
                    oooOo002.f13713OooOoO0 = (Integer) o0oooo0.f30184OooOo;
                    return oooOo002.OooO0Oo();
                } catch (o000OOo unused3) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            case 24:
                if (!((String) o0oooo0.f30186OooOo0o).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
                }
                try {
                    o000OO o000ooOooOoOO = o000OO.OooOoOO((com.google.crypto.tink.shaded.protobuf.OooOOO0) o0oooo0.f30187OooOoO, com.google.crypto.tink.shaded.protobuf.Oooo0.OooO00o());
                    if (o000ooOooOoOO.OooOoO0() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    o0000.OooOOOO oooOOOO4 = o0000.OooOOOO.f28918OooOOoo;
                    int size5 = o000ooOooOoOO.OooOo().size();
                    if (size5 != 16 && size5 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(size5)));
                    }
                    o00OO0OO o00oo0oo4 = (o00OO0OO) o0oooo0.f30190OooOoo0;
                    int iOrdinal4 = o00oo0oo4.ordinal();
                    if (iOrdinal4 == 1) {
                        oooOOOO4 = o0000.OooOOOO.f28917OooOOo0;
                    } else if (iOrdinal4 == 2) {
                        oooOOOO4 = o0000.OooOOOO.f28916OooOOo;
                    } else if (iOrdinal4 != 3) {
                        if (iOrdinal4 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o00oo0oo4.getNumber());
                        }
                        oooOOOO4 = o0000.OooOOOO.f28916OooOOo;
                    }
                    o0000.oo000o oo000oVar = new o0000.oo000o(size5, oooOOOO4);
                    Oooo.OooOo00 oooOo003 = new Oooo.OooOo00(20);
                    oooOo003.f13710OooOo = null;
                    oooOo003.f13713OooOoO0 = null;
                    oooOo003.f13712OooOo0o = oo000oVar;
                    oooOo003.f13710OooOo = new o000Ooo0.OooOO0(o00OOO0O.OooO00o(o000ooOooOoOO.OooOo().OooOO0()), 21);
                    oooOo003.f13713OooOoO0 = (Integer) o0oooo0.f30184OooOo;
                    return oooOo003.OooO0o0();
                } catch (o000OOo unused4) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            case 25:
                return OooO0OO(o0oooo0);
            case 26:
                return OooO0o0(o0oooo0);
            default:
                if (!((String) o0oooo0.f30186OooOo0o).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
                }
                try {
                    o0000OOo.OooO0OO oooO0OOOooOoo = o0000OOo.OooO0OO.OooOoo((com.google.crypto.tink.shaded.protobuf.OooOOO0) o0oooo0.f30187OooOoO, com.google.crypto.tink.shaded.protobuf.Oooo0.OooO00o());
                    if (oooO0OOOooOoo.OooOoOO() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    Oooo.OooOo00 oooOo004 = new Oooo.OooOo00(25);
                    oooOo004.f13712OooOo0o = null;
                    oooOo004.f13710OooOo = null;
                    oooOo004.f13713OooOoO0 = o0000O.OooO0o.f29321OooO0o;
                    oooOo004.OooOOo0(oooO0OOOooOoo.OooOoO0().size());
                    int iOooOo2 = oooO0OOOooOoo.OooOoO().OooOo();
                    if (iOooOo2 < 10 || 16 < iOooOo2) {
                        throw new GeneralSecurityException(OooO0oO.OooOo.OooO0o(iOooOo2, "Invalid tag size for AesCmacParameters: "));
                    }
                    oooOo004.f13710OooOo = Integer.valueOf(iOooOo2);
                    oooOo004.f13713OooOoO0 = o0000O.OooOO0.OooO00o((o00OO0OO) o0oooo0.f30190OooOoo0);
                    o0000O.OooO oooOOooO0oO = oooOo004.OooO0oO();
                    Oooo.OooOo00 oooOo005 = new Oooo.OooOo00(24);
                    oooOo005.f13710OooOo = null;
                    oooOo005.f13713OooOoO0 = null;
                    oooOo005.f13712OooOo0o = oooOOooO0oO;
                    oooOo005.f13710OooOo = new o000Ooo0.OooOO0(o00OOO0O.OooO00o(oooO0OOOooOoo.OooOoO0().OooOO0()), 21);
                    oooOo005.f13713OooOoO0 = (Integer) o0oooo0.f30184OooOo;
                    return oooOo005.OooO0o();
                } catch (o000OOo | IllegalArgumentException unused5) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
        }
    }

    @Override // com.applovin.impl.C1153p3.b
    /* renamed from: a */
    public Object mo1a(Object obj) {
        return C1178r3.m2314a((Long) obj);
    }

    @Override // OooOo.OooOOOO, androidx.arch.core.util.Function, OooOOO.OooO0o
    public Object apply(Object obj) {
        switch (this.f13528OooOo0O) {
            case 1:
                Cursor cursor = (Cursor) obj;
                ArrayList arrayList = new ArrayList();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(1);
                    if (string == null) {
                        throw new NullPointerException("Null backendName");
                    }
                    OooOOO.OooO0OO oooO0OOOooO0O0 = o000.OooO0O0(cursor.getInt(2));
                    String string2 = cursor.getString(3);
                    arrayList.add(new OooOo(string, string2 == null ? null : Base64.decode(string2, 0), oooO0OOOooO0O0));
                }
                return arrayList;
            case 2:
                return C1044h3.m880a((C1026f5) obj);
            case 3:
            default:
                return AbstractC1266v2.m3500d((C1026f5) obj);
            case 4:
                return AbstractC1207b.m2513h((C1026f5) obj);
            case 5:
                return AbstractC1207b.m2525s((C1026f5) obj);
            case 6:
                return AbstractC1207b.m2523r((C1026f5) obj);
            case 7:
                return AbstractC1207b.m2518m((C1026f5) obj);
            case 8:
                return AbstractC1207b.m2516k((C1026f5) obj);
            case 9:
                return AbstractC1207b.m2519n((C1026f5) obj);
            case 10:
                return AbstractC1207b.m2520o((C1026f5) obj);
            case 11:
                return AppLovinNativeAdImpl.lambda$getDirectDownloadParameters$4((C1026f5) obj);
            case 12:
                return AbstractC1266v2.m3502f((C1026f5) obj);
            case 13:
                return AbstractC1266v2.m3501e((C1026f5) obj);
            case 14:
                return AbstractC1266v2.m3498b((C1026f5) obj);
            case 15:
                return AbstractC1266v2.m3503g((C1026f5) obj);
        }
    }

    @Override // com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker
    public void invokeCallback(Invocation invocation) {
        SharedInstances.webViewAppInvocationCallbackInvoker$lambda$0(invocation);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    @Override // com.unity3d.services.ads.token.INativeTokenGeneratorListener
    public void onReady(String str) {
        InMemoryTokenStorage._get_nativeGeneratedToken_$lambda$2(str);
    }
}
