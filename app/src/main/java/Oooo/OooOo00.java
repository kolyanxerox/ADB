package Oooo;

import OooOOo0.o0Oo0oo;
import OooOOoo.o0000O;
import OooOOoo.o0000OO0;
import OoooO0O.o000O000;
import OoooO0O.o000O0o;
import OoooO0O.o000Oo0;
import OoooO0O.o00O000o;
import OoooO0O.o00O00OO;
import OoooO0O.o00oOoo;
import OoooO0O.o0O0ooO;
import OoooO0O.o0OOO0o;
import OoooO0O.oOO00O;
import OoooOOO.o0O0O0O;
import OoooOOO.o0O0OOO0;
import OoooOOO.o0OO0oO0;
import OoooOOO.oO00O0o;
import OoooOOO.oOO000;
import OoooOOO.oOO0000;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.os.SystemClock;
import android.util.Log;
import com.github.superadb.R;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.google.android.gms.internal.ads.C1386ai;
import com.google.android.gms.internal.ads.C2051sk;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.crypto.tink.shaded.protobuf.o000OOo;
import com.ironsource.C3034d9;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import o0000.o00Ooo;
import o0000.oo000o;
import o00000oo.o000oOoO;
import o00000oo.o00O0O;
import o00000oo.o00oO0o;
import o00000oo.o0OO00O;
import o0000O.OooO;
import o0000O.OooO0o;
import o0000O0.OooO0OO;
import o0000O0O.OooO0O0;
import o0000OOO.OooO00o;
import o0000OOo.o000O0O0;
import o0000OOo.o00O0O0;
import o0000OOo.o00O0O00;
import o0000OOo.o00OO0OO;
import o0000OoO.o00OOO0O;
import o000OO.o0OoOo0;
import o00O00oO.o0000O0;

/* loaded from: classes2.dex */
public final class OooOo00 implements AppSetIdClient, o0000O, o00oOoo, oO00O0o, o0O0OOO0, OooO00o {

    /* renamed from: OooOoO */
    public static OooOo00 f13708OooOoO;

    /* renamed from: OooOoOO */
    public static OooOo00 f13709OooOoOO;

    /* renamed from: OooOo */
    public Object f13710OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f13711OooOo0O;

    /* renamed from: OooOo0o */
    public Object f13712OooOo0o;

    /* renamed from: OooOoO0 */
    public Object f13713OooOoO0;

    public /* synthetic */ OooOo00(int i) {
        this.f13711OooOo0O = i;
    }

    public static String OooOO0(String str, HashMap map) {
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append(C3034d9.i.f8173b);
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append(C3034d9.i.f8175c);
            sb.append((String) entry2.getKey());
            sb.append(C3034d9.i.f8173b);
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String string = sb.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return OooO0oO.OooOo.OooOoo(str, "?", string);
        }
        if (!str.endsWith(C3034d9.i.f8175c)) {
            string = C3034d9.i.f8175c.concat(string);
        }
        return OooO0oO.OooOo.OooOoo0(str, string);
    }

    public static final OooOo00 OooOO0o(o00O0O0 o00o0o0) throws GeneralSecurityException {
        if (o00o0o0.OooOoO0() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        ArrayList arrayList = new ArrayList(o00o0o0.OooOoO0());
        for (o00O0O00 o00o0o00 : o00o0o0.OooOoO()) {
            o00o0o00.getClass();
            try {
                try {
                    o00000oo.OooOo00 oooOo00OooO00o = o000OO.OooOOO.f30166OooO0O0.OooO00o(o0OoOo0.OooO00o(o00o0o00.OooOoO().OooOoOO(), o00o0o00.OooOoO().OooOoo0(), o00o0o00.OooOoO().OooOoO(), o00o0o00.OooOoo0(), o00o0o00.OooOoo0() == o00OO0OO.RAW ? null : Integer.valueOf(o00o0o00.OooOoOO())));
                    int iOrdinal = o00o0o00.OooOoo().ordinal();
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    arrayList.add(new o00O0O(oooOo00OooO00o));
                } catch (GeneralSecurityException unused) {
                    arrayList.add(null);
                }
            } catch (GeneralSecurityException e) {
                throw new OooOOO0.OooO00o("Creating a protokey serialization failed", e);
            }
        }
        return new OooOo00(o00o0o0, Collections.unmodifiableList(arrayList));
    }

    public static final OooOo00 OooOOOo(o000oOoO o000oooo2, OooO0O0 oooO0O0) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) o000oooo2.f29292OooO0O0;
        try {
            o000O0O0 o000o0o0OooOoO = o000O0O0.OooOoO(byteArrayInputStream, com.google.crypto.tink.shaded.protobuf.Oooo0.OooO00o());
            byteArrayInputStream.close();
            if (o000o0o0OooOoO.OooOo().size() == 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            try {
                o00O0O0 o00o0o0OooOooO = o00O0O0.OooOooO(oooO0O0.OooO0O0(o000o0o0OooOoO.OooOo().OooOO0(), bArr), com.google.crypto.tink.shaded.protobuf.Oooo0.OooO00o());
                if (o00o0o0OooOooO.OooOoO0() > 0) {
                    return OooOO0o(o00o0o0OooOooO);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (o000OOo unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public static final SharedPreferences OooOo0(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void OooOo0O(Context context) {
        if (OooOo0(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(strValueOf) : new String("Failed to store app set ID last used time for App "));
        throw new OooOOOO("Failed to store the app set ID last used time.");
    }

    public o0000O0.OooO00o OooO() throws GeneralSecurityException {
        o000Ooo0.OooOO0 oooOO0;
        OooO0OO oooO0OO = (OooO0OO) this.f13712OooOo0o;
        if (oooO0OO == null || (oooOO0 = (o000Ooo0.OooOO0) this.f13710OooOo) == null) {
            throw new IllegalArgumentException("Cannot build without parameters and/or key material");
        }
        if (oooO0OO.f29358OooO0O0 != ((o00OOO0O) oooOO0.f30538OooOo0o).f29522OooO00o.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        o0000O0.OooO0O0 oooO0O0 = o0000O0.OooO0O0.f29356OooO0Oo;
        o0000O0.OooO0O0 oooO0O02 = oooO0OO.f29359OooO0OO;
        if (oooO0O02 != oooO0O0 && ((Integer) this.f13713OooOoO0) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (oooO0O02 == oooO0O0 && ((Integer) this.f13713OooOoO0) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (oooO0O02 == oooO0O0) {
            o00OOO0O.OooO00o(new byte[0]);
        } else if (oooO0O02 == o0000O0.OooO0O0.f29355OooO0OO) {
            o00OOO0O.OooO00o(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f13713OooOoO0).intValue()).array());
        } else {
            if (oooO0O02 != o0000O0.OooO0O0.f29354OooO0O0) {
                throw new IllegalStateException("Unknown AesSivParameters.Variant: " + ((OooO0OO) this.f13712OooOo0o).f29359OooO0OO);
            }
            o00OOO0O.OooO00o(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f13713OooOoO0).intValue()).array());
        }
        return new o0000O0.OooO00o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0032 A[Catch: all -> 0x0019, TRY_ENTER, TryCatch #1 {all -> 0x0019, blocks: (B:65:0x0016, B:81:0x006b, B:84:0x008f, B:75:0x0032, B:77:0x0058, B:79:0x0063, B:80:0x0067), top: B:117:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0067 A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:65:0x0016, B:81:0x006b, B:84:0x008f, B:75:0x0032, B:77:0x0058, B:79:0x0063, B:80:0x0067), top: B:117:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x008e  */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.String] */
    @Override // OoooOOO.oO00O0o, OoooOOO.o0O0OOO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void OooO00o(java.lang.String r8, int r9, java.io.IOException r10, byte[] r11, java.util.Map r12) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Oooo.OooOo00.OooO00o(java.lang.String, int, java.io.IOException, byte[], java.util.Map):void");
    }

    @Override // o0000OOO.OooO00o
    public byte[] OooO0O0(int i, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrOooOoO0;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!AbstractC2183w4.OooO00o(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) o0000Oo.Oooo0.f29463OooO0O0.f29465OooO00o.OooO00o("AES/ECB/NoPadding");
        cipher.init(1, (SecretKeySpec) this.f13712OooOo0o);
        int iMax = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
        if (iMax * 16 == bArr.length) {
            bArrOooOoO0 = OooO00o.OooO00o.OooOo(bArr, (iMax - 1) * 16, (byte[]) this.f13710OooOo, 0, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length);
            if (bArrCopyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[bArrCopyOfRange.length] = -128;
            bArrOooOoO0 = OooO00o.OooO00o.OooOoO0(bArrCopyOf, (byte[]) this.f13713OooOoO0);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i2 = 0; i2 < iMax - 1; i2++) {
            bArrDoFinal = cipher.doFinal(OooO00o.OooO00o.OooOo(bArrDoFinal, 0, bArr, i2 * 16, 16));
        }
        return Arrays.copyOf(cipher.doFinal(OooO00o.OooO00o.OooOoO0(bArrOooOoO0, bArrDoFinal)), i);
    }

    public o0000.Oooo000 OooO0OO() throws GeneralSecurityException {
        o000Ooo0.OooOO0 oooOO0;
        o0000.Oooo0 oooo0 = (o0000.Oooo0) this.f13712OooOo0o;
        if (oooo0 == null || (oooOO0 = (o000Ooo0.OooOO0) this.f13710OooOo) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (oooo0.f28935OooO0O0 != ((o00OOO0O) oooOO0.f30538OooOo0o).f29522OooO00o.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        o0000.OooOOOO oooOOOO = o0000.OooOOOO.f28913OooOOO0;
        o0000.OooOOOO oooOOOO2 = oooo0.f28938OooO0o0;
        if (oooOOOO2 != oooOOOO && ((Integer) this.f13713OooOoO0) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (oooOOOO2 == oooOOOO && ((Integer) this.f13713OooOoO0) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (oooOOOO2 == oooOOOO) {
            o00OOO0O.OooO00o(new byte[0]);
        } else if (oooOOOO2 == o0000.OooOOOO.OooOO0o) {
            o00OOO0O.OooO00o(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f13713OooOoO0).intValue()).array());
        } else {
            if (oooOOOO2 != o0000.OooOOOO.f28911OooOO0O) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + ((o0000.Oooo0) this.f13712OooOo0o).f28938OooO0o0);
            }
            o00OOO0O.OooO00o(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f13713OooOoO0).intValue()).array());
        }
        return new o0000.Oooo000();
    }

    public o0000.o0OoOo0 OooO0Oo() throws GeneralSecurityException {
        o000Ooo0.OooOO0 oooOO0;
        o0000.o00O0O o00o0o = (o0000.o00O0O) this.f13712OooOo0o;
        if (o00o0o == null || (oooOO0 = (o000Ooo0.OooOO0) this.f13710OooOo) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (o00o0o.f28947OooO0O0 != ((o00OOO0O) oooOO0.f30538OooOo0o).f29522OooO00o.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        o0000.OooOOOO oooOOOO = o0000.OooOOOO.f28915OooOOOo;
        o0000.OooOOOO oooOOOO2 = o00o0o.f28950OooO0o0;
        if (oooOOOO2 != oooOOOO && ((Integer) this.f13713OooOoO0) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (oooOOOO2 == oooOOOO && ((Integer) this.f13713OooOoO0) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (oooOOOO2 == oooOOOO) {
            o00OOO0O.OooO00o(new byte[0]);
        } else if (oooOOOO2 == o0000.OooOOOO.f28914OooOOOO) {
            o00OOO0O.OooO00o(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f13713OooOoO0).intValue()).array());
        } else {
            if (oooOOOO2 != o0000.OooOOOO.f28912OooOOO) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + ((o0000.o00O0O) this.f13712OooOo0o).f28950OooO0o0);
            }
            o00OOO0O.OooO00o(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f13713OooOoO0).intValue()).array());
        }
        return new o0000.o0OoOo0();
    }

    public o0000O.OooO00o OooO0o() throws GeneralSecurityException {
        o000Ooo0.OooOO0 oooOO0;
        o00OOO0O o00ooo0oOooO00o;
        OooO oooO = (OooO) this.f13712OooOo0o;
        if (oooO == null || (oooOO0 = (o000Ooo0.OooOO0) this.f13710OooOo) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (oooO.f29310OooO0O0 != ((o00OOO0O) oooOO0.f30538OooOo0o).f29522OooO00o.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        OooO0o oooO0o = OooO0o.f29321OooO0o;
        OooO0o oooO0o2 = oooO.f29312OooO0Oo;
        if (oooO0o2 != oooO0o && ((Integer) this.f13713OooOoO0) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (oooO0o2 == oooO0o && ((Integer) this.f13713OooOoO0) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (oooO0o2 == oooO0o) {
            o00ooo0oOooO00o = o00OOO0O.OooO00o(new byte[0]);
        } else if (oooO0o2 == OooO0o.f29322OooO0o0 || oooO0o2 == OooO0o.f29320OooO0Oo) {
            o00ooo0oOooO00o = o00OOO0O.OooO00o(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f13713OooOoO0).intValue()).array());
        } else {
            if (oooO0o2 != OooO0o.f29319OooO0OO) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + ((OooO) this.f13712OooOo0o).f29312OooO0Oo);
            }
            o00ooo0oOooO00o = o00OOO0O.OooO00o(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f13713OooOoO0).intValue()).array());
        }
        return new o0000O.OooO00o((OooO) this.f13712OooOo0o, o00ooo0oOooO00o);
    }

    public o00Ooo OooO0o0() throws GeneralSecurityException {
        o000Ooo0.OooOO0 oooOO0;
        oo000o oo000oVar = (oo000o) this.f13712OooOo0o;
        if (oo000oVar == null || (oooOO0 = (o000Ooo0.OooOO0) this.f13710OooOo) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (oo000oVar.f28966OooO0O0 != ((o00OOO0O) oooOO0.f30538OooOo0o).f29522OooO00o.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        o0000.OooOOOO oooOOOO = o0000.OooOOOO.f28918OooOOoo;
        o0000.OooOOOO oooOOOO2 = oo000oVar.f28967OooO0OO;
        if (oooOOOO2 != oooOOOO && ((Integer) this.f13713OooOoO0) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (oooOOOO2 == oooOOOO && ((Integer) this.f13713OooOoO0) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (oooOOOO2 == oooOOOO) {
            o00OOO0O.OooO00o(new byte[0]);
        } else if (oooOOOO2 == o0000.OooOOOO.f28916OooOOo) {
            o00OOO0O.OooO00o(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f13713OooOoO0).intValue()).array());
        } else {
            if (oooOOOO2 != o0000.OooOOOO.f28917OooOOo0) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + ((oo000o) this.f13712OooOo0o).f28967OooO0OO);
            }
            o00OOO0O.OooO00o(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f13713OooOoO0).intValue()).array());
        }
        return new o00Ooo();
    }

    public OooO OooO0oO() {
        Integer num = (Integer) this.f13712OooOo0o;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (((Integer) this.f13710OooOo) == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (((OooO0o) this.f13713OooOoO0) != null) {
            return new OooO(num.intValue(), ((Integer) this.f13710OooOo).intValue(), (OooO0o) this.f13713OooOoO0);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public o0000O.OooOOOO OooO0oo() throws GeneralSecurityException {
        o000Ooo0.OooOO0 oooOO0;
        o00OOO0O o00ooo0oOooO00o;
        o0000O.OooOo oooOo = (o0000O.OooOo) this.f13712OooOo0o;
        if (oooOo == null || (oooOO0 = (o000Ooo0.OooOO0) this.f13710OooOo) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (oooOo.f29339OooO0O0 != ((o00OOO0O) oooOO0.f30538OooOo0o).f29522OooO00o.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        OooO0o oooO0o = OooO0o.f29329OooOOOO;
        OooO0o oooO0o2 = oooOo.f29341OooO0Oo;
        if (oooO0o2 != oooO0o && ((Integer) this.f13713OooOoO0) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (oooO0o2 == oooO0o && ((Integer) this.f13713OooOoO0) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (oooO0o2 == oooO0o) {
            o00ooo0oOooO00o = o00OOO0O.OooO00o(new byte[0]);
        } else if (oooO0o2 == OooO0o.f29327OooOOO || oooO0o2 == OooO0o.f29328OooOOO0) {
            o00ooo0oOooO00o = o00OOO0O.OooO00o(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f13713OooOoO0).intValue()).array());
        } else {
            if (oooO0o2 != OooO0o.OooOO0o) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: " + ((o0000O.OooOo) this.f13712OooOo0o).f29341OooO0Oo);
            }
            o00ooo0oOooO00o = o00OOO0O.OooO00o(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f13713OooOoO0).intValue()).array());
        }
        return new o0000O.OooOOOO((o0000O.OooOo) this.f13712OooOo0o, o00ooo0oOooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public OooO0oO.Oooo0 OooOO0O() throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "FirebaseCrashlytics"
            java.lang.String r1 = "GET Request URL: "
            o000O0O.OooO.OooO0O0()
            r2 = 0
            java.lang.Object r3 = r8.f13712OooOo0o     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r4 = r8.f13710OooOo     // Catch: java.lang.Throwable -> Lb9
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r3 = OooOO0(r3, r4)     // Catch: java.lang.Throwable -> Lb4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb4
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Lb4
            r4.append(r3)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> Lb4
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L2e
            android.util.Log.v(r0, r1, r2)     // Catch: java.lang.Throwable -> L2b
            goto L2e
        L2b:
            r0 = move-exception
            goto Lb7
        L2e:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Lb4
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lb4
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> Lb4
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch: java.lang.Throwable -> Lb4
            r1 = 10000(0x2710, float:1.4013E-41)
            r0.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L6e
            r0.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = "GET"
            r0.setRequestMethod(r1)     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r1 = r8.f13713OooOoO0     // Catch: java.lang.Throwable -> L6e
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L6e
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L6e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L6e
        L52:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto L70
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L6e
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L6e
            r0.addRequestProperty(r4, r3)     // Catch: java.lang.Throwable -> L6e
            goto L52
        L6e:
            r1 = move-exception
            goto Lbb
        L70:
            r0.connect()     // Catch: java.lang.Throwable -> L6e
            int r1 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L6e
            java.io.InputStream r3 = r0.getInputStream()     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto La6
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> La3
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> La3
            java.lang.String r5 = "UTF-8"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> La3
            r2.<init>(r4)     // Catch: java.lang.Throwable -> La3
            r4 = 8192(0x2000, float:1.148E-41)
            char[] r4 = new char[r4]     // Catch: java.lang.Throwable -> La3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La3
            r5.<init>()     // Catch: java.lang.Throwable -> La3
        L92:
            int r6 = r2.read(r4)     // Catch: java.lang.Throwable -> La3
            r7 = -1
            if (r6 == r7) goto L9e
            r7 = 0
            r5.append(r4, r7, r6)     // Catch: java.lang.Throwable -> La3
            goto L92
        L9e:
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> La3
            goto La6
        La3:
            r1 = move-exception
            r2 = r3
            goto Lbb
        La6:
            if (r3 == 0) goto Lab
            r3.close()
        Lab:
            r0.disconnect()
            OooO0oO.Oooo0 r0 = new OooO0oO.Oooo0
            r0.<init>(r1, r2)
            return r0
        Lb4:
            r1 = move-exception
        Lb5:
            r0 = r2
            goto Lbb
        Lb7:
            r1 = r0
            goto Lb5
        Lb9:
            r0 = move-exception
            goto Lb7
        Lbb:
            if (r2 == 0) goto Lc0
            r2.close()
        Lc0:
            if (r0 == 0) goto Lc5
            r0.disconnect()
        Lc5:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Oooo.OooOo00.OooOO0O():OooO0oO.Oooo0");
    }

    public List OooOOO(byte[] bArr) {
        List list = (List) ((ConcurrentHashMap) this.f13712OooOo0o).get(new o00oO0o(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object OooOOO0(java.lang.Class r15) throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Oooo.OooOo00.OooOOO0(java.lang.Class):java.lang.Object");
    }

    public void OooOOOO(String str, String str2) {
        ((HashMap) this.f13713OooOoO0).put(str, str2);
    }

    public OooOo00 OooOOo() {
        return new OooOo00((o00O000o) ((o0O0ooO) this.f13712OooOo0o).zza(), ((OooOo00) this.f13710OooOo).OooOOoo(), (o0OOO0o) ((o0O0ooO) this.f13713OooOoO0).zza(), 9);
    }

    public void OooOOo0(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.f13712OooOo0o = Integer.valueOf(i);
    }

    public C2051sk OooOOoo() {
        Application application = (Application) ((o0000OO0) this.f13712OooOo0o).f13531OooOo0o;
        o0OOO0o o0ooo0o = (o0OOO0o) ((o0O0ooO) this.f13710OooOo).zza();
        o00O00OO o00o00oo = (o00O00OO) ((o0O0ooO) this.f13713OooOoO0).zza();
        o000O000 o000o0002 = o000O0o.f13968OooO0O0;
        o000Oo0.OooO0OO(o000o0002);
        return new C2051sk(application, o0ooo0o, o00o00oo, o000o0002, 2);
    }

    public synchronized void OooOo00(int i, int i2, long j, long j2) {
        ((o0OO0oO0) this.f13712OooOo0o).f14527Oooo000.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.f13713OooOoO0;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        ((Oooo0.OooO0O0) this.f13710OooOo).OooO0OO(new Oooo00O.o000oOoO(0, Arrays.asList(new Oooo00O.OooOo(36301, i, 0, j, j2, null, null, 0, i2)))).addOnFailureListener(new o0O0O0O(this, jElapsedRealtime));
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.f13711OooOo0O) {
            case 15:
                OooOo00 oooOo00 = new OooOo00(((com.google.android.gms.internal.measurement.OooO0O0) this.f13712OooOo0o).clone());
                ArrayList arrayList = (ArrayList) this.f13713OooOoO0;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((ArrayList) oooOo00.f13713OooOoO0).add(((com.google.android.gms.internal.measurement.OooO0O0) obj).clone());
                }
                return oooOo00;
            default:
                return super.clone();
        }
    }

    @Override // o00O00oO.o0000O0
    public Object get() {
        switch (this.f13711OooOo0O) {
            case 2:
                return new o0Oo0oo(new o000OOoO.OooO(4), new o000000.OooO(4), (OooOo0O.OooO0o) ((OooOOo0.o0OOO0o) this.f13712OooOo0o).get(), (OooOo0o.Oooo0) ((o000O0Oo.OooO0o) this.f13710OooOo).get(), (OooOo0o.o0OoOo0) ((C1386ai) this.f13713OooOoO0).get());
            default:
                return new OooOo0o.OooOOO0((Context) ((o0000OO0) this.f13712OooOo0o).f13531OooOo0o, (OooOo.OooO0o) ((o0000O0) this.f13710OooOo).get(), (OooOo0o.OooOO0) ((o000OOoO.OooO) this.f13713OooOoO0).get());
        }
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public Task getAppSetIdInfo() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ((ExecutorService) this.f13713OooOoO0).execute(new o00000oO.OooOOO0(1, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public String toString() {
        switch (this.f13711OooOo0O) {
            case 16:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f13712OooOo0o);
                sb.append('{');
                com.google.android.gms.internal.play_billing.OooOOOO oooOOOO = ((com.google.android.gms.internal.play_billing.OooOOOO) this.f13710OooOo).f26958OooO0O0;
                String str = "";
                while (oooOOOO != null) {
                    Object obj = oooOOOO.f26957OooO00o;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
                    }
                    oooOOOO = oooOOOO.f26958OooO0O0;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 21:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f13712OooOo0o);
                sb2.append('{');
                OooO0oO.OooOOO0 oooOOO0 = (OooO0oO.OooOOO0) ((OooO0oO.OooOOO0) this.f13710OooOo).f13278OooOo;
                String str2 = "";
                while (oooOOO0 != null) {
                    Object obj2 = oooOOO0.f13280OooOo0o;
                    sb2.append(str2);
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb2.append(obj2);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj2});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    oooOOO0 = (OooO0oO.OooOOO0) oooOOO0.f13278OooOo;
                    str2 = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 22:
                return o0OO00O.OooO00o((o00O0O0) this.f13712OooOo0o).toString();
            default:
                return super.toString();
        }
    }

    @Override // OoooO0O.o00O000
    public /* bridge */ /* synthetic */ Object zza() {
        switch (this.f13711OooOo0O) {
            case 5:
                return OooOOo();
            case 6:
                return OooOOoo();
            default:
                return new oOO00O((o0OOO0o) ((o0O0ooO) this.f13712OooOo0o).zza(), ((o000O0Oo.OooO0o) this.f13710OooOo).zza(), (OoooO0O.o000OOo) ((o0O0ooO) this.f13713OooOoO0).zza());
        }
    }

    public /* synthetic */ OooOo00(Object obj, Object obj2, Object obj3, int i) {
        this.f13711OooOo0O = i;
        this.f13712OooOo0o = obj;
        this.f13710OooOo = obj2;
        this.f13713OooOoO0 = obj3;
    }

    public OooOo00() {
        this.f13711OooOo0O = 15;
        this.f13712OooOo0o = new com.google.android.gms.internal.measurement.OooO0O0("", 0L, null);
        this.f13710OooOo = new com.google.android.gms.internal.measurement.OooO0O0("", 0L, null);
        this.f13713OooOoO0 = new ArrayList();
    }

    public OooOo00(oOO0000 ooo0000, String str, oOO000 ooo000) {
        this.f13711OooOo0O = 14;
        this.f13712OooOo0o = str;
        this.f13710OooOo = ooo000;
        Objects.requireNonNull(ooo0000);
        this.f13713OooOoO0 = ooo0000;
    }

    public OooOo00(oOO0000 ooo0000, String str, ArrayList arrayList) {
        this.f13711OooOo0O = 13;
        this.f13712OooOo0o = str;
        this.f13710OooOo = arrayList;
        Objects.requireNonNull(ooo0000);
        this.f13713OooOoO0 = ooo0000;
    }

    public OooOo00(Context context, int i) throws Resources.NotFoundException {
        this.f13711OooOo0O = i;
        switch (i) {
            case 17:
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(oo0o0Oo.OooO0O0.OooO0OO(context, com.google.android.material.datepicker.o000oOoO.class.getCanonicalName(), R.attr.materialCalendarStyle).data, Ooooo00.OooOo.f14974OooOoOO);
                com.google.android.material.datepicker.OooO0o.OooO0O0(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
                this.f13713OooOoO0 = com.google.android.material.datepicker.OooO0o.OooO0O0(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
                com.google.android.material.datepicker.OooO0o.OooO0O0(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
                com.google.android.material.datepicker.OooO0o.OooO0O0(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
                ColorStateList colorStateListOooO00o = oo0o0Oo.OooO0OO.OooO00o(context, typedArrayObtainStyledAttributes, 6);
                this.f13712OooOo0o = com.google.android.material.datepicker.OooO0o.OooO0O0(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
                com.google.android.material.datepicker.OooO0o.OooO0O0(context, typedArrayObtainStyledAttributes.getResourceId(7, 0));
                this.f13710OooOo = com.google.android.material.datepicker.OooO0o.OooO0O0(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
                new Paint().setColor(colorStateListOooO00o.getDefaultColor());
                typedArrayObtainStyledAttributes.recycle();
                break;
            default:
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                this.f13710OooOo = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
                this.f13713OooOoO0 = Executors.newSingleThreadExecutor();
                this.f13712OooOo0o = context;
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new OooOOO(this, 0), 0L, 86400L, TimeUnit.SECONDS);
                break;
        }
    }

    public OooOo00(Context context, o0OO0oO0 o0oo0oo0) {
        this.f13711OooOo0O = 11;
        this.f13713OooOoO0 = new AtomicLong(-1L);
        this.f13710OooOo = new Oooo0.OooO0O0(context, Oooo0.OooO0O0.f13718OooOooO, new Oooo00O.o0OoOo0("measurement:api"), Oooo000.OooO.f13720OooO0O0);
        this.f13712OooOo0o = o0oo0oo0;
    }

    public OooOo00(String str, int i) {
        this.f13711OooOo0O = i;
        switch (i) {
            case 21:
                OooO0oO.OooOOO0 oooOOO0 = new OooO0oO.OooOOO0(24, false);
                this.f13710OooOo = oooOOO0;
                this.f13713OooOoO0 = oooOOO0;
                this.f13712OooOo0o = str;
                break;
            default:
                com.google.android.gms.internal.play_billing.OooOOOO oooOOOO = new com.google.android.gms.internal.play_billing.OooOOOO();
                this.f13710OooOo = oooOOOO;
                this.f13713OooOoO0 = oooOOOO;
                this.f13712OooOo0o = str;
                break;
        }
    }

    public OooOo00(com.google.android.gms.internal.measurement.OooO0O0 oooO0O0) {
        this.f13711OooOo0O = 15;
        this.f13712OooOo0o = oooO0O0;
        this.f13710OooOo = oooO0O0.clone();
        this.f13713OooOoO0 = new ArrayList();
    }

    public OooOo00(String str, HashMap map) {
        this.f13711OooOo0O = 29;
        this.f13712OooOo0o = str;
        this.f13710OooOo = map;
        this.f13713OooOoO0 = new HashMap();
    }

    public OooOo00(byte[] bArr) throws GeneralSecurityException {
        this.f13711OooOo0O = 28;
        o0000Oo.o0Oo0oo.OooO00o(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f13712OooOo0o = secretKeySpec;
        if (AbstractC2183w4.OooO00o(1)) {
            Cipher cipher = (Cipher) o0000Oo.Oooo0.f29463OooO0O0.f29465OooO00o.OooO00o("AES/ECB/NoPadding");
            cipher.init(1, secretKeySpec);
            byte[] bArrOooO0o0 = o00Oo0oo.o00oO0o.OooO0o0(cipher.doFinal(new byte[16]));
            this.f13710OooOo = bArrOooO0o0;
            this.f13713OooOoO0 = o00Oo0oo.o00oO0o.OooO0o0(bArrOooO0o0);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    public OooOo00(ConcurrentHashMap concurrentHashMap, ArrayList arrayList, o00000oo.oo000o oo000oVar, o0000OO.OooO00o oooO00o, Class cls) {
        this.f13711OooOo0O = 23;
        this.f13712OooOo0o = concurrentHashMap;
        this.f13710OooOo = oo000oVar;
        this.f13713OooOoO0 = oooO00o;
    }

    public OooOo00(o00O0O0 o00o0o0, List list) {
        this.f13711OooOo0O = 22;
        this.f13712OooOo0o = o00o0o0;
        this.f13710OooOo = list;
        this.f13713OooOoO0 = o0000OO.OooO00o.f29381OooO0O0;
    }
}
